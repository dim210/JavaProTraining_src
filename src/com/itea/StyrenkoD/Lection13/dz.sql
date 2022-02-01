-- Restricting and Sorting Data
select * from Employees;
select * from Employees where First_name = 'David';
select * from Employees where job_id = 'IT_PROG';
select * from Employees where department_id = 50 and salary>4000;
select * from Employees where department_id in (20,30);
select * from Employees where First_name like '%a';
select * from Employees where department_id in (50,80) and commission_pct is not null;
select * from Employees where First_name like '%n%n%';
select * from Employees where length(First_name) > 4;
select * from Employees where salary between 8000 and 9000;


-- Using Conversion Functions and Conditional Expressions
select e.* from Employees e join Job_history j
	on (e.employee_id = j.employee_id)
    and dayofmonth(j.start_date) = 1;
    
select e.* from Employees e join Job_history j
	on (e.employee_id = j.employee_id)
    and year(j.start_date) = 2008;
    
select date_format(date_add(curdate(), INTERVAL 1 DAY),"tomorrow is %D day of %M") tomorrow from dual;

select e.first_name,e.last_name, 
date_format(j.start_date,"%D of %M" %Y) work_day
from Employees e join Job_history j
	on (e.employee_id = j.employee_id)
    and year(j.start_date) = 2008;
    

-- Reporting Aggregated Data Using the Group Functions
select department_id, count(*) from Employees group by department_id;
select department_id, max(salary) from Employees group by department_id;
select department_id, min(salary) from Employees group by department_id;

select e.department_id,  max(j.start_date),
date_format(j.start_date,"%D of %M" %Y) work_day
from Employees e join Job_history j
	on (e.employee_id = j.employee_id)
group by e.department_id;

select e.department_id,  min(j.start_date),
date_format(j.start_date,"%D of %M" %Y) work_day
from Employees e join Job_history j
	on (e.employee_id = j.employee_id)
group by e.department_id;

select LEFT(First_name, 1) first_l , count(*) from Employees group by LEFT(First_name, 1) order by count(*);


-- Displaying Data from Multiple Tables Using Joins
select  r.region_name, count(e.employee_id)
from regions r join countries c on (r.region_id = c.region_id)
			   join locations l on (c.country_id = l.country_id)
               join departments d on (l.location_id = d.location_id)
               join employees e on (d.department_id = e.department_id)
group by r.region_name
order by r.region_name;

select e.First_name, e.Last_name, d.Departament_name, j.Job_title, l.Street_address, c.Country_name, r.Region_name
from regions r join countries c on (r.region_id = c.region_id)
			   join locations l on (c.country_id = l.country_id)
               join departments d on (l.location_id = d.location_id)
               join employees e on (d.department_id = e.department_id)
               join jobs j on (j.job_id = e.job_id);
               

-- Using Subqueries to Solve Queries
select *
from employees where length(first_name) = (
	select max(length(first_name)) len from employees 
	group by department_id
	);
    
select *
from employees where manager_id in (
	select employee_id from employees 
	where salary > 15000
	);

select department_name
from departments where department_id in (
	select department_id from employees 
	group by department_id
	having count(*) = 0 );
    


    