package com.serosoft.stepdef;

import com.serosoft.pages.ExaminationPages;
import com.serosoft.pages.GradeProgramPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class ExaminationSteps {
	
	@And("I add assessment method")
	public void iClickAddButton() throws Exception {
		new ExaminationPages().iClickAddAssessment();
	}

	@And("I fill the mandatory details for assign assessment method {string}")
	public void iClickAssignAssessmentTab(String type) throws Exception {
		new ExaminationPages().iClickAssignAssessmenttype(type);
	}
	
	@Then("I Verify the created assessment method {string}")
	public void iVerifyAssessmentMethod(String type) throws Exception {
		new ExaminationPages().iVerifyAssessmentMethod(type);
	}
	
	@And("I fill assessment scheme {string} and {string},{string} and {string} details")
	public void iFilltheAssessmentSchemeDetails(String type, String mode,String dynamicschemechoice, String acadterm)throws Exception {
		new ExaminationPages().iFilltheAssessmentSchemeDetails(type, mode, dynamicschemechoice ,acadterm);
	}
	
	@Given("I searching assessment scheme {string} and {string} name")
	public void iSearchAssessmentSchemeName(String type, String acadterm)throws Exception {
		new ExaminationPages().iSearchAssessmentSchemeName(type, acadterm);
	}
	
	@And("I validate the assessment scheme")
	public void iSelectAssessmentScheme()throws Exception {
		new ExaminationPages().iSelectAssessmentScheme();
	}
	
	@And("I add academic {string}")
	public void iSelectAcademicTerm(String term)throws Exception {
		new ExaminationPages().iSelectAcademicTerm(term);
	}
	
	@And("I link academy location")
	public void iMappingLocation()throws Exception {
		new ExaminationPages().iMappingLocation();
	}
	
	@And("I mapping course")
	public void iMappingCourse()throws Exception {
		new ExaminationPages().iMappingCourse();
	}
	
	@And("I mapping elegible course variants")
	public void iMappingVariantCourse()throws Exception {
		new ExaminationPages().iMappingVariantCourse();
	}

	@And("I add the assessment scheme hierarchy")
	public void iAddAssessmentschemeHierarchy()throws Exception {
		new ExaminationPages().iAddAssessmentschemeHierarchy();
	}
	@And("I add the assessment scheme hierarchy for SIS")
	public void iAddAssessmentschemeHierarchyforSIS()throws Exception {
		new ExaminationPages().iAddAssessmentschemeHierarchyForSIS();
	}
	
	@And("I add the assessment rule and {string}")
	public void iAddRules(String rule)throws Exception {
		new ExaminationPages().iAddRules(rule);
	}
	
	@And("I search {string} and {string} for manage the assessment status")
	public void iSearchAssmntSchemeandAcademicterm(String assemtscheme, String academicterm)throws Exception {
		new ExaminationPages().iSearchAssmntSchemeandAcademicterm(assemtscheme, academicterm);
	}

	@And("I select scheme and change the event {string}")
	public void iManageEventStatus(String status)throws Exception {
		new ExaminationPages().iManageEventStatus(status);
	}

	@And("I search {string} and {string} and course name for marks entry")
	public void iOpenforMarksEntry(String assemtscheme, String academicterm)throws Exception {
		new ExaminationPages().iOpenforMarksEntry(assemtscheme, academicterm);
	}
	
	@And("I select student and publishing the marks")
	public void iSelectStudentandEnterMarks()throws Exception {
		new ExaminationPages().iSelectStudentandEnterMarks();
	}
	
	@And("I add the reval setup with revalution fee {string}")
	public void iAddRevalSetupwithRevaluationFee(String feeopttion)throws Exception {
		new ExaminationPages().iAddRevalSetupwithRevaluationFee(feeopttion);
	}
	
	@Given("I search for the created revalution  setup")
	public void iSearchCreatedRevaluation()throws Exception{
		new ExaminationPages().iSearchCreatedRevaluation();
	}
	@And("I select the revalution setup and click on {string} button")
	public void iClickingManageRulesButton(String mngrlues)throws Exception {
		new ExaminationPages().iClickingManageRulesButton(mngrlues);
	}
	@And("I add the revalution rule with {string} ,{string}")
	public void iAddRevaluationTypeandCalculation(String revtype, String calculation)throws Exception {
		new ExaminationPages().iAddRevaluationTypeandCalculation(revtype, calculation);
	}
	@Given("I selected the created revalution setup and click on {string} button")
	public void iSelectCreatedRevalSetupandClickMapProg(String mapprogdetail)throws Exception{
		new ExaminationPages().iSelectCreatedRevalSetupandClickMapProg(mapprogdetail);
	}
	@And("I fill the program details with {string} and {string}")
	public void iFillProgDetailwithStartDateandEndDate(String startdate, String enddate)throws Exception {
		new ExaminationPages().iFillProgDetailwithStartDateandEndDate(startdate, enddate);
	}
	 @And("I search for the student applied for the revalution according to the student id")
	 public void iSearchAppliedStudentIdforRevaluation()throws Exception {
			new ExaminationPages().iSearchAppliedStudentIdforRevaluation();
		}
	 @And("I enter the {string} for the student and apply for the revalution")
	 public void iEnterRevTypeforforStudentforRevaluation(String revaltype) throws Exception{
		 new ExaminationPages().iEnterRevTypeforforStudentforRevaluation(revaltype);
	 }
	 @Given("I click on approve request button")
	 public void iClickApproveReqButton()throws Exception {
			new ExaminationPages().iClickApproveReqButton();
		}	
	 @And("I select the status {string} for the revalution request")
	    public void iSelectStatusforRevalRequest(String status)throws Exception {
			new ExaminationPages().iSelectStatusforRevalRequest(status);
		}
	 @And("I select the course and course variant ,Assesment event and type with annonymus assesment as {string}")
	    public void iSelectCourseCourseVariantAssmentEvnandAnnonymusAssessment(String options)throws Exception {
			new ExaminationPages().iSelectCourseCourseVariantAssmentEvnandAnnonymusAssessment(options);
		}
	 @Given("I enter the marks for the valuer1 and valuer2")
	 public void iEnterMarksintotheValues()throws Exception {
			new ExaminationPages().iEnterMarksintotheValues();
		}
	  @And("click on the calculate marks button")
	  public void iClicktheCalculateMarksBtn()throws Exception {
			new ExaminationPages().iClicktheCalculateMarksBtn();
		}
	  @Then("revalution status is now Changed")
	  public void iVlaidatetheRevaluationStatus()throws Exception {
			new ExaminationPages().iVlaidatetheRevaluationStatus();
		}
	  
	  @And("I entered academic term ,course ,course variant and {string}")
	    public void iEnterAcdemicTermCourseandCourseVariant(String asmscmlevel)throws Exception {
			new ExaminationPages().iEnterAcdemicTermCourseandCourseVariant(asmscmlevel);
		}
	  
	  @And("I click on manage remark status button and choose {string}")
	    public void iClickonManageRemaksStatusButton(String status)throws Exception {
			new ExaminationPages().iClickonManageRemaksStatusButton(status);
		}
	  
	  @Then("I search reusult is visible")
	  public void iSearchResultisVisible()throws Exception {
			new ExaminationPages().iSearchResultisVisible();
		}
	  
	  @Given("I select the searched student from the list")
	  public void iSelectStudentinList()throws Exception {
			new ExaminationPages().iSelectStudentinList();
		}
	  
	  @And("I click on enter remarks button")
	  public void iClickEnterRemarksButton()throws Exception {
			new ExaminationPages().iClickEnterRemarksButton();
		}
	  
	    @And("I enter the remarks")
	   public void iEntertheRemarks() throws Exception {
			new ExaminationPages().iEntertheRemarks();
		}
	    
	    @Given("I click on generic remark button") 
	    public void iClickGenericRemarksButton() throws Exception {
			new ExaminationPages().iClickGenericRemarksButton();
		}

	    @And("I select the {string} , Program ,batch , {string} , {string}")
		   public void iSelectUsertypeProgramBatchAsmscmlevelandLevelname(String usertype, String asmscmlevel, String asmscmlevelname) throws Exception {
				new ExaminationPages().iSelectUsertypeProgramBatchAsmscmlevelandLevelname(usertype, asmscmlevel, asmscmlevelname);
			}
	    
	    @Then("I validate {string}")
	    public void iValidateHeader(String header) throws Exception {
			new ExaminationPages().iValidateHeader(header);
		}
	    
	    @And("I select the {string} and entered student ID")
	    public void iSelectRanktypeandEnterStudentId(String ranktype) throws Exception {
			new ExaminationPages().iSelectRanktypeandEnterStudentId(ranktype);
		}
	    
	    @Then("student result should be visible in the search list")
	    public void iStudentResultShouldbeVisibleinList() throws Exception {
			new ExaminationPages().iStudentResultShouldbeVisibleinList();
		}
	    
	    @Given("I select the student result from the list")
	    public void iSelectStudentResultformTheList() throws Exception {
			new ExaminationPages().iSelectStudentResultformTheList();
		}
	
	    
	    @Then("result should be visible correctly as {string}")
	    public void iCheckResultVisibleCorrctly(String pass) throws Exception {
			new ExaminationPages().iCheckResultVisibleCorrctly(pass);
		}
	    
	    @And("I select the Assesment scheme")
	    public void SelectAssessmentScheme() throws Exception {
			new ExaminationPages().SelectAssessmentScheme();
		}
	    
	    @Given("I select the student for mark deletion")
	    public void iSelectStudentforMarksDeletion() throws Exception {
			new ExaminationPages().iSelectStudentforMarksDeletion();
		}
	    @And("I click on yes button")
	    public void iClickYesButton() throws Exception {
			new ExaminationPages().iClickYesButton();
		}
	    @And("I search program, course and assessment method for manage the assessment events")
	    public void iSearchProgramforManageAssessmentEvents() throws Exception {
	    	new ExaminationPages().iSearchProgramforManageAssessmentEvents();
	    }
	    @And("I enter {string}, {string}, {string}, {string} into the selected assessment event")
	    public void iEnterNameWeightageMinandMaxMarks(String name, String weightage, String minmarks, String maxmarks) throws Exception {
	    	new ExaminationPages().iEnterNameWeightageMinandMaxMarks(name, weightage, minmarks, maxmarks);
	    }
	    @Then("I click pending enrolled student in student exam enrollment tab")
	    public void iClickPendingEnrolledStudentLink() throws Exception {
	    	new ExaminationPages().iClickPendingEnrolledStudentLink();
	    }
	    @Then("I selecting the student name in student exam enrollment list")
	    public void iSelectingTheStudenntinExamEnrollment() throws Exception {
	    	new ExaminationPages().iSelectingTheStudenntinExamEnrollment();
	    }
	    @And("I click manage event status for {string}")
	    public void iClickManageEventsforOpenMarkEntry(String status) throws Exception {
	    	new ExaminationPages().iClickManageEventsforOpenMarkEntry(status);
	    }
	    @And("I select the student name program name and assessment level for student assessment report")
	    public void iOpenStudentAssessmentReport() throws Exception {
	    	new ExaminationPages().iOpenStudentAssessmentReport();
	    }
	    @And("I selecting the academy location and {string}")
	    public void iSelectAcdLocandTemplateFormatType(String temformattype)  throws Exception {
	    	new ExaminationPages().iSelectAcdLocandTemplateFormatType(temformattype);
	    }
	    @And("I add pbs and {string},{string} fill the details for sis")
		public void iAddPbsSectionforSIS(String homeroom, String teachername) throws Exception {
			new ExaminationPages().iAddPbsSectionforSIS(homeroom, teachername);
		}
	    @And("I select unallocated student and assign section")
		public void iSelectUnallocatedStuandAssignSec() throws Exception {
			new ExaminationPages().iSelectUnallocatedStuandAssignSec();
		}
	    @And("I select the student in student assessment report list")
		public void iSelectStudentForAssmntReport() throws Exception {
			new ExaminationPages().iSelectStudentForAssmntReport();
		}
	    
	    
	    @And("program and assesment level from the dropdown")
	    public void PrgandAssmntLevelDropdown() throws Exception {
	    	new ExaminationPages().PrgandAssmntLevelDropdown();
	    }
	    @And("I select the searched student")
	    public void iSelecttheStudent()  throws Exception {
	    	new ExaminationPages().iSelecttheStudent();	    	
	    }
	    
	    @And("I click on export grade book button")
	    public void iClickExportGreadeBookButton()throws Exception {
	    	new ExaminationPages().iClickExportGreadeBookButton();	    	
	    }
	    
	    @Then("I click {string} button and preview or generate the report")
	    public void iClickCancelbutton(String cancelbtn) throws Exception{
	    	new ExaminationPages().iClickCancelbutton(cancelbtn);	
	    }
	    
	    @Then("I click {string} button and preview or generate the report {string}")
	    public void iClickCancelbtnandPrevieworGenerateReport(String generatebtn, String templatename) throws Exception{
	    	new ExaminationPages().iClickCancelbtnandPrevieworGenerateReport(generatebtn, templatename);	
	    }
	    
	    @And("I select the mapped {string}")
	    public void iSelectMappedTemplate(String templatename) throws Exception{
	    	new ExaminationPages().iSelectMappedTemplate(templatename);	
	    }
	    
	    @And("I select current date as pubish date")
	    public void iSelectCurrentDateAsPublishdate() throws Exception{
	    	new ExaminationPages().iSelectCurrentDateAsPublishdate();	
	    }
	    @And("I select past date as pubish date")
	    public void iSelectPastDateAsPublishdate() throws Exception{
	    	new ExaminationPages().iSelectPastDateAsPublishdate();	
	    }
	    
	    @And("I select future date as pubish date")
	    public void iSelectFeatureDateAsPublishdate() throws Exception{
	    	new ExaminationPages().iSelectFeatureDateAsPublishdate();	
	    }
	    
	    @Given("I searching assessment scheme {string},{string} and {string}")
		public void iSearchAssessmentScheme(String type, String acadterm , String assesmentschemename)throws Exception {
			new ExaminationPages().iSearchAssessmentSchemeByName(type, acadterm , assesmentschemename);
		}
	    
	    
	    @And("I validate the assessment scheme {string} and select it")
		public void iSelectAssessmentSchemeAndSelect(String name)throws Exception {
			new ExaminationPages().iSelectAssessmentSchemeName(name);
		}
	    
	   
}
