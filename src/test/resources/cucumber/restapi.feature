Feature: Testing Which? RESTapi calls

  @whichone_restapi @RuleEngine2
  Scenario Outline: Test the restapi <apiHttpMethod>:<version><endpoint> verify "<expectedResult>" rule
    Given user call following restapi "<endpoint>" of "<version>" with "<apiHttpMethod>" page
    Then User should able to verify "<expectedResult>" tests
    Examples: provided valid and invalid input
      | apiHttpMethod | endpoint          | version  | expectedResult                         |
      | GET           | EMPLOYEES_BASEURL | /api/v1/ | statuscode:200 ; SchemaValidation:true |
