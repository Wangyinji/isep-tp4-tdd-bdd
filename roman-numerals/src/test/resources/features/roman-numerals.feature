Feature: Convert integers to Roman numerals
  Scenario: Convert one
    Given the integer is 1
    When I convert it to a Roman numeral
    Then the Roman numeral should be "I"

  Scenario: Convert two
    Given the integer is 2
    When I convert it to a Roman numeral
    Then the Roman numeral should be "II"

  Scenario: Convert three
    Given the integer is 3
    When I convert it to a Roman numeral
    Then the Roman numeral should be "III"

  Scenario: Convert four
    Given the integer is 4
    When I convert it to a Roman numeral
    Then the Roman numeral should be "IV"

  Scenario: Convert five
    Given the integer is 5
    When I convert it to a Roman numeral
    Then the Roman numeral should be "V"

  Scenario: Convert nine
    Given the integer is 9
    When I convert it to a Roman numeral
    Then the Roman numeral should be "IX"
