/*DROP TABLE emp_ng_rest;*/
CREATE Table emp_ng_rest(employee_id numeric(10) primary key,	
name varchar(30),
salary numeric(10,2));

/*DROP sequence emp_ng_rest_seq;*/
create sequence emp_ng_rest_seq start with 10 increment by 1;