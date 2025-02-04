@Regression
Feature: User needs to test the functionality of Getplace API
Scenario: User needs to check the working of Getplace API
Given User needs to use the getplace payload
When User needss to use the "Getplaceapi" using http "get" method
Then User needss to verify uf the response of statuss code is 200
And User needs to veify the responsee of "types" is "place,ken"
And User needs to veify the responsee of "website" is "https://www.amazon.com"
