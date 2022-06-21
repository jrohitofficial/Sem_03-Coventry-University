Feature: Orange Basket
    As a farmer,
    I want to carry oranges in a basket,
    So that I do not drop them all.

Scenario Outline: Add oranges to a basket
    Given the basket has <start> oranges
    When <more> oranges are added to the basket
    Then the basket contains <final> oranges

    Examples: # Supply multiple values/data(test cases) to the pytest.
        | start | more | final |
        | 2 | 4 | 6 |
        | 1 | 3 | 4 |
        | 1 | 2 | 3 |



Scenario Outline: Remove oranges from a basket. 
Given the basket has <start> oranges
When <some> oranges are removed from the basket
Then the basket contains <final> oranges

Examples:
    | start | some | final |
    | 6  | 2  | 4  |
    | 7  | 4  | 3  |



Scenario Outline: Add item to cart. 
Given the cart has <start> item
When <some> item is added to the cart
Then the cart contains <final> items

Examples:
    | start | some | final |
    | 1  | 2  | 3 |


Scenario Outline: Return item to cart. 
Given the cart has <start> item
# When user asks the items
# For return item , When can be removed because it provides no tangible value.
Then return <final> items in his cart

Examples:
    | start | final |
    | 5  | 5 |

