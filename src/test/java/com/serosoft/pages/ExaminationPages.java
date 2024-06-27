package com.serosoft.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.appium.commonactionmethods.CommonActions;
import com.harsh.globalvariable.GlobalVariable;
import com.serosoft.base.BaseClass;

public class ExaminationPages extends GlobalVariable {

	By addforexambtn = By.xpath(
			"//div[contains(@id , 'toolbar')]//a[contains(@class,'x-btn') and contains(@role,'button')and contains(@data-xpath,'searchResult') and contains(@data-qtip,'Add')]");
	By assemnametxt = By.xpath(
			"//body//div[contains(@class,'x-window') and contains(@style,'opacity: 1')]//input[@name='sequenceName']");
	By assignprogramtxtbox = By.xpath(
			"//body//div[contains(@class,'x-window') and contains(@style,'opacity: 1')]//input[@name='program']");
	By assignprobatchtxtbox = By.xpath(
			"//body//div[contains(@class,'x-window') and contains(@style,'opacity: 1')]//input[@name='batch']/../../td[2]");
	By assessmenttypearrow = By.xpath(
			"//body//div[contains(@class,'x-window') and contains(@style,'opacity: 1')]//input[@name='evaluationType']/../../td[2]");
	By assignassessmenttxtboxarrow = By.xpath(
			"//body//div[contains(@class,'x-window') and contains(@style,'opacity: 1')]//div[@name='seqName']/../../td[3]");
	By assignassessmenttxtbox = By.xpath(
			"//body//div[contains(@class,'x-window') and contains(@style,'opacity: 1')]//div[@name='seqName']//input");
	By acadterminschemesrc = By.cssSelector("input[name = 'assessmentSchemeAcademicTerm']");

	By schemetype = By.xpath("//input[@name='evaluationPlanType']/../../td[2]");
	By coursesrch = By.xpath("//input[@name='courseId' and contains(@class,'required-field')]/../../td[2]");
	By assessmentnametxt = By.xpath("//input[@name='evaluationPlanNumber']");
	By roundingmodedrpdwn = By.xpath("//input[@name='roundingMode']/../../td[2]");
	By acadtermdd = By.xpath("//input[@name='academicTerm']/../../td[2]");
	By assessschtxt = By.xpath("//input[@name='evaluationplanno']/../../td[2]");

	By mainexpandacdbtn = By.xpath("//span[text() = 'ACADEMICS']/../img[contains(@class , 'expander')]");
	By subtypearrow = By.xpath("//input[@name = 'courseComponentAcademic']/../../td[2]");
	By methodarrow = By.xpath("//input[@name = 'sequenceHeaderId']/../../td[2]");
	By whetherradiobtn = By.xpath("//table[@data-xpath='fieldcontainer_whetherRemarkRadioGroup_whetherRemarkRadioGroupItemId_radiogroup']//label[text() = 'Whether Remark:' and contains(@class,'item-label')]/../following-sibling::div//label[text()='Yes']/../input");
	By criticalradiobtnyes = By.xpath(
			"//label[text() = 'Whether Passing Critical:']/../../div[contains(@class , 'box')]//label[text() = 'Yes']/preceding-sibling::input");
	By failmarkstxt = By.xpath("//input[@name = 'failMarksToBeAwarded']");
	By reretitionradiobtn = By.xpath("//input[@name = 'repetitionType']/../../td[2]");
	By eventlevelvalue = By.xpath("//div[contains(text() , 'Course Level' )]");
	By minmarkstxt = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//input[@name = 'minMarksOrGradeNumber']");
	By maxmarkstxt = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//input[@name = 'maxMarksOrGradeNumber']");
	By weighttxt = By.xpath("//input[@name='weightage']");
	By weighttxtsubtype = By.xpath("//input[@name='evalSequenceWeightage']");
	By eventtxt = By.xpath("//input[@name='detailSequenceNumber']");
	By ruletext = By.cssSelector("input[name='ruleName']");
	By ruleapplyarrow = By.xpath("//input[@name='ruleAppliedFor']/../../td[2]");
	By businessrule = By.xpath("//input[@name='businessRule']/../../td[2]");
	By evnminmarkstxt = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//input[@name = 'minMarks']");
	By evnmaxmarkstxt = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//input[@name = 'maxMarks']");
	By elgstudent = By.xpath("//span[text()='Eligible Students']/ancestor::td");
	By mapstudent = By.xpath("//span[text()='Mapped Students']/ancestor::td");
	By mapstdbtn = By.xpath("//span[text()='Map Students']/ancestor::a");
	By schmetypedpdn = By.xpath("//input[@name='evaluationplantype']/../../td[2]");
	By acadmtermdpdn = By.xpath("//input[@name='academicTerm' and contains(@class,'required-field')]/../../td[2]");
	By assemtschedpdn = By.xpath("//input[@name='evalautionPlanNo']/../../td[2]");

	By saveButtonExamsAssesmentType = By.xpath(
			"//span[text()='Save' and contains(@class,'x-btn-inner x-btn-inner-center')]/ancestor::a[@data-xpath='panel_addButtonItemId_button']");
	By saveButtonAsssementSubType = By.xpath(
			"//span[text()='Save' and contains(@class,'x-btn-inner x-btn-inner-center')]/ancestor::a[@data-xpath='panel_levelTwoAddButtonId_button']");
	By saveButtonMehtod = By.xpath(
			"//span[text()='Save' and contains(@class,'x-btn-inner x-btn-inner-center')]/ancestor::a[@data-xpath='panel_evaluationSequenceAddButtonId_button']");
	By saveButtonEvent = By.xpath(
			"//span[text()='Save' and contains(@class,'x-btn-inner x-btn-inner-center')]/ancestor::a[@data-xpath='panel_evaluationDetailFormAddButtonId_button']");
	By magevtstatusddpdw = By.xpath("//span[contains(text() , 'Manage Event Status')]/ancestor::a");
	By markentryacadtermtxt = By.xpath("//input[@name = 'markEntryAcademicTerm']");
	By coursevardropdwn = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//input[@name = 'courseVariant']/../../td[2]");
	By searchbtnformarksentry = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//span[text() = 'Search']/ancestor::a[not(contains(@class , 'disabled'))]");
	By coursevartxt = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//input[@name = 'courseVariant']");

	By marksentryeditbtn = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//a[@data-qtip='Edit.' and contains(@data-xpath,'btnEditNew')]");
	By marksobtaintxt = By.xpath("//input[@name='totalMarks']");
	By publishmarksbtn = By.xpath("//span[text()='Publish Marks/Grade']/ancestor::a");
	By savebtnmarksentry = By.xpath(
			"//div[@data-xpath='grid_toolbar' and contains(@class,'panel-default-outer-border-rl')]//span[text()='Save']/ancestor::a");
	By advanceconfigbtn = By.xpath("//div[text()='Advance Configuration']/parent::div/div/img");
	By revalyesradiobtn = By.xpath(
			"//label[text() = 'Is Revaluation Possible:']/../../div[contains(@class , 'box')]//label[text() = 'Yes']/preceding-sibling::input");
	By revalCode = By.xpath("//input[@name = 'revaluationCode']");
	By revalName = By.xpath(
			"//body//div[contains(@class,'x-window') and contains(@style,'opacity: 1')]//input[@name = 'revaluationName']");
	By maxRevalCourseApply = By.xpath(
			"//body//div[contains(@class,'x-window') and contains(@style,'opacity: 1')]//input[@name = 'maxRevalToApply']");
	By validTill = By.xpath(
			"//body//div[contains(@class,'x-window') and contains(@style,'opacity: 1')]//input[@name = 'validTill']");
	By vlaidtillArrow = By.xpath("//input[@name= 'validTill']/parent::td/following-sibling::td");
	By searchRevalName = By.xpath("//input[@name='revaluationName']");
	By managerulesButton = By.xpath("//span[text()='Manage Rules']/ancestor::a");
	By rulesListHeader = By.xpath("//span[text() = 'Rules List']/..");
	By revalTypeDropdownArrow = By.xpath(
			"//body//div[contains(@class,'x-window') and contains(@style,'opacity: 1')]//input[@name='revaluationTypeEnum']/../../td[2]");
	By droolsCalArrow = By.xpath(
			" //body//div[contains(@class,'x-window') and contains(@style,'opacity: 1')]//input[@name='drools']/../../td[2]");
	By maxCourseApplyRule = By.xpath(
			"//body//div[contains(@class,'x-window') and contains(@style,'opacity: 1')]//input[@name='maxCourseToApply']");
	By numberOfRevaluter = By.xpath(
			"//body//div[contains(@class,'x-window') and contains(@style,'opacity: 1')]//input[@name='noOfRevaluater']");

	By revalRuleRow = By.xpath("//div[text()='Revaluation Calculation']/ancestor::tr");
	By prgArrow = By.xpath("//input[@name='PROGRAM_NAME']/../../td[2]");
	By batchArrow = By.xpath("//input[@name='BATCH_NAME']/../../td[2]");
	By periodArrow = By.xpath("//input[@name='PERIOD_NAME']/../../td[2]");
	By fromDatePrg = By.xpath(
			"//input[@name= 'fromdate' and contains(@class,'form-required-field')]/parent::td/following-sibling::td");
	By tillDate = By.xpath(
			"//input[@name= 'tilldate' and contains(@class,'form-required-field')]/parent::td/following-sibling::td");
	By approveDateArrow = By.xpath(
			"//input[@name= 'approvalEndDate' and contains(@class,'form-required-field')]/parent::td/following-sibling::td");
	By searchStudentId = By.xpath("//input[@name='studentId']");
	By revTypeArrow = By.xpath("//input[@name='revaluationTypeEnum' and contains(@class,'focus')]");
	By revTypeArrow1 = By.xpath("//table[@data-xpath='revaluationTypeEnum_revaluationTypeEnum_customcombobox']//input[@name='revaluationTypeEnum' and contains(@class,'focus')]");
	
	By applyNowBtn = By.xpath("//span[text()='Apply Now']/ancestor::a");
	By approveButton = By.xpath("//span[text()='Approve/Reject']/ancestor::a");
	By statusOfreval = By.xpath(
			"//body//div[contains(@class,'x-window') and contains(@style,'opacity: 1')]//input[@name='approveReject']/../../td[2]");
	By remarkTextField = By.xpath("//textarea[@name='remark']");
	By courseNameArrowMarksentry = By.xpath("//input[@name='course_name']/../../td[2]");
	By courseVariantArrow = By.xpath("//input[@name='courseVariant']/../../td[2]");
	By assesmentEvent = By.xpath("//input[@name='detailSequence']/../../td[2]");
	By revalTypeArrow = By.xpath("//input[@name='revaluationTypeEnum']/../../td[2]");
	By marksEntry = By.xpath("//input[@name='graceMarks' and contains(@class , 'focus')]");
	By calculateMarksButton = By.xpath("//span[text()='Calculate Marks']/ancestor::a");
	By academicTermArrow = By.xpath("//input[@name = 'academicTerm']/../../td[2]");
	By courseCodeNameArrow = By.xpath("//input[@name = 'courseId']");
	By courseVariantArrowMarks = By.xpath("//input[@name = 'courseVariant']/../../td[2]");
	By assessmentScheme = By.xpath("//input[@name = 'evaluationPlan']/../../td[2]");
	By assSchemeLevelArrow = By.xpath("//input[@name = 'evalPlanLevelId']/../../td[2]");
	By manageRemarkStatus = By.xpath("//span[text() = 'Manage Remark Status']/ancestor::a");
	By remarkDropArrow = By.xpath("//input[@name = 'remarkStatus']/../../td[2]");
	By enterRemarkButton = By.xpath("//span[text() = 'Enter Remark']/ancestor::a");
	By remarksTextField = By.xpath("//textarea[@name = 'evaluationRemark' or @name = 'evaluationGenericRemark']");
	By genericRemarkButton = By.xpath("//span[text() = 'Generic Remark']/ancestor::a");
	By rankTypeDropdownArrow = By.xpath("//input[@name = 'rank']/../../td[2]");
	By studentIDArrow = By.xpath("//input[@name = 'studentId']/../../td[2]");
	By assscmtextarrow = By.xpath("//input[@name='evaluationplan' and contains(@class,'required')]/../../td[2]");
	
