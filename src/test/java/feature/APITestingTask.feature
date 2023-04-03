@test
Feature: Title of your feature

  Scenario: Title of your scenario
    Given Send get request to fetch resource and verify resource count
    And Send post request to create a resource
    When Send get request to fetch resource information
    And Send post request to update created resource
    Then Send get request to fetch resource information and verify resource is updated
    And Send delete request to delete resource
    Then Verify that resource has been deleted succesfully