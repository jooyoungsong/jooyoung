--emp테이블에서 ename만 조회하시오
select ename from EMP;
--emp테이블에서 job만 조회하시오
select ename,job from emp;
--emp 테이블 전체조회
select * from emp;
--student테이블 전체조회
select * from student;
--표현식
select name, '지금실습중' from student;
--컬럼 별칭 allias출력
select name "이름",grade as "학년",birthday 생일 from student;
--emp에서 사원명,직업,입사일자를 조회하시오
select ename 사원명,job as "직업",hiredate 입사일자 from emp;
--DISTINCT: 중복된 값을 제거하고 출력하기
--emp에서 직업군을 중복하지 말고 출력하세요
select DISTINCT job "직 업 군" from emp;
--emp에서 부서번호를 중복없이 출력하세요
select DISTINCT deptno 부서번호 from emp;
--합성연산자: 컬럼을 붙혀서 출력
select name||grade 학년별학생명 from student;
--professor조회
select * from professor;
--하나의 컬럼으로 출력_조인형님은 정교수입니다(합성연산자 필요)
select name || '님은 ' || position || '입니다' "교수별직급" from professor;
--emp에서 smith님의 job은 clerk입니다
select ename || '님은 job은' || job || '입니다' from emp;
--student에서 서지순님의 키는 180cm, 몸무게는 72kg입니다
select name || '님의 키는 ' || height || 'cm, 몸무게는 ' || weight || 'kg입니다' from student;
--emp에서 내직업은 salesman이고 연봉은 ***입니다
select '내직업은 ' || job || '이고 연봉은 ' || sal || '입니다' from emp;

--정렬
--student에서 학생명 학년 생일을 학생명의 오름차순으로 조회하시오
select name 학생명,grade 학년,birthday 생일 from student order by name asc;
select name 학생명,grade 학년,birthday 생일 from student order by birthday;
--emp에서 사원명,직업,급여를 조회하는데 급여가 낮은사람순으로 조회하세요
select ename 사원명,job 직업,sal 급여 from emp order by 3 desc; --컬럼번호로 정렬도 가능하다
--emp에서 직업군을 중복없이 출력하고 직업군이 오름차순으로 출력하시오
select DISTINCT job 직업군 from emp order by job;

--산술연산자
--emp에서 sal에 특별보너스 100을 더하여 출력하시오
select ename 사원명,sal 기본급,sal+100 특별보너스 from emp;


--where절 : 조건절
--emp에서 10번부서에 근문하는 사람의 사원명,급여와 부서번호를 출력하세요
select ename 사원명,sal 급여,deptno 부서번호 from emp where deptno=10;
--emp에서 이름이 KING인 사람의 사원명,직업을 조회하시오
select ename 사원명,job 직업 from emp where ename='KING';
--emp에서 급여가 3000이상인 사람의 사원명 급여를 조회하십시오
select ename 사원명,sal 급여 from emp where sal>=3000;
--학생테이블에서 키가 180cm이상인 학생명과 키를 출력하시오
select name 학생명,height 키 from student where height>=180;
--학생테이블에서 키가 160cm~180cm사이인 학생명과 키를 출력하시오(between A_작은수 and B_큰수)
select name 학생명,height 키 from student where height between 160 and 180 order by height;
--in(a,b) : a,b만 조회
--emp에서 deptno가 20,30인 사람들의 사원명과 부서번호를 조회
select ename 사원명,deptno 부서번호 from emp where deptno IN(20,30);


--emp에서 null값만 출력하시오
--emp에서 comm이 null인 사람의 이름과 보너스를 출력하세요
select ename 사원명,comm 보너스 from emp where comm is null;
select ename 사원명,comm 보너스 from emp where comm is not null;
--NVL : null값 0으로 바꾸기,연산이 목적
select ename 사원명, nvl(comm,0) 보너스 from emp;

--Like연산자
--학생테이블에서 김씨만 조회하여 모든열을 출력하시오
select * from student where name like '김%';

