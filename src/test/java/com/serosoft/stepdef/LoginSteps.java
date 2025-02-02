package com.serosoft.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import com.appium.commonactionmethods.CommonActions;
import com.harsh.globalvariable.GlobalVariable;
import com.serosoft.pages.*;

public class LoginSteps extends GlobalVariable {

	@When("I enter username as {string}")
	public void iEnterUsernameAs(String username) throws InterruptedException {
	 LoginPage.enterUsername(username);
	}

	@And("I enter password as {string}")
	public void iEnterPasswordAs(String password) throws InterruptedException {

		LoginPage.enterPassword(password);

	}

	@And("I login")
	public void iLogin() throws InterruptedException {
		LoginPage.clickOnLoginButton();
	}

	@Then("I am on homepage")
	public void validateHomePage() throws Exception {
		
		new HomePage().iValidatePortal();
				
	}
	
}
