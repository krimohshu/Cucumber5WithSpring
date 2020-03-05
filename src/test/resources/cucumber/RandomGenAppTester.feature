@RegressionTests
@RandomGenAppTester

Feature: Testing Random Generator App - UI Tests


  @Framework_Groundwork_Scenario @dummytest
  Scenario Outline: generate "<NumOfDates>" random values
    Given  I execute dates via javaScript
    Given Valid user provide following Randomization criteria
      | NumOfDates   | outPutFormat   | customDateFormat   | startDate   | endDate   |
      | <NumOfDates> | <outPutFormat> | <customDateFormat> | <startDate> | <endDate> |
    Then "<actualResult>" actual result should match "<expectedResult>" expected result on UI
    Examples: provided valid and invalid input
      | NumOfDates | outPutFormat        | customDateFormat | startDate           | endDate             | expectedResult                        | actualResult |
      | 11         | YYYY-MM-DD hh:mm:ss | YY-MM-DD         | 1900-01-01 00:00:00 | 2099-12-31 23:59:59 | RULE_ENGINE001;MATCHCOUNT{NumOfDates} | <NumOfDates> |





#   @Framework_Groundwork_Scenario @dummytest
#  Scenario Outline: generate "<NumOfDates>" random values
#    Given Valid user provide following Randomization criteria
#      | NumOfDates   | outPutFormat   | customDateFormat   | startDate   | endDate   |
#      | <NumOfDates> | <outPutFormat> | <customDateFormat> | <startDate> | <endDate> |
#    Then "<actualResult>" result should match "<expectedResult>" expected result on UI
#    Examples: provided valid and invalid input
#      | NumOfDates | outPutFormat | customDateFormat | startDate | endDate | actualResult | expectedResult |
#      | 1          | 2            | 3                | 4         | 5       | a            | e              |