--Like % : _언더바 이용해서 특정순번에 있는 글을 출력
--emp에서 사원명이 두번째글자가 a인 사람의 사원명 출력
select ename 사원명 from emp where ename like '_A%';
--emp에서 사원명이 세번째글자가 a인 사람의 사원명 출력
select ename 사원명 from emp where ename like '__A%';
--emp에서 사원명 2번째글자가 a인 사람 또는 3번째 글자가 a인 사람의 사원명을 출력하시오
select ename 사원명 from emp where ename like '_A%' or ename like '__A%';

--학생테이블 총 몇명?
select count(*) cnt from student;
--emp에서 job이 salesman,manager인 사원명,작업군만 출력하세요(or연산자와 in 연산자로 출력_각각)
select ename 사원명,job 직업군 from emp where job='SALESMAN' or job='MANAGER';
select ename 사원명,job 직업군 from emp where job in('SALESMAN','MANAGER');

--emp에서 급여가 2000~3000인 사원명,직업군,급여를 출력하시오(and, between연산자 각각 출력)
select ename 사원명,job 직업군,sal 급여 from emp where sal>=2000 and sal<=3000;
select ename 사원명,job 직업군,sal 급여 from emp where sal between 2000 and 3000;

--Q.student 테이블에서 1학년 학생의 학생명, 키를 출력하세요(단, 키가 작은순...)
select name 학생명,grade 학년,height 키 from student where grade=1 order by height;

--Q.student에서 2학년 학생의 학생명 생일 키 몸무게를 출력하세요(단, 생일이 빠른 사람 순서)
select name 학생명,grade 학년,birthday 생일,height 키,weight 몸무게 from student where grade=2 order by birthday;

--Q.professor에서 교수들의 이름중 조씨 성을 가진 교수의 교수명,직위,입사일자를 출력하시오
select name 교수명,position 직위,hiredate 입사일자 from professor where name like '조%';

--Q.emp에서 사원명,급여,급여*12,보너스,급여총계를 구하시오
select ename 사원명,sal 급여, sal*12 "급여*12",nvl(comm,0) 보너스, sal*12+nvl(comm,0) 급여총계 from emp;

--Q.emp에서 입사일자가 1982년도 이후에 들어온 사람의 사원명과 입사일자를 조회하시오
select ename 사원명, hiredate 입사일자 from emp where hiredate>='82/01/01' order by hiredate;

--날짜 리터럴 '' 반드시 사용
--emp에서 직급이 clerk이고 입사일이 87/05/23인 사람의 사원명 입사일 구하기
select ename 사원명,hiredate 입사일 from emp where job='CLERK' and hiredate='87/05/23';

--emp에서 매니저이거나 82년이후 입사자의 사원명 직업군 입사일 출력
select ename 사원명,job 직업군,hiredate 입사일 from emp where job='MANAGER' or hiredate >='82/01/01' order by hiredate;


--다중정렬
--student에서 학생의 이름과 키와 몸무게 출력(키는 작은 사람부터, 몸무게는 많은 사람부터)
select name 학생명,height 키,weight 몸무게 from student where grade=1 order by height asc,weight desc;

--emp에서 급여 내림차순 후에 다시 이름으로 오름차순_출력:사원번호,사원명,급여
select empno 사원번호 ,ename 사원명,sal 급여 from emp order by sal desc,ename asc; 


select*from student;
--union
--union All
--intersect
select name from student where  deptno1=101 union all
select name from student where deptno2=201;


--Q.GOGAK(고객테이블) point가 30만~50만 고객명과 포인트를 출력하세요(포인트 많은순)
select gname 고객명, point 포인트 from GOGAK where point between 300000 and 500000 order by point desc;

--Q.emp의 comm의 널을 0으로 바꾸어서 직업이 manager인 사람만 이름과 보너스를 출력하시오
select ename 사원명, nvl(comm,0) 보너스 from emp where job='MANAGER';

--Q.professer 103번 학과 교수들의 이름과 급여,보너스,연봉(급여*12+보너스)을 출력하시오
select name 이름,pay 급여,bonus 보너스,pay*12+bonus 연봉 from professor where deptno='103';

--SQL 그룹함수(count,sum,avg)
--count(*): null값 포함, count(컬럼):null값 제외
select count(*),count(hpage) from professor;

select count(bonus), sum(bonus) from professor;

