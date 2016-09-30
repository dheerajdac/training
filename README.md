# trainingbnshhshjs
create table department(id int primary key,name varchar(20),role int,department int,foreign key(role) REFERENCES roles(id),foreign key(project) REFERENCES project(id));
create table Employee(employeeid varchar(20),name varchar(20),kinid int,emailid varchar(20),phoneno varchar(10),address varchar(40),dob varchar(10),doj varchar(10),department int,projects int , roles int, foreign key(role) REFERENCES roles(id),foreign key(department) REFERENCES department(id),foreign key(project) REFERENCES project(id));