	By sisprgnametxt = By.xpath("//input[@name='program']");
	By siscoursenamearrw = By.xpath("//input[@name='courseId']/../../td[2]");
	By sisasmentmethodnamearrw = By.xpath("//input[@name='evaluationMethod']/../../td[2]");
	By sisnewnamediv = By.xpath("//div[contains(@id,'assessmenteventgrid')]//table//td[4] | //div[text() = '"+GlobalVariable.AssessmentEvent+"']/ancestor::tr/td[4]/div");
	By sisweightagediv = By.xpath("//div[contains(@id,'assessmenteventgrid')]//table//td[5]| //div[text() = '"+GlobalVariable.AssessmentEvent+"']/ancestor::tr/td[5]/div");
	By sisminmarksdiv = By.xpath("//div[contains(@id,'assessmenteventgrid')]//table//td[6] | //div[text() = '"+GlobalVariable.AssessmentEvent+"']/ancestor::tr/td[6]/div");
	By sismaxmarksdiv = By.xpath("//div[contains(@id,'assessmenteventgrid')]//table//td[7] | //div[text() = '"+GlobalVariable.AssessmentEvent+"']/ancestor::tr/td[7]/div");
	By sisstatusdiv = By.xpath("//div[contains(@id,'assessmenteventgrid')]//table//td[8] | //div[text() = '"+GlobalVariable.AssessmentEvent+"']/ancestor::tr/td[8]");
	By sispendingstuenrldiv = By.xpath("//div[text() = '"+GlobalVariable.AssessmentEvent+"']/ancestor::tr/td[8]/div[text()='Pending'] |//div[contains(@id,'assessmenteventgrid')]//table//td[8]/div[text()='Pending']");
	By sisenrolstutab = By.xpath("//div[contains(@id,'assessmenteventgrid')]//table//td[9]/div/a[text()='1'] | //div[text() = '"+GlobalVariable.AssessmentEvent+"']/ancestor::tr/td[9]/div/a[text()='1']");
	By sisnewnametxtbox = By.xpath("//input[@name='eventName']");
	By sisweightagetxtbox = By.xpath("//input[@name='maxMarks' and contains(@class,'focus')]");
	By sisminmarkstxtbox = By.xpath("//input[@name='minMarks']");
	By sismaxmarkstxtbox = By.xpath("//input[@name='maxMarks' and contains(@class,'focus')]");
	
	By sisstunametxtbox = By.xpath("//table[contains(@data-xpath,'eventstudentfilter')]//input[@name='studentId']");
	By noofstuvalue = By.xpath("//div[@data-xpath='eventmappedstudentgrid_header']//label[text()='Total No. of Students:']/../following-sibling::td/input");
	By closestuenrtab = By.xpath("//span[text()='Student Exam Enrollment']/ancestor::a/span[@class='x-tab-close-btn']");
	By checkmngevtstucoloum = By.xpath("//div[contains(@id,'assessmenteventgrid')]//table//td[1]/div/div[contains(@class,'checker')]");
	By stunameserch = By.xpath("//input[@name='studentId']");
	By assleveldropdwn = By.xpath("//div[@name='evalLevelName']/parent::td/following-sibling::td[2]");
	By assesstypeselect = By.xpath("//div[contains(@data-xpath,'multiselectcombofield')]/div/span");
	By acdlocdropdown = By.xpath("//div[@name='academyLocation']/parent::td/following-sibling::td[2]");
	By tempalteformatdpdw = By.xpath("//input[@name='templateType']/../../td[2]");
	By pronameforpbs = By.xpath("//input[@name='program']");
	By pbsaddbtn = By.xpath("//div[contains(@data-xpath,'form_programbatchsectiongrid_programbatchsectiongrid')]//div[contains(@data-xpath,'programbatchsectiongrid_toolbar') and contains(@class,'top')]//a[@data-xpath='toolbar_btnAdd_button']");
	By pbssearchbbtn = By.xpath("//div[contains(@id,'programbatchsectionsearch')]/table[4]//span[text()='Search']/ancestor::a");
	
	By secnametxt = By.xpath("//input[@name='sectionCode']");
	By secprtnametxt = By.xpath("//input[@name='alternateName']");
	By homeroomarrow = By.xpath("//input[@name='homeRoom']/../../td[2]");
	By pbsteacher = By.xpath("//input[@name='classTeacher']");
	By selstuforasgsec = By.xpath("//div[contains(@id,'programbatchsectiongrid')]/div[contains(@data-xpath,'programbatchsectiongrid_gridview')]/table//tr/td//a");
	By assignsecbtn = By.xpath("//span[text()='Assign Section']/ancestor::a");
	By stusrcassessmentreport = By.xpath("//span[contains(text(),'Applicant pLFUGr')]/preceding-sibling::img/following-sibling::input");
	By clickpublishbtn = By.xpath("//span[text()='Publish']/ancestor::a");
	
	By prgstuassmntreport = By.xpath("//input[@name='programId']");
	By assmntlevelreport = By.xpath("//div[@name='evalLevelName']/../../td[3]");
	By selectstudentinreport = By.xpath("//span[text()='Student ID / Student Name']/parent::div/../../div[contains(@data-xpath,'headercontainer_gridcolumn')  and contains(@class,'column-header-first')]/div/span/input");
	By exportgradebookbtn = By.xpath("//span[text()='Export Grade Book']/ancestor::a");
	By templatedropdown = By.xpath("//input[@name='chooseHallticketTemplateId']/../../td[2]");
	By previewbtn = By.xpath("//span[text()='Preview Template']/ancestor::a");
	By generatewbtn = By.xpath("//span[text()='Generate']/ancestor::a");
	By generateandpublishwbtn = By.xpath("//span[text()='Generate And Publish']/ancestor::a");
	By cancelbtnclick = By.xpath("//body//div[contains(@class,'x-window') and contains(@style,'opacity: 1')]//span[text()='Cancel']/ancestor::a");
	By currentandpublishdate = By.xpath("//body//div[contains(@class,'x-window') and contains(@style,'opacity: 1')]//input[@name='publishDate']/../../td[2]");
	By pastdatetext = By.xpath("//td[contains(@class,'datepicker-selected')]/a[@class='x-datepicker-date']/../preceding-sibling::td[not(contains(@class,'datepicker-disabled'))]/a");
	By featuredatetext = By.xpath("//td[contains(@class,'datepicker-selected')]/a[@class='x-datepicker-date']/../following-sibling::td[not(contains(@class,'datepicker-disabled'))][1]");
	By currentdatetext = By.xpath("//td[contains(@class,'datepicker-selected')]/a[@class='x-datepicker-date']/..");
	
	
	
	
	public void iClickAddAssessment() throws Exception {

//		CommonActions.iClickElementByLocator(addforexambtn, "I Click Add buttonn for Assessment Master");
//		Thread.sleep(3000);
		AssessmentMethodtName = CommonActions.randomAssessmentNameGeneration();
		BaseClass.writeInFile("Examination Assessment Method Name ", AssessmentMethodtName);
		CommonActions.clickOnElementAndType(assemnametxt, GlobalVariable.AssessmentMethodtName,
				"I Enter the assessment Name in the Text Box");
		new CommonLocatorPage().iClickSaveButton("window");
	}

	public void iClickAssignAssessmenttype(String type) throws Exception {
		CommonActions.iClickElementByLocator(addforexambtn, "I Click Add buttonn for Assessment Master");
		CommonActions.clickOnElementAndType(assignprogramtxtbox, GlobalVariable.GradeOrProgramName,
				"I Select Program name");
		Thread.sleep(2000);
//		https: // www.academiaerp.com/privacy-policy
		CommonActions.iClickEnter(assignprogramtxtbox);
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(assignprobatchtxtbox, "I Select  Program Batch Name");
		CommonActions.iClickElementByLocator(
				By.xpath("//div[text()=' " + GlobalVariable.GradeorProgramBatchName + " ']/.."),
				"I Select Program Bacth Name");
		CommonActions.iClickElementByLocator(assessmenttypearrow, "I Select Assessment type");
		CommonActions.iClickElementByLocator(
				By.xpath("//div[text()=' " + type + " ' and not(contains(@class,'selected'))]"),
				"I Select Program Bacth Name");
		Thread.sleep(2000);
//		CommonActions.clickOnElementAndType(assignassessmenttxtbox, GlobalVariable.AssessmenMethodtName, "I Select Assign AssessmentMethod Name");
		CommonActions.iClickElementByLocator(assignassessmenttxtboxarrow, "I Select  Assign Assessment Method Arrow");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(
				By.xpath("//div[text()='" + GlobalVariable.AssessmentMethodtName
						+ "' and not(contains(@class,'item-over'))]/ancestor::li/div[1]"),
				"I Select Assign AssessmentMethod Name");

		new CommonLocatorPage().iClickSaveButton("window");
		;
	}

	public void iVerifyAssessmentMethod(String type) throws Exception {
		CommonActions.clickOnElementAndType(By.xpath("//input[@name='program']"), GlobalVariable.GradeOrProgramName,
				"I Select Program name");
		CommonActions.iClickEnter(By.xpath("//input[@name='program']"));
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(By.xpath("//input[@name='batch']/../../td[2]"),
				"I Select  Program Batch Name");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(
				By.xpath("//div[text()=' " + GlobalVariable.GradeorProgramBatchName + " ']/.."),
				"I Select Program Bacth Name");
		CommonActions.iClickElementByLocator(By.xpath("//input[@name='evaluationType']/../../td[2]"),
				"I Select Assessment type");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(
				By.xpath("//div[text()=' " + type + " ' and not(contains(@class,'selected'))]"),
				"I Select Program Bacth Name");
		Thread.sleep(3000);
		CommonActions.iClickElementByLocator(By.xpath(
				"//table[@data-xpath='assignsequencesdropdown_fieldcontainer']//span[text()='Search']/ancestor::a"),
				"Selecting the Search button");

	}

