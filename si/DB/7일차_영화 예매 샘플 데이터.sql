-- cgv 홈페이지에서 영화 듄 정보를 이용하여 영화정보, 인물 등 필요한 정보를 DB에 추가 
-- 배우는 대표 2명
-- insert into movie values(1, '듄', '12세이상', '155', '2021-10-20', '듄을 지배하는 자가 우주를 지배한다');
-- insert into `character` values(1, '티모시 샬라메', '1995-12-27', null, '배우');
-- insert into `character` values(2, '레베카 퍼거슨', '1983-10-19', '스웨덴', '배우');
-- insert into genre value('SF');
-- insert into genre values('가족'),('공포/호러'),('드라마'),('멜로/로맨스'),('코미디'),('애니메이션'),('느와르'),('단편'),('다큐멘터리'),('로드무비'),('무협'),('뮤지컬'),('뮤직'),('미스터리'),('범죄'),('옴니버스'),('서부'),('스릴러'),('스포츠'),('시대극/사극'),('재난'),('청춘영화'),('퀴어'),('환타지'),('학원물'),('에로');
-- insert into movie_genre values(1, 'SF', 1);
-- insert into `character` values(3, '드니 빌뇌브', '1967-10-03', '케나다', '영화감독, 시나리오작가');
-- insert into participation values(1, 1, 1, '주연'),(2,1,2, '주연'),(3,1,3, '감독');

-- cgv 홈페이지에서 강남점 정보를 이용하여 DB에 추가, 상영시간표 x, 
-- 좌석은 A1~A5, B1~B5만 추가, 관은 총3개
/*insert into theater values(1, '서울', 'CGV강남', "서울특별시 강남구 역삼동 814-6 스타플렉스
서울특별시 강남구 강남대로 438 (역삼동)", "2호선 | 강남역 11번 출구
9호선 | 신논현역 5번출구", "건물 지하2F ~ 지하4F", 3, 30);*/
/*insert into seat(st_name, st_th_num, st_room_num) values
('A1', 1, 1),('A2', 1, 1),('A3', 1, 1),('A4', 1, 1),('A5', 1, 1),
('A1', 1, 2),('A2', 1, 2),('A3', 1, 2),('A4', 1, 2),('A5', 1, 2),
('A1', 1, 3),('A2', 1, 3),('A3', 1, 3),('A4', 1, 3),('A5', 1, 3),
('B1', 1, 1),('B2', 1, 1),('B3', 1, 1),('B4', 1, 1),('B5', 1, 1),
('B1', 1, 2),('B2', 1, 2),('B3', 1, 2),('B4', 1, 2),('B5', 1, 2),
('B1', 1, 3),('B2', 1, 3),('B3', 1, 3),('B4', 1, 3),('B5', 1, 3);*/
-- cgv 영화 듄, 강남지점 12 1~3일 상영 시간표를 보고 DB에 추가
/*insert into schedule values
(1, 1, 1, '2021-12-01', '15:45', 1, '2D', 10, 10),
(2, 1, 1, '2021-12-01', '21:20', 1, '2D', 10, 10),
(3, 1, 1, '2021-12-02', '10:20', 1, '2D', 10, 10),
(4, 1, 1, '2021-12-02', '16:20', 1, '2D', 10, 10),
(5, 1, 1, '2021-12-02', '19:30', 1, '2D', 10, 10),
(6, 1, 1, '2021-12-03', '10:30', 1, '2D', 10, 10),
(7, 1, 1, '2021-12-03', '16:30', 1, '2D', 10, 10),
(8, 1, 1, '2021-12-03', '19:45', 1, '2D', 10, 10);*/
-- 아이디가 abc123, 비번이 abc123인 회원이 가입
-- insert into member values('abc123', 'abc123');
-- abc123 회원이 12월1일 21:20분 1관에서 하는 영화 듄을 A1, A2 두자리를 예매했다.
-- 이때 실행되는 쿼리문을 작성
-- 1.
-- insert into ticketing select 1, 'abc123', sc_num from schedule
	-- where sc_date = '2021-12-01' and sc_time = '21:20' and sc_room_num = 1;
-- 2. 예매 리스트에 테이터 추가
-- insert into ticketing_list select 1, 1, st_num from seat
	-- where st_room_num = 1 and st_name = 'A1';
-- insert into ticketing_list select 2, 1, st_num from seat
	-- where st_room_num = 1 and st_name = 'A2';
-- insert into ticketing values(1, 'abc123', 2);
-- insert into ticketing_list values(1, 1, 1),(2, 1, 2);
-- 3.상영시간 정보를 수정 
update schedule set sc_seat = sc_seat - 2
	where sc_date = '2021-12-01' and sc_time = '21:20' and sc_room_num = 1;
select * from schedule;
