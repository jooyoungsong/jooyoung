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

--��������
--Q1. emp���� job �������� �������� �ѹ����� ����غ�����
select distinct job ���� from emp;
--Q2. emp���̺��� ������� A�� S�� �����ϴ� ����� ����غ�����(�����ȣ �����)
select empno �����ȣ,ename ����� from emp where ename like 'A%' or ename like 'S%';
--Q3. emp���� deptno�� 10�� �μ��� ����Ͻÿ�(����� �����ȣ)
select ename �����, empno �����ȣ from emp where deptno=10;
--Q4. emp���� �޿�(sal)�� ��պ��� �� ���� ����� ������ �޿��� ����Ͻÿ�(6��)
select ename �����, sal �޿� from emp where sal >(select avg(sal) �޿� from emp);
--Q5. SCOTT�� �޿��� �����ϰų� ������ �޴� ����� ������ �޿��� ����Ͻÿ�(3��)
select ename �����, sal �޿� from emp where sal >= (select sal �޿� from emp where ename ='SCOTT');
--Q6. emp���� hiredate�� ���� 5���� ����� ����� �Ի����� ����Ͻÿ�(to_char �̿�)
select ename �����, hiredate �Ի����� from emp where to_char(hiredate,'mm')='05';


--7��7��
--1.���̺� ����
--primary key�� �⺻Ű�� �ǹ� not null+unique�� �ǹ��Ѵ�

--test���̺�
create table test (num number(5) primary key,
name varchar2(20), score number(6,2), birth date);

desc test; --��������
select * from test;

--test�� ��ü ������ insert
insert into test values(1,'�ռ���',67.2,'1995-10-22');
--test�� �Ϻ� ������ insert
insert into test(num,name) values (2,'��ȣ��');

--insert ����
--���Ἲ ���� ����(JOOYOUNG.SYS_C008353)�� ����
insert into test values(4,'�̿���',68.78,'1989-11-12');

--sysdate ���糯¥�� �ǹ�
insert into test values(5,'��ȿ��',88.96,sysdate);

--alter
--���̸� ������ �÷� �߰�, ������ null�� �߰�
--���̺� �÷��߰� : SQL> ALTER TABLE ���̺�� ADD �߰����÷��� ������Ÿ��;

alter table test add age number(5);

--�ּҸ� ������ �÷��� �߰��ϴµ� �ʱⰪ�� ��������� ����
alter table test add addr varchar2(30) default '������';
select * from test;

--SQL����: ORA-00913: ���� ���� �ʹ� �����ϴ�
--insert into test values(4,'�̿���',68,78,'1989-11-12',22,'���ѹα�  ����� ');

--���̺� �÷��� Ÿ�Ժ���
--SQL> ALTER TABLE ���̺�� MODIFY �÷��� ������Ÿ��;
alter table test modify addr varchar2(50);

--age Ÿ���� ���ڿ�(10)���� �����ϰ� �ʱⰪ�� 20���� �����ϱ�
--���� null�� �״�� �ְ� ���� insert�ϴ� �ͺ��� �ʱⰪ ��
alter table test modify age varchar(10) default '20';

insert into test (num,name) values (10,'��ȣ��');

--num�� �������� ���
select * from test order by num;
select * from test order by num desc;

--drop
--age��� �÷��� ����
--SQL> ALTER TABLE ���̺�� DROP COLUMN �������÷���
alter table test drop column age;
--addr �÷��� ����
alter table test drop column addr;

--�÷��� ����
--SQL> ALTER TABLE ���̺�� RENAME COLUMN  OLD�÷��� TO NEW�÷���; 
--score==>jumsu�� �����غ�����
alter table test rename column score to jumsu;
--birth==>birthday�� �����غ�����
alter table test rename column birth to birthday;

--test ���̺� ����
drop table test;
selet * from test;

--������ ����
--������ �⺻���� ����, 1���� 1�� �����ϴ� ������ ������
create sequence seq1;

--��ü������ Ȯ��
select * from seq;

--���� ���������� �߻� �ֿܼ� ���
select seq1.nextval from dual;

--���� ������ �߻��� ��������
select seq1.currval from dual;

--seq1����
drop sequence seq1;

--10���� 5�� �����ϴ� ������ ���� cash�� ���ֱ�
create sequence seq2 start with 10 increment by 5 nocache;

--������ �߻�
select seq2.nextval from dual;

--������2 ����
drop sequence seq2;

