# Maven Command 
Tests: `mvn clean test -Dspring.profiles.active=qa` <br />
Application on 9095 port: `mvn clean spring-boot:run -Dspring.profiles.active=qa`

# RESTapi Automation Information
Test the CRUD  RESTaoi functionality of http://dummy.restapiexample.com/<br />



# UI Automation Information
# Information of implemented scenario
To test search functionality of https://www.which.co.uk/reviews/televisions <br />
User can provide a combination of filter on Which? TV review page. User should not need to implement code for different filters input or order/combination of filters.(screensize, screentype, features etc) <br />
User can independently sort the result in any order. <br />
User input closely mimic the enum of different choices objects( checkbox, dropdown etc).<br />
Based on filterset, code get all the TV cards as TVInfoCard model. It creates Map of all the result set. Because TVcard is same object with different data so we have checked all of result in one scenario with great reusability<br />


#  Feature of Framework
## api
schema validation support added <br />
seperate model, httpoperation , requestspecification and test <br />

## ui
@DataTableType annotation used for typeRegister of ReviewFilter filters ( cucumber-4 to cucumber-5 improvement ) <br />
Framework build to mimic domain language e.g. user can provide filter as a set of different filter options <br/>
Abstract Page cater generic way to handle objects such as dropdown, check box, goto, wait properties <br />
Framework support to replace the object definition on the fly. It will help to user on By element toreuse for entire page <br/>
One verification can verify all the element of the result. e.g. after filter framework verify each result one by one <br/>
Common issues of automation such as spinner, page refresh has been handled in this solution <br />
User will able to different filter and sort option and need not to change any code. Framework used enum and DSL to handle business behaviour <br />
Browserstack support has been implemented and checked. It is disable <br />
Parametrize Jenkins file support <br />
Added cucumber timeline report in cucumberOptions and surefire threadcount<br />
For dev env ( mysql on local docker) - JPA with mysql has been checked but removed so mysql and spring-jpa dependencies are disabled now <br/>
Used latest Junit5, Spring2, Java8 & cucumber5 <br />
Logback is added , message can be embedded into Scenario and html report <br />
Different env and other property source can be enabled with spring profiles <br />
AssertJ used for soft and fluent assertions <br />
Spring bring lots of coding benefit and easy to implement code<br />


# Future Enhancement
Data creation can be develop as seperate microservice<br />
Json manipulation need to be enhanced<br />
API automation should be used as different module and DSL need to go in common module <br/>
mobile automation need to be a separate module and reuse common lib as much as possible <br />
Parllelization need to be added <br />
Rule engine such as easy-rule need to be implemented <br />
Jenkins pipeline need to enhance with other stages e.g. security, performance and code analysis <br />
Reporting need to be enhanced (Clucumber or donought) <br />
Custom Exception need to be added in great detail <br />
AssertJ will be incorporated for fluent assertion <br />
Abstraction of Element need to be incorporated <br />
Framework tweak to run on grid, browserstack, Linux, iOS and Windows env <br />
Utilities - Randomization, Javafaker, Date, collections, Json, Strings, pdf, csv , excel etc need to be enhanced <br />
Abstract layer of object identification need to be incorporated into solution <br />



# Technology/api/plugins<br />

Latest cucumber - 5.4.1<br />
Spring - 2.0.3.RELEASE<br />
Runner using Junit<br />
Maven, surefire<br />
Parllel - Native cucumber support<br />
Test can run on dev, preprod or qa env<br />
JPA setting disabled , but can added back by uncommnted prop files<br />
RestAssure , restspecification via springbootRunner. But good if project have seperate API module<br />


# Creating Microservices separately - Development Env <br />
## Setting Dockerize MYSQL on port 3306<br />
launch(run) docker container docker-mysql <br />
`run -d -p 3306:3306 --name=docker-mysql --env="MYSQL_ROOT_PASSWORD=root" --env="MYSQL_PASSWORD=root" --env="MYSQL_DATABASE=book_manager" mysql` <br />
Log into docker container shell <br />
`docker exec -it docker-mysql bash;`<br />
Log into MySQL cli<br />
`mysql -uroot -p`<br />
Show database using mysql cli<br />
`show databases;`<br />

**Create data on dockerize mySQL ( file attached in root : book_manager.sql, example of query select * from book_manager.author :<br />
`docker exec -i docker-mysql mysql -uroot -proot book_manager <book_manager.sql`<br />

 
