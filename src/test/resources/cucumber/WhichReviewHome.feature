@WhichReviewHome
@RandomGenAppTester

Feature: Testing Which Review Home Page

  @whichone
  Scenario Outline: generate random values and verify rule engine rule no. "<expectedResult>"
    Given user navigate to "<navigateToPage>" page
    When sort the "<navigateToPage>" page with "<sortOption>" sort-option
    Examples: provided valid and invalid input
      | navigateToPage | sortOption          |
      | home           | PRICE_LOW_TO_HIGH |
      | home           | MOST_RECENTLY_LAUNCHED |
