Feature: Registration
Scenario: launch the application
Given application url
When site is up and runing
And user clicks on register button valid data
Then registration form should be opened

Scenario Outline: clicking on registration link & providing data
Given user having data
When data is accurate
And user provides the correct data "<name>" and "<pswrd>" correctly
Then registration form should be opened
Examples:
| name | pswrd |
| srini | demo |
| suman | demo1 |
| ram | demo2 |

Scenario: Fetching the user name from the application
Given success page url
When page having usernem
And user name appearing
Then fetch it and store it

@dataTest
Scenario: large data
Given the following users exists
| name | email |
| abc | ab99c@gmail.com|
| fgrr | ghdjfhemail@gmail |
