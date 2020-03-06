
#Run application by -DforkMode=never clean test -Dspring.profiles.active=qa<br />

#Feature of  Framework:<br />
RuleEngine for expected criteria 
Abstract Page and Abstract Step provide the common functionality such as navigation etc <br />
@DataTableType annotation used to typeRegister ( cucumber-4 to cucmber-5 improvement )
DSL supporting sdk using builder pattern

#Future Enhancement<br />
Data creation can be develop as seperate microservice<br />
Json manipulation need to be enhanced<br />
Parllelization need to be added <br />
Rule engine such as easy-rule need to be implemented <br />
Jenkins pipeline file need to be added into code <br />
Reporting need to be enhanced (Clucumber or donought) <br />
Custom Exception need to be added in great detail <br />
AssertJ will be incorporated for fluent assertion <br />
Abstraction of Element need to be incorporated <br />
Framework tweak to run on Linux, iOS and Windows env <br />



#Technology/api/plugins<br />

Latest cucumber - 5.4.1<br />
Spring - 2.0.3.RELEASE<br />
Runner using TestNG<br />
Maven, surefire<br />
Parllel - Native cucumber support<br />
Shared Driver<br />
Test can run on dev, preprod or qa env<br />
JPA setting disabled , but can added back by uncommnted prop files<br />
test https://codebeautify.org/generate-random-date<br />
DataTable Transformer in cucumber5 http://grasshopper.tech/1586/<br />
RestAssure , restspecification via springbootRunner. But good if project have seperate API module<br />


