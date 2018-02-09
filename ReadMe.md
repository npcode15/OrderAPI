BY NAVNEET PANDEY - For Zappos Data Science Internship

System Requirement
------------------
MongoDB community Edition
Spring-Boot

API Use (Make sure MongoDb Server is running in the background)
-------
API has performs four functions, ADD, REMOVE, UPDATE, DELETE.

To add some content to the Database: 
Host - http://localhost:8080
Method - POST
Parameter (Body) - Valid JSON

To remove some content to the Database: 
Host - http://localhost:8080
Path - /restaurant/id (replace id with actual id already present)
Method - DELETE
Parameter (Body) - Valid JSON

To modify existing content: 
Host - http://localhost:8080
Method - PUT
Parameter (Body) - Valid JSON

To fetch some content from the Database: 
Host - http://localhost:8080
Method - GET
Path - /restaurant/id (replace id with actual id already present)
