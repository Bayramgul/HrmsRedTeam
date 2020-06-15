package com.hrms.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddMembership extends CommonMethods {

	@Given("user should be able to login with valid admin credentials")
	public void user_should_be_able_to_login_with_valid_admin_credentials() {
		login.login();
	}

	@Given("user clicks on {string} tab on Dashboard page")
	public void user_clicks_on_tab(String header) {
		WaitandClick(dashboard.Admin);
		sleep(2);
	}

	@Given("user clicks on Qualifications and {string} dropdown and clicks on addBtn")
	public void user_clicks_on_dropdown(String membership) {
		WaitandClick(systemUsers.qualifications);
		WaitandClick(systemUsers.Memberships);
		WaitandClick(systemUsers.btnAdd);
		sleep(2);
	}

	@When("user enters different Membership and clicks on saveBtn and Validate membership in dataTable")
	public void user_chooses_different(io.cucumber.datatable.DataTable dataTable) {
		List<String> memberships = dataTable.asList();
		for (String m : memberships) {
			sleep(3);
			sendText(systemUsers.membership, m);
			WaitandClick(systemUsers.btnSave);
			//systemUsers.clickResult(m, systemUsers.resulTable);
			sleep(2);
			WaitandClick(systemUsers.btnAdd);

		}
	}

	@Then("validates {string} is added successfully")
	public void validates_is_added_successfully(String actual) {
	
		for(WebElement element:systemUsers.resulTable) {
			String expected=element.getText();
			if(expected.equals(actual)) {
			Assert.assertEquals("Membership names doesnt match", expected, actual);
			}
		}
	}
}
