# CS264 1/66 - SubjectRequestForm
![stu_home](README_Picture/stu_home.png)
## What this project is about
This project is a web application that allows students to send various request(Add-Drop , DropOut , etc.) . And data will store in Microsoft Azure SQL Database . The application is built using Spring Boot and Java. 
## Tech Use
- Spring Boot 3.1.3
- Java JDK 17
- Trello
- Git
- Intellij IDEA

## Features
### Login Authentication with TU API 
User can login with their TU Wifi account and password. The application will use TU API to verify the user. If the user is not in the database, the application will tell the user their account is not in the database.
![login](README_Picture/login.png)
### Send Request
Student can send various request to the system. The system will store the request in the database and send the request to the admin.  
The List of Request that student can send are:
- เพิ่มถอนรายวิชา
- ถอน W ล่าช้า
- จดทะเบียนข้ามโครงการ
- เขียนคำร้องลาออก
- คำร้องอื่นๆ  

In each request will have different form to fill.
### 