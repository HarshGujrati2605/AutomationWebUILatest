@ApplicationUsingExcel
Feature: Create Admission features

  Scenario Outline: Validating the logout functionality
    When I enter username as "<username>"
    And I enter password as "<password>"
    And I login
    Then I am on homepage
   
    Examples: 
      | username | password | 
      | sysadmin | password |

  Scenario Outline: Create New Appliation
    Given I click on "<Module>"
    And I click on "<Modulename>" Module
    Then I add new application details
    Examples: 
      | Module     | Modulename         | 
      | Admissions | Create Application | 