--seq1 : ���۰� 5 ������ 2 ����:30  ĳ��:no cycle:y
create sequence seq1 start with 5 increment by 2 maxvalue 10 nocache cycle;

--seq2 ���۰��� 1 ������ 1 cache:no
create sequence seq2 nocache; --�⺻�� 11�̶� ����ó�� �� �ᵵ �ȴ�

--seq3 ���۰��� 1 ������ 2 cache:no
create sequence seq3 start with 1 increment by 2 nocache;

--���
select seq1.nextval,seq2.nextval,seq3.nextval from dual;

--��ü ����
drop sequence seq1;
drop sequence seq2;
drop sequence seq3;

------------------------������ 1�� ����, ���̺� ����
create sequence seq_start nocache;

create table personinfo (num number(5) primary key,
name varchar2(20),
job varchar2(30),
gender varchar2(20),
age number(5),
hp varchar2(20),
birthday date);

desc personinfo;

--birthday==>ipsaday�� ����
alter table personinfo rename column birthday to ipsaday;
select*from personinfo;

--insert
insert into personinfo values (seq_start.nextval,'�ں���','�����Ͼ�','����',22,'010-222-3333','2023-02-11');
insert into personinfo values (seq_start.nextval,'�迵��','����','����',25,'010-222-4561','2022-01-11');
insert into personinfo values (seq_start.nextval,'�ں���','������','����',26,'010-123-3333','2021-02-11');
insert into personinfo values (seq_start.nextval,'�ں���','������','����',22,'010-561-0173','2023-02-11');
insert into personinfo values (seq_start.nextval,'�迵ȯ','����','����',32,'010-612-3856','2023-02-11');
insert into personinfo values (seq_start.nextval,'�ں���','�����Ͼ�','����',29,'010-292-3533','2023-02-11');
insert into personinfo values (seq_start.nextval,'�ں���','���α׷���','����',22,'010-812-3339','2023-02-11');
insert into personinfo values (seq_start.nextval,'������','����','����',22,'010-999-1533','2023-02-11');
insert into personinfo values (seq_start.nextval,'�ں���','���α׷���','����',31,'010-252-3083','2023-02-11');
commit;

--�����ο�Ȯ��
select count(*) from personinfo;

--��ȸ����
select * from personinfo order by name asc;
select * from personinfo order by age desc;
select * from personinfo order by 5 asc; --�÷���ȣ�� ����

select * from personinfo order by gender,age desc;
select * from personinfo order by gender,name;

select job from personinfo;
select distinct job from personinfo;

--���� '��'���� ����غ�
select * from personinfo where name like '��%';

--�̸��� �ι�° ���ڰ� '��'�� ����� ���
select * from personinfo where name like '_��%';

--�ڵ��� ������ �ڸ��� 3333�� ���
select * from personinfo where hp like '%3333';

--�Ի����ڰ� 1���� ��� ���
select * from personinfo where to_char(ipsaday,'mm')='01';

--�Ի�⵵�� 2023���� ��� ���
select * from personinfo where to_char(ipsaday,'yyyy')='2023';

--���̰� 20~30 ���� ���
select * from personinfo where age between 20 and 30;

--������ �������̰ų� ���α׷����� ��� ���
select * from personinfo where job in('������','���α׷���');

----������ �������̰ų� ���α׷��Ӱ� �ƴ� ��� ���
select * from personinfo where job not in ('������','���α׷���');

--��ճ���, �Ҽ��� ���ڸ��� ���ϱ�
select round(avg(age),1) ��ճ��� from personinfo;

select * from personinfo;

--������� update
--SQL> UPDATE ���̺�� SET �÷�1='�����ҵ�����' WHERE �÷�2='�����Ͱ�';
--3�� ���� ���� �����ϱ�, ������ ������ ��� �����Ͱ� �����ȴٴ� ���� �ʼ�
update personinfo set job='��ȣ��', age=35;
select*from personinfo;

--�߸� ������ ������ ������� ������
rollback;
select*from personinfo;

--3���� �����ϱ�
update personinfo set job='��ȣ��', age=35 where num=3;

--�־��̸鼭 ������ ����� ������ ���ڿ��� ���ڷ� �ٲټ���
update personinfo set gender='����' where name like '��%' and job='����';

--num�� 8���� ����� ������ �����Ͼ�->����� �����ϰ� �Ի����� 2000-12-25�� �����ϼ���
update personinfo set job='����',ipsaday='2000-12-25' where num=8;

--��������
commit;


--����
--SQL> DELETE FROM ���̺��;
delete from personinfo;  --���ǹ� ���ָ� ��� �� ������(11��)

