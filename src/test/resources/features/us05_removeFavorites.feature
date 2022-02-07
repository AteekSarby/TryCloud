@us_05
Feature: As a user, I should be able to remove files from favorites
  and upload a file directly

  Background:
    Given user on the dashboard page
    When user clicks "Files" module

  Scenario: As a user, I should be able to remove files to Favorites
    When user click action-icon from any file on the page to remove
    And  user choose "Remove from favorites" option
    And user click "Favorites" sub-module on the left side
    Then Verify that the file is removed from Favorites sub-module’s table






