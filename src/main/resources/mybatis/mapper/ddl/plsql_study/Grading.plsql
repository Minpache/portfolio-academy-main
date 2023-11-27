create table t_score (
	std_id char(5), 
	class_id char(5), 
	score int, 
	grade char(1),
	primary key (std_id, class_id)
)

insert into t_score (std_id, class_id, score) values('00009', '99999', '55');

insert into t_score (std_id, class_id, score) values('00009', '99997', '90');

insert into t_score (std_id, class_id, score, grade) values('00009', '99995', '88', 'A');

insert into t_score (std_id, class_id, score) values('00009', '99993', '88');

insert into t_score (std_id, class_id, score) values('00009', '99992', '62');


DELIMITER $$
CREATE OR REPLACE procedure grading()
BEGIN

	update t_score
	set grade = case
	when score >= 90 then 'A'
	when score >= 80 then 'B'
	when score >= 70 then 'C'
	when score >= 60 then 'D'
	else 'F'
	end 
	 where grade is null;
END;
$$
DELIMITER ;


call grading;













-- 2

where dept, (
	from emp
	deptno IN ('x', 'p')) rEmp
	dept.no = rEmp.deptno


CREATE VIEW v_employees_male
AS
  SELECT
    first_name, last_name
  FROM employees
  WHERE gender = 'M'
;




create table DEPT_Table (
	DEPTNO VARCHAR(5) primary key, 
	DNAME VARCHAR2(10),
	LOC VARCHAR2(5)
)

create table EMP_Table (
	EMPNO VARCHAR(5) primary key,
	DEPTNO VARCHAR(5), 
	ENAME VARCHAR(10),
	JOB VARCHAR(10),
	SAL VARCHAR(5),
	FOREIGN KEY (DEPTNO) REFERENCES DEPT_Table(DEPTNO)
)

ALTER TABLE DEPT_Table MODIFY LOC VARCHAR(10);

SELECT ENAME
FROM EMP_Table
WHERE DEPTNO IN (SELECT DEPTNO FROM EMP_Table WHERE DEPTNO = 'X20' OR DEPTNO = 'P30');

SELECT DEPT_Table.DNAME, EMP_Table.ENAME
FROM EMP_Table
JOIN DEPT_Table ON EMP_Table.DEPTNO = DEPT_Table.DEPTNO
WHERE EMP_Table.DEPTNO IN ('X20', 'P30');



