select count(bonus),sum(bonus),avg(bonus) from professor;

--max,min
select max(sal),min(sal) from emp;
select max(hiredate),min(hiredate) from emp;

--소수점
--emp에서 sal의 평균
select round(avg(sal),1) from emp;  --소수점 1자리
select round(avg(sal),2) from emp;
select round(avg(sal),0) from emp;  --반올림
select round(avg(sal),-1) from emp;  --10단위 반올림
select round(avg(sal),-2) from emp;  --100단위 반올림

--콘솔에 입력
--현재날짜를 콘솔에 출력
select sysdate from dual;

--내일날짜를 콘솔에 출력
select sysdate from dual;

--to_char : 날짜 및 수치 데이터를 문자로 반환해주기 위한 함수
--날짜에서 년도만 추출
select to_char(sysdate,'year')from dual;  --영어로 나옴
select to_char(sysdate,'yyyy')from dual;  --2023

select to_char(sysdate,'MM')from dual;
select to_char(sysdate,'dd')from dual;

select to_char(sysdate,'yyyy-mm-dd hh24-mi-ss') from dual;

--to_char : 숫자에도 적용 가능하다
select to_char(245897714,'999,999,999') from dual;

--emp
select empno 사원번호,ename 사원명,to_char(hiredate,'yyyy')년도 from emp;

--Q.emp에서 사원번호,사원명,급여 출력(급여는 천단위구분기호 붙여주기)
select empno 사원번호,ename 사원명,sal 급여, to_char(sal,'l999,999,999') 화폐금액 from emp;

--서브퀴리
--쿼리안에 또다른 쿼리 담김(KING보다 급여를 많이 받는 사람은?)_2가지 질문
--서브쿼리가 먼저 수행_그 결과를 메인쿼리에 전해주고 그값을 받아 메인쿼리가 실행
--서브쿼리 안에는 order by절이 못 온다

--emp에서 KING보다 급여 많이 받는 사람의 사원명 급여를 구해보자
select ename 사원명,sal 급여 from emp where sal>(select sal 급여 from emp where ename='JAMES');

--emp에서 평균급여보다 많이 받는 사람의 사원번호,사원명,급여를 나타내시오
select empno 사원번호,ename 사원명,sal 급여 from emp where sal > (select avg(sal) 급여 from emp);

--emp에서 이름이 WARD인 사람의 MGR과 같은 값을 가진 사람의 목록출력
select * from emp where mgr=(select mgr from emp where ename='WARD');

--emp에서 평균급여보다 많이 받는 사람 수?
select count(*) 인원수 from emp where sal>(select avg(sal) 급여 from emp);

--서브쿼리 문제
--Q1.emp에서 ADAMS와 같은 직업군을 가진 사람의 이름 연봉 직업군 출력
select ename 사원명,sal 연봉,job 직업 from emp where job=(select job 직업 from emp where ename='ADAMS');

--Q2.emp에서 SCOTT와 같은 연봉을 받는 사람의 이름과 연봉출력
select ename 사원명,sal 연봉 from emp where sal=(select sal 연봉 from emp where ename='SCOTT');

--Q3.student에서 제1전공이 일지매 학생과 동일한 학생들의 학생명 제1전공 출력
select name 학생명, deptno1 제1전공 from student where deptno1=(select deptno1 제1전공 from student where name='일지매'); 

--Q4.student에서 제1전공이 101인 학과의 평균몸무게보다 몸무게가 많은 학생들의 이름과 몸무게 출력
select name 학생명,weight 몸무게 from student where weight>(select avg(weight) 몸무게 from student where deptno1='101');  

--Q5.professor에서 입사일이 김영조 교수보다 나중에 입사한 사람의 이름과 입사일 학과번호를 출력하시오
select name 이름,hiredate 입사일, deptno 학과번호 from professor where hiredate>(select hiredate 입사일 from professor where name='김영조');

