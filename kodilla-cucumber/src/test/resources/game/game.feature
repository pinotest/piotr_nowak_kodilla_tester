Feature: Game
  Give me the number I will tell you what next

  Scenario Outline: Is number is divided?
    Given number is <number>
    When I ask whether it divided by three or five
    Then I should get <answer>
    Examples:
      | number | answer |
      | 3 | "Fizz" |
      | 5 | "Buzz" |
      | 15 | "FizzBuzz" |
      | 1 | "None" |
      | 45  | "FizzBuzz"     |
      | 9  | "Fizz"     |