@mustRun
Feature: how to use tags 

##Multiple tags
##Tags with AND OR conditions
##tags = {"@smoke or @regression"}
##tags = {"@smoke and @regression"}
##tags = {"@smoke and not @regression"}

##Skip or Ignore Tags
##tags = {"(@smoke or @regression) and not @important"}

##@must run = will excecute all the scenarios

@smoke 
Scenario: Scenario 1
Given 
When 
And
Then 

@regression
Scenario: Scenario 2
Given 
When 
And
Then 

@smoke @regression
Scenario: Scenario 3
Given 
When 
And
Then 

@important
Scenario: Scenario 4
Given 
When 
And
Then 