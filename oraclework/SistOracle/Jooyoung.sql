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


--7/10 문제
--Q1. emp에서 ename을 empname으로 바꾸세요
alter table emp rename column ename to empname;
select * from emp;

--Q2. gift에서 7번 노트북을 아이패드로 바꾸세요
update gift set gname='아이패드' where gno=7;
select * from gift;
rollback;

--Q3. gift에 10번 아이폰 9000001-1000000 한행을 추가하세요
insert into gift values (10,'아이폰',900001,1000000);
select* from gift;

--Q4. member에서 1003 서새알 멤버를 삭제하시오
delete from member where name='서새알';
select * from member;

--Q5. emp에서 입사일이 82/01/23인 사람의 이름,부서번호,급여를 출력하시오
select empname 이름, deptno 부서번호, sal 급여 from emp where hiredate='82/01/23';

--Q6. emp에서 직무별로 최대급여,최소급여,총급여,평균급여를 출력하시오
select job 직무, max(sal) 최대급여, min(sal) 최소급여, sum(sal) 총급여, round(avg(sal),0) 평균급여 from emp group by job;

--Join

--1. emp와 dept를 조인해서 emp사람들의 부서명을 구해보자
--사원명  부서명  

select e.empname, d.dname from emp e,dept d where e.deptno=d.deptno;
select empname, dname from emp e, dept d where e.deptno=d.deptno;
--테이블의 고유명사일 경우, e와 d 생략해도 된다


--student와 professor를 조인하여 다음과 같이 출력하시오
--학번  학생명  지도교수명
select s.studno 학번, s.name 학생명, p.name 지도교수명 from student s, professor p where s.profno=p.profno;

--학번  학생명  제1전공명 
select s.studno 학번, s.name 학생명, d.dname 제1전공명 from student s, department d where s.deptno1=d.deptno;

--교수명  직급  학과명
select p.name 교수명, p.position 직급, d.dname 학과명 from professor p, department d where p.deptno=d.deptno;

--사원번호  사원명  근무도시
--e1111 smith new york
select empno 사원번호, empname 사원명, loc 근무도시 from emp e, dept d where e.deptno=d.deptno;

--판매테이블 product join
--판매일자  과자명  전체 판매액
select to_char(to_date(p_date),'yyyy-mm-dd') 판매일자, p_name 과자명, p_total "전체 판매액" from panmae pa,product pr where pa. p_code=pr.p_code;

--primary 키와  foreign키를 생성한 조인테이블(부모,자식) 만들어보기

--sequence 만들어볼게요
create sequence seq_shop;

--shop테이블(부모)
create table shop(shop_num number(5) primary key, sangname varchar2(30), color varchar2(20));

--5개의 상품추가
insert into shop values(seq_shop.nextval,'요가매트','pink');
insert into shop values(seq_shop.nextval,'아령','black');
insert into shop values(seq_shop.nextval,'레깅스','beige');
insert into shop values(seq_shop.nextval,'저지','white');
insert into shop values(seq_shop.nextval,'양말','yellow');
commit;

delete from shop where shop_num=1;
drop sequence seq_shop;

--sequence 만들어볼게요
create sequence seq_shop;

--shop테이블(부모)
create table shop(shop_num number(5) primary key, sangname varchar2(30), color varchar2(20));

--5개의 상품추가
insert into shop values(seq_shop.nextval,'요가매트','pink');
insert into shop values(seq_shop.nextval,'아령','black');
insert into shop values(seq_shop.nextval,'레깅스','beige');
insert into shop values(seq_shop.nextval,'저지','white');
insert into shop values(seq_shop.nextval,'양말','yellow');
commit;

--cart1...상품정보는 shop테이블의 shop_num값을 외부키로 지정
create table cart1(idx number(5) primary key,shop_num number(5) CONSTRAINT cart_fk_shopnum REFERENCES shop(shop_num), cnt number(5), guipday date);

--cart2...상품정보는 shop테이블의 shop_num값을 외부키로 지정
--부모테이블의 상품을 지우면 그 상품과 관련된 카트를 자동으로 지워준다
create table cart2(idx number(5) primary key, shop_num number(5) references shop(shop_num) on delete cascade, cnt number(5), guipday date);

select * from shop order by shop_num;
delete from shop where shop_num=6;