	public void iFilltheAssessmentSchemeDetails(String type, String mode, String dynamicSchemeChoice ,String acadterm ) throws Exception {

		GlobalVariable.AssessmentSchemeName = CommonActions.randomAssessmentSchemeNameGeneration();
		BaseClass.writeInFile("Examination Assessment Scheme Name ", AssessmentSchemeName);
		System.out.println("************Assessment scheme Name is : " + AssessmentSchemeName);

		CommonActions.iClickElementByLocator(schemetype, "Selecting scheme type dropdown");
		CommonActions.iClickElementByLocator(By.xpath("//div[text()=' " + type + " ']"),
				"Selecting the Assessment Scheme");
		CommonActions.iClickElementByLocator(coursesrch, "Clicking the Course Name for Search");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(
				By.xpath("//div[contains(text(),'" + GlobalVariable.CoursesubjectName + "')]"),
				"Clicking the Course Name for Search");

//		CommonActions.clickOnElementAndType(coursesrch, GlobalVariable.CoursesubjectName.replace("SubName ", "").trim(),"Enter the Course Name for Search");
//		CommonActions.iClickEnter(coursesrch);
		CommonActions.clickOnElementAndType(assessmentnametxt, GlobalVariable.AssessmentSchemeName,
				"Enter the Assessment Name");
		CommonActions.iClickElementByLocator(roundingmodedrpdwn, "Selecting Mode dropdown");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(By.xpath("//div[text()=' " + mode + " ']"),
				"Selecting Rounding Mode type");
		CommonActions.iClickElementByLocator(acadtermdd, "Clicking Academic term dropdown arrow");
		Thread.sleep(2000);
		try {

			CommonActions.clickOnElementAndType(By.xpath("//input[@name='academicTerm']"), "2023", "Academic term");
			Thread.sleep(2000);
			CommonActions.iClickEnter(By.xpath("//input[@name='academicTerm']"));
		} catch (Exception e) {
			CommonActions.iClickElementByLocator(
					By.xpath("//div[contains(@class,'x-boundlist-above')]//div[text()=' " + acadterm + " ']"),
					"Selecting Academic Term");
		}
		CommonActions.iClickElementByLocator(By.xpath("//table[contains(@data-xpath , 'whetherDynamicScheme')]//label[text() = '"+dynamicSchemeChoice+"']/preceding-sibling::input"), "Dynamic scheme choosen is "+dynamicSchemeChoice+"");
        Thread.sleep(2000);
		new CommonLocatorPage().iClickSaveButton("normal");
	}

	public void iSearchAssessmentSchemeName(String type, String acadterm) throws Exception {
		CommonActions.iClickElementByLocator(By.xpath("//input[@name='evaluationplantype']/../../td[2]"),
				"clicking Assessment Scheme type dropdown");
		CommonActions.iClickElementByLocator(By.xpath("//div[text()=' " + type + " ']"),
				"Selecting Assessment scheme type");
		Thread.sleep(2000);
//		CommonActions.clickOnElementAndType(By.xpath("//input[@name='evaluationplanno']"), GlobalVariable.AssessmenntSchemeName, "Selecting Assessment Scheme Name");
//		Thread.sleep(4000);
//		CommonActions.iClickEnter(assessschtxt);
		CommonActions.iClickElementByLocator(By.xpath("//input[@name='assessmentSchemeAcademicTerm']/../../td[2]"),
				"Clicking Academic term dropdown");
		Thread.sleep(2000);
		try {
			System.out.println("Inside the try block");

			CommonActions.clickOnElementAndType(acadterminschemesrc, acadterm, "Academic term");
			CommonActions.iClickEnter(acadterminschemesrc);

		} catch (Exception e) {
			System.out.println("Inside the catch block");
			CommonActions.iClickElementByLocator(
					By.xpath("//div[contains(@class,'x-boundlist-above')]//div[text()=' 2023 ']"),
					"Selecting Academic Term");
		}

		Thread.sleep(2000);
		// CommonActions.iClickElementByLocator(assessschtxt, "Clicking scheme
		// dropdown");

		try {
			System.out.println("Inside the try block");
			System.out.println(GlobalVariable.AssessmentSchemeName.replace("Assessment Scheme", "").trim());

			CommonActions.clickOnElementAndType(By.cssSelector("input[name='evaluationplanno']"),
					GlobalVariable.AssessmentSchemeName.replace("Assessment Scheme", "").trim(),
					"Selecting Assessment Scheme Name");

			Thread.sleep(2000);
			CommonActions.iClickEnter(By.cssSelector("input[name = 'evaluationplanno']"));
		} catch (Exception e) {
			System.out.println("Inside the Catch block");
			WebElement ele = CommonActions
					.getElement(By.xpath("//div[text()=' " + GlobalVariable.AssessmentSchemeName + " ']"));
			CommonActions.iClickJSE(ele, "Selecting the value using webelement");
		}

	}

	public void iSelectAssessmentScheme() throws Exception {

		try {
			CommonActions.iClickElementByLocator(By.xpath("//div[contains(text(),'"
					+ GlobalVariable.AssessmentSchemeName.replace("Assessment Scheme", "").trim() + "')]/ancestor::tr"),
					"Selecting Assessment Scheme Name in the List");
		} catch (Exception e) {

			System.out.println("Inside the Catch block");

			WebElement ele = CommonActions.getElement(By.xpath("//div[contains(text(),'"
					+ GlobalVariable.AssessmentSchemeName.replace("Assessment Scheme", "").trim()
					+ "')]/ancestor::tr"));

			CommonActions.iClickJSE(ele, "Selecting the value using webelement");
			CommonActions.highlightElementRed(ele, "Selecting ele");
		}

	}

	public void iSelectAcademicTerm(String term) throws Exception {
		CommonActions.iClickElementByLocator(acadtermdd, "Clicking Academic term dropdown arrow");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(
				By.xpath("//div[contains(@class,'x-boundlist-above')]//div[text()=' " + term + " ']"),
				"Selecting Academic Term");

	}

	public void iMappingLocation() throws Exception {
		CommonActions.clickOnElementAndType(By.xpath("//input[@name='academyLocation']"),
				GlobalVariable.academyLocation, "Enter the Academic Location");
//		CommonActions.iClickElementByLocator(By.xpath("//span[text() = 'Save']/ancestor::a[@data-xpath='fieldcontainer_btnLinkAlItemId_button']"),"Clicking Save Button");
	}

	public void iMappingCourse() throws Exception {
		CommonActions.iClickElementByLocator(
				By.xpath("//div[@data-xpath='coursemappingtabview_gridview']//div[text()='"
						+ GlobalVariable.CoursesubjectName + "']/ancestor::tr/td[1]/div/div"),
				"Selecting the Mapping course");

	}

	public void iMappingVariantCourse() throws Exception {
		CommonActions.iClickElementByLocator(
				By.xpath("//div[@data-xpath='eligiblecoursevariantgrid_gridview']//div[text()='"
						+ GlobalVariable.CoursesubjectName + "']/ancestor::tr/td[1]/div/div"),
				"Selecting the Mapping course variant in the list");
		CommonActions.iClickElementByLocator(
				By.xpath("//span[text() = 'Save']/ancestor::a[@data-xpath='toolbar_btnLinkCVItemId_button']"),
				"Clicking Save Button");
	}

