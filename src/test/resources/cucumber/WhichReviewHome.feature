@WhichReviewHome
@RandomGenAppTester

Feature: Testing Which Review Home Page

  @whichone
  Scenario Outline: Test which TV review page
    Given user navigate to "<navigateToPage>" page
    When sort the "<navigateToPage>" page with "<sortOption>" sort-option
    When User set filter conditions
      | ScreenSize              | ScreenType |
      | SIZE_20_28 ; SIZE_55_60 | OLED ; LCD |
    When get all the TV reviews on the page
    Examples: provided valid and invalid input
      | navigateToPage | sortOption             |
      | home           | PRICE_LOW_TO_HIGH      |
      | home           | MOST_RECENTLY_LAUNCHED |
