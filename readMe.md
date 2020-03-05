
Run application by -DforkMode=never clean test -Dspring.profiles.active=qa<br />

Feature of  Framework:<br />
RuleEngine for expected criteria. AssertJ will be incorporated for fluent assertion <br />
Abstract Page and Abstract Step provide the common functionality such as navigation etc <br />
@DataTableType annotation used to typeRegister ( cucumber 4 to cucmber 5 improvement )


Future Enhancement<br />
Data creation can be develop as seperate microservice<br />

Technology/api/plugins<br />

Latest cucumber - 5.4.1<br />
Spring - 2.0.3.RELEASE<br />
Runner using TestNG<br />
Maven, surefire<br />
Parllel - Native cucumber support<br />
Shared Driver<br />
Test can run on dev, preprod or qa env<br />
JPA setting disabled , but can added back by uncommnted prop files<br />
RestAssure , restspecification via springbootRunner. But good if project have seperate API module<br />

test https://codebeautify.org/generate-random-date<br />
DataTable Transformer in cucumber5 http://grasshopper.tech/1586/<br />
