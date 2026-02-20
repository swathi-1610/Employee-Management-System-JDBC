Employee Management System (JDBC) :

##📌 Project Overview

Employee Management System is a console-based Java application developed using JDBC and MySQL. This application performs CRUD (Create, Read, Update, Delete) operations on employee records stored in a relational database.

The project demonstrates real-time database connectivity and backend development concepts.

##🚀 Features:

Add New Employee Remove Employee Update Employee Name Update Employee Department Update Employee Salary Search Employee by ID Secure Database Operations using PreparedStatement Transaction Management (Commit & Rollback)

##🛠 Technologies Used :

Java JDBC MySQL SQL Git & GitHub

##🗄 Database Details :

Database Name: jfs293031 Table Name: employee

##Table Structure:

Column Name Data Type

id INT (Primary Key)

name VARCHAR(50)

department VARCHAR(50)

salary DOUBLE

##🔄 JDBC Concepts Implemented:

✔ Connection Used DriverManager to establish database connection.

✔ PreparedStatement Used for executing parameterized SQL queries securely to prevent SQL Injection.

✔ ResultSet Used to retrieve and process data returned from SELECT queries.

✔ Transaction Management Used: connection.commit() connection.rollback() to maintain data consistency.

✔ DAO Design Pattern Separated database logic into EmployeeDAO class for better code structure and maintainability.

##🗂 Project Structure :

ConnectionManager.java Employee.java EmployeeDAO.java Test.java

##⚙ How to Run the Project :

Clone the repository

Create database in MySQL:

CREATE DATABASE jfs293031;

USE jfs293031;

CREATE TABLE employee( id INT PRIMARY KEY, name VARCHAR(50), department VARCHAR(50), salary DOUBLE );

Update database credentials in ConnectionManager.java

Run Test.java file

📚 Learning Outcomes

Understanding JDBC architecture Implementing CRUD operations Handling ResultSet to fetch data Using PreparedStatement securely Managing database transactions Applying DAO design pattern Integrating Java with MySQL database

👩‍💻 Developed by Swathi

Java Full Stack Trainee (Fresher)