	public void iAddAssessmentschemeHierarchy() throws Exception {

		// ########################Adding the Assessment Type###################
		CommonActions.iClickElementByLocator(By.xpath("//span[text()='ACADEMICS']"),
				"Selecting the Assessment hierarchey");
		new CommonLocatorPage().iClickActionButtonInsideNestedTabs("Add");
		CommonActions.iClickElementByLocator(By.xpath("//input[@name='evaluationTypeAcademic']/../../td[2]"),
				"Selecting the assessment type Name arrow");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(By.xpath("//div[text()=' " + GlobalVariable.AssessmentType + " ']"),
				"Selecting the assessment Type Name");
		CommonActions.clickOnElementAndType(weighttxt, "100", "Enter the Weight age Marks");
		CommonActions.clickOnElementAndType(minmarkstxt, "40", "Enter the Min Pass Marks");
		CommonActions.clickOnElementAndType(maxmarkstxt, "100", "Enter the Max Pass Marks");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(whetherradiobtn, "Selecting the whether Remaks  yes radio btn");
		Thread.sleep(3000);
		try {

			CommonActions.iClickElementByLocator(saveButtonExamsAssesmentType, "Save button");

		} catch (Exception e) {

			new CommonLocatorPage().iClickSaveButton("nested");

		}
		Thread.sleep(3000);

		// ######################## Adding the Assessment SubType ###################
//		CommonActions.iClickElementByLocator(mainexpandacdbtn, "Selecting the Academics for Adding Assessment Type");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(By.xpath(
				"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//span[text() = '"
						+ GlobalVariable.AssessmentType + "']/.."),
				"Clicking Assessment Type");
		new CommonLocatorPage().iClickActionButtonInsideNestedTabs("Add");
		try {
			Thread.sleep(3000);
			CommonActions.clickOnElementAndType(By.xpath("//input[@name = 'courseComponentAcademic']"),
					GlobalVariable.AssessmentSubType, "Sub type is Arrow");
			Thread.sleep(3000);

//			CommonActions.iClickEnter(By.xpath("//div[contains(text(),'"+GlobalVariable.AssessmenntSubType+"')]"));
			CommonActions.iClickEnter(By.xpath("//input[@name = 'courseComponentAcademic']"));

		} catch (Exception e) {
			CommonActions.iClickElementByLocator(subtypearrow, "Select Assessment Sub type arrow");
			Thread.sleep(2000);
			CommonActions.iClickElementByLocator(
					By.xpath("//div[text() = ' " + GlobalVariable.AssessmentSubType + " ']"),
					"Select Assessment Sub type");
		}

		CommonActions.clickOnElementAndType(weighttxt, "100", "Enter the Weight age Marks");
		CommonActions.clickOnElementAndType(minmarkstxt, "40", "Enter the Min Pass Marks");
		CommonActions.clickOnElementAndType(maxmarkstxt, "100", "Enter the Max Pass Marks");
		CommonActions.iClickElementByLocator(whetherradiobtn, "Selecting the whether Remaks  yes radio btn");
		Thread.sleep(3000);
		CommonActions.iClickElementByLocator(criticalradiobtnyes, "Selecting the Passing Critical marks Radio btn");
		CommonActions.clickOnElementAndType(failmarkstxt, "0", "Enter the Fail Marks");

		try {

			CommonActions.iClickElementByLocator(saveButtonAsssementSubType, "Save button");

		} catch (Exception e) {
			new CommonLocatorPage().iClickSaveButton("nested");
		}

		// ######################## Adding the Method ###################

		CommonActions.iClickElementByLocator(
				By.xpath("//span[contains(text(),'" + GlobalVariable.AssessmentType
						+ "')]/../img[contains(@class , 'expander')]"),
				"Sub Type Selecting the Assessment Type for Adding the Assessment SubType");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(By.xpath(
				"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//span[text() = '"
						+ GlobalVariable.AssessmentSubType + "']/.."),
				"Clicking Assessment SubType");
		new CommonLocatorPage().iClickActionButtonInsideNestedTabs("Add");
		try {
			CommonActions.clickOnElementAndType(By.xpath("//input[@name = 'sequenceHeaderId']"),
					GlobalVariable.AssessmentMethodtName.replace("Automation Assessment", "").trim(),
					"Entering method name");
			Thread.sleep(2000);
			CommonActions.iClickEnter(By.xpath("//input[@name = 'sequenceHeaderId']"));

		} catch (Exception e) {
			CommonActions.iClickElementByLocator(methodarrow, "Select Assessment Method type arrow");
			Thread.sleep(2000);
			CommonActions.iClickElementByLocator(
					By.xpath("//div[text() = ' " + GlobalVariable.AssessmentMethodtName + " ']"),
					"Select Assessment Sub type");
		}

		CommonActions.clickOnElementAndType(weighttxtsubtype, "100", "Enter the Weight age Marks");

		CommonActions.clickOnElementAndType(minmarkstxt, "40", "Enter the Min Pass Marks");
		CommonActions.clickOnElementAndType(maxmarkstxt, "100", "Enter the Max Pass Marks");
		CommonActions.iClickElementByLocator(criticalradiobtnyes, "Selecting the Passing Critical marks Radio btn");
		CommonActions.iClickElementByLocator(whetherradiobtn, "Selecting the whether Remaks  yes radio btn");
		Thread.sleep(3000);
		CommonActions.clickOnElementAndType(failmarkstxt, "0", "Enter the Fail Marks");
		CommonActions.iClickElementByLocator(reretitionradiobtn, "Clicking Repettion dropdown arrow");
		CommonActions.iClickElementByLocator(eventlevelvalue, "Selecting Repettion Course level ");

		try {

			CommonActions.iClickElementByLocator(saveButtonMehtod, "Save button");

		} catch (Exception e) {
			new CommonLocatorPage().iClickSaveButton("nested");
		}

		// ######################## Adding the Event ###################
		GlobalVariable.AssessmentEvent = CommonActions.randomEventNameGeneration();
		BaseClass.writeInFile("Examination Assessment Event Name ", AssessmentEvent);
		CommonActions.iClickElementByLocator(
				By.xpath("//span[contains(text(),'" + GlobalVariable.AssessmentSubType
						+ "')]/../img[contains(@class , 'expander')]"),
				"Selecting the Assessment SubType for Adding the Assessment Method");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(By.xpath(
				"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//span[text() = '"
						+ GlobalVariable.AssessmentMethodtName + "']/.."),
				"##################### Clicking Assessment Method");

		new CommonLocatorPage().iClickActionButtonInsideNestedTabs("Add");
		Thread.sleep(2000);
		CommonActions.clickOnElementAndType(eventtxt, GlobalVariable.AssessmentEvent,
				"Selecting and Enter the Rule Name");
		CommonActions.clickOnElementAndType(weighttxt, "100", "Enter the Weight age Marks");

		CommonActions.clickOnElementAndType(evnminmarkstxt, "40", "Enter the Min Pass Marks");
		CommonActions.clickOnElementAndType(evnmaxmarkstxt, "100", "Enter the Max Pass Marks");
		CommonActions.iClickElementByLocator(criticalradiobtnyes, "Selecting the Passing Critical marks Radio btn");
		CommonActions.clickOnElementAndType(failmarkstxt, "0", "Enter the Fail Marks");
		CommonActions.iClickElementByLocator(reretitionradiobtn, "Clicking Repettion dropdown arrow");
		CommonActions.iClickElementByLocator(eventlevelvalue, "Selecting Repettion Course level ");
		CommonActions.iClickElementByLocator(advanceconfigbtn, "Clicking Advance configaration btn");
		CommonActions.iClickElementByLocator(revalyesradiobtn, "Clicking Yes radio btn for revaluation");

		try {
			CommonActions.iClickElementByLocator(saveButtonEvent, "Save button");
		} catch (Exception e) {
			new CommonLocatorPage().iClickSaveButton("nested");
		}

		// ######################## Mapping the Student ###################
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(
				By.xpath("//span[contains(text(),'" + GlobalVariable.AssessmentMethodtName
						+ "')]/../img[contains(@class , 'expander')]"),
				"Selecting the Assessment Type for Adding the Assessment SubType");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(
				By.xpath("//span[contains(text(),'" + GlobalVariable.AssessmentEvent
						+ "')]/../img[contains(@class , 'expander')]"),
				"Selecting the Assessment Type for Adding the Assessment SubType");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(elgstudent, "Slecting Elegible Students");
		CommonActions.iClickElementByLocator(
				By.xpath("//div[text()='" + GlobalVariable.StudentId
						+ "']/ancestor::tr[contains(@class,'grid-data-row')]/td[1]/div/div"),
				"Selecting the Student in Eligible Students List.");
		CommonActions.iClickElementByLocator(mapstdbtn, "Clicking Map Students button");
		new CommonLocatorPage().iClickYes();
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(mapstudent, "Slecting Elegible Students");
		Thread.sleep(2000);

	}

	public void iAddRules(String rule) throws Exception {

		GlobalVariable.AssmntSchemeRuleName = CommonActions.AssessmentSchemeRuleNameGeneration();
		BaseClass.writeInFile("Examination Assessment Scheme Rule Name ", AssmntSchemeRuleName);
		GlobalVariable.AssmntTypeRuleName = CommonActions.AssessmentTypeRuleNameGeneration();
		BaseClass.writeInFile("Examination AssmntTypeRuleName Name ", AssmntTypeRuleName);
		GlobalVariable.AssmntSubTypeRuleName = CommonActions.AssessmentSubTypeRuleNameGeneration();
		BaseClass.writeInFile("Examination AssmntSubTypeRuleName Name ", AssmntSubTypeRuleName);
		GlobalVariable.AssmntMethodRuleName = CommonActions.AssessmentMethodRuleNameGeneration();
		BaseClass.writeInFile("Examination AssmntMethodRuleName Name ", AssmntMethodRuleName);

		// ####################### Assessment Rule for Scheme###############

		new CommonLocatorPage().iClickActionButtonInsideNestedTabs("Add");
		CommonActions.clickOnElementAndType(ruletext, GlobalVariable.AssmntSchemeRuleName,
				"Selecting and Enter the Rule Name");
		CommonActions.iClickElementByLocator(ruleapplyarrow, "Clicking the Arrow");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(By.xpath(
				"//div[text()='" + GlobalVariable.AssessmentSchemeName + "' and contains(@class,'boundlist-item')]"),
				"Selectin the Assessment Scheme Name");
		CommonActions.iClickElementByLocator(businessrule, "Clicking the Arrow");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(
				By.xpath("//div[text()=' " + rule + " ' and contains(@class,'x-boundlist-item')]"), studentName);
		new CommonLocatorPage().iClickSaveButton("window");
		Thread.sleep(3000);
		// ####################### Assessment Rule for Type###############

		new CommonLocatorPage().iClickActionButtonInsideNestedTabs("Add");
		CommonActions.clickOnElementAndType(ruletext, GlobalVariable.AssmntTypeRuleName,
				"Selecting and Enter the Rule Name");
		CommonActions.iClickElementByLocator(ruleapplyarrow, "Clicking Applied rule dropdown");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(
				By.xpath("//div[text()='" + GlobalVariable.AssessmentType + "' and contains(@class,'boundlist-item')]"),
				"Selectin the Assessment Scheme Name");
		CommonActions.iClickElementByLocator(businessrule, "Clicking the Arrow");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(
				By.xpath("//div[text()=' " + rule + " ' and contains(@class,'x-boundlist-item')]"), studentName);
		new CommonLocatorPage().iClickSaveButton("window");
		Thread.sleep(3000);

		// ####################### Assessment Rule for SubType###############

		new CommonLocatorPage().iClickActionButtonInsideNestedTabs("Add");
		CommonActions.clickOnElementAndType(ruletext, GlobalVariable.AssmntSubTypeRuleName,
				"Selecting and Enter the Rule Name");
		CommonActions.iClickElementByLocator(ruleapplyarrow, "Clicking Applied rule dropdown");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(By.xpath("//div[contains(text(),'" + GlobalVariable.AssessmentSubType
				+ "') and contains(@class,'boundlist-item')]"), "Selectin the Assessment Scheme Name");
		CommonActions.iClickElementByLocator(businessrule, "Clicking the Arrow");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(
				By.xpath("//div[text()=' " + rule + " ' and contains(@class,'x-boundlist-item')]"),
				"Selecting the Assessment Subtype rule ");
		new CommonLocatorPage().iClickSaveButton("window");
		Thread.sleep(3000);

		// ####################### Assessment Rule for Assessment Method###############

		new CommonLocatorPage().iClickActionButtonInsideNestedTabs("Add");
		CommonActions.clickOnElementAndType(ruletext, GlobalVariable.AssmntMethodRuleName,
				"Selecting and Enter the Rule Name");
		CommonActions.iClickElementByLocator(ruleapplyarrow, "Clicking Applied rule dropdown");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(By.xpath("//div[contains(text(),'" + GlobalVariable.AssessmentMethodtName
				+ "') and contains(@class,'boundlist-item')]"), "Selectin the Assessment Scheme Name");
		CommonActions.iClickElementByLocator(businessrule, "Clicking the Arrow");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(
				By.xpath("//div[text()=' " + rule + " ' and contains(@class,'x-boundlist-item')]"),
				"Selecting the Assessment Method rule ");
		new CommonLocatorPage().iClickSaveButton("window");
		Thread.sleep(3000);

	}

	public void iSearchAssmntSchemeandAcademicterm(String assemtscheme, String academicterm) throws Exception {
		CommonActions.iClickElementByLocator(schmetypedpdn, "Clicking the Assessment Scheme Type dropdown");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(By.xpath("//div[text()=' " + assemtscheme + " ']"),
				"Clicking the Scheme type dropdown");
		CommonActions.iClickElementByLocator(acadmtermdpdn, "Clicking the Academin Term Type dropdown");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(By.xpath("//div[text()=' " + academicterm + " ']"),
				"Clicking the Scheme type dropdown");
		CommonActions.iClickElementByLocator(assemtschedpdn, "Clicking the Assessment Scheme dropdown");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(By.xpath("//div[text()=' " + GlobalVariable.AssessmentSchemeName + " ']"),
				"Clicking the Assessment Scheme Name dropdown");

	}

	public void iManageEventStatus(String status) throws Exception {

		CommonActions.iClickElementByLocator(
				By.xpath("//div[text()='" + GlobalVariable.AssessmentSchemeName + "']/ancestor::tr/td[1]"),
				"Selectinng the Assessment scheme in the Status List");
		CommonActions.iClickElementByLocator(magevtstatusddpdw, "magevtstatusddpdw");
		CommonActions.clickDownKey(magevtstatusddpdw);
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(By.xpath("//span[text()= '" + status + "']/ancestor::a"),
				"Selectinng the event open for marks entry");
		new CommonLocatorPage().iClickYes();
		Thread.sleep(2000);
	}

	public void iOpenforMarksEntry(String asmtscheme, String acadterm) throws Exception {
		String subname = GlobalVariable.CoursesubjectName.replace("SubName ", "").trim();
		System.out.println("####################### Replace Sub name is : " + subname);
		CommonActions.clickOnElementAndType(markentryacadtermtxt, acadterm, "Selectin the Academin Term");
		Thread.sleep(3000);
		CommonActions.iClickEnter(markentryacadtermtxt);
		Thread.sleep(2000);
		try {
			System.out.println("####################### Enter to Try Block ############### ");
			CommonActions.clickOnElementAndType(coursevartxt, subname,
					"Selecting the Course Subject Name in the Dropdown");
			Thread.sleep(3000);
			CommonActions.iClickEnter(coursevartxt);
		} catch (Exception e) {
			System.out.println("####################### Enter to Catch Block ############### ");
			CommonActions.iClickElementByLocator(coursevardropdwn, "Selecting the Course variant dropdown");
			Thread.sleep(3000);
			CommonActions.iClickElementByLocator(
					By.xpath("//div[contains(text() , '" + subname
							+ "' )] and @class='x-boundlist-item combo-odd x-boundlist-selected'"),
					"Selecting the Course Subject Name in the Dropdown");
			Thread.sleep(2000);
		}

		CommonActions.iClickElementByLocator(searchbtnformarksentry, "Clicking Search Button for Marks Entry");
		Thread.sleep(3000);

	}

	public void iSelectStudentandEnterMarks() throws Exception {
		try {
		CommonActions.iClickElementByLocator(By.xpath(
				"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//div[text()='"
						+ GlobalVariable.StudentId + "']/ancestor::tr/td[1]/div/div"),
				"Selecting Student for marks entry");
		}catch (Exception e) {
			CommonActions.iClickElementByLocator(By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//div[text()='"
					+ GlobalVariable.studentName+ "']/ancestor::tr/td[1]/div/div"),
			"Selecting Student for marks entry");
		}
		Thread.sleep(2000);
		
		CommonActions.iClickElementByLocator(marksentryeditbtn, "Clicking Edit button after selecting the Student");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(By.xpath(
				"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[text()='"
						+ GlobalVariable.StudentId + "']/ancestor::tr[contains(@role,'row')]/td[9]/div"),
				"Selecting Student for marks entry");
		Thread.sleep(2000);
		CommonActions.clickOnElementAndType(marksobtaintxt, "50", "Enter the Total marks obtained");
