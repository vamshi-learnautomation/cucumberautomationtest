Feature: Googlesearch
@Regressiontest
Scenario: enter sometext in searchbox

Given user is on the googlepage
When user clicks on the search box
And enter some search text and click on enter
Then search results are displayed based on search criteria
