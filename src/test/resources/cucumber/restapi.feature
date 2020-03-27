Feature: Testing Which? RESTapi calls

  @whichone_restapi @RuleEngine2
  Scenario Outline: Test the restapi <apiHttpMethod>:<version><endpoint> verify "<expectedResult>" rule
    Given user call following restapi "<endpoint>" with "<apiHttpMethod>" page
    Then User should able to verify "<expectedResult>" tests
    Examples: provided valid and invalid input
      | apiHttpMethod | endpoint                    | expectedResult                    |
      | GET           | EMPLOYEES_BASEURL           | statuscode:200                    |
#      | GET           | EMPLOYEES_BASEURL_WITHPARAM | response_VerifyEmployee_idx_;id:2 |

  @whichone_restapi_2
  Scenario Outline: Test the restapi <apiHttpMethod>:<version><endpoint> verify "<expectedResult>" rule
    Given user call following restapi "<endpoint>" with "<apiHttpMethod>" page
    Then User should able to verify "<expectedResult>" tests
    Examples: provided valid and invalid input
      | apiHttpMethod | endpoint | expectedResult |
#      | POST          | EMPLOYEES_CREATE_BASEURL | statuscode:201                     |
#      | PATCH         | EMPLOYEES_UPDATE         | response_VerifyEmployee_idx_;id:21 |
#      | DELETE        | EMPLOYEES_DELETE         | response_VerifyEmployee_idx_;id:21 |
#      | GET           | EMPLOYEES_GET            | response_VerifyEmployee_idx_;id:21 |