rollback;
select * from personinfo;  

--5���� ����
delete from personinfo where num=5;  --(10���� ��)

--�����߿��� ���̰� 25���̻� ��� ���� 
delete from personinfo where gender='����' and age>='25';  --(2�� �پ� 8���� ��)

--�ڵ����� ***-***-****���� ����
update personinfo set hp='***-***-****';
select * from personinfo;  

--���̺����
--������ ����
drop table personinfo;
drop sequence seq_start;

--dept���� 30�� �μ��� �þ�Ʋ�� �������ּ���
update dept set loc='SEATTLE' where deptno=30;
select * from dept;

--emp ���̺� Totalsal���� �ϳ� �߰��ϼ��� (number(20)���� �� ��)
alter table emp add Totalsal number(20);
select * from emp;

--emp ���̺� Totalsal�� sal�� comm�� ���Ѱ����� �����ϼ���
update emp set totalsal=sal+nvl(comm,0);
select * from emp;

--emp���� WARD(����̸�) �����Ͻÿ�
delete from emp where ename='WARD';
select * from emp;

--product ���̺��� 100���� �������̷� �������ּ���
update product set p_name='��������' where p_code='100';
select * from product;


--Group by
--professor���� �а����� �������� ��ձ޿��� ����Ͻÿ�(~���� �ϸ� �׷� �����ϸ� �ȴ�)
select deptno, avg(pay) "��� �޿�" from professor group by deptno;

--select���� ���� �׷��Լ� �̿��� �÷��̳� ǥ������ �ݵ�� group by�� ���Ǿ�� �Ѵ�.
--professor���� ���޺� ��պ��ʽ��� ����ϼ���
select position ����, avg(bonus) ��պ��ʽ� from professor group by position;

--�а��� ���޺��� �������� ��ձ޿�
select deptno,position,avg(pay) "��� �޿�" from professor group by deptno,position;

--student���� �г⺰ �ְ�Ű�� �ְ�����Ը� ���
select grade �г�,max(height) �ְ�Ű, max(weight) �ְ������ from student group by grade order by grade;

--������ ���޺� �ѱ޿��� �ְ��ʽ��� ���Ͻÿ�
select position ����, sum(pay) �ѱ޿�, max(bonus) �ְ��ʽ� from professor group by position;

--emp���� ������ ������ ����� ���Ͻÿ�
--���� �����
select job ����, count(empno) ����� from emp group by job;

--Having��_������ �ְ� �˻��� �� ����_�ݵ�� group by �ڿ� ���δ�.
--emp���� ��ձ޿��� 2,000�̻��� �μ��� �μ���ȣ�� ��ձ޿��� ���Ͻÿ�.
select deptno �μ�, avg(sal) ��ձ޿� from emp group by deptno having avg(sal)>=2000;
--where���� �׷��Լ��� ���������� �� �� ����

--professor���� ��ձ޿��� 300�̻��� �а��� �а���ȣ�� ��ձ޿��� ���Ͻÿ�
select deptno �а�, avg(pay) ��ձ޿� from professor group by deptno having avg(pay)>=300;
--professor���� ��ձ޿��� 300�̻��� �а��� �а���ȣ�� ��ձ޿��� ���Ͻÿ�(101�а��� ����, �а���ȣ ��������)
select deptno �а�, avg(pay) ��ձ޿� from professor where deptno not in(101) group by deptno having avg(pay)>=300 order by deptno desc; 

--emp���� job���� sal�� ��ձ޿��� ���Ͻÿ�
select job ����, avg(sal) ��ձ޿� from emp group by job;

--professor���� ���޺� �ѱ޿��� ���Ͻÿ�
select position ����, sum(pay) �ѱ޿� from professor group by position;

--emp���� ������ �ο��� �ִ�޿� �ּұ޿� ����ϼ���(job�� ��������)
select job ����, count(job) �ο���, max(sal) �ִ�޿�, min(sal) �ּұ޿� from emp group by job order by job;

--emp���� �Ի�⵵ �׷캰�� ���(�Ի�⵵,�ο���,�޿����(�Ҽ��� ����)_�Ի�⵵�� ��������)
select to_char(hiredate,'yyyy') �Ի�⵵, count(*) �ο���, round(avg(sal),0) �޿���� from emp group by to_char(hiredate,'yyyy') order by to_char(hiredate,'yyyy');

