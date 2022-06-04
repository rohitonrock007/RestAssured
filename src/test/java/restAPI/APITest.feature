Feature: Perform the CURD Operations

  Scenario: To perform the GET Operation on Employee DB
    Given The Base URI is "http://localhost:7000/employees"
    When I perform the Get Operation
    Then The Response code should be 200
