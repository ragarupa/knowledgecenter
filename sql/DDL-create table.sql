-- Below are the DDL(Data Definition Language) queries

-- Below query is to enter in to the schemas/database
use sql_practice;

-- Below query is to create table
CREATE TABLE CUSTOMERS
(`CUSTOMER_ID` int, 
`STATUS` varchar(8), 
`FNAME` varchar(9), 
`MNAME` varchar(7), 
`LNAME` varchar(8), 
`GENDER` varchar(1), 
`AGE` int);

-- Below query is insert values in to the tables
INSERT INTO CUSTOMERS
    (`CUSTOMER_ID`, `STATUS`, `FNAME`, `MNAME`, `LNAME`, `GENDER`, `AGE`)
VALUES
    (1, 'Active', 'John', NULL, 'Smith', 'M', 70),
    (2, 'Active', 'James', 'Emitt', 'Madison', 'M', 68),
    (3, 'Active', 'Joe', 'Anthony', 'Diggs', 'M', 55),
    (4, 'Inactive', 'Adam', NULL, 'Lambert', 'M', 40),
    (5, 'Active', 'Marcus', NULL, 'Dallas', 'M', 81),
    (6, 'Active', 'Steve', 'Eugene', 'Bullock', 'M', 62),
    (7, 'Active', 'Naomi', NULL, 'Patel', 'F', 33),
    (8, 'Active', 'Alexander', NULL, 'Pope', 'M', 29),
    (9, 'Inactive', 'Peter', NULL, 'Chandler', 'M', 36)
;
