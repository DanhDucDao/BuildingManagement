# Started with building management application

To run this project for the first time, you need to go through some steps below:

## change database configuration

Create a database in MySQL.

Create file src/main/resources/application.properties.\
Copy content from application.properties.example to application.properties.\
Change database, user, password attributes to match your DBMS.

## run project with maven

You will need Apache Maven to achieve this. \
Download it in Apache site if you do not have one. \
Install and add bin directory to your path.

### `mvn clean package`
Cleans project and compiles code, packages it in distributable format. 

### `mvn spring-boot:run`
Publics project to address [http://localhost:8080](http://localhost:8080) .\
It should be ready to go.
