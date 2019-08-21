Feature: Refund of item

#Background:
#Given refund of any faulty item as per the guidelines
#
#
#Scenario Outline: Jeff returns faulty microwave
#
#
#Given Jeff has brought microwave for <cost>
#And Jeff has the reciept
#When Jeff retirns the faulty item 
#Then Jeff got the refund of <refund_cost>
#
#Examples:
#|cost|refund_cost|
#|100|102|
#|100|92|

@loginTest 
Scenario Outline: Demotours login

Given User know that the application is up and running
And User having the valida data
When user provides the valid data "<uname>" and "<pswd>" clicks on sign in button
Then User Should be logged into the system

Examples:
| uname | pswd |
| demo | demo |

@logoutTest @prerequisiteTest
Scenario:
Given application is closed


@prerequisiteTest
Scenario:Refund regression test
Given item is returned
When and item is not further not damaged
Then initiate the refund process

@dataTest
Scenario: large data
Given the following users exists
| name | email |
| abc | ab99c@gmail.com|
| fgrr | ghdjfhemail@gmail |
