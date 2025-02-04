@Regression
Feature: User needs to test the working functionality of addplace api
Scenario: User needs to test the add place api
Given User needs to use the addplace api with "<lat>" "<lng>" "<accuracy>" "<name>" "<phonenumber>" "<address>" "<types1>" "<types2>" "<website>" "<language>"
When User needs to use the "Addplaceapi" using http "post" method
Then User needs to validate if the response status code is 200
And User needs to check if the response of "status" is "OK"
And User needs to check if the response of "scope" is "APP"
Examples:
|lat    |lng    |accuracy|name         |phonenumber      |address               |types1|types2  |website                 |language     |
|90.4859|34.5748|60      |james house  |(+91)576858695434|flem house rich street|place |ken     |https://www.amazon.com  |German-IN    |