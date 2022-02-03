use cdac;
select e.employee_id,e.last_name,e.salary,e.department_id,d.department_id,d.department_name,l.location_id,d.location_id,l.city from employees e INNER JOIN departments d
on(e.department_id=d.department_id) inner join locations l on(d.location_id=l.location_id) ;
 select * from locations;
 desc countries;
 desc regions;
 select c.country_name,r.region_name from countries c inner join regions r on(c.region_id=r.region_id);
 select manager.last_name,manager.salary,manager.hire_date,d.department_name,(year(curdate())-year(manager.hire_date)) from employees worker 
 inner join employees manager on(worker.manager_id=manager.employee_id)
 inner join departments d on(manager.department_id=d.department_id) where (year(curdate())-year(manager.hire_date))>30;
 desc employees;
 select manager.employee_id,manager.last_name,worker.manager_id,worker.last_name from employees manager inner join employees worker on(worker.manager_id=manager.employee_id);
 select e.employee_id,e.last_name,e.salary,e.department_id,d.department_id,d.department_name from employees e LEFT OUTER JOIN departments d
on (e.department_id=d.department_id);
select e.employee_id,e.last_name,e.salary,e.department_id,d.department_id,d.department_name from employees e RIGHT OUTER JOIN departments d
on (e.department_id=d.department_id);
select * from employees where department_id in(select department_id from departments);
select job_id,max(salary) from employees group by job_id having max(salary)>=4000;
select avg(salary),count(employee_id) count,department_id from employees group by department_id having count(employee_id)>=5 order by count asc;


desc jobs;
show tables;
select * from jobs;
desc employees;
select e.employee_id,e.salary,j.job_id,j.job_title from employees e left outer join jobs j on(e.job_id=j.job_id);
insert into employees values(306,'htyu','kiop','htyui','223.908.789','2000-12-09',NULL,
select e.employee_id,e.salary,j.job_id,j.job_title from employees e left outer join jobs j on(e.job_id=j.job_id);
desc jobs;
select * from jobs;
insert into jobs values(20,'Developer',50000,150000);

