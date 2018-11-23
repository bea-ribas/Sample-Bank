Narrative:
As a manager
I want to request a loan
So that I can assure if the system is blocking loans higher than 30% and balance lower than $2000

GivenStories: stories/Deposit.story

Scenario: Open Make Loan Page
When User clicks on menu Loans

Scenario: Request Loan
Given User select an account <account>
And User fills the desired <loanValue> to loan
When User clicks on loan button
Then system should display <message>
Examples:
|account      |loanValue   | message                                                     |
|55555555555  |10.00       |Operation completed with success                             |
|55555555555  |15.00       |There is a pending loan for this account                     |
|55555555555  |40.00       |There is a pending loan for this account                     |
|88888888888  |100.00      |The requested loan amount exceeds the available credit limit |                     |

