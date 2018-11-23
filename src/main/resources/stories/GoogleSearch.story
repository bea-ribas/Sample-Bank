Scenario: Google search for item
Given I access the google search
When I search for <searchItem>
Then the page title should contain <searchItem>
Examples:
| searchItem |
| cheese     |
| chocolate  |
| pizza      |