--cart1에 상품추가 _1번
insert into cart1 values(seq_shop.nextval,1,2,sysdate);
insert into cart1 values(seq_shop.nextval,3,4,sysdate);
insert into cart1 values(seq_shop.nextval,2,1,sysdate);
insert into cart1 values(seq_shop.nextval,4,2,sysdate);
insert into cart1 values(seq_shop.nextval,5,1,sysdate);

select * from cart1;
--insert into cart1 values(seq_shop.nextval,6,3,sysdate); 부모키에 없기에 무결성 제약조건에 위배된다.

delete from cart1 where shop_num=4;
delete from cart1 where shop_num=3;

delete from cart2 where shop_num=4;


--cart2에 상품추가
insert into cart2 values(seq_shop.nextval,3,1,sysdate);
insert into cart2 values(seq_shop.nextval,2,4,sysdate);
insert into cart2 values(seq_shop.nextval,1,1,sysdate);
insert into cart2 values(seq_shop.nextval,4,2,sysdate);
insert into cart2 values(seq_shop.nextval,5,1,sysdate);

--cart1: 부모 1,2,5 존재  cart2: 부모에 1,2,3,5가 존재


--shop의 1번 상품 삭제될까요?
--delete from shop where shop_num=1;
--ORA-02292: 무결성 제약조건(JOOYOUNG.CART_FK_SHOPNUM)이 위배되었습니다- 자식 레코드가 발견되었습니다

--cart2에서 3번 데이터 지워보자
delete from shop where shop_num=3;
rollback;

commit;
select * from cart2;

--cart1에 담긴상품을 shop테이블과 join에서 자세히 출력
--방법:
select c1.idx, s.shop_num, s.sangname, s.color, cnt, c1.guipday from shop s,cart1 c1 where s.shop_num=c1.shop_num;


--부모테이블

--자식테이블(자식테이블에 연결된 부모가 있어도 부모를 삭제할 수 있으며, 부모테이블 삭제 시 자동으로 자식테이블 삭제된다.)

--최종출력
--주문번호   음식명   가격   개수   주문일자   (가격은 원단위 붙이고, 개수에는 개라고 붙이기)

create sequence seq_Menu;
create table Menu(m_num number(6) primary key, m_name varchar2(20), price number(6));
select * from menu;

create table MyOrder(idx number(6) primary key, m_num number(6) references Menu(m_num) on delete cascade, cnt number(5), o_date date);

insert into menu values(seq_menu.nextval,'떡볶이',4000);
insert into menu values(seq_menu.nextval,'순대',3000);
insert into menu values(seq_menu.nextval,'어묵',1500);
insert into menu values(seq_menu.nextval,'피카츄',2500);
insert into menu values(seq_menu.nextval,'콜팝',5000);
commit;

insert into myorder values(seq_menu.nextval,1,5,sysdate);
insert into myorder values(seq_menu.nextval,2,2,sysdate);
insert into myorder values(seq_menu.nextval,3,6,sysdate);
insert into myorder values(seq_menu.nextval,4,1,sysdate);
insert into myorder values(seq_menu.nextval,5,3,sysdate);
commit;

select idx 주문번호,m_name 음식명, to_char(price,'l999,999,999') 가격, lpad(cnt,10) ||'개' 개수, lpad(o_date,10) 주문일자 from menu m,myorder o where m.m_num=o.m_num;

-------------------------------------------------------------------------------------------------
create table board (bno number(3) constraint board_pk_bno primary key, writer varchar2(20), subject varchar2(100), writeday date);

--board에 5개 insert
insert into board values(seq_sawon.nextval,'이수연','안녕 애들아',sysdate);
insert into board values(seq_sawon.nextval,'효지니','오늘 만나자',sysdate);
insert into board values(seq_sawon.nextval,'준상아','오늘 난 운동가',sysdate);
insert into board values(seq_sawon.nextval,'피곤한 월요일','오늘 나는 아파서 병원가',sysdate);
insert into board values(seq_sawon.nextval,'둘리','비 안오니',sysdate);
commit;

--answer라는 댓글(자식)
--부모글 지우면 자식글 자동삭제 되게 만드세요
create table answer (num number(5) constraint answer_pk_num primary key, bno number(3) constraint answer_fk_bno references board(bno) on delete cascade, nickname varchar2(20), content varchar2(30),writeday date);

select * from board;

