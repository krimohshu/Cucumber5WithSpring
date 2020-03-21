@RegressionTests
@RandomGenAppTester

Feature: Testing Random Generator App - UI Tests

  @parallel
  Scenario Outline: <scen_out_row_num>
    Given Step from '<scen_out_row_num>' in 'scenario-outlines' feature file
    Given user navigate to which? site
    Examples:
      | scen_out_row_num       |
      | Scenario Outline Row 1 |
      | Scenario Outline Row 2 |