--복습문제
--Q1. emp에서 job 종류별로 직업군을 한번씩만 출력해보세요
select distinct job 직업 from emp;
--Q2. emp테이블에서 사원명이 A나 S로 시작하는 사람만 출력해보세요(사원번호 사원명)
select empno 사원번호,ename 사원명 from emp where ename like 'A%' or ename like 'S%';
--Q3. emp에서 deptno가 10인 부서만 출력하시오(사원명 사원번호)
select ename 사원명, empno 사원번호 from emp where deptno=10;
--Q4. emp에서 급여(sal)가 평균보다 더 높은 사람만 사원명과 급여를 출력하시오(6명)
select ename 사원명, sal 급여 from emp where sal >(select avg(sal) 급여 from emp);
--Q5. SCOTT의 급여와 동일하거나 더많이 받는 사람의 사원명과 급여를 출력하시오(3명)
select ename 사원명, sal 급여 from emp where sal >= (select sal 급여 from emp where ename ='SCOTT');
--Q6. emp에서 hiredate의 월이 5월인 사람만 사원명 입사일자 출력하시오(to_char 이용)
select ename 사원명, hiredate 입사일자 from emp where to_char(hiredate,'mm')='05';


--7월7일
--1.테이블 생성
--primary key는 기본키를 의미 not null+unique를 의미한다

--test테이블
create table test (num number(5) primary key,
name varchar2(20), score number(6,2), birth date);

desc test; --구조보기
select * from test;

--test에 전체 데이터 insert
insert into test values(1,'손석구',67.2,'1995-10-22');
--test에 일부 데이터 insert
insert into test(num,name) values (2,'강호동');

--insert 에러
--무결성 제약 조건(JOOYOUNG.SYS_C008353)에 위배
insert into test values(4,'이영애',68.78,'1989-11-12');

--sysdate 현재날짜를 의미
insert into test values(5,'이효리',88.96,sysdate);

--alter
--나이를 저장할 컬럼 추가, 무조건 null로 추가
--테이블에 컬럼추가 : SQL> ALTER TABLE 테이블명 ADD 추가할컬럼명 데이터타입;

alter table test add age number(5);

--주소를 저장할 컬럼을 추가하는데 초기값을 강남구라고 지정
alter table test add addr varchar2(30) default '강남구';
select * from test;

--SQL오류: ORA-00913: 값의 수가 너무 많습니다
--insert into test values(4,'이영애',68,78,'1989-11-12',22,'대한민국  서울시 ');

--테이블 컬럼의 타입변경
--SQL> ALTER TABLE 테이블명 MODIFY 컬럼명 데이터타입;
alter table test modify addr varchar2(50);

--age 타입을 문자열(10)으로 변경하고 초기값을 20으로 설정하기
--기존 null은 그대로 있고 새로 insert하는 것부터 초기값 들어감
alter table test modify age varchar(10) default '20';

insert into test (num,name) values (10,'강호동');

--num의 오름차순 출력
select * from test order by num;
select * from test order by num desc;

--drop
--age라는 컬럼을 삭제
--SQL> ALTER TABLE 테이블명 DROP COLUMN 삭제할컬럼명
alter table test drop column age;
--addr 컬럼도 삭제
alter table test drop column addr;

--컬럼명 변경
--SQL> ALTER TABLE 테이블명 RENAME COLUMN  OLD컬럼명 TO NEW컬럼명; 
--score==>jumsu로 수정해보세요
alter table test rename column score to jumsu;
--birth==>birthday로 수정해보세요
alter table test rename column birth to birthday;

--test 테이블 삭제
drop table test;
selet * from test;

--시퀀스 생성
--시퀀스 기본으로 생성, 1부터 1씩 증가하는 시퀀스 생성됨
create sequence seq1;

--전체시퀀스 확인
select * from seq;

--다음 시퀀스값을 발생 콘솔에 출력
select seq1.nextval from dual;

--현재 마지막 발생한 시퀀스값
select seq1.currval from dual;

--seq1삭제
drop sequence seq1;

--10부터 5씩 증가하는 시퀀스 생성 cash값 없애기
create sequence seq2 start with 10 increment by 5 nocache;

--시퀀스 발생
select seq2.nextval from dual;

--시퀀스2 삭제
drop sequence seq2;

--seq1 : 시작값 5 증가값 2 끝값:30  캐시:no cycle:y
create sequence seq1 start with 5 increment by 2 maxvalue 10 nocache cycle;

