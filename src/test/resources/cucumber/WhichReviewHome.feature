@WhichReviewHome
@RandomGenAppTester

Feature: Testing Which? TV Review Home Page

  @whichone @RuleEngine1
  Scenario Outline: First Page of Search Result should have valid ScreenType and ScreenSize as per "<ruleEngineIndex>" rule
    Given user navigate to "<navigateToPage>" page
    When User set filter conditions
      | ScreenSize              | ScreenType |
      | SIZE_32_34 ; SIZE_55_60 | OLED ; LCD |
    When sort the "<navigateToPage>" page with "<sortOption>" sort-option
    Then verify filtered result of TV review products pass "<ruleEngineIndex>" rule
    Examples: provided valid and invalid input
      | navigateToPage | sortOption             | ruleEngineIndex                                                                       |
      | TVhome         | PRICE_LOW_TO_HIGH      | RuleEngine_001; Filtered result should have selected ScreenSize only                  |
#     |  TVhome          | PRICE_LOW_TO_HIGH      | RuleEngine_002; Filtered result should have selected ScreenType only                  |
      | TVhome         | MOST_RECENTLY_LAUNCHED | RuleEngine_001+002; Filtered result should have selected ScreenSize & ScreenType only |
#     | MobileHome           | MOST_RECENTLY_LAUNCHED | RuleEngine_001; Filtered result should have selected ScreenSize only                  |
#     | home           | MOST_RECENTLY_LAUNCHED | RuleEngine_002; Filtered result should have selected ScreenType only                  |


