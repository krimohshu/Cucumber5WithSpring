@RegressionTests
@RandomGenAppTester

Feature: Testing Random Generator App - UI Tests


  @Framework_Groundwork_Scenario
  Scenario Outline: generate "<NumOfDates>" random values
    Given Valid user provide following Randomization criteria
      | NumOfDates   | outPutFormat   | customDateFormat   | startDate   | endDate   |
      | <NumOfDates> | <outPutFormat> | <customDateFormat> | <startDate> | <endDate> |
    Then "<actualResult>" result should match "<expectedResult>" expected result on UI
    Examples: provided valid and invalid input
      | NumOfDates | outPutFormat | customDateFormat | startDate | endDate | actualResult | expectedResult |
      | 1          | 2            | 3                | 4         | 5       | a            | e              |