--seq2 시작값은 1 증가값 1 cache:no
create sequence seq2 nocache; --기본이 11이라 위에처럼 안 써도 된다

--seq3 시작값은 1 증각값 2 cache:no
create sequence seq3 start with 1 increment by 2 nocache;

--출력
select seq1.nextval,seq2.nextval,seq3.nextval from dual;

--전체 삭제
drop sequence seq1;
drop sequence seq2;
drop sequence seq3;

------------------------시퀀스 1개 생성, 테이블 생성
create sequence seq_start nocache;

create table personinfo (num number(5) primary key,
name varchar2(20),
job varchar2(30),
gender varchar2(20),
age number(5),
hp varchar2(20),
birthday date);

desc personinfo;

--birthday==>ipsaday로 수정
alter table personinfo rename column birthday to ipsaday;
select*from personinfo;

--insert
insert into personinfo values (seq_start.nextval,'박병주','엔지니어','남자',22,'010-222-3333','2023-02-11');
insert into personinfo values (seq_start.nextval,'김영준','교사','여자',25,'010-222-4561','2022-01-11');
insert into personinfo values (seq_start.nextval,'박병주','연예인','남자',26,'010-123-3333','2021-02-11');
insert into personinfo values (seq_start.nextval,'박병주','연예인','남자',22,'010-561-0173','2023-02-11');
insert into personinfo values (seq_start.nextval,'김영환','교사','여자',32,'010-612-3856','2023-02-11');
insert into personinfo values (seq_start.nextval,'박병주','엔지니어','남자',29,'010-292-3533','2023-02-11');
insert into personinfo values (seq_start.nextval,'박병주','프로그래머','남자',22,'010-812-3339','2023-02-11');
insert into personinfo values (seq_start.nextval,'최진평','교사','여자',22,'010-999-1533','2023-02-11');
insert into personinfo values (seq_start.nextval,'박병주','프로그래머','남자',31,'010-252-3083','2023-02-11');
commit;

--최종인원확인
select count(*) from personinfo;

--조회연습
select * from personinfo order by name asc;
select * from personinfo order by age desc;
select * from personinfo order by 5 asc; --컬럼번호도 가능

select * from personinfo order by gender,age desc;
select * from personinfo order by gender,name;

select job from personinfo;
select distinct job from personinfo;

--성이 '김'씨만 출력해봐
select * from personinfo where name like '김%';

--이름의 두번째 글자가 '영'인 사람만 출력
select * from personinfo where name like '_영%';

--핸드폰 마지막 자리가 3333인 사람
select * from personinfo where hp like '%3333';

--입사일자가 1월인 사람 출력
select * from personinfo where to_char(ipsaday,'mm')='01';

--입사년도가 2023년인 사람 출력
select * from personinfo where to_char(ipsaday,'yyyy')='2023';

--나이가 20~30 사이 출력
select * from personinfo where age between 20 and 30;

--직업이 연예인이거나 프로그래머인 사람 출력
select * from personinfo where job in('연예인','프로그래머');

----직업이 연예인이거나 프로그래머가 아닌 사람 출력
select * from personinfo where job not in ('연예인','프로그래머');

--평균나이, 소수점 한자리로 구하기
select round(avg(age),1) 평균나이 from personinfo;

select * from personinfo;

--내용수정 update
--SQL> UPDATE 테이블명 SET 컬럼1='변경할데이터' WHERE 컬럼2='데이터값';
--3번 직업 나이 수정하기, 조건이 없으면 모든 데이터가 수정된다는 조건 필수
update personinfo set job='간호사', age=35;
select*from personinfo;

--잘못 수정된 데이터 원래대로 돌리기
rollback;
select*from personinfo;

--3번만 수정하기
update personinfo set job='간호사', age=35 where num=3;

--최씨이면서 교사인 사람의 젠더를 여자에서 남자로 바꾸세요
update personinfo set gender='남자' where name like '최%' and job='교사';

--num이 8번인 사람의 직업을 엔지니어->교사로 변경하고 입사일을 2000-12-25로 수정하세요
update personinfo set job='교사',ipsaday='2000-12-25' where num=8;

