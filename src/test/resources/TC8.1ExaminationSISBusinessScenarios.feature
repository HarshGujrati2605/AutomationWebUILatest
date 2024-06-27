@ExaminationSIS @studentassessment
Feature: Examination SIS features
  I want to use this template for my feature file

  Scenario Outline: Validating the logout functionality
    When I enter username as "<username>"
    And I enter password as "<password>"
    And I login
    Then I am on homepage

    Examples: 
      | username | password |
      | sysadmin | password |

  @StudentAssesmentReport
  Scenario Outline: Validating Export grade book cancelation
    Given I click on "<Module>"
    And I click on "<Modulename>" Module
    And program and assesment level from the dropdown
    And I click "<Buttonname>" button
    And I select the searched student
    And I click on export grade book button
    Then I click "<button>" button and preview or generate the report

    Examples: 
      | Modulename                | Module       | Buttonname | button |
      | Student Assessment Report | Examinations | Search     | Cancel |

  @StudentAssesmentReport
  Scenario Outline: Validating Export grade book with current date
    Given I click on export grade book button
    And I select the mapped "<Template Name>"
    And I select current date as pubish date
    Then I click "<button>" button and preview or generate the report "<Template Name>"

    Examples: 
      | Modulename                | Module       | Buttonname | button   | Template Name                 |
      | Student Assessment Report | Examinations | Search     | Generate | SIS Assessment Report JC1-JC2 |

  @StudentAssesmentReport
  Scenario Outline: Validating Export grade book past date
    Given I click on export grade book button
    And I select the mapped "<Template Name>"
    And I select past date as pubish date
    Then I click "<button>" button and preview or generate the report "<Template Name>"

    Examples: 
      | Modulename                | Module       | Buttonname | button   | Template Name                 |
      | Student Assessment Report | Examinations | Search     | Generate | SIS Assessment Report JC1-JC2 |

  @StudentAssesmentReport
  Scenario Outline: Validating Export grade book future date
    Given I click on export grade book button
    And I select the mapped "<Template Name>"
    And I select future date as pubish date
    And I click "<button>" button and preview or generate the report "<Template Name>"

    Examples: 
      | Modulename                | Module       | Buttonname | button   | Template Name                 |
      | Student Assessment Report | Examinations | Search     | Generate | SIS Assessment Report JC1-JC2 |

  @StudentAssesmentReport
  Scenario Outline: Validating Export grade book future date and click Generate and Publish btn
    Given I click on export grade book button
    And I select the mapped "<Template Name>"
    And I select current date as pubish date
    Then I click "<button>" button and preview or generate the report "<Template Name>"

    Examples: 
      | Modulename                | Module       | Buttonname | button               | Template Name                 |
      | Student Assessment Report | Examinations | Search     | Generate And Publish | SIS Assessment Report JC1-JC2 |

  @SelectExistingassementScheme
  Scenario Outline: Validating Export grade book cancelation
    Given I refresh page
    And I click on "<Module>"
    And I click on "<Modulename>" Module
    And I searching assessment scheme "<Type>","<Academic Term>" and "<assesemnt scheme name>"
    And I click "<Buttonname>" button
    Then I validate the assessment scheme "<assesemnt scheme name >" and select it

    Examples: 
      | Modulename        | Module       | Buttonname | assesemnt scheme name    | Action |
      | Assessment Scheme | Examinations | Search     | Assessment Scheme dNQhBT | Edit   |

  @DynamicFormRendering
  Scenario Outline: Validating changing "Academic term" visibility as "No"
    Given I refresh page
    And I click on "<Module>"
    And I click on "<Modulename>" Module
    And I select academy location and "<Screen name>"
    And I click "<Buttonname>" button
    And I select the assessment basic detail screen row
    And I click on "<Action>" button
    Then I select assessment basic screen and change visiblity to "<visibility>" and "<option>"

    Examples: 
      | Modulename             | Module | Buttonname | Screen name             | Action | visibility | option   |
      | Dynamic Form Rendering | Setup  | Search     | Assessment Basic Detail | Edit   | No         | Optional |

  @SelectExistingassementScheme
  Scenario Outline: Validating academic term is not visible
    Given I refresh page
    And I click on "<Module>"
    And I click on "<Modulename>" Module
    And I searching assessment scheme "<Type>","<Academic Term>" and "<assesemnt scheme name>"
    And I click "<Buttonname>" button
    And I validate the assessment scheme "<assesemnt scheme name >" and select it
    And I click on "<Action>" button
    Then I validate no academic term is visible in basic details

    Examples: 
      | Modulename        | Module       | Buttonname | assesemnt scheme name    | Action |
      | Assessment Scheme | Examinations | Search     | Assessment Scheme dNQhBT | Edit   |

  @DynamicFormRendering
  Scenario Outline: Validating changing "Academic term" visibility as "Yes"
    Given I refresh page
    And I click on "<Module>"
    And I click on "<Modulename>" Module
    And I select academy location and "<Screen name>"
    And I click "<Buttonname>" button
    And I select the assessment basic detail screen row
    And I click on "<Action>" button
    Then I select assessment basic screen and change visiblity to "<visibility>" and "<option>"

    Examples: 
      | Modulename             | Module | Buttonname | Screen name             | Action | visibility | option    |
      | Dynamic Form Rendering | Setup  | Search     | Assessment Basic Detail | Edit   | Yes        | Mandatory |

  @SelectExistingassementScheme
  Scenario Outline: Validating academic term is visible
    Given I refresh page
    And I click on "<Module>"
    And I click on "<Modulename>" Module
    And I searching assessment scheme "<Type>","<Academic Term>" and "<assesemnt scheme name>"
    And I click "<Buttonname>" button
    And I validate the assessment scheme "<assesemnt scheme name >" and select it
    And I click on "<Action>" button
    Then I validate academic term is visible in basic details

    Examples: 
      | Modulename        | Module       | Buttonname | assesemnt scheme name    | Action |
      | Assessment Scheme | Examinations | Search     | Assessment Scheme dNQhBT | Edit   |

  @DynamicFormRendering
  Scenario Outline: Validating changing "Academic term" label in DFR
    Given I refresh page
    And I click on "<Module>"
    And I click on "<Modulename>" Module
    And I select academy location and "<Screen name>"
    And I click "<Buttonname>" button
    And I select the assessment basic detail screen row
    And I click on "<Action>" button
    Then I can able to change academic term "<label>" in new label name field

    Examples: 
      | Modulename             | Module | Buttonname | Screen name             | Action | visibility | label             |
      | Dynamic Form Rendering | Setup  | Search     | Assessment Basic Detail | Edit   | Yes        | Academic term new |

  @SelectExistingassementScheme
  Scenario Outline: Validating academic term field name is changed
    Given I refresh page
    And I click on "<Module>"
    And I click on "<Modulename>" Module
    And I searching assessment scheme "<Type>","<Academic Term>" and "<assesemnt scheme name>"
    And I click "<Buttonname>" button
    And I validate the assessment scheme "<assesemnt scheme name >" and select it
    And I click on "<Action>" button
    Then I validate academic term field name is changed/

    Examples: 
      | Modulename        | Module       | Buttonname | assesemnt scheme name    | Action |
      | Assessment Scheme | Examinations | Search     | Assessment Scheme dNQhBT | Edit   |
