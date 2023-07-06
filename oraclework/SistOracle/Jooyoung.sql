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
