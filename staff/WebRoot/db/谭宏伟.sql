--1.дһ�� SQL ����ҳ��ʾ scott ������ emp��dept ������ݡ���20����
--�������£�
select e.ename ,e.job, e.sal,d.dname,d.loc from emp e,dept d where e.deptno=d.deptno;


--a)�ֶΣ�ename(����)��job(ְλ)��dname(��������)��loc(�������ڵ�)��sal(����)

--b)�����ʽ�����ʾ�� 6 ������ 10 �����ݣ�һҳ5����¼��


��:	select  * from (select row_number() over (order by sal desc) rn,t.* from (select e.ename ,e.job,e.sal,d.dname,d.loc from emp e,dept d where e.deptno=d.deptno) t )
	where rn>(2-1)*5 and rn<=2*5;


