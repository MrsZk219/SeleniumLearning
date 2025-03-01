Feature: Text Box Page tests
  @test1
  Scenario: Verify that submit button works when all textboxes entered
    Given go to Text Box page
    And type fullname on Text Box page
    And type email on Text Box page
    And type address on Text Box page
    And type password on Text Box page
    When click submit button
    Then Page URL should changed