@WhichReviewHome
@RandomGenAppTester

Feature: Testing Which Review Home Page

  @whichone @RuleEngine1
  Scenario Outline: Test which TV review page
    Given user navigate to "<navigateToPage>" page
    When User set filter conditions
      | ScreenSize              | ScreenType |
      | SIZE_32_34 ; SIZE_55_60 | OLED ; LCD |
    When sort the "<navigateToPage>" page with "<sortOption>" sort-option
    Then verify filtered result of TV review products pass "<ruleEngineIndex>" rule
    Examples: provided valid and invalid input
      | navigateToPage | sortOption             | ruleEngineIndex                                                      |
      | home           | PRICE_LOW_TO_HIGH      | RuleEngine_001; Filtered result should have selected ScreenSize only |
#      | home           | MOST_RECENTLY_LAUNCHED | RuleEngine_001; Filtered result should have selected ScreenSize only |
#      | home           | PRICE_LOW_TO_HIGH      | RuleEngine_002; Filtered result should have selected ScreenType only |
      | home           | MOST_RECENTLY_LAUNCHED | RuleEngine_002; Filtered result should have selected ScreenType only |