--최종저장
commit;


--삭제
--SQL> DELETE FROM 테이블명;
delete from personinfo;  --조건문 안주면 모두 다 지워짐(11행)

rollback;
select * from personinfo;  

--5번만 삭제
delete from personinfo where num=5;  --(10행이 됨)

--여자중에서 나이가 25세이상만 모두 삭제 
delete from personinfo where gender='여자' and age>='25';  --(2행 줄어 8행이 됨)

--핸드폰을 ***-***-****으로 수정
update personinfo set hp='***-***-****';
select * from personinfo;  

--테이블삭제
--시퀀스 삭제
drop table personinfo;
drop sequence seq_start;

--dept에서 30번 부서를 시애틀로 변경해주세요
update dept set loc='SEATTLE' where deptno=30;
select * from dept;

--emp 테이블 Totalsal열을 하나 추가하세요 (number(20)으로 줄 것)
alter table emp add Totalsal number(20);
select * from emp;

--emp 테이블 Totalsal에 sal과 comm을 더한가격을 수정하세요
update emp set totalsal=sal+nvl(comm,0);
select * from emp;

--emp에서 WARD(사람이름) 삭제하시오
delete from emp where ename='WARD';
select * from emp;

--product 테이블에서 100번을 초코파이로 수정해주세요
update product set p_name='초코파이' where p_code='100';
select * from product;


--Group by
--professor에서 학과별로 교수들의 평균급여를 출력하시오(~별로 하면 그룹 생각하면 된다)
select deptno, avg(pay) "평균 급여" from professor group by deptno;

--select절에 사용된 그룹함수 이외의 컬럼이나 표현식은 반드시 group by에 사용되어야 한다.
--professor에서 직급별 평균보너스를 출력하세요
select position 직급, avg(bonus) 평균보너스 from professor group by position;

--학과별 직급별로 교수들의 평균급여
select deptno,position,avg(pay) "평균 급여" from professor group by deptno,position;

--student에서 학년별 최고키와 최고몸무게를 출력
select grade 학년,max(height) 최고키, max(weight) 최고몸무게 from student group by grade order by grade;

--교수의 직급별 총급여와 최고보너스를 구하시오
select position 직급, sum(pay) 총급여, max(bonus) 최고보너스 from professor group by position;

--emp에서 동일한 직업의 사원수 구하시오
--직무 사원수
select job 직무, count(empno) 사원수 from emp group by job;

--Having절_조건을 주고 검색할 때 쓰임_반드시 group by 뒤에 쓰인다.
--emp에서 평균급여가 2,000이상인 부서의 부서번호와 평균급여를 구하시오.
select deptno 부서, avg(sal) 평균급여 from emp group by deptno having avg(sal)>=2000;
--where절은 그룹함수의 비교조건으로 쓸 수 없다

--professor에서 평균급여가 300이상인 학과의 학과번호와 평균급여를 구하시오
select deptno 학과, avg(pay) 평균급여 from professor group by deptno having avg(pay)>=300;
--professor에서 평균급여가 300이상인 학과의 학과번호와 평균급여를 구하시오(101학과만 제외, 학과번호 내림차순)
select deptno 학과, avg(pay) 평균급여 from professor where deptno not in(101) group by deptno having avg(pay)>=300 order by deptno desc; 

--emp에서 job별로 sal의 평균급여를 구하시오
select job 직업, avg(sal) 평균급여 from emp group by job;

--professor에서 직급별 총급여를 구하시오
select position 직급, sum(pay) 총급여 from professor group by position;

--emp에서 직업별 인원수 최대급여 최소급여 출력하세요(job의 오름차순)
select job 직업, count(job) 인원수, max(sal) 최대급여, min(sal) 최소급여 from emp group by job order by job;

--emp에서 입사년도 그룹별로 출력(입사년도,인원수,급여평균(소수점 없이)_입사년도의 오름차순)
select to_char(hiredate,'yyyy') 입사년도, count(*) 인원수, round(avg(sal),0) 급여평균 from emp group by to_char(hiredate,'yyyy') order by to_char(hiredate,'yyyy');

