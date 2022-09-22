# Student Database created 
create database Student;

use Student;

create table tblParents(Parent_id int Not Null Unique, Parent_Name varchar(40),City varchar(20),Age int,Annual_Income int, Occupation Varchar(15),EmailId varchar(25));
update tblParents set EmailId='N/A';

/* data inserted into the table*/
insert into tblParents(Parent_id,Parents_Name,City,Age,Annual_Income,Occupation) values(1004,"Mr.Sumanth Pathak & Mrs.Priya Pathak","Ghaziabad","45,44",700000,"Engineer")
,(1005,"Mr.Ravi Ved & Mrs.Pooja Ved","Ghaziabad","45,44",650000,"Teacher"),(1006,"Mr.Praful Singh & Mrs.Vani Singh","Delhi","45,44",800000,"Accountant")
,(1007,"Mr.Amit Dubey & Mrs.Vinita Dubey","Ghaziabad","45,44",700000,"Engineer"),(1008,"Mr.Avdesh Singh & Mrs.Poonam Devi","Ghaziabad","45,44",1000000,"Engineer")
,(1009,"Mr.Ankit Mehta & Mrs.Geeta mehta","Delhi","45,44",750000,"Engineer"),(1010,"Mr.Roy & Mrs.Roy","Ghaziabad","45,44",980000,"Teacher")
,(1011,"Mr.Himanshu Vats & Mrs.Vinni Vats","Pune","45,44",700000,"Manager"),(1012,"Mr.Pradeep Singh & Mrs.Priya Singh","Kolkata","45,44",960000,"Accountant");

/* data inserted into the table*/
insert into tblParents(Parent_id,Parents_Name,City,Age,Annual_Income,Occupation) values(1013,"Mr.Sumit Aggrawal & Mrs.Priya Aggrawal","Delhi","48,47",500000,"Accountant")
,(1014,"Mr.Satyam Kapoor & Mrs.Saroj Kapoor","Delhi","46,44",550000,"Teacher"),(1015,"Mr.Mehta & Mrs.Mehta","Delhi","42,42",500000,"Accountant")
,(1016,"Mr.Amit Goyal & Mrs.Vinita Goyal","Ghaziabad","45,44",500000,"Teacher"),(1017,"Mr.Avdesh Sharma & Mrs.Poonam Sharma","Kolkata","42,42",1200000,"Singer")
,(1018,"Mr.Ankit Goel & Mrs.Geeta Goel","Delhi","40,40",750000,"Engineer"),(1019,"Mr.Gupta & Mrs.Gupta","Ghaziabad","45,44",980000,"Teacher")
,(1020,"Mr.Himanshu Singh & Mrs.Vinni Kaur","Pune","40,40",700000,"Manager");

select * from tblParents;   /*reading data from table*/

select count(Annual_Income) from tblParents where Annual_Income>600000;      /*Counting number of parents whose annual income is greater than 6lakh */

select  count(Annual_Income),Count(Age) from tblParents where Annual_Income<500000 or age>45;     /*Counting number of parents whose annual income is less than 5lakh and age greater than 45 */

/*created table Student */
Create table Student(S_id int,S_Name varchar(25),Maths int, Science int,Parent_id int ,Primary key(S_id),Foreign key(Parent_id) references tblParents(Parent_id) );

/*inerted data into the table*/
insert into Student(S_id,S_Name,Maths,Science,Parent_id) values(101,'Isha Vats',78,88,1001),(102,"Geeta",77,88,1002),(103,"Garima",87,98,1003),(104,'Sinu',66,66,1004),(105,'mani',76,76,1005)
,(106,'Ishani',78,88,1007),(107,"Geet",77,88,1008),(108,'Vansh',78,88,1011),(109,"meena",77,88,1018),(110,"Gani",87,98,1012);

select * from Student;         /*Reading data from table*/