--원하는 글에 댓글 추가하기
insert into answer values(seq_sawon.nextval,14,'영지니','효지나 나 오늘 못나가',sysdate);
insert into answer values(seq_sawon.nextval,12,'고슴도치','둘리야 지금 비 와',sysdate);
insert into answer values(seq_sawon.nextval,14,'진영이','효지나 나랑 놀자',sysdate);
insert into answer values(seq_sawon.nextval,15,'머슬맨','운동 잘하고 와',sysdate);
insert into answer values(seq_sawon.nextval,13,'연하울','반가워',sysdate);
commit;


select * from answer;
delete from answer where num=17;


--join으로 출력
--원글번호  작성자  작성자글  댓글단사람  댓글내용  원글날짜  댓글날짜 

select b.bno 원글번호, writer 작성자, subject 작성자글, nickname 댓글단사람, content 댓글내용, b.writeday 원글날짜, a.writeday 댓글날짜 from board b,answer a where b.bno=a.bno;

--14번 원글 삭제
delete from board where bno=14;

--board를 먼저 삭제
drop table board; --외래 키에 의해 참조되는 고유/기본 키가 테이블에 있습니다

--자식
drop table answer;


--shop,cart 모두 삭제
--외부키로 연결이 된 경우, 자식테이블 먼저 삭제 후 부모테이블 삭제 가능
drop table cart1;
drop table cart2;
drop table shop;


select * from board;
select * from answer;

----------------------------------------------------------------------------------------
--주문번호  주문자  음식명  가격  상호명  가게위치  배송지

create sequence seq_food;
create table food(fno number(5) primary key, foodname varchar2(20), price number(5), shopname varchar2(20), loc varchar(20));
create table jumun(num number(5) primary key, name varchar(20), fno number(5) constraint jumun_pk_fno references food(fno), addr varchar2(20) );

insert into food values(110,'삼겹살',25000,'333삼겹살','서울 강남');
insert into food values(111,'곱창',28000,'곱창이야기','서울 역삼');
insert into food values(112,'칼국수',15000,'칼칼한 칼국수','서울 합정');
insert into food values(113,'연어',32000,'싱싱한연어랑','서울 용산');
insert into food values(114,'샤브샤브',48000,'최고의샤브','서울 방배');
commit;

drop table food;
drop table jumun;

rollback;
insert into food values(seq_food.nextval,'삼겹살',25000,'333삼겹살','서울 강남');
insert into food values(seq_food.nextval,'곱창',28000,'곱창이야기','서울 역삼');
insert into food values(seq_food.nextval,'칼국수',15000,'칼칼한 칼국수','서울 합정');
insert into food values(seq_food.nextval,'연어',32000,'싱싱한연어랑','서울 용산');
insert into food values(seq_food.nextval,'샤브샤브',48000,'최고의샤브','서울 방배');
commit;

select * from food;
insert into jumun values(seq_food.nextval,'강남인',6,'서울 강남');
insert into jumun values(seq_food.nextval,'오인영',8,'서울 홍대');
insert into jumun values(seq_food.nextval,'설상인',9,'서울 용산');
insert into jumun values(seq_food.nextval,'김나라',7,'서울 문래');
insert into jumun values(seq_food.nextval,'여의주',10,'서울 여의도');
commit;

select num 주문번호, name 주문자, foodname 음식명, price 가격, shopname 상호명, loc 가게위치, addr 배송지 from food f,jumun j where f.fno=j.fno order by name;

select * from food;
select * from jumun;

--7/10 과제
create sequence seq_snsboard;
create table snsboard(b_num number(5) primary key, nick varchar2(20), subject varchar2(20), content varchar(20), wday date);

insert into snsboard values(seq_snsboard.nextval,'가','안녕','인사',sysdate);
insert into snsboard values(seq_snsboard.nextval,'나','카페','홍보',sysdate);
insert into snsboard values(seq_snsboard.nextval,'다','다이빙','취미',sysdate);
insert into snsboard values(seq_snsboard.nextval,'라','음식','먹방',sysdate);
insert into snsboard values(seq_snsboard.nextval,'마','오늘의 명언','명언',sysdate);
insert into snsboard values(seq_snsboard.nextval,'바','요리','소개',sysdate);
insert into snsboard values(seq_snsboard.nextval,'사','해외여행추천지','여행',sysdate);
insert into snsboard values(seq_snsboard.nextval,'아','사회생활','꿀팁',sysdate);
insert into snsboard values(seq_snsboard.nextval,'자','언어','공부',sysdate);
insert into snsboard values(seq_snsboard.nextval,'차','메이크업샵','광고',sysdate);
commit;

