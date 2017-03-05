#Feature: Testing bananas
#
#  Scenario: My banana scenario
#
#    Given I have 10 bananas
#    When my brother gave me 5 bananas
#    Then I should have 15 bananas
#
#  Scenario: provide data within the steps
#    Given I have a calculator
#    When I add number 1 and number 2
#    Then the total should be 3
#
#
#  Scenario Outline: provide example data to execute the same test case multiple times <number1> <number2> <total>
#    Given I have a calculator
#    When I add number <number1> and number <number2>
#    Then the total should be <total>
#
#    Examples:
#      | number1 | number2 | total |
#      |  12     |  5      |  17   |
#      |  20     |  5      |  25   |
#      |  35     |  5      |  40   |
#
#  Scenario: provide data through a data table
#    Given I have following data
#      |  12     |  5      |  17|
#
#
#  Scenario: provide data through a table with header
#    Given I have following data with header
#      | first   | 12  |
#      | second  |  5  |
#      | total   | 17  |
