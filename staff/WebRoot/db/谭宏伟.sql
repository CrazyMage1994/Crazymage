--1.写一条 SQL 语句分页显示 scott 方案中 emp、dept 表的数据。（20’）
--需求如下：
select e.ename ,e.job, e.sal,d.dname,d.loc from emp e,dept d where e.deptno=d.deptno;


--a)字段：ename(姓名)、job(职位)、dname(部门名称)、loc(部门所在地)、sal(工资)

--b)按工资降序，显示第 6 条至第 10 条数据（一页5条记录）


答案:	select  * from (select row_number() over (order by sal desc) rn,t.* from (select e.ename ,e.job,e.sal,d.dname,d.loc from emp e,dept d where e.deptno=d.deptno) t )
	where rn>(2-1)*5 and rn<=2*5;


