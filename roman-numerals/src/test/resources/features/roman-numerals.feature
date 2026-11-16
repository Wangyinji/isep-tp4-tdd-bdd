Feature: Convert integers to Roman numerals
  Scenario: Convert one
    Given the integer is 1
    When I convert it to a Roman numeral
    Then the Roman numeral should be "I"