//		CommonActions.iClickElementByLocator(By.xpath("//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[text()='"+GlobalVariable.StudentId+"']/ancestor::tr[contains(@role,'row')]/td[10]/div"), "Selecting Student for marks entry");
		Thread.sleep(3000);
		CommonActions.iClickElementByLocator(savebtnmarksentry, "Clicking Save button after enter the total marks");
		Thread.sleep(3000);
		new CommonLocatorPage().iClickYes();
		Thread.sleep(2000);
//		CommonActions.iClickElementByLocator(By.xpath(
//				"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//div[text()='"
//						+ GlobalVariable.StudentId + "']/ancestor::tr/td[1]/div/div"),
//				"Selecting Student for marks entry");
		Thread.sleep(2000);
//		CommonActions.iClickElementByLocator(publishmarksbtn, "Clicking the Publishing the marks btn");

	}

	public void iAddRevalSetupwithRevaluationFee(String feeoption) throws Exception {
		new CommonLocatorPage().iClickActionButton("Add");
		CommonActions.clickOnElementAndType(revalCode, CommonActions.revalCodeGeneration(), "Reval code is entered");
		GlobalVariable.reevalutionName = CommonActions.revalNameGeneration();
		BaseClass.writeInFile("Examination reevalutionName Name ", reevalutionName);
		CommonActions.clickOnElementAndType(revalName, reevalutionName, "Reval event name");
		CommonActions.clickOnElementAndType(maxRevalCourseApply, "2", "Max reval course apply");
//		CommonActions.clickOnElementAndType(validTill, "26/05/2025", "Valid till");
		CommonActions.iClickElementByLocator(vlaidtillArrow, "valid till arrow");
		new CommonLocatorPage().iClickButtonOfChoice("Next Month");
		new CommonLocatorPage().iClickButtonOfChoice("Day");
		CommonActions.iClickElementByLocator(By.xpath(
				"//label[text() = 'Whether Revaluation Fee Applicable:']/../../div[contains(@class , 'box')]//label[text() = '"
						+ feeoption + "']/preceding-sibling::input"),
				"Radio button for the fees applicable");

		new CommonLocatorPage().iClickSaveButton("window");
	}

	public void iSearchCreatedRevaluation() throws Exception {

		CommonActions.clickOnElementAndType(searchRevalName, GlobalVariable.reevalutionName, "Searching reval name");
		Thread.sleep(4000);
		CommonActions.iClickEnter(searchRevalName);

	}

	public void iClickingManageRulesButton(String mngrlues) throws Exception {
		new CommonLocatorPage().iClickButtonOfChoice("Search");
		Thread.sleep(6000);
		try {
			System.out.println("*****************" + GlobalVariable.reevalutionName);
			WebElement row = CommonActions.getElement(
					By.xpath("//div[contains(text(),'" + GlobalVariable.reevalutionName + "')]/ancestor::tr"));
			CommonActions.iClickJSE(row, "searched row clicked");
			CommonActions.iClickElementByLocator(managerulesButton, "Manage rules button clicked");
			CommonActions.isDisplayed(rulesListHeader, "rules list header");
		} catch (Exception e) {
			System.out.println("Inside catch");
			CommonActions.iClickElementByLocator(
					By.xpath("//div[contains(text(),'" + GlobalVariable.reevalutionName + "')]/ancestor::tr"),
					"row is clicked");
			CommonActions.iClickElementByLocator(managerulesButton, "Manage rules button clicked");
			CommonActions.isDisplayed(rulesListHeader, "rules list header");
		}

	}

	public void iAddRevaluationTypeandCalculation(String revtype, String calculation) throws Exception {
		new CommonLocatorPage().iClickActionButton("Add");
		CommonActions.iClickElementByLocator(revalTypeDropdownArrow, "Reval type dropdown arrow clicked");
		Thread.sleep(3000);
		CommonActions.iClickElementByLocator(By.xpath("//div[text()=' " + revtype + " ']"), "reval type");
		CommonActions.iClickElementByLocator(droolsCalArrow, "droll calendar arrow");
		Thread.sleep(3000);
		CommonActions.iClickElementByLocator(By.xpath("//div[text()=' " + calculation + " ']"), "calculation type");
		CommonActions.clickOnElementAndType(maxCourseApplyRule, "2", "Max course for reval in rule");
		CommonActions.clickOnElementAndType(numberOfRevaluter, "2", "Number of revaluter");
		new CommonLocatorPage().iClickSaveButton("window");
	}

	public void iSelectCreatedRevalSetupandClickMapProg(String mapprogdetail) throws InterruptedException {
		CommonActions.iClickElementByLocator(revalRuleRow, "Reval rule row");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(By.xpath("//span[text()='" + mapprogdetail + "']/ancestor::a"),
				"Map prg detail button");

	}

	public void iFillProgDetailwithStartDateandEndDate(String startdate, String enddate) throws InterruptedException {
		CommonActions.iClickElementByLocator(prgArrow, "Program arrow");
		Thread.sleep(3000);
		CommonActions.iClickElementByLocator(
				By.xpath("//div[contains(text() , '" + GlobalVariable.GradeOrProgramName + "')]"), "Program name");
		CommonActions.iClickElementByLocator(batchArrow, "Batch arrow");
		Thread.sleep(3000);
		System.out.println("****************************** "+GlobalVariable.GradeOrProgramName);
		try {
			WebElement element = CommonActions.getElement(By.xpath(
					"//div[contains(text(),'"+GlobalVariable.GradeOrProgramName+"') and contains(@class,'item')]/../parent::div[ not(contains(@style,'display: none'))]/div/div"));
			
			CommonActions.iClickJSE(element, "Prg batch");
		}
		catch (Exception e) {
			CommonActions.iClickElementByLocator(By.xpath(
					"//div[contains(text(),'"+GlobalVariable.GradeOrProgramName+"') and contains(@class,'item')]/../parent::div[ not(contains(@style,'display: none'))]/div/div"),
					"Prg batch");
		}
		CommonActions.iClickElementByLocator(periodArrow, "period arrow");
		Thread.sleep(3000);
		CommonActions.iClickElementByLocator(By.xpath(
				"//div[contains(text(),'" + GlobalVariable.prgOrGradePeriodName + "') and contains(@class,'item')]"),
				"Period");
		CommonActions.iClickElementByLocator(fromDatePrg, "From date arrow");
		Thread.sleep(2000);
		new CommonLocatorPage().iClickButtonOfChoice("Today");
		CommonActions.iClickElementByLocator(tillDate, "Till date");
		Thread.sleep(2000);
		new CommonLocatorPage().iClickButtonOfChoice("Next Month");
		new CommonLocatorPage().iClickButtonOfChoice("Day");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(approveDateArrow, "Approval date");
		new CommonLocatorPage().iClickButtonOfChoice("Next Month");
		new CommonLocatorPage().iClickButtonOfChoice("Day");
		Thread.sleep(2000);
		new CommonLocatorPage().iClickSaveButton("normal");

	}

	public void iSearchAppliedStudentIdforRevaluation() throws Exception {
		CommonActions.clickOnElementAndType(searchStudentId, GlobalVariable.studentName, "Student ID");
		Thread.sleep(3000);
		CommonActions.iClickEnter(searchStudentId);
		new CommonLocatorPage().iClickButtonOfChoice("Search");
	}

	public void iEnterRevTypeforforStudentforRevaluation(String revaltype) throws InterruptedException {
		try {
			CommonActions.iClickElementByLocator(By.xpath("//div[text() = '"+ GlobalVariable.studentName +"']/ancestor::tbody/tr/td/div[contains(text() , 'Click')]/../.."), revaltype);
            //WebElement ele = CommonActions.getElement(By.xpath("//div[text() = 'Applicant FyPmyt']/ancestor::tbody/tr/td/div[contains(text() , 'Click')]"));
            CommonActions.iClickElementByLocator(By.xpath("//div[text() = '"+ GlobalVariable.studentName +"']/ancestor::tbody/tr/td/div[contains(text() , 'Click')]"), revaltype);
		}
		catch (Exception e) {
			CommonActions.iClickElementByLocator(By.xpath("//div[text() = '"+ GlobalVariable.studentName +"']/ancestor::tbody/tr/td/div[contains(text() , 'Click')]/../.."), revaltype);
			CommonActions.iClickElementByLocator(By.xpath(
					"//div[text()='" + GlobalVariable.StudentId + "']/ancestor::tbody/tr/td/div[contains(text() , 'Click')"),
					"Click to enter text field");
		}
		
		Thread.sleep(3000);
		try {
			WebElement element = CommonActions.getElement(revTypeArrow1);
			CommonActions.iClickJSE(element, "Reval dropdown type arrow");
		}
		catch (Exception e) {
			CommonActions.iClickElementByLocator(revTypeArrow, "Reval dropdown type arrow");
			
		}
		Thread.sleep(3000);
		CommonActions.iClickElementByLocator(By.xpath("//div[text()=' " + revaltype + " ']"), "Reval type");
		Thread.sleep(2000);
//		CommonActions.iClickElementByLocator(
//				By.xpath("//div[text()='" + GlobalVariable.studentName + "']/ancestor::tr/td[1]/div"),
//				"Student applied for reval row");
		CommonActions.iClickElementByLocator(
				By.xpath("//div[text()='" + GlobalVariable.studentName + "']/ancestor::tr/td[1]/div/div"),
				"Student applied for reval row");
		CommonActions.iClickElementByLocator(applyNowBtn, "Apply now button");

	}

	public void iClickApproveReqButton() throws InterruptedException {
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(
				By.xpath("//div[text()='" + GlobalVariable.studentName + "']/ancestor::tr/td[1]/div/div"),
				"Student applied for reval row");
		CommonActions.iClickElementByLocator(approveButton, "Approve button");
	}

	public void iSelectStatusforRevalRequest(String status) throws Exception {
		CommonActions.iImplicitlywait(30, "wait");
		CommonActions.iClickElementByLocator(statusOfreval, "Reval status dropdown arrow");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(By.xpath("//div[text()=' " + status + " ']"), "Approved status option");
		CommonActions.clickOnElementAndType(remarkTextField, "Automation Harsh remark", "Remark");
		new CommonLocatorPage().iClickSaveButton("window");
	}

	public void iSelectCourseCourseVariantAssmentEvnandAnnonymusAssessment(String options) throws InterruptedException {
		String coursename = GlobalVariable.CoursesubjectName.replace("SubName ","");
		CommonActions.iClickElementByLocator(courseNameArrowMarksentry, "course dropdown");
		Thread.sleep(4000);
		
		CommonActions.iClickElementByLocator(
				By.xpath("//div[@data-xpath='customcombobox_boundlist']//div[contains(text(),'"
						+ coursename + "') and not(contains(@class,'item-over'))]"),
				"course option");

		CommonActions.iClickElementByLocator(courseVariantArrow, "course variant arrow");
		Thread.sleep(3000);
		CommonActions.iClickElementByLocator(By.xpath("//div[contains(text(),'" + coursename+ "') and not(contains(@class,'selected'))]"), "Course variant");

		CommonActions.iClickElementByLocator(By.xpath(
				"//label[text() = 'Anonymous Assessment Event:']/ancestor::td[contains(@class , 'checkboxgroup')]//input[contains(@id , '"
						+ options + "')]"),
				"Radio button option");

		CommonActions.iClickElementByLocator(assesmentEvent, "Assesment even arrow");
		Thread.sleep(3000);
		CommonActions.iClickElementByLocator(
				By.xpath("//div[contains(text(),'" + GlobalVariable.AssessmentEvent + "')]"), options);

		CommonActions.iClickElementByLocator(revalTypeArrow, "RevalType arrow");
		Thread.sleep(3000);
		CommonActions.iClickElementByLocator(By.xpath("//div[text()=' Revaluation ']"), "Revalution option is selcted");

		new CommonLocatorPage().iClickButtonOfChoice("Search");

	}

	public void iEnterMarksintotheValues() throws Exception {

		CommonActions.iClickElementByLocator(
				By.xpath("//div[text()='" + GlobalVariable.GradeOrProgramName + "']/ancestor::tr/td[9]/div"),
				"Valuer 1 text field");
		Thread.sleep(2000);
		CommonActions.clickOnElementAndType(marksEntry, "70", "Valuer 1 marks");
	
		CommonActions.iClickElementByLocator(
				By.xpath("//div[text()='" + GlobalVariable.GradeOrProgramName + "']/ancestor::tr/td[1]/div/div"),
				"Valuer 2 text field");
		Thread.sleep(2000);

		CommonActions.iClickElementByLocator(
				By.xpath("//div[text()='" + GlobalVariable.GradeOrProgramName + "']/ancestor::tr/td[10]/div"),
				"Valuer 2 text field");
		Thread.sleep(2000);
		CommonActions.clickOnElementAndType(marksEntry, "75", "Valuer 2 marks");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(
				By.xpath("//div[text()='" + GlobalVariable.GradeOrProgramName + "']/ancestor::tr/td[4]/div"),
				"Valuer 2 text field");
		Thread.sleep(2000);
	}

	public void iClicktheCalculateMarksBtn() throws InterruptedException {
		CommonActions.iClickElementByLocator(calculateMarksButton, "Calculate marks button");
		new CommonLocatorPage().iClickYes();

	}

	public void iVlaidatetheRevaluationStatus() throws Exception {

		CommonActions.isDisplayed(By.xpath("//div[text()='" + GradeOrProgramName + "']/ancestor::tr/td[11]/div"),
				"Changed status");

	}

	public void iEnterAcdemicTermCourseandCourseVariant(String asmscmlevel) throws Exception {
		CommonActions.iClickElementByLocator(academicTermArrow, "academic arrow");
		Thread.sleep(3000);
		CommonActions.iClickElementByLocator(
				By.xpath("//div[text()=' " + GlobalVariable.academicTerm + " ' or text() = '"
						+ GlobalVariable.academicTerm + "' and contains(@class , 'item')]"),
				"Academic term" + academicTerm);
		String name = GlobalVariable.CoursesubjectName;
		String replacename = name.replace("SubName ", "");
		System.out.println("****************** Replace  Course Name Is : "+replacename);
		
		try {
		CommonActions.clickOnElementAndType(courseCodeNameArrow,replacename ,"course code name search");
		Thread.sleep(3000);
		CommonActions.iClickEnter(courseCodeNameArrow);		
		}
		catch (Exception e) {
			CommonActions.clickOnElementAndType(courseCodeNameArrow, replacename,"course code name search");
			Thread.sleep(3000);
			CommonActions.iClickElementByLocator(By.xpath(
					"//div[contains(text() , '" + GlobalVariable.CoursesubjectName + "') and contains(@class , 'item')]"),
					"Course name");			
		}
		CommonActions.iClickElementByLocator(courseVariantArrowMarks, "course variant");
		Thread.sleep(3000);
		CommonActions
				.iClickElementByLocator(
						By.xpath("//div[contains(text() , '" + GlobalVariable.CoursesubjectName + "/"
								+ GlobalVariable.academicTerm + "') and contains(@class , 'item')]"),
						"Course variant name");
		CommonActions.iClickElementByLocator(assessmentScheme, "assesment scheme dropdown");
		Thread.sleep(3000);
		CommonActions.iClickElementByLocator(By.xpath("//div[contains(text() , '" + GlobalVariable.AssessmentSchemeName
				+ "') and contains(@class , 'item')]"), "Course name");
		CommonActions.iClickElementByLocator(assSchemeLevelArrow, "assesment level scheme drodown");
		Thread.sleep(3000);
		CommonActions.iClickElementByLocator(
				By.xpath("//div[text() = '" + asmscmlevel + "' and contains(@class , 'item')]"),
				"Course name");
	}

	public void iClickonManageRemaksStatusButton(String status) throws InterruptedException {
		CommonActions.iClickElementByLocator(manageRemarkStatus, "Manage remark status button");
		CommonActions.iClickElementByLocator(remarkDropArrow, "Remark dropdown arrow");
		Thread.sleep(3000);
		CommonActions.iClickElementByLocator(
				By.xpath("//div[contains(text() , '" + status + "') and contains(@class , 'item')]"),
				status + " is selected");

	}

	public void iSearchResultisVisible() throws Exception {
		CommonActions.isDisplayed(By.xpath("//div[text() = '" + GlobalVariable.studentName + "']/ancestor::tr"),
				"Student remark row is visible");

	}

	public void iSelectStudentinList() {
		WebElement row = CommonActions
				.getElement(By.xpath("//div[text() = '" + GlobalVariable.studentName + "']/ancestor::tr/td[1]/div/div"));
		CommonActions.iClickJSE(row, "Student row is clicked from search results");
	}

	public void iClickEnterRemarksButton() throws InterruptedException {
        CommonActions.iClickElementByLocator(enterRemarkButton, "Remarks button");
	}

	public void iEntertheRemarks() throws Exception {
		CommonActions.clickOnElementAndType(remarksTextField, "Good Harsh keep it up", "Remarks field");

	}

	public void iClickGenericRemarksButton() throws InterruptedException {
		CommonActions.iClickElementByLocator(genericRemarkButton, "Generic reamrk button");
	}

	public void iSelectUsertypeProgramBatchAsmscmlevelandLevelname(String usertype, String asmscmlevel,
			String asmscmlevelname) {
		//Student level is out of scope for now

	}

	public void iValidateHeader(String header) throws Exception {
		CommonActions.isDisplayed(By.xpath("//span[text() = '"+header+"' and contains(@class,  'header')]"), header+" Header is validating");
	}

	public void iSelectRanktypeandEnterStudentId(String ranktype) throws InterruptedException {
		CommonActions.iClickElementByLocator(rankTypeDropdownArrow, "Rank dropdown arrow");
        Thread.sleep(3000);
        CommonActions.iClickElementByLocator(
				By.xpath("//div[contains(text() , '" + ranktype + "') and contains(@class , 'item')]"),
				"Course name");     
        
        CommonActions.iClickElementByLocator(studentIDArrow, "student dropdown arrow");
        Thread.sleep(3000);
        CommonActions.iClickElementByLocator(
				By.xpath("//div[contains(text() , '" + GlobalVariable.studentName + "') and contains(@class , 'item')]"),
				"Course name");     
	}

	public void iStudentResultShouldbeVisibleinList() throws Exception {
		CommonActions.isDisplayed(By.xpath("//div[text() = '" + GlobalVariable.studentName + "']/ancestor::tr"),
				"Student is visible in list");
	}

	public void iSelectStudentResultformTheList() {
		CommonActions.iImplicitlywait(30, "waiting...");
		WebElement row = CommonActions.getElement(By.xpath(
				"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//div[(text() = '" + GlobalVariable.StudentId + "' or text() = '" + GlobalVariable.AssessmentType
						+ "' or text() = '" + GlobalVariable.AssessmentSubType + "' or text() = '"
						+ GlobalVariable.AssessmentMethodtName + "') and contains(@class , 'grid') ]/ancestor::tr"));
		try {
			System.out.println("Enter try block double click ############################");
	        new Actions(driver).doubleClick(row).build().perform();		
		}
		catch (Exception e) {
			System.out.println("Enter try block double click ############################");
			CommonActions.iClickJSE(row, "student row is selected");
			
		}
		
	}

	public void iCheckResultVisibleCorrctly(String result) throws Exception {
		CommonActions.iImplicitlywait(30, "waiting...");
		CommonActions.isDisplayed(By.xpath(
				"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//font[text()='"
						+ result + "']"),
				result);
	}

	public void SelectAssessmentScheme() throws Exception {
		CommonActions.iClickElementByLocator(assscmtextarrow, "Selecting the Assessment scheme ");
		Thread.sleep(3000);
		CommonActions.iClickElementByLocator(By.xpath("//div[contains(text(),'"+GlobalVariable.AssessmentSchemeName+"')]"), studentName);
		

	}

	public void iSelectStudentforMarksDeletion() throws Exception {
		CommonActions.iClickElementByLocator(By.xpath("//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[text()='"+GlobalVariable.GradeOrProgramName+"']/ancestor::tr/td[1]/div/div"), "Selecting the Student using Program name");
		Thread.sleep(2000);
		
	}

	public void iClickYesButton() throws Exception {
		new CommonLocatorPage().iClickYes();
		
	}
	public void iAddAssessmentschemeHierarchyForSIS() throws Exception {

		// ########################Adding the Assessment Type###################
		CommonActions.iClickElementByLocator(By.xpath("//span[text()='ACADEMICS']"),
				"Selecting the Assessment hierarchey");
		new CommonLocatorPage().iClickActionButtonInsideNestedTabs("Add");
		CommonActions.iClickElementByLocator(By.xpath("//input[@name='evaluationTypeAcademic']/../../td[2]"),
				"Selecting the assessment type Name arrow");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(By.xpath("//div[text()=' " + GlobalVariable.AssessmentType + " ']"),
				"Selecting the assessment Type Name");
		CommonActions.clickOnElementAndType(weighttxt, "100", "Enter the Weight age Marks");
		CommonActions.clickOnElementAndType(minmarkstxt, "40", "Enter the Min Pass Marks");
		CommonActions.clickOnElementAndType(maxmarkstxt, "100", "Enter the Max Pass Marks");
		Thread.sleep(2000);
//		CommonActions.iClickElementByLocator(whetherradiobtn, "Selecting the whether Remaks  yes radio btn");
		Thread.sleep(3000);
		try {

			CommonActions.iClickElementByLocator(saveButtonExamsAssesmentType, "Save button");

		} catch (Exception e) {

			new CommonLocatorPage().iClickSaveButton("nested");

		}
		Thread.sleep(3000);

		// ######################## Adding the Assessment SubType ###################
//		CommonActions.iClickElementByLocator(mainexpandacdbtn, "Selecting the Academics for Adding Assessment Type");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(By.xpath(
				"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//span[text() = '"
						+ GlobalVariable.AssessmentType + "']/.."),
				"Clicking Assessment Type");
		new CommonLocatorPage().iClickActionButtonInsideNestedTabs("Add");
		try {
			Thread.sleep(3000);
			CommonActions.clickOnElementAndType(By.xpath("//input[@name = 'courseComponentAcademic']"),
					GlobalVariable.AssessmentSubType, "Sub type is Arrow");
			Thread.sleep(3000);

//			CommonActions.iClickEnter(By.xpath("//div[contains(text(),'"+GlobalVariable.AssessmenntSubType+"')]"));
			CommonActions.iClickEnter(By.xpath("//input[@name = 'courseComponentAcademic']"));

		} catch (Exception e) {
			CommonActions.iClickElementByLocator(subtypearrow, "Select Assessment Sub type arrow");
			Thread.sleep(2000);
			CommonActions.iClickElementByLocator(
					By.xpath("//div[text() = ' " + GlobalVariable.AssessmentSubType + " ']"),
					"Select Assessment Sub type");
		}

		CommonActions.clickOnElementAndType(weighttxt, "100", "Enter the Weight age Marks");
		CommonActions.clickOnElementAndType(minmarkstxt, "40", "Enter the Min Pass Marks");
		CommonActions.clickOnElementAndType(maxmarkstxt, "100", "Enter the Max Pass Marks");
