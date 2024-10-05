Overview
---------

#Traini8 is a Spring Boot application for managing training center records using a RESTful API with MySQL. 
#It supports adding, viewing, and validating training centers, and includes features like automatic timestamping and embedded address fields.

Features
--------
#Create Training Center: Add center details like name, code, address, capacity, and contact info with validation.
#View All Centers: Retrieve the list of all registered training centers.
#Validations: Ensure mandatory fields are filled with valid formats for phone and email.
#Embedded Address: Address is stored as an embedded object (city, state, pincode).
#Timestamping: Automatically timestamps each entry upon creation.

Project Structure
-----------------
#Controller: Handles API requests.
#Entities: Maps the training center data to the database.
#Services: Business logic and validation.
#Repository: Interface for database operations.
#Exceptions: Custom exception handling.
#Resources: Contains application.properties for MySQL setup.

Key File Paths:
---------------
#Java files: src/main/java/com/spring/springproject/
Controller, Entities, Exception, Repository, Services
#MySQL Config: src/main/resources/application.properties (update with your MySQL credentials)


Setup
#Clone the repository: https://github.com/EVANABRAHAM/traini8-center-registry.git

#Configure MySQL: Update application.properties with your MySQL URL, username, and password.
                  -------------------------------------------------------------------------

#Run the project:spring-boot:run

API Endpoints:
--------------
#Create: POST /api/training-centers
#View All: GET /api/training-centers
