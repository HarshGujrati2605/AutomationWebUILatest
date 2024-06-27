@ExaminationSIS @regression 

Feature: Examinations Business Scenarios for SIS(Dynamic Scheme)
#Pre-requisite : Program and course should be created and student should be admitted for the same program.

  @Createassessmentmethod
  Scenario Outline: Add Assessment Method
    Given I click on "<Module>"
    And I click on "<Modulename>" Module
    And I click on "<Action>" button
    And I add assessment method
    Then I can see the successfull alert
    And I refresh page

    Examples: 
      | Modulename         | Module       | Action |
      | Assessment Methods | Examinations | Add    |

  
  Scenario Outline: Add Assessment Scheme
    Given I click on "<Module>"
    And I click on "<Modulename>" Module
    And I click on "<Action>" button
    And I fill assessment scheme "<Type>" and "<Rounding Mode>","<Dynamic scheme>" and "<Academic Term>" details
    Then I can see the successfull alert

    Examples: 
      | Modulename        | Module       | Action | Type      | Rounding Mode | Academic Term |Dynamic scheme|
      | Assessment Scheme | Examinations | Add    | Academics | Round Half Up |          2023 |   Yes        |

  Scenario Outline: Search Assessment Scheme name
    Given I searching assessment scheme "<Type>" and "<Academic Term>" name
    And I click "<Buttonname>" button
    And I validate the assessment scheme

    Examples: 
      | Buttonname | Type      | Academic Term |
      | Search     | Academics |          2023 |

  Scenario Outline: Edit Assessment scheme and Linking Academy location
    Given I click on "<Action>" button
    And I click on "<Tab name>" tab
    And I link academy location

    Examples: 
      | Action | Tab name               |
      | Edit   | Link Academy Locations |

  Scenario Outline: Mapping Course in Assessment scheme
    Given I click on "<Tab name>" tab
    And I mapping course

    Examples: 
      | Tab name       |
      | Course Mapping |

  Scenario Outline: Mapping Variant in Assessment scheme
    Given I click on "<Tab name>" tab
    And I mapping elegible course variants
    Then I can see the successfull alert

    Examples: 
      | Tab name        |
      | Variant Mapping |

  Scenario Outline: Mapping Assessment Scheme Hierarchy
    Given I click on "<Tab name>" tab
    And I add the assessment scheme hierarchy for SIS
    Then I can see the successfull alert

    Examples: 
      | Tab name                    |
      | Assessment Scheme Hierarchy |

  Scenario Outline: Apply Rules
    Given I click on "<Tab name>" tab
    And I add the assessment rule and "<Business Rule>"
    Then I can see the successfull alert
    And I refresh page

    Examples: 
      | Tab name   | Business Rule |
      | Apply Rule | Sum           |

  Scenario Outline: Manage assessment status and change event status
    Given I click on "<Module>"
    And I click on "<Modulename>" Module
    And I search program, course and assessment method for manage the assessment events
    And I click "<Buttonname>" button
    And I enter "<New Name>", "<Weightage>", "<Min Marks>", "<Max Marks>" into the selected assessment event
    And I can see the successfull alert
    #Then I click pending enrolled student in student exam enrollment tab

    Examples: 
      | Modulename               | Module       |  Buttonname |New Name				 |Weightage |Min Marks|Max Marks|
      | Manage Assessment Events | Examinations | Search      |Automation_Test |100				|	45			|	100			|
      
    Scenario Outline: Run the Job for Start Admission
    Given I click on "<Module>"
    And I click on "<Modulename>" Module
    Then I select "<JobName>" and "<JobState>"
    And I click "<JobName>" and "<JobState History>"
    Then I refresh page

    Examples: 
      | Module | Modulename  | JobName                 										| JobState |JobState History|
      | Setup  | Job History | Auto Enroll Students into Assessment Event | Waiting  |History|
      
    Scenario Outline: Student Exam Enrollment Tab 
    Given I click on "<Module>"
    And I click on "<Modulename>" Module
    And I search program, course and assessment method for manage the assessment events
    And I click "<Buttonname>" button
    And I click pending enrolled student in student exam enrollment tab
  	Then I refresh page
   
    Examples: 
      | Modulename               | Module       |  Buttonname |
      | Manage Assessment Events | Examinations | Search      |
      
	  Scenario Outline: Manage subjects/section  
    Given I click on "<Module>"
    And I click on "<Modulename>" Module
    And I add pbs and "<Home Room>","<Teacher Name>" fill the details for sis
    And I select unallocated student and assign section
    Then I refresh page

    Examples: 
      | Modulename      | Module             | Home Room              | Teacher Name |
      | Manage Section  | Programs & Courses | Automation Class A		  | Pallavi      |

  Scenario Outline: Channge SIS Student Status Open for Marks Entry
  	Given I click on "<Module>"
    And I click on "<Modulename>" Module
    And I search program, course and assessment method for manage the assessment events
    And I click "<Buttonname>" button
    And I click manage event status for "<Event Type>"
    Then I can see the successfull alert
    And I refresh page

    Examples: 
      | Modulename         			 | Module       |  Buttonname |  Event Type       |
      | Manage Assessment Events | Examinations | Search      |Open For Mark Entry|
      
    Scenario Outline: Open for Manage Marks Entry
    Given I click on "<Module>"
    And I click on "<Modulename>" Module
    And I search "<Assessment Scheme>" and "<Academic Term>" and course name for marks entry
    And I select student and publishing the marks
    Then I can see the successfull alert
    And I refresh page

    Examples: 
      | Modulename         | Module       | Assessment Scheme | Academic Term |
      | Manage Marks Entry | Examinations | Academics         |          2023 |
      
    Scenario Outline: Examination results search
    Given I click on "<Module>"
    And I click on "<Modulename>" Module
    And I select the "<Rank type>" and entered student ID
    And I click "<Buttonname>" button
    And student result should be visible in the search list
    Then I refresh page
    
    Examples: 
      | Modulename          | Module       | Rank type       | Buttonname |
      | Examination Results | Examinations | Course Specific | Search     |
    
    Scenario Outline: Examination Student Assessment Report
    Given I click on "<Module>"
    And I click on "<Modulename>" Module
    And I select the student name program name and assessment level for student assessment report
    And I click "<Buttonname>" button
    And I select the student in student assessment report list
    And I can see the successfull alert
    Then I refresh page
    
    Examples: 
      | Modulename          			| Module       | Rank type       | Buttonname |
      | Student Assessment Report | Examinations | Course Specific | Search     |
      
    Scenario Outline: Report Template Mapping
    Given I click on "<Module>"
    And I click on "<Modulename>" Module
    And I selecting the academy location and "<Tamplate Format Type>"
    And I click "<Buttonname>" button
    
    Then I refresh page

    Examples: 
      | Module | 			Modulename 				 | Tamplate Format Type |Buttonname|
      | Setup  | Report Template Mapping |			Basic Reports		|Search|
      
      
      
      
      
      
      
      
      
      
      
      

  #Scenario Outline: Re-evalution setup and approval
    #Given I click on "<Module>"
    #And I click on "<Modulename>" Module
    #And I add the reval setup with revalution fee "<option>"
    #Then I can see the successfull alert
