@RegressionTests
@RandomGenAppTester

Feature: Testing Random Generator App - UI Tests

  @RULE_ENGINE003
  Scenario Outline: generate random values and verify rule engine rule no. "<expectedResult>"
    Given Valid user provide following Randomization criteria "<NumOfDates>","<outPutFormat>","<customDateFormat>","<startDate>","<endDate>"
    Then result should match "<expectedResult>" expected result on UI
    Examples: provided valid and invalid input
      | NumOfDates | outPutFormat             | customDateFormat | startDate           | endDate             | expectedResult                               |
      | 11         | YYYY-MM-DD hh:mm:ss      | YY-MM-DD         | 1900-01-01 00:00:00 | 2099-12-31 23:59:59 | RULE_ENGINE001;MATCHCOUNT{outPutFormat}      |
      | 12         | YYYY-DD-MM hh:mm:ss      | YY-MM-DD         | 1900-01-01 00:00:00 | 2099-12-31 23:59:59 | RULE_ENGINE001;MATCHCOUNT{outPutFormat}      |
      | 13         | MM-DD-YYYY hh:mm:ss      | YY-MM-DD         | 1900-01-01 00:00:00 | 2099-12-31 23:59:59 | RULE_ENGINE001;MATCHCOUNT{outPutFormat}      |
      | 14         | ISO 8601                 | YY-MM-DD         | 1900-01-01 00:00:00 | 2099-12-31 23:59:59 | RULE_ENGINE001;MATCHCOUNT{outPutFormat}      |
      | 15         | Year Month Date hh:mm:ss | YY-MM-DD         | 1900-01-01 00:00:00 | 2099-12-31 23:59:59 | RULE_ENGINE001;MATCHCOUNT{outPutFormat}      |
      | 16         | Year Date Month hh:mm:ss | YY-MM-DD         | 1900-01-01 00:00:00 | 2099-12-31 23:59:59 | RULE_ENGINE001;MATCHCOUNT{outPutFormat}      |
      | 17         | Month Date Year hh:mm:ss | YY-MM-DD         | 1900-01-01 00:00:00 | 2099-12-31 23:59:59 | RULE_ENGINE001;MATCHCOUNT{outPutFormat}      |
      | 1000       | Month Date Year hh:mm:ss | YY-MM-DD         | 1900-01-01 00:00:00 | 2099-12-31 23:59:59 | RULE_ENGINE002;MATCHCOUNT{NumOfDates}        |
      | 8          | Custom date format       | YYYY-MM-DD       | 1900-01-01 00:00:00 | 2099-12-31 23:59:59 | RULE_ENGINE003;MATCHCOUNT{customDateFormat}  |
      | 8          | Custom date format       | YYYY-MM-DD       | 2020-01-01 00:00:00 | 2019-12-31 23:59:59 | RULE_ENGINE004;MATCHCOUNT{startDate}         |
      | 8          | Custom date format       | YYYY-MM-DD       | 1900-01-01 00:00:00 | 2099-12-31 23:59:59 | RULE_ENGINE005;MATCHCOUNT{endDate}           |
      | 20         | Custom date format       | YYYY-MM-DD       | 2001                | 2003                | RULE_ENGINE006;MATCHCOUNT{startDate:endDate} |
      | 18         | Custom date format       | YYYY-MM-DD       | -1                  | -3                  | RULE_ENGINE007;MATCHCOUNT{negativeDates}     |
      | -1         | Custom date format       | YYYY-MM-DD       | 1900-01-01 00:00:00 | 2099-12-31 23:59:59 | RULE_ENGINE007;MATCHCOUNT{negativeDates}     |

  @RULE_ENGINE001
  Scenario Outline: generate "<NumOfDates>" random values
    Given Valid user provide following Randomization criteria
      | NumOfDates   | outPutFormat   | customDateFormat   | startDate   | endDate   |
      | <NumOfDates> | <outPutFormat> | <customDateFormat> | <startDate> | <endDate> |
    Then result should match "<expectedResult>" expected result on UI
    Examples: provided valid and invalid input
      | NumOfDates | outPutFormat        | customDateFormat | startDate           | endDate             | expectedResult                        |
      | 11         | YYYY-MM-DD hh:mm:ss | YY-MM-DD         | 1900-01-01 00:00:00 | 2099-12-31 23:59:59 | RULE_ENGINE001;MATCHCOUNT{NumOfDates} |


  @RULE_ENGINE002
  Scenario: generate random values
    Given Valid user provide following Randomization criteria
      | NumOfDates | outPutFormat        | customDateFormat | startDate           | endDate             |
      | 12         | YYYY-DD-MM hh:mm:ss | YY-MM-DD         | 1900-01-01 00:00:00 | 2099-12-31 23:59:59 |
    Then result should match "RULE_ENGINE002;MATCHCOUNT{outPutFormat}" expected result on UI



