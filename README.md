# c6604c0c-6775-4947-add2-007c1c40c12a
Acer Coding Challenge

How to run this application:
1. You need Java IDE (Ex: Eclipse) with a minimum JDK1.8 installed
2. After that import the project as a maven project
3. Adjust the properties file located in the ./properties/acer.properties 
4. Make sure to run clean compile first before starting the project

Assumptions:
1. The gender of all students is Male and want to be called as he
2. Diagnostic and Feedback report results will only be based on the latest data inside the student-response.json file
3. Progress report result is based on which assessment the user specify in the properties file
4. When 'completed' field has value, meaning the responses field total row will also have the same value as total of question 
5. This application only run for single thread
6. Questions field in the assessment.json is the question of the assessment that the student needs to answer and questions.json is the database for all the questions