--Rollup�Լ�
--�ڵ����� �Ұ�/�հ� �����ִ� �Լ��̴�
--group by���� �־��� �������� �Ұ谪 �����ִ� ���̴�
--professor���� ������ �α����� �޿� �Ұ谪 ���غ���
select deptno �а���ȣ, position ����, sum(pay) �ѱ޿� from professor group by position,rollup(deptno);

select deptno �а���ȣ, position ����, sum(pay) �ѱ޿� from professor group by deptno,rollup(position);

--count
select position, count(*), sum(pay) from professor group by rollup(position);

--cube�Լ�
--rollupó�� ���Ұ迡 ��ü�Ѱ���� �����ش� (rollup�� �������� cube�� ���Ұ�� �ѼҰ� �Ѵ� ���ȴ�)
select deptno,position, count(*), sum(pay) from professor group by cube(deptno,position);

--������ �Ѻ���
--Q1. emp���� ��ձ޿��� 2000�̻��� �μ��� �μ���ȣ�� ��ձ޿��� ���Ͻÿ�
select deptno �μ���ȣ, round(avg(sal),0) ��ձ޿� from emp group by deptno having avg(sal)>=2000;

--Q2. emp���� deptno�� deptno�� 10,20,30�� �μ��� ������?
select deptno �μ�, count(deptno) �� from emp group by deptno order by deptno;

--Q3. emp���� job�� �ο����� ���Ͻÿ�(��, �ο��� 2���� ���� ���� ���Ұ�)
select job ����, count(job) �ο� from emp group by job having count(job)>'2';

--Q4. emp���� job�� �޿��հ踦 ���ϴµ� (PRESIDENT�� ������ ��) �޿��հ谡 5000 �̻� ���Ͻð� �޿��հ谡 ���� �ͺ��� ���ʴ�� �����Ͻÿ�
select job ����, sum(sal) �޿��հ� from emp where job not in('PRESIDENT') group by job having sum(sal)>=5000 order by sum(sal) desc;

--��������
--���̺����
create table sawon (num number(5) CONSTRAINT sawon_pk_num primary key,
name varchar2(20),gender varchar2(10),buseo varchar2(20) CONSTRAINT sawon_ck_buseo
check(buseo in('ȫ����','�λ��','������')),pay number(10) default 2000000);

--������ ����
create sequence seq_sawon nocache;

--������ 10���� insert
--�����޼��� : üũ ��������(JOOYOUNG.SAWON_CK_BUSEO)�� ����Ǿ����ϴ�
--insert into sawon values(seq_sawon.nextval,'�̿���','����','���Ӱ��ߺ�',3500000);
insert into sawon values(seq_sawon.nextval,'�̿���','����','������',3500000);
insert into sawon values(seq_sawon.nextval,'�迵ö','����','�λ��',3700000);
insert into sawon values(seq_sawon.nextval,'�̰���','����','ȫ����',3200000);
insert into sawon values(seq_sawon.nextval,'����ö','����','�λ��',3100000);
insert into sawon values(seq_sawon.nextval,'���ҹ�','����','������',3900000);
insert into sawon values(seq_sawon.nextval,'�ſ���','����','�λ��',3700000);
insert into sawon values(seq_sawon.nextval,'������','����','ȫ����',2900000);
insert into sawon values(seq_sawon.nextval,'������','����','������',4500000);
insert into sawon values(seq_sawon.nextval,'����','����','�λ��',5000000);
insert into sawon values(seq_sawon.nextval,'ȫ�̳�','����','ȫ����',2600000);
commit;

--�μ��� �ο����� �ְ�޿�,�����޿� ��ȸ
select buseo �μ�,count(*) �ο���, max(pay) �ְ�޿�, min(pay) �����޿� from sawon group by buseo;

--���� ���������� �ְ�޿�,�����޿� ȭ����� ���̰� 3�ڸ� �ĸ��� ������ ���ּ���
select buseo �μ�,count(*) �ο���, to_char(max(pay),'l999,999,999') �ְ�޿�, to_char(min(pay),'l999,999,999') �����޿� from sawon group by buseo;

--���� �ο����� ��ձ޿��� ����ϼ���(�ο��� �ڿ� ���̶�� �������� �Ͻÿ�)
select gender ����, count(gender) ||'��' �ο��� , avg(pay) ��ձ޿� from sawon group by gender;

--�μ��� �ο����� ��ձ޿��� ���ϵ� �ο��� 4�� �̻��� ��쿡�� ����ϵ��� �ϼ���
select buseo �μ�,count(buseo) �ο���, avg(pay) from sawon group by buseo having count(buseo)>=4;