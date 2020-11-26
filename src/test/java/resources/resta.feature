Feature: resta entera
As a user 
I want to sum some values
So I can get de total of sum

Scenario Outline: resta
    Given a <value1> and <value2> to substract
    When the calc substract the values
    Then the <total> of substarct is ok

    Examples:
        | value1 | value2 | total |
        | 10      | 2     | 8     |
        | 15     | 12     | 3     |
        | 17     | 15     | 2    |
        | 150     | 25     | 125   |
        | 2        | 4     | -2    |
        | -3    | -4    | -1     |