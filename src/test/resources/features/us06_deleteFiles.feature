@us_06
Feature: As a user, I should be able to delete a file / folder.

  Scenario: As a user, I should be able to delete a file / folder.
    Given user on the dashboard page
    When user clicks "Files" module
    And user click action-icon  from any file on the page
    And user choose "Delete f" option
    When user click "Deleted files" sub-module on the left side
    Then Verify the deleted file is displayed on the page.


