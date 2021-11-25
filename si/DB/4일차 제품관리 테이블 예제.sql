-- 단가가 3000원 이상 6000원 이하인 제품들을 확인
-- select (보고싶은 속성명) from (테이블) [where 조건];
SELECT 제조업체, 제품명, 재고량, 단가 FROM 제품 
	where 단가 >= 3000 and 단가 <= 6000
    order by 제조업체,제품명;
-- between : a 이상 b 이하일 때 사용
SELECT 제조업체, 제품명, 재고량, 단가 FROM 제품 
	where 단가 between 3000 and 6000
    order by 제조업체,제품명;

-- in() : 여러 값 중 하나를 만족하는 경우 사용
-- 제조업체가 대한식품 또는 민국푸드인 제품들을 확인
select * from 제품 where 제조업체 = '대한식품' or  제조업체 = '민국푸드'  order by 제조업체;
select * from 제품 where 제조업체 in('대한식품', '민국푸드')  order by 제조업체;
-- 등급이 silver 또는 gold인 회원의 아이디를 확인
select 고객아이디, 등급 from 고객 where 등급 in('silver', 'gold') order by 등급; 
select 고객아이디, 등급 from 고객 where 등급 = 'gold' or 등급 = 'silver';
-- 등급이 silver 또는 gold인 회원이 주문한 제품명을 확인
select distinct 제품명 from 주문
	join 고객
		on 주문고객 = 고객아이디  
	join 제품
		on 주문제품 = 제품번호
	where 등급 in('silver', 'gold');
    
-- 가격이 2600원 이상인 제품의 제품명과 단가를 확인
select 제품명, 단가 from 제품
	where 단가 >= 2600
    order by 단가;
    
-- 서브쿼리 : 쿼리문 안에 들어가 있는 쿼리 
-- select () from () [where()];
-- 쿵떡파이의 가격보다 크거나 같은 제품의 제품명과 단가를 확인
select 제품명, 단가 from 제품
	where 단가 >= (select 단가 from 제품 where 제품명 = '쿵떡파이');
    
-- 그냥만두의 가격보다 크거나 같고 얼큰라면의 가격보다 크거나 같은 제품의 제품명과 단가를 확인
select 제품명, 단가 from 제품
	where 단가 >= (select 단가 from 제품 where 제품명 = '얼큰라면')
		and 단가 >= (select 단가 from 제품 where 제품명 = '그냥만두');
select 제품명, 단가 from 제품
	where 단가 >= (select 단가 from 제품 where 제품명 in ('얼큰라면','그냥만두'));
-- all() : 전부를 만족하는 경우들만 확인. and 느낌
select 제품명, 단가 from 제품
	where 단가 >= all(select 단가 from 제품 where 제품명 in ('얼큰라면','그냥만두'));
-- any() : 하나이상 만족하는 경우들만 확인. or 느낌s
-- 그냥만두의 가격보다 같거나 얼큰라면의 가격보다 크거나 같은 제품의 제품명과 단가를 확인
select 제품명, 단가 from 제품
	where 단가 >= (select 단가 from 제품 where 제품명 = '얼큰라면')
		or 단가 >= (select 단가 from 제품 where 제품명 = '그냥만두');
select 제품명, 단가 from 제품
	where 단가 >= (select min(단가) from 제품 where 제품명 in ('얼큰라면','그냥만두'));
select 제품명, 단가 from 제품
	where 단가 >= any(select 단가 from 제품 where 제품명 in ('얼큰라면','그냥만두'));
    
-- group by : where절 다음에 나와야함, order by 앞, 같은 그룹끼리 묶어줌 
-- group by는 distinct처럼 보일 수 있다 
select * from 제품 group by 제조업체;
select distinct 제조업체 from 제품; 

-- 대한식품에서 만든 제품 개수 확인 
select count(*) from 제품 where 제조업체 = '대한식품';

-- 각 회사별 만든 제품 개수 확인 
select 제조업체 ,count(*) as '제조업체 별 제품수' from 제품 group by 제조업체;

-- 1번이상 주문한 고객별 주문한 주문 횟수
 select 주문고객,count(*) as '주문횟수' from 주문 group by 주문고객;
 
-- 1번이상 주문한 고객별 고객의 총 주문 갯수 
 select 주문고객,주문제품, sum(수량) as '주문 갯수' from 주문  group by 주문고객;
 