select * from snsboard;
drop table snsboard;

select b_num 기본키, nick 닉네임, subject 제목, content 내용, wday 현재날짜 from snsboard;

--07/11

--시퀀스
create sequence seq1;

--테이블
create table myinfo (num number(5) primary key, name varchar2(20), addr varchar2(30), sdate date);

-----------------------------------------------
--테이블(myshop)
create sequence seq_myshop;

create table myshop (shopnum number(5) primary key, sangpum varchar2(20), su number(5), price number(5), ipgo date);

select * from myshop;

----------------------------------------------
--과제
create sequence seq_stu;

create table mystudent (stu_num number(5) primary key, stu_name varchar2(20), stu_grade number(5), hp varchar2(20), addr varchar2(30), age number(5), sdate date);
-----------------------------------------------------------
--day0801
create sequence seq_1;

create table info(num number(5) primary key,
name varchar2(20),hp varchar2(20),
age number(3),photo varchar2(100));

insert into info values(seq_1.nextval,'미니언즈5','010-555-6666',35,'../jquery_img/05.png');

commit;
-----------------------------------------------------------

--team
create table team (num number(5) primary key,
name varchar2(20), addr varchar2(50), writeday date);

insert into team values(seq_1.nextval,'길순이','서울시 강동구',sysdate);

commit;

-------------------------------------------------------------
--day0802(1)
create table myfood(num number(3) primary key, foodname varchar2(20), foodphoto varchar(50),
price number(5), cnt number(5));

insert into myfood values(seq_food.nextval,'리조또','../Food/5.jpg',12000,2);

commit;

select * from myfood;

---------------------------------------------------------------
--day0802(2)
create table shop(num number(3) primary key,
sangpum varchar2(30), color varchar2(20), price number(5),
imgname varchar2(50));

insert into shop values (seq1.nextval,'롱원피스','white',88000,'../image/28.jpg');

commit;
select*from shop;
delete shop where num=24;
--------------------------------------------------------------
--day0802(3)
create table myfriend(num number(3) primary key, fname varchar2(20), fhp varchar2(30), faddr varchar2(50), gaipday date);

insert into myfriend values(seq1.nextval,'다롱이','010-555-6666','제주',sysdate);
commit;
select * from myfriend;
---------------------------------------------------------------
--day0802(4)
create table sinsang(num number(5) primary key, name varchar2(20), addr varchar2(30), sdate date);

---------------------------------------------------------------
--day0803(1)
create table myteam(num number(3) primary key, tname varchar2(20),
driver varchar2(10), taddr varchar2(50), writeday date);

select * from myteam;

delete from myteam where num=41;
rollback;

----------------------------------------------------------------
--day0803(2)
create table mymall(num number(3) primary key, sangpum varchar2(30),
photo varchar2(50), price number(5), ipgoday varchar2(20), writeday date);

select * from mymall;
delete from mymall where num=51;

------------------------------------------------------------------
--day0804(1)
create table intro(intro_num number(5) primary key, intro_name varchar2(10),intro_blood varchar2(5),
intro_hp varchar2(20), intro_city varchar2(30), gaipday date);


select * from intro;
-------------------------------------------------------------------
--day0807(1)
create table memo(num number(3) primary key,writer varchar2(10),story varchar2(500),avata varchar2(50),writeday date);

drop table memo;

insert into memo values(seq1.nextval,'전성','나 오늘 외롭다','../flower_ani/s1.JPG',sysdate);

commit;

select * from memo;

select * from intro;

delete from intro where intro_num=105;

delete from memo where num=41;

insert into memo values(seq1.nextval,'라이언','하트뿅뿅','../avata/b3.png',sysdate);
commit;
--------------------------------------------------------------------
--day0809(1)
create table ajaxboard(num number(3) primary key, writer varchar2(20),
subject varchar2(100), story varchar2(1000), avata varchar2(50), writeday date);

drop table ajaxboard;

select * from ajaxboard;

insert into ajaxboard values(seq_1.nextval,'해리','오늘영화보실분','오늘쿠폰이 지급됩니다','../avata/b1.png',sysdate);

commit;
----------------
alter table intro modify intro_name varchar2(100);
