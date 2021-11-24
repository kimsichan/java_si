-- 컴퓨터 개론 3분반 강의를 듣는 학생들의 명단을 확인하는 쿼리를 작성하세요. 
-- 컴퓨터 개론 3분반 강의를 수강하는 학생들의 명단을 확인하는 쿼리를 작성하세요. 
-- 수강테이블
select * from course
	join subject
		on co_su_num = su_num
	join student
		on co_st_num = st_num
	where su_title = '컴퓨터 개론' and su_class_num = 3;	
-- 2021160123 학번인 홍길동 학생이 수강한 모든 과목명을subject 확인하는 쿼리를 작성하세요 
	select su_title from course
		join subject
			on co_su_num = su_num
		where co_st_num = 2021160123;
-- 이순신 교수님의 강의를 듣는 학생들 명단을 확인하는 쿼리를 작성하세요.
select *from lecture
	join professor on pr_num = le_pr_num
    join course on co_su_num = le_su_num
    join student on co_st_num = st_num
    where pr_name = '이순신';