#
    #Examples: 
      #| Modulename        | Module       | option |
      #| Revaluation Setup | Examinations | No     |
#
  #Scenario Outline: Search created revalution setup and setup the rules
    #Given I search for the created revalution  setup
    #And I select the revalution setup and click on "<Manage Rules>" button
    #And I add the revalution rule with "<Revalution type>" ,"<calculation>"
    #Then I can see the successfull alert
#
    #Examples: 
     #| Revalution type | calculation             | Manage Rules |
     #| Revaluation     | Revaluation Calculation | Manage Rules |
#
  #Scenario Outline: Manage program details for revalution setup
    #Given I selected the created revalution setup and click on "<Map Program Details>" button
    #And I fill the program details with "<start date>" and "<end date>"
    #Then I can see the successfull alert
#
    #Examples: 
     #| Map Program Details | 
     #| Map Program Details | 
#
  #Scenario Outline: Apply For Revaluation Module
    #Given I refresh page
    #And I click on "<Module>"
    #And I click on "<Modulename>" Module
    #And I search for the student applied for the revalution according to the student id
    #And I enter the "<revalution type>" for the student and apply for the revalution
    #Then I can see the successfull alert
#
    #Examples: 
      #| Modulename            | Module       | revalution type |
      #| Apply For Revaluation | Examinations | Revaluation     |
#
  #Scenario Outline: Approve the revalution request
    #Given I click on approve request button
    #And I select the status "<status>" for the revalution request
    #Then I can see the successfull alert
#
    #Examples: 
      #| status   |
      #| Approved |
