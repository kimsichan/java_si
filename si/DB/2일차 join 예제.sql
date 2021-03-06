-- 2021160123 학번 학생이 수강 신청한 과목 제목을 확인하는 쿼리문 
SELECT co_st_num, su_title from course
	left join subject
	on course.co_su_num = subject.su_num
    where co_st_num = 2021160123;
    
SELECT co_st_num, su_title from course
	left join subject
	on co_su_num = su_num
    where co_st_num = 2021160123;
    
-- 테이블 1과 테이블2의 순서를 바꾼경우 결과가 달라짐
select * from subject
	left join course
	on co_su_num = su_num;


-- 2000160001 교수번호를 가진 교수님이 강의하는 강의 제목과 일정을 확인하는 쿼리문을 작성하세요.
select su_title, su_schedule from lecture
	left join subject
    on le_su_num = su_num
    where le_pr_num = 2000160001;
-- 컴퓨터 개론을 강의하는 교수번호를 확인하는 쿼리문을 작성하세요.
select le_pr_num from lecture
	left join subject
    on  le_su_num = su_num
    where su_title = '컴퓨터 개론';

-- 컴퓨터 개론을 강의하는 교수님 이름을 확인하는 쿼리문을 작성하세요.
select pr_name from lecture
	left join subject
		on  le_su_num = su_num
    left join professor
		on pr_num = le_pr_num
    where su_title = '컴퓨터 개론';
    
-- 컴퓨터 개론 3분반 강의를 듣는 학생들의 명단을 확인하는 쿼리를 작성하세요. 
-- 컴퓨터 개론 3분반 강의를 수강하는 학생들의 명단을 확인하는 쿼리를 작성하세요. 
-- 수강테이블
select * from course
	join subject
		on co_su_num = su_num
	join student
		on co_st_num = st_num
	where su_title = '컴퓨터 개론' and su_class_num = 3;	