-- 1번이상 주문한 고객별 고객의 총 주문 금액을 확인 
select 주문고객,주문제품, sum(수량*단가) as '총 주문 금액' 
	from 주문
    join 제품 on 제품.제품번호 = 주문.주문제품
	group by 주문고객 order by `총 주문 금액`;

-- 1번 이상 주문한 고객중 총 주문 금액이 100000원 이상인 고객 확인
-- where 절에는 group by로 작업한 집약함수를 이용한 조건을 걸 수 없다
-- having 절은 group by로 작업한 내용에 조건을 걸어줄 때 사용
select 주문고객,주문제품, sum(수량*단가) as '총 주문 금액' 
	from 주문
    join 제품 on 제품.제품번호 = 주문.주문제품
	group by 주문고객 
    having sum(수량*단가) >= 100000 
    order by `총 주문 금액`;
select 주문고객,주문제품, sum(수량*단가) as '총 주문 금액' 
	from 주문
    join 제품 on 제품.제품번호 = 주문.주문제품
	group by 주문고객 
    having `총 주문 금액` >= 100000 
    order by `총 주문 금액`;
    
-- 제품별 주문한 제품 번호와 주문의 누적 수량 제조 업체을 확인
select 제품번호, sum(수량) as '주문 누적 수량', 제조업체 
	from 제품 
    join 주문 on 제품.제품번호 = 주문.주문제품
    group by 제품번호
    order by 제품번호;
    
-- 제조업체별 가장 많이 팔린 제품을 제조업체, 제품번호, 누적 주문 수량을 확인
select 제조업체, 주문제품 as 제품번호 , max(누적주문량) as '주문수량' from
(select 제조업체, 주문제품, sum(수량) as '누적주문량' 
	from 주문 
    join 제품 on 주문제품 = 제품번호
    group by 주문제품
    order by 제조업체)as `제품별판매량`
group by 제조업체;

-- with rollup : 부분 총합을 구해줌

select 주문고객, 주문제품, sum(수량)  from 주문
	group by 주문고객, 주문제품 
    with rollup;
    
-- limit : 검색결과의 갯수를 제한할 때 사용
-- limit 정수1 : 정수1개만큼 결과를 보여줌
-- limit 번지, 정수1 : 번지부터 정수1개의 결과를 보여줌 
SELECT * FROM 주문 limit 5;
--  한번에 주문 내역 확인할 수 있는 갯수가 5개인 경우, 1페이지에 해당
SELECT * FROM 주문 limit 0, 5; -- 0번지부터 5개
--  한번에 주문 내역 확인할 수 있는 갯수가 5개인 경우, 2페이지에 해당
SELECT * FROM 주문 limit 5, 5; -- 5번지부터 5개
--  한번에 주문 내역 확인할 수 있는 갯수가 5개인 경우, 3페이지에 해당
SELECT * FROM 주문 limit 10, 5; -- 10번지부터 5개 [5*(3-1) : 한페이지에 보여지는 갯수 * (페이지번호 - 1)]

-- 아이디별 사용 누적 금액을 확인
select 주문고객, sum(수량*단가)as '누적금액' from 주문
	join 제품 on 주문제품 = 제품번호
    group by 주문고객 
    having sum(수량*단가)
    order by sum(수량*단가)desc ;
-- 가장 많은 금액을 사용한 고객 아이디를 확인 
select 주문고객, sum(수량*단가)as '누적금액' from 주문
	join 제품 on 주문제품 = 제품번호
    group by 주문고객 
    having sum(수량*단가)
    order by sum(수량*단가)desc
    limit 1;
-- select 속성 from 테이블 where 조건 group by 속성 order by 속성 asc limit갯수
-- 가장 많은 제품 갯수를 구매한 고객 아이디를 확인 
select 주문고객, sum(수량)as '총 주문 수량' from 주문
	join 제품 on 주문제품 = 제품번호
    group by 주문고객 
    having sum(수량)
    order by sum(수량)desc
    limit 1;
-- 20대가 구매한 제품목록을 확인
SELECT 제품명 as '20대구매제품',수량 FROM 고객
	join 주문 on 고객.고객아이디 = 주문고객
	join 제품 on 주문제품 = 제품번호
    where 나이 between 20 and 29
    group by 제품명;

-- 20대가 구매를 가장 많이한 제품을 확인 
SELECT 제품명 as '20대구매제품', sum(수량)as '누적주문량' FROM 고객
	join 주문 on 고객.고객아이디 = 주문고객
	join 제품 on 주문제품 = 제품번호
    where 나이 between 20 and 29
    group by 제품명
    order by 누적주문량 desc limit 1;
    
   