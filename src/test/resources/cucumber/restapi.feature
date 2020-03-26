Feature: Testing Which? RESTapi calls

  @whichone_restapi @RuleEngine2
  Scenario Outline: Test the restapi <apiHttpMethod>:<version><endpoint> verify "<expectedResult>" rule
    Given user call following restapi "<endpoint>" with "<apiHttpMethod>" page
    Then User should able to verify "<expectedResult>" tests
    Examples: provided valid and invalid input
      | apiHttpMethod | endpoint          | expectedResult |
      | GET           | EMPLOYEES_BASEURL | statuscode:200 |
      | GET           | EMPLOYEES_BASEURL_WITHPARAM | statuscode:200 ; SchemaValidation:true |
#      | GET           | EMPLOYEES_BASEURL | statuscode:200 ; SchemaValidation:true |
#      | GET           | EMPLOYEES_BASEURL | statuscode:200 ; SchemaValidation:true |
