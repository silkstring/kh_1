CREATE TABLE EMP_SAMPLE
AS
SELECT EMPLOYEE_ID AS EMP_ID
	 , FIRST_NAME || ' ' || LAST_NAME AS EMP_NAME
	 , EMAIL || '@emp.co.kr' AS EMAIL
	 , HIRE_DATE
	 , SALARY
	 , COMMISSION_PCT
	 , DEPARTMENT_ID AS DEPT_ID
	 , REPLACE(PHONE_NUMBER, '.', '-') AS PHONE
  FROM EMPLOYEES;
  
UPDATE EMP_SAMPLE
   SET (SALARY, COMMISSION_PCT) = (SELECT SALARY + 1000
   										, 0.1 
   									 FROM EMP_SAMPLE
   									WHERE DEPT_ID = 10)
 WHERE DEPT_ID = 10;
 
SELECT * FROM EMP_SAMPLE WHERE DEPT_ID = 10;

/*
 *	107번 사원 Diana Lorentz의 급여를 소속 부서의 평균 급여로 수정
 */
SELECT * FROM EMP_SAMPLE;
UPDATE EMP_SAMPLE 
   SET SALARY = (SELECT FLOOR(AVG(SALARY))
   				   FROM EMP_SAMPLE
				  WHERE DEPT_ID = 60
				  GROUP BY DEPT_ID)
 WHERE EMP_NAME = 'Diana Lorentz';
 
DROP TABLE EMP_SAMPLE;