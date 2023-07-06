--emp���̺��� ename�� ��ȸ�Ͻÿ�
select ename from EMP;
--emp���̺��� job�� ��ȸ�Ͻÿ�
select ename,job from emp;
--emp ���̺� ��ü��ȸ
select * from emp;
--student���̺� ��ü��ȸ
select * from student;
--ǥ����
select name, '���ݽǽ���' from student;
--�÷� ��Ī allias���
select name "�̸�",grade as "�г�",birthday ���� from student;
--emp���� �����,����,�Ի����ڸ� ��ȸ�Ͻÿ�
select ename �����,job as "����",hiredate �Ի����� from emp;
--DISTINCT: �ߺ��� ���� �����ϰ� ����ϱ�
--emp���� �������� �ߺ����� ���� ����ϼ���
select DISTINCT job "�� �� ��" from emp;
--emp���� �μ���ȣ�� �ߺ����� ����ϼ���
select DISTINCT deptno �μ���ȣ from emp;
--�ռ�������: �÷��� ������ ���
select name||grade �г⺰�л��� from student;
--professor��ȸ
select * from professor;
--�ϳ��� �÷����� ���_���������� �������Դϴ�(�ռ������� �ʿ�)
select name || '���� ' || position || '�Դϴ�' "����������" from professor;
--emp���� smith���� job�� clerk�Դϴ�
select ename || '���� job��' || job || '�Դϴ�' from emp;
--student���� ���������� Ű�� 180cm, �����Դ� 72kg�Դϴ�
select name || '���� Ű�� ' || height || 'cm, �����Դ� ' || weight || 'kg�Դϴ�' from student;
--emp���� �������� salesman�̰� ������ ***�Դϴ�
select '�������� ' || job || '�̰� ������ ' || sal || '�Դϴ�' from emp;

--����
--student���� �л��� �г� ������ �л����� ������������ ��ȸ�Ͻÿ�
select name �л���,grade �г�,birthday ���� from student order by name asc;
select name �л���,grade �г�,birthday ���� from student order by birthday;
--emp���� �����,����,�޿��� ��ȸ�ϴµ� �޿��� ������������� ��ȸ�ϼ���
select ename �����,job ����,sal �޿� from emp order by 3 desc; --�÷���ȣ�� ���ĵ� �����ϴ�
--emp���� �������� �ߺ����� ����ϰ� �������� ������������ ����Ͻÿ�
select DISTINCT job ������ from emp order by job;

--���������
--emp���� sal�� Ư�����ʽ� 100�� ���Ͽ� ����Ͻÿ�
select ename �����,sal �⺻��,sal+100 Ư�����ʽ� from emp;


--where�� : ������
--emp���� 10���μ��� �ٹ��ϴ� ����� �����,�޿��� �μ���ȣ�� ����ϼ���
select ename �����,sal �޿�,deptno �μ���ȣ from emp where deptno=10;
--emp���� �̸��� KING�� ����� �����,������ ��ȸ�Ͻÿ�
select ename �����,job ���� from emp where ename='KING';
--emp���� �޿��� 3000�̻��� ����� ����� �޿��� ��ȸ�Ͻʽÿ�
select ename �����,sal �޿� from emp where sal>=3000;
--�л����̺��� Ű�� 180cm�̻��� �л���� Ű�� ����Ͻÿ�
select name �л���,height Ű from student where height>=180;
--�л����̺��� Ű�� 160cm~180cm������ �л���� Ű�� ����Ͻÿ�(between A_������ and B_ū��)
select name �л���,height Ű from student where height between 160 and 180 order by height;
--in(a,b) : a,b�� ��ȸ
--emp���� deptno�� 20,30�� ������� ������ �μ���ȣ�� ��ȸ
select ename �����,deptno �μ���ȣ from emp where deptno IN(20,30);


--emp���� null���� ����Ͻÿ�
--emp���� comm�� null�� ����� �̸��� ���ʽ��� ����ϼ���
select ename �����,comm ���ʽ� from emp where comm is null;
select ename �����,comm ���ʽ� from emp where comm is not null;
--NVL : null�� 0���� �ٲٱ�,������ ����
select ename �����, nvl(comm,0) ���ʽ� from emp;

