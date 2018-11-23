Narrative:
As a manager
I want to deposit
So that I can test the system

GivenStories: stories/CreateAccount.story

Scenario: Open Deposit Page
When User clicks on menu Deposit

Scenario: Deposit a value on an account
Given User select an <account>
And User fills the desired <amount> to deposit
When User clicks on deposit button
Then The return message for deposit is <message>
Examples:
|account     | amount 	   	| message 						    |
|55555555555 | 20.00   		| Operation completed with success  |
|88888888888 | 20.00   		| Operation completed with success  |