//		CommonActions.iClickElementByLocator(whetherradiobtn, "Selecting the whether Remaks  yes radio btn");
		Thread.sleep(3000);
//		CommonActions.iClickElementByLocator(criticalradiobtnyes, "Selecting the Passing Critical marks Radio btn");
//		CommonActions.clickOnElementAndType(failmarkstxt, "0", "Enter the Fail Marks");

		try {

			CommonActions.iClickElementByLocator(saveButtonAsssementSubType, "Save button");

		} catch (Exception e) {
			new CommonLocatorPage().iClickSaveButton("nested");
		}

		// ######################## Adding the Method ###################

		CommonActions.iClickElementByLocator(
				By.xpath("//span[contains(text(),'" + GlobalVariable.AssessmentType
						+ "')]/../img[contains(@class , 'expander')]"),
				"Sub Type Selecting the Assessment Type for Adding the Assessment SubType");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(By.xpath(
				"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//span[text() = '"
						+ GlobalVariable.AssessmentSubType + "']/.."),
				"Clicking Assessment SubType");
		new CommonLocatorPage().iClickActionButtonInsideNestedTabs("Add");
		try {
			CommonActions.clickOnElementAndType(By.xpath("//input[@name = 'sequenceHeaderId']"),
					GlobalVariable.AssessmentMethodtName.replace("Automation Assessment", "").trim(),
					"Entering method name");
			Thread.sleep(2000);
			CommonActions.iClickEnter(By.xpath("//input[@name = 'sequenceHeaderId']"));

		} catch (Exception e) {
			CommonActions.iClickElementByLocator(methodarrow, "Select Assessment Method type arrow");
			Thread.sleep(2000);
			CommonActions.iClickElementByLocator(
					By.xpath("//div[text() = ' " + GlobalVariable.AssessmentMethodtName + " ']"),
					"Select Assessment Sub type");
		}

		CommonActions.clickOnElementAndType(weighttxtsubtype, "100", "Enter the Weight age Marks");

		CommonActions.clickOnElementAndType(minmarkstxt, "40", "Enter the Min Pass Marks");
		CommonActions.clickOnElementAndType(maxmarkstxt, "100", "Enter the Max Pass Marks");