#
  #Scenario Outline: Search for marks entry for the revalution
    #Given I refresh page
    #And I click on "<Module>"
    #And I click on "<Modulename>" Module
    #And I select the course and course variant ,Assesment event and type with annonymus assesment as "<option>"
#
    #Examples: 
      #| Modulename             | Module       | option |
      #| Revaluation Mark Entry | Examinations | No     |
#
  #Scenario: Marks entry revalution
    #Given I enter the marks for the valuer1 and valuer2
    #And click on the calculate marks button
    #And I can see the successfull alert
    #Then revalution status is now Changed
#
  #Scenario Outline: Assigned remarks for prgram/course level
    #Given I refresh page
    #And I click on "<Module>"
    #And I click on "<Modulename>" Module
    #And I entered academic term ,course ,course variant and "<Assesment scheme level>"
    #And I click on manage remark status button and choose "<status>"
    #And I click on Save button of "<type>"
    #And I can see the successfull alert
    #And I click "<Buttonname>" button
    #Then I search reusult is visible
#
    #Examples: 
      #| Modulename     | Module       | option | status | Buttonname | type   |Assesment scheme level|
      #| Assign Remarks | Examinations | No     | Open   | Search     | window |Auto Assessment Type  |
#
  #Scenario Outline: Enter remarks for the student level
    #Given I select the searched student from the list
    #And I click on enter remarks button
    #And I enter the remarks
    #And I click on Save button of "<type>"
    #Then I can see the successfull alert
#
    #Examples: 
      #| type   |
      #| window |
#
  #Scenario Outline: Enter generic remark for the student in program level
    #Given I click on generic remark button
    #And I enter the remarks
    #And I click on Save button of "<type>"
    #Then I can see the successfull alert
#
    #Examples: 
      #| type   |
      #| window |
      #
################################################################## Comment below scenario code
  #Scenario Outline: Assign remark in student level
    #Given I click on "<Tab name>" tab
    #And I select the "<User type>" , Program ,batch , "<Assessment scheme level>" , "<Assesment level name>"
    #And I click on manage remark status button and choose "<status>"
    #And I click on Save button of "<type>"
    #And I click "<Buttonname>" button
    #Then I validate "<Header>"
#
    #Examples: 
      #| Tab name             | User type     | Assessment scheme level | Assesment level name | status | type   | Buttonname | Header      |
      #| Student Level Remark | Class Teacher | Assessment Type         | Auto Assessment Type | Open   | window | Search     | Remark List |
#
  ###############################################################################
#
  #Scenario Outline: Examination results search
    #Given I refresh page
    #And I click on "<Module>"
    #And I click on "<Modulename>" Module
    #And I select the "<Rank type>" and entered student ID
    #And I click "<Buttonname>" button
    #Then student result should be visible in the search list
#
    #Examples: 
      #| Modulename          | Module       | Rank type       | Buttonname |
      #| Examination Results | Examinations | Course Specific | Search     |
#
 #
  #Scenario Outline: Validating the Examination result
  #	Given I refresh page
    #And I click on "<Module>"
    #And I click on "<Modulename>" Module
    #And I select the "<Rank type>" and entered student ID
    #And I click "<Buttonname>" button
    #
      #Examples: 
      #| Modulename          | Module       | Rank type       | Buttonname |
      #| Examination Results | Examinations | Course Specific | Search     |
    #
   #Scenario Outline: Validating the result Multiple Tabs
    #Given I select the student result from the list
    #And I click on "<Tab name>" tab
    #Then result should be visible correctly as "Pass"
#
    #Examples: 
      #| Tab name            |
      #| Assessment Type     |
      #| Assessment Sub Type |
      #| Assessment Method   |
     #
      #
   #Scenario Outline: Exam Result Deletion
    #Given I refresh page
    #And I click on "<Module>"
    #And I click on "<Modulename>" Module
    #And I select the Assesment scheme
    #And I click "<Buttonname>" button
    #Then I validate "<Header>"
#
    #Examples: 
      #| Modulename           | Module       | Buttonname | Header     |
      #| Exam Result Deletion | Examinations | Search     | Mark Entry |
#
  #Scenario Outline: Delete the examination results
    #Given I select the student for mark deletion
    #And I click on "<Action>" button
    #And I click on yes button
    #Then I can see the successfull alert
#
    #Examples: 
      #| Action |
      #| Delete |
