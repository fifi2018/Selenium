Feature: Testing OMDB API

Scenario: Test the API
  Given a film exists with the title titanic
  When a user retrieves the film using the title
  Then the status code should read 200