--Like������
--�л����̺��� �达�� ��ȸ�Ͽ� ��翭�� ����Ͻÿ�
select * from student where name like '��%';

--Like % : _����� �̿��ؼ� Ư�������� �ִ� ���� ���
--emp���� ������� �ι�°���ڰ� a�� ����� ����� ���
select ename ����� from emp where ename like '_A%';
--emp���� ������� ����°���ڰ� a�� ����� ����� ���
select ename ����� from emp where ename like '__A%';
--emp���� ����� 2��°���ڰ� a�� ��� �Ǵ� 3��° ���ڰ� a�� ����� ������� ����Ͻÿ�
select ename ����� from emp where ename like '_A%' or ename like '__A%';

--�л����̺� �� ���?
select count(*) cnt from student;
--emp���� job�� salesman,manager�� �����,�۾����� ����ϼ���(or�����ڿ� in �����ڷ� ���_����)
select ename �����,job ������ from emp where job='SALESMAN' or job='MANAGER';
select ename �����,job ������ from emp where job in('SALESMAN','MANAGER');

--emp���� �޿��� 2000~3000�� �����,������,�޿��� ����Ͻÿ�(and, between������ ���� ���)
select ename �����,job ������,sal �޿� from emp where sal>=2000 and sal<=3000;
select ename �����,job ������,sal �޿� from emp where sal between 2000 and 3000;

--Q.student ���̺��� 1�г� �л��� �л���, Ű�� ����ϼ���(��, Ű�� ������...)
select name �л���,grade �г�,height Ű from student where grade=1 order by height;

--Q.student���� 2�г� �л��� �л��� ���� Ű �����Ը� ����ϼ���(��, ������ ���� ��� ����)
select name �л���,grade �г�,birthday ����,height Ű,weight ������ from student where grade=2 order by birthday;

--Q.professor���� �������� �̸��� ���� ���� ���� ������ ������,����,�Ի����ڸ� ����Ͻÿ�
select name ������,position ����,hiredate �Ի����� from professor where name like '��%';

--Q.emp���� �����,�޿�,�޿�*12,���ʽ�,�޿��Ѱ踦 ���Ͻÿ�
select ename �����,sal �޿�, sal*12 "�޿�*12",nvl(comm,0) ���ʽ�, sal*12+nvl(comm,0) �޿��Ѱ� from emp;

--Q.emp���� �Ի����ڰ� 1982�⵵ ���Ŀ� ���� ����� ������ �Ի����ڸ� ��ȸ�Ͻÿ�
select ename �����, hiredate �Ի����� from emp where hiredate>='82/01/01' order by hiredate;

--��¥ ���ͷ� '' �ݵ�� ���
--emp���� ������ clerk�̰� �Ի����� 87/05/23�� ����� ����� �Ի��� ���ϱ�
select ename �����,hiredate �Ի��� from emp where job='CLERK' and hiredate='87/05/23';

--emp���� �Ŵ����̰ų� 82������ �Ի����� ����� ������ �Ի��� ���
select ename �����,job ������,hiredate �Ի��� from emp where job='MANAGER' or hiredate >='82/01/01' order by hiredate;


--��������
--student���� �л��� �̸��� Ű�� ������ ���(Ű�� ���� �������, �����Դ� ���� �������)
select name �л���,height Ű,weight ������ from student where grade=1 order by height asc,weight desc;

--emp���� �޿� �������� �Ŀ� �ٽ� �̸����� ��������_���:�����ȣ,�����,�޿�
select empno �����ȣ ,ename �����,sal �޿� from emp order by sal desc,ename asc; 


select*from student;
--union
--union All
--intersect
select name from student where  deptno1=101 union all
select name from student where deptno2=201;


--Q.GOGAK(�����̺�) point�� 30��~50�� ����� ����Ʈ�� ����ϼ���(����Ʈ ������)
select gname ����, point ����Ʈ from GOGAK where point between 300000 and 500000 order by point desc;

--Q.emp�� comm�� ���� 0���� �ٲپ ������ manager�� ����� �̸��� ���ʽ��� ����Ͻÿ�
select ename �����, nvl(comm,0) ���ʽ� from emp where job='MANAGER';

--Q.professer 103�� �а� �������� �̸��� �޿�,���ʽ�,����(�޿�*12+���ʽ�)�� ����Ͻÿ�
select name �̸�,pay �޿�,bonus ���ʽ�,pay*12+bonus ���� from professor where deptno='103';

