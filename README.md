# User Authentication System

### Objective:
To design and implement a user authentication system that includes a welcome page, login, registration, and logout functionalities using HTML, CSS, JSP, Servlets, and JDBC (for database interaction).

### Technologies Used:
Frontend: HTML, CSS <br>
Backend: Java Servlets , JSP (JavaServer Pages)<br>
Database: MySQL<br>
Other: JDBC (Java Database Connectivity)<br>

### Project Components:

#### Welcome Page (welcome.html):
A simple HTML page styled with CSS.<br>
Provides links to the Login and Registration pages.<br>
Introduces the user to the system and its functionalities.<br>

#### Login Page (login.jsp):
A form where users can input their username and password.<br>
Styled using CSS for a clean and user-friendly interface.<br>
Form submission is handled by the Login Servlet.<br>

#### Registration Page (register.jsp):
A form for new users to create an account by providing their details (username, password, email, etc.).<br>
Includes form validation and CSS for an attractive layout.<br>
Form submission is handled by the Register Servlet.<br>

#### Logout Page (logout.jsp):
A simple page confirming the user has successfully logged out.<br>
Provides a link back to the Welcome or Login page.<br>

#### Login Servlet (LoginServlet.java):
Handles the processing of login requests.<br>
Retrieves user data from the database via DAO classes.<br>
Validates user credentials and manages session handling.<br>

#### Register Servlet (RegisterServlet.java):
Manages the registration process.<br>
Inserts new user details into the MySQL database using DAO classes.<br>
Includes error handling for duplicate users and invalid data.<br>

#### DAO Classes (UserDAO.java):
Data Access Object classes responsible for database interaction.<br>
Perform CRUD operations (Create, Read, Update, Delete) on the user data.<br>
Use JDBC to connect to the MySQL database and execute SQL queries.<br>

#### MySQL Database Setup:
A MySQL database configured to store registered user details.<br>
Includes tables for user information (e.g., users table with fields like id, username, password, email).<br>
Database connection settings configured in the DAO classes.<br>

### Workflow:

#### User Registration:
A new user navigates to the registration page and submits their details.<br>
The Register Servlet processes the form, and the DAO class inserts the data into the MySQL database.<br>
Upon successful registration, the user is redirected to the login page.<br>

#### User Login:
The user enters their credentials on the login page.<br>
The Login Servlet validates the credentials by querying the database via the DAO class.<br>
If successful, the user is granted access and their session is managed.<br>
If unsuccessful, the user is prompted to re-enter their credentials.<br>

#### User Logout:
The user logs out, which ends their session.<br>
They are redirected to the logout confirmation page and can navigate back to the welcome or login page.<br>

### Conclusion:
This project demonstrates a comprehensive understanding of web development using JSP, Servlets, and MySQL. It covers the full lifecycle of user authentication, from registration to login and logout, with secure handling of user data and session management.
