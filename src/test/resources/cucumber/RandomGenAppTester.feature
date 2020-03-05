@RegressionTests
@RandomGenAppTester

Feature: Testing Random Generator App - UI Tests


#  @RULE_ENGINE001
#  Scenario Outline: generate "<NumOfDates>" random values
#    Given Valid user provide following Randomization criteria
#      | NumOfDates   | outPutFormat   | customDateFormat   | startDate   | endDate   |
#      | <NumOfDates> | <outPutFormat> | <customDateFormat> | <startDate> | <endDate> |
#    Then result should match "<expectedResult>" expected result on UI
#    Examples: provided valid and invalid input
#      | NumOfDates | outPutFormat        | customDateFormat | startDate           | endDate             | expectedResult                        |
#      | 11         | YYYY-MM-DD hh:mm:ss | YY-MM-DD         | 1900-01-01 00:00:00 | 2099-12-31 23:59:59 | RULE_ENGINE001;MATCHCOUNT{NumOfDates} |


  @RULE_ENGINE002 @
  Scenario: generate "<NumOfDates>" random values
    Given Valid user provide following Randomization criteria
      | NumOfDates | outPutFormat        | customDateFormat | startDate           | endDate             |
      | 11         | YYYY-MM-DD hh:mm:ss | YY-MM-DD         | 1900-01-01 00:00:00 | 2099-12-31 23:59:59 |
    Then result should match "RULE_ENGINE002;MATCHCOUNT{outPutFormat}" expected result on UI



#   @Framework_Groundwork_Scenario @dummytest
#  Scenario Outline: generate "<NumOfDates>" random values
#    Given Valid user provide following Randomization criteria
#      | NumOfDates   | outPutFormat   | customDateFormat   | startDate   | endDate   |
#      | <NumOfDates> | <outPutFormat> | <customDateFormat> | <startDate> | <endDate> |
#    Then "<actualResult>" result should match "<expectedResult>" expected result on UI
#    Examples: provided valid and invalid input
#      | NumOfDates | outPutFormat | customDateFormat | startDate | endDate | actualResult | expectedResult |
#      | 1          | 2            | 3                | 4         | 5       | a            | e              |