//		CommonActions.iClickElementByLocator(criticalradiobtnyes, "Selecting the Passing Critical marks Radio btn");
//		CommonActions.iClickElementByLocator(whetherradiobtn, "Selecting the whether Remaks  yes radio btn");
		Thread.sleep(3000);
//		CommonActions.clickOnElementAndType(failmarkstxt, "0", "Enter the Fail Marks");
//		CommonActions.iClickElementByLocator(reretitionradiobtn, "Clicking Repettion dropdown arrow");
//		CommonActions.iClickElementByLocator(eventlevelvalue, "Selecting Repettion Course level ");

		try {

			CommonActions.iClickElementByLocator(saveButtonMehtod, "Save button");

		} catch (Exception e) {
			new CommonLocatorPage().iClickSaveButton("nested");
		}

		// ######################## Adding the Event ###################
		GlobalVariable.AssessmentEvent = CommonActions.randomEventNameGeneration();
		BaseClass.writeInFile("Examination AssessmentEvent Nmae ", AssessmentEvent);

		CommonActions.iClickElementByLocator(
				By.xpath("//span[contains(text(),'" + GlobalVariable.AssessmentSubType
						+ "')]/../img[contains(@class , 'expander')]"),
				"Selecting the Assessment SubType for Adding the Assessment Method");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(By.xpath(
				"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//span[text() = '"
						+ GlobalVariable.AssessmentMethodtName + "']/.."),
				"##################### Clicking Assessment Method");

		new CommonLocatorPage().iClickActionButtonInsideNestedTabs("Add");
		Thread.sleep(2000);
		CommonActions.clickOnElementAndType(eventtxt, GlobalVariable.AssessmentEvent,
				"Selecting and Enter the Rule Name");
		CommonActions.clickOnElementAndType(weighttxt, "100", "Enter the Weight age Marks");

		CommonActions.clickOnElementAndType(evnminmarkstxt, "40", "Enter the Min Pass Marks");
		CommonActions.clickOnElementAndType(evnmaxmarkstxt, "100", "Enter the Max Pass Marks");
//		CommonActions.iClickElementByLocator(criticalradiobtnyes, "Selecting the Passing Critical marks Radio btn");
//		CommonActions.clickOnElementAndType(failmarkstxt, "0", "Enter the Fail Marks");
//		CommonActions.iClickElementByLocator(reretitionradiobtn, "Clicking Repettion dropdown arrow");
//		CommonActions.iClickElementByLocator(eventlevelvalue, "Selecting Repettion Course level ");
//		CommonActions.iClickElementByLocator(advanceconfigbtn, "Clicking Advance configaration btn");
//		CommonActions.iClickElementByLocator(revalyesradiobtn, "Clicking Yes radio btn for revaluation");

		try {
			CommonActions.iClickElementByLocator(saveButtonEvent, "Save button");
		} catch (Exception e) {
			new CommonLocatorPage().iClickSaveButton("nested");
		}

		// ######################## Mapping the Student ###################
		Thread.sleep(2000);