--Rollup함수
--자동으로 소계/합계 구해주는 함수이다
--group by절에 주어진 조건으로 소계값 구해주는 것이다
--professor에서 정교수 부교수의 급여 소계값 구해보자
select deptno 학과번호, position 직위, sum(pay) 총급여 from professor group by position,rollup(deptno);

select deptno 학과번호, position 직위, sum(pay) 총급여 from professor group by deptno,rollup(position);

--count
select position, count(*), sum(pay) from professor group by rollup(position);

--cube함수
--rollup처럼 각소계에 전체총계까지 구해준다 (rollup과 차이점은 cube는 각소계와 총소계 둘다 계산된다)
select deptno,position, count(*), sum(pay) from professor group by cube(deptno,position);

--오늘의 총복습
--Q1. emp에서 평균급여가 2000이상인 부서의 부서번호와 평균급여를 구하시오
select deptno 부서번호, round(avg(sal),0) 평균급여 from emp group by deptno having avg(sal)>=2000;

--Q2. emp에서 deptno별 deptno가 10,20,30인 부서의 개수는?
select deptno 부서, count(deptno) 수 from emp group by deptno order by deptno;

--Q3. emp에서 job별 인원수를 구하시오(단, 인원이 2명보다 많은 곳만 구할것)
select job 직업, count(job) 인원 from emp group by job having count(job)>'2';

--Q4. emp에서 job별 급여합계를 구하는데 (PRESIDENT는 제외할 것) 급여합계가 5000 이상만 구하시고 급여합계가 높은 것부터 차례대로 나열하시오
select job 직업, sum(sal) 급여합계 from emp where job not in('PRESIDENT') group by job having sum(sal)>=5000 order by sum(sal) desc;

--제약조건
--테이블생성
create table sawon (num number(5) CONSTRAINT sawon_pk_num primary key,
name varchar2(20),gender varchar2(10),buseo varchar2(20) CONSTRAINT sawon_ck_buseo
check(buseo in('홍보부','인사부','교육부')),pay number(10) default 2000000);

--시퀀스 생성
create sequence seq_sawon nocache;

--데이터 10정도 insert
--에러메세지 : 체크 제약조건(JOOYOUNG.SAWON_CK_BUSEO)이 위배되었습니다
--insert into sawon values(seq_sawon.nextval,'이영미','여자','게임개발부',3500000);
insert into sawon values(seq_sawon.nextval,'이영미','여자','교육부',3500000);
insert into sawon values(seq_sawon.nextval,'김영철','남자','인사부',3700000);
insert into sawon values(seq_sawon.nextval,'이건희','남자','홍보부',3200000);
insert into sawon values(seq_sawon.nextval,'윤영철','남자','인사부',3100000);
insert into sawon values(seq_sawon.nextval,'전소미','여자','교육부',3900000);
insert into sawon values(seq_sawon.nextval,'신영미','여자','인사부',3700000);
insert into sawon values(seq_sawon.nextval,'오연수','여자','홍보부',2900000);
insert into sawon values(seq_sawon.nextval,'강소희','여자','교육부',4500000);
insert into sawon values(seq_sawon.nextval,'박희남','남자','인사부',5000000);
insert into sawon values(seq_sawon.nextval,'홍미나','여자','홍보부',2600000);
commit;

--부서별 인원수와 최고급여,최저급여 조회
select buseo 부서,count(*) 인원수, max(pay) 최고급여, min(pay) 최저급여 from sawon group by buseo;

--위의 쿼리문에서 최고급여,최저급여 화폐단위 붙이고 3자리 컴마도 나오게 해주세요
select buseo 부서,count(*) 인원수, to_char(max(pay),'l999,999,999') 최고급여, to_char(min(pay),'l999,999,999') 최저급여 from sawon group by buseo;

--성별 인원수와 평균급여를 출력하세요(인원수 뒤에 명이라고 나오도록 하시오)
select gender 성별, count(gender) ||'명' 인원수 , avg(pay) 평균급여 from sawon group by gender;

--부서별 인원수와 평균급여를 구하되 인원이 4명 이상인 경우에만 출력하도록 하세요
select buseo 부서,count(buseo) 인원수, avg(pay) from sawon group by buseo having count(buseo)>=4;