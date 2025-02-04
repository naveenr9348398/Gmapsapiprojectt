@Deleteplace
Feature: User needs to test the functionality of Deleteplace API
Scenario: User needs to test the functionality of the delete place api
Given User needs to use the delete place payload
When Userr needs to use the "Deleteplaceapi" using http "delete" method
Then Userr needs to check if the reponse of status code is 200
And Userr needs to checkk if the response of "status" is "OK" 