//		CommonActions.iClickElementByLocator(
//				By.xpath("//span[contains(text(),'" + GlobalVariable.AssessmentMethodtName
//						+ "')]/../img[contains(@class , 'expander')]"),
//				"Selecting the Assessment Type for Adding the Assessment SubType");
//		Thread.sleep(2000);
//		CommonActions.iClickElementByLocator(
//				By.xpath("//span[contains(text(),'" + GlobalVariable.AssessmentEvent
//						+ "')]/../img[contains(@class , 'expander')]"),
//				"Selecting the Assessment Type for Adding the Assessment SubType");
//		Thread.sleep(2000);
//		CommonActions.iClickElementByLocator(elgstudent, "Slecting Elegible Students");
//		CommonActions.iClickElementByLocator(
//				By.xpath("//div[text()='" + GlobalVariable.StudentId
//						+ "']/ancestor::tr[contains(@class,'grid-data-row')]/td[1]/div/div"),
//				"Selecting the Student in Eligible Students List.");
//		CommonActions.iClickElementByLocator(mapstdbtn, "Clicking Map Students button");
//		new CommonLocatorPage().iClickYes();
//		Thread.sleep(2000);
//		CommonActions.iClickElementByLocator(mapstudent, "Slecting Elegible Students");
//		Thread.sleep(2000);

	}

	public void iSearchProgramforManageAssessmentEvents() throws Exception {
		CommonActions.clickOnElementAndType(sisprgnametxt, GlobalVariable.GradeOrProgramName,"Clicking the Program name Search");
		Thread.sleep(3000);
		CommonActions.iClickEnter(sisprgnametxt);
		CommonActions.iClickElementByLocator(siscoursenamearrw, "Clicking Course dropdown arrow in Manage Assessment Events");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(By.xpath("//div[contains(@data-xpath,'list')]//div[contains(text(),'"+GlobalVariable.CoursesubjectName+"')]"), "Selecting Course name into the dropdown list ");
		CommonActions.iClickElementByLocator(sisasmentmethodnamearrw, "Clicking Assessment Method dropdown arrow in Manage Assessment Events");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(By.xpath("//div[contains(@data-xpath,'list')]//div[contains(text(),'"+GlobalVariable.AssessmentMethodtName+"')]"), "Selecting Course name into the dropdown list ");
				
	}

	public void iEnterNameWeightageMinandMaxMarks(String name, String weightage, String minmarks, String maxmarks) throws Exception {
		try {
			WebElement ele = CommonActions.getElement(sisnewnamediv);
			CommonActions.iClickJSE(ele, "Selecting the new name row in the list");
			
		}catch (Exception e) {
			CommonActions.iClickElementByLocator(sisnewnamediv, "Selecting the new name row in the list");
		}
		
		Thread.sleep(2000);
		CommonActions.clickOnElementAndType(sisnewnametxtbox, name, "Entering the New Name");
		CommonActions.iClickElementByLocator(sisweightagediv, "Selecting the weightage row in the list");
		Thread.sleep(2000);
		CommonActions.clickOnElementAndType(sisweightagetxtbox, weightage, "Entering the weightage");
		CommonActions.iClickElementByLocator(sisminmarksdiv, "Selecting the min marks row in the list");
		Thread.sleep(2000);
		CommonActions.clickOnElementAndType(sisminmarkstxtbox, minmarks, "Entering the min marks");
		CommonActions.iClickElementByLocator(sismaxmarksdiv, "Selecting the max marks row in the list");
		Thread.sleep(2000);
		CommonActions.clickOnElementAndType(sismaxmarkstxtbox, maxmarks, "Entering the max marks");
		CommonActions.iClickElementByLocator(sisstatusdiv, "Selecting the max marks row in the list");
		Thread.sleep(2000);
		new CommonLocatorPage().iClickSaveButton("normal");
		Thread.sleep(2000);
		new CommonLocatorPage().iClickYes();
	}

	public void iClickPendingEnrolledStudentLink() throws Exception {
		CommonActions.iClickElementByLocator(sispendingstuenrldiv, "Selecting the max marks row in the list");
		Thread.sleep(3000);
		CommonActions.iClickElementByLocator(sisenrolstutab, "Selecting the max marks row in the list");
		Thread.sleep(3000);
		String value =CommonActions.iGetTextByLoctor(noofstuvalue, studentName);
		String stuvalue = value.trim();
		System.out.println("Total No of Mapped Students : "+stuvalue);
		if(stuvalue.equalsIgnoreCase("1")) {
			System.out.println("***************      No of Mapped Student are Matched");
			Thread.sleep(3000);
			CommonActions.iClickElementByLocator(closestuenrtab, "Closing the Student Enrollment Tab");
		}else {
			System.out.println("***************      No of Mapped Student are NOt Matched");
			Thread.sleep(3000);
			CommonActions.iClickElementByLocator(closestuenrtab, "Closing the Student Enrollment Tab");
		}		
	}

	public void iSelectingTheStudenntinExamEnrollment() throws Exception {
		CommonActions.clickOnElementAndType(sisstunametxtbox, GlobalVariable.studentName, "Entering the New Name");
		Thread.sleep(3000);
		CommonActions.iClickEnter(sisstunametxtbox);
	}

	public void iClickManageEventsforOpenMarkEntry(String status) throws Exception {
		Thread.sleep(3000);
		CommonActions.iClickElementByLocator(checkmngevtstucoloum, "Selecting the max marks row in the list");
		Thread.sleep(3000);
		CommonActions.iClickElementByLocator(magevtstatusddpdw, "magevtstatusddpdw");
		CommonActions.clickDownKey(magevtstatusddpdw);
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(By.xpath("//span[text()= '" + status + "']/ancestor::a"),
				"Selectinng the event open for marks entry");
		new CommonLocatorPage().iClickYes();
		Thread.sleep(2000);
		
	}

	public void iOpenStudentAssessmentReport() throws Exception{
		try {
			CommonActions.iClickElementByLocator(By.xpath("//input[@name='studentId']/../../td[2]"), "Clicking the Student name dropdown ");
			Thread.sleep(3000);
			CommonActions.iClickElementByLocator(By.xpath("//div[contains(text(),'"+GlobalVariable.studentName+"')]"), "Selecting the Student name ");
		}catch (Exception e) {
			CommonActions.clickOnElementAndType(stunameserch,GlobalVariable.studentName ,"Enter the Student name into the search box");
			Thread.sleep(3000);
			CommonActions.iClickEnter(stunameserch);
			
			CommonActions.iClickElementByLocator(assleveldropdwn, "Selecting Assessment Level name dropdown");
			Thread.sleep(3000);
			CommonActions.iClickElementByLocator(assesstypeselect, "Selecting the Assessment Type");
			
		}
		
	}

	public void iSelectAcdLocandTemplateFormatType(String temformattype) throws Exception{
		CommonActions.iClickElementByLocator(acdlocdropdown, "Clicking the Academy Location Arrow");
		Thread.sleep(3000);
		CommonActions.iClickElementByLocator(By.xpath("//div[contains(text(),'"+GlobalVariable.academyLocation+"')]/preceding-sibling::div"), "Selecting the Academy Location on dropdown");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(tempalteformatdpdw, "Clicking template type format dropdown");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(By.xpath("//div[text()=' "+temformattype+" ']"), "Selecting the Tempalte format Value");
	}

	public void iAddPbsSectionforSIS(String homeroom, String teachername) throws Exception {
		CommonActions.clickOnElementAndType(pronameforpbs, GlobalVariable.GradeOrProgramName, "I Add Program Name");
		Thread.sleep(3000);
		CommonActions.iClickEnter(pronameforpbs);
		CommonActions.iClickElementByLocator(pbssearchbbtn, "I Select Search Button");
		new CommonLocatorPage().iSelectRow("1", "nested");
		Thread.sleep(3000);
		
		CommonActions.iClickElementByLocator(pbsaddbtn, "I Click Add Button");
		
		GlobalVariable.PBSSectionNameSIS = CommonActions.randomSectionNameGeneration();
		BaseClass.writeInFile("Examination Assessment Method Name ", PBSSectionNameSIS);
		
		System.out.println("####################################"+GlobalVariable.PBSSectionNameSIS);
		CommonActions.clickOnElementAndType(secnametxt, GlobalVariable.PBSSectionNameSIS, "I Enter SIS Section Nmae");
		Thread.sleep(2000);
		CommonActions.clickOnElementAndType(secprtnametxt, GlobalVariable.PBSSectionNameSIS, "I Print SIS Section Nmae");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(homeroomarrow, "I Select Home room Arrow");
		CommonActions.iClickElementByLocator(By.xpath("//div[text()=' "+homeroom+" ']"), "I Select HoomRoom Value is "+homeroom);
		Thread.sleep(2000);
		CommonActions.clickOnElementAndType(pbsteacher, teachername, "I Enter SIS Teacher Nmae");
		Thread.sleep(2000);
		CommonActions.iClickEnter(pbsteacher);
		new CommonLocatorPage().iClickSaveButton("window");
	}

	public void iSelectUnallocatedStuandAssignSec() throws Exception {
		CommonActions.iClickElementByLocator(selstuforasgsec, "Selectinng the Student for assign section");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(By.xpath("//div[text()='"+GlobalVariable.studentName+"']/ancestor::tr/td[1]/div/div"), "Selectinng the Student for assign section");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(assignsecbtn, "Clicking the Assign Section Button");
		Thread.sleep(3000);
	}

	public void iSelectStudentForAssmntReport() throws Exception  {
		CommonActions.iClickElementByLocator(stusrcassessmentreport, "Selecting the student for assessment report");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(clickpublishbtn, "Clicking the Publish the report");
	}
	
	
	
	

	public void PrgandAssmntLevelDropdown() throws Exception {
		CommonActions.clickOnElementAndType(prgstuassmntreport ,GlobalVariable.GradeOrProgramName, "Selecting Program name search");
		Thread.sleep(2000);
		CommonActions.iClickEnter(prgstuassmntreport);
		CommonActions.iClickElementByLocator(assmntlevelreport, "Selecting Assessment report level dropdown");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(By.xpath("//div[text()='"+GlobalVariable.AssessmentType+"']/../div[1]"), "Selecting assessment value");
		CommonActions.iClickElementByLocator(assmntlevelreport, "Selecting Assessment report level dropdown");
	}

	public void iSelecttheStudent() throws Exception {
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(selectstudentinreport, "Select the Student in the searched list");
	}

	public void iClickExportGreadeBookButton() throws Exception {
		CommonActions.iClickElementByLocator(exportgradebookbtn, "Clicking the Export Grade Book Button");		
	}

	public void iClickCancelbtnandPrevieworGenerateReport(String generatebtn, String templatename) throws Exception  {		
		CommonActions.iClickElementByLocator(previewbtn, "Clicking the Preview btn");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(By.xpath("//span[text()='"+generatebtn+"']/ancestor::a") , "Generate the report btn");
		
	}

	public void iClickCancelbutton(String cancelbtn) throws Exception {
		CommonActions.iClickElementByLocator(cancelbtnclick, "Clicking the Preview btn");		
	}

	public void iSelectMappedTemplate(String templatename) throws Exception {
		CommonActions.iClickElementByLocator(templatedropdown, "Selecting template dropdown");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(By.xpath("//div[text()=' "+templatename+" ']"), "Select the template name");
		
	}

	public void iSelectCurrentDateAsPublishdate() throws Exception {
		CommonActions.iClickElementByLocator(currentandpublishdate , "Selecting the Published Date");
		Thread.sleep(2000);
		try {
			CommonActions.iClickElementByLocator(currentdatetext , "Selecting the Published Date");
			Thread.sleep(2000);
		} catch (Exception e) {
			CommonActions.iClickElementByLocator(currentandpublishdate , "Selecting the Published Date");
		}				
	}
	
	public void iSelectPastDateAsPublishdate() throws Exception {
		CommonActions.iClickElementByLocator(currentandpublishdate , "Selecting the Published Date");
		Thread.sleep(2000);
		try {
			CommonActions.iClickElementByLocator(pastdatetext , "Selecting the Published Date");
			Thread.sleep(1000);
//			CommonActions.iClickElementByLocator(currentandpublishdate , "Selecting the Published Date");
		} catch (Exception e) {
			CommonActions.iClickElementByLocator(currentandpublishdate , "Selecting the Published Date");	
		}			
	}
	
	public void iSelectFeatureDateAsPublishdate() throws Exception {
		CommonActions.iClickElementByLocator(currentandpublishdate , "Selecting the Published Date");
		Thread.sleep(2000);
		try {
			CommonActions.iClickElementByLocator(featuredatetext , "Selecting the Published Date");
			Thread.sleep(1000);	
//			CommonActions.iClickElementByLocator(currentandpublishdate , "Selecting the Published Date");
		} catch (Exception e) {
			CommonActions.iClickElementByLocator(currentandpublishdate , "Selecting the Published Date");	
		}		
	}
	
	public void iSearchAssessmentSchemeByName(String type, String acadterm , String name) throws Exception {
		CommonActions.iClickElementByLocator(By.xpath("//input[@name='evaluationplantype']/../../td[2]"),
				"clicking Assessment Scheme type dropdown");
		CommonActions.iClickElementByLocator(By.xpath("//div[text()=' " + type + " ']"),
				"Selecting Assessment scheme type");
		Thread.sleep(2000);
//		CommonActions.clickOnElementAndType(By.xpath("//input[@name='evaluationplanno']"), GlobalVariable.AssessmenntSchemeName, "Selecting Assessment Scheme Name");
//		Thread.sleep(4000);
//		CommonActions.iClickEnter(assessschtxt);
		CommonActions.iClickElementByLocator(By.xpath("//input[@name='assessmentSchemeAcademicTerm']/../../td[2]"),
				"Clicking Academic term dropdown");
		Thread.sleep(2000);
		try {
			System.out.println("Inside the try block");

			CommonActions.clickOnElementAndType(acadterminschemesrc, acadterm, "Academic term");
			CommonActions.iClickEnter(acadterminschemesrc);

		} catch (Exception e) {
			System.out.println("Inside the catch block");
			CommonActions.iClickElementByLocator(
					By.xpath("//div[contains(@class,'x-boundlist-above')]//div[text()=' 2023 ']"),
					"Selecting Academic Term");
		}

		Thread.sleep(2000);
		// CommonActions.iClickElementByLocator(assessschtxt, "Clicking scheme
		// dropdown");

		try {
			System.out.println("Inside the try block");
			System.out.println(name.replace("Assessment Scheme", "").trim());

			CommonActions.clickOnElementAndType(By.cssSelector("input[name='evaluationplanno']"),
					name.replace("Assessment Scheme", "").trim(),
					"Selecting Assessment Scheme Name");

			Thread.sleep(2000);
			CommonActions.iClickEnter(By.cssSelector("input[name = 'evaluationplanno']"));
		} catch (Exception e) {
			System.out.println("Inside the Catch block");
			WebElement ele = CommonActions
					.getElement(By.xpath("//div[text()=' " + name + " ']"));
			CommonActions.iClickJSE(ele, "Selecting the value using webelement");
		}

	}
	
	public void iSelectAssessmentSchemeName(String name) throws Exception {

		try {
			CommonActions.iClickElementByLocator(By.xpath("//div[contains(text(),'"
					+name.replace("Assessment Scheme", "").trim() + "')]/ancestor::tr"),
					"Selecting Assessment Scheme Name in the List");
		} catch (Exception e) {

			System.out.println("Inside the Catch block");

			WebElement ele = CommonActions.getElement(By.xpath("//div[contains(text(),'"
					+ name.replace("Assessment Scheme", "").trim()
					+ "')]/ancestor::tr"));

			CommonActions.iClickJSE(ele, "Selecting the value using webelement");
			CommonActions.highlightElementRed(ele, "Selecting ele");
		}

	}


	

}