--SQL �׷��Լ�(count,sum,avg)
--count(*): null�� ����, count(�÷�):null�� ����
select count(*),count(hpage) from professor;

select count(bonus), sum(bonus) from professor;

select count(bonus),sum(bonus),avg(bonus) from professor;

--max,min
select max(sal),min(sal) from emp;
select max(hiredate),min(hiredate) from emp;

--�Ҽ���
--emp���� sal�� ���
select round(avg(sal),1) from emp;  --�Ҽ��� 1�ڸ�
select round(avg(sal),2) from emp;
select round(avg(sal),0) from emp;  --�ݿø�
select round(avg(sal),-1) from emp;  --10���� �ݿø�
select round(avg(sal),-2) from emp;  --100���� �ݿø�

--�ֿܼ� �Է�
--���糯¥�� �ֿܼ� ���
select sysdate from dual;

--���ϳ�¥�� �ֿܼ� ���
select sysdate from dual;

--to_char : ��¥ �� ��ġ �����͸� ���ڷ� ��ȯ���ֱ� ���� �Լ�
--��¥���� �⵵�� ����
select to_char(sysdate,'year')from dual;  --����� ����
select to_char(sysdate,'yyyy')from dual;  --2023

select to_char(sysdate,'MM')from dual;
select to_char(sysdate,'dd')from dual;

select to_char(sysdate,'yyyy-mm-dd hh24-mi-ss') from dual;

--to_char : ���ڿ��� ���� �����ϴ�
select to_char(245897714,'999,999,999') from dual;

--emp
select empno �����ȣ,ename �����,to_char(hiredate,'yyyy')�⵵ from emp;

--Q.emp���� �����ȣ,�����,�޿� ���(�޿��� õ�������б�ȣ �ٿ��ֱ�)
select empno �����ȣ,ename �����,sal �޿�, to_char(sal,'l999,999,999') ȭ��ݾ� from emp;

--��������
--�����ȿ� �Ǵٸ� ���� ���(KING���� �޿��� ���� �޴� �����?)_2���� ����
--���������� ���� ����_�� ����� ���������� �����ְ� �װ��� �޾� ���������� ����
--�������� �ȿ��� order by���� �� �´�

--emp���� KING���� �޿� ���� �޴� ����� ����� �޿��� ���غ���
select ename �����,sal �޿� from emp where sal>(select sal �޿� from emp where ename='JAMES');

--emp���� ��ձ޿����� ���� �޴� ����� �����ȣ,�����,�޿��� ��Ÿ���ÿ�
select empno �����ȣ,ename �����,sal �޿� from emp where sal > (select avg(sal) �޿� from emp);

--emp���� �̸��� WARD�� ����� MGR�� ���� ���� ���� ����� ������
select * from emp where mgr=(select mgr from emp where ename='WARD');

--emp���� ��ձ޿����� ���� �޴� ��� ��?
select count(*) �ο��� from emp where sal>(select avg(sal) �޿� from emp);

--�������� ����
--Q1.emp���� ADAMS�� ���� �������� ���� ����� �̸� ���� ������ ���
select ename �����,sal ����,job ���� from emp where job=(select job ���� from emp where ename='ADAMS');

--Q2.emp���� SCOTT�� ���� ������ �޴� ����� �̸��� �������
select ename �����,sal ���� from emp where sal=(select sal ���� from emp where ename='SCOTT');

--Q3.student���� ��1������ ������ �л��� ������ �л����� �л��� ��1���� ���
select name �л���, deptno1 ��1���� from student where deptno1=(select deptno1 ��1���� from student where name='������'); 

--Q4.student���� ��1������ 101�� �а��� ��ո����Ժ��� �����԰� ���� �л����� �̸��� ������ ���
select name �л���,weight ������ from student where weight>(select avg(weight) ������ from student where deptno1='101');  

--Q5.professor���� �Ի����� �迵�� �������� ���߿� �Ի��� ����� �̸��� �Ի��� �а���ȣ�� ����Ͻÿ�
select name �̸�,hiredate �Ի���, deptno �а���ȣ from professor where hiredate>(select hiredate �Ի��� from professor where name='�迵��');
