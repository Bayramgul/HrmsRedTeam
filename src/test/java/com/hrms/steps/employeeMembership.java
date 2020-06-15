package com.hrms.steps;



import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class employeeMembership extends CommonMethods{

	@Given("clicks on PIM and searches employee by {string} and clicks from dataTable")
	public void clicks_on_PIM_and_searches_employee_by_and_clicks_from_dataTable(String empId) {
		WaitandClick(dashboard.pim);
		sendText(empList.EmpID, empId);
		sleep(2);
		jsClick(empList.searchBtn);
		jsClick(empList.empIDValidation);
		
	}

	@Given("user clicks on Memberships link and clicks on AddMembershipDetailBtn")
	public void user_clicks_on_Memberships_link_and_clicks_on_AddMembershipDetailBtn() {
		WaitandClick(pdetails.linkMemberships);
		WaitandClick(pdetails.btnAddMembershipDetail);
	}

	@When("user fills {string},{string},{string},{string},{string},{string}")
	public void user_fills(String membershp, String paidBy, String subAmount, String currency , String fromDate, String toDate) {
	selectDDValue(membership.membershipDD, membershp);
	selectDDValue(membership.subscriptionPaidDD, paidBy);
	sendText(membership.scriptionAmount, subAmount);
	selectDDValue(membership.currencyDD, currency);
	sendText(membership.subscCommenceDateTextbox, fromDate);
	sendText(membership.RenewalDateTextbox,toDate );
	}

	@When("click on Save button")
	public void click_on_Save_button() {
		WaitandClick(membership.btnSaveMembership);
	}

	@Then("I verify the Assigned Membership {string}")
	public void i_verify_the_Assigned_Membership(String actual) {
		for(WebElement element:membership.membershipTable) {
			String expected=element.getText();
			if(expected.equals(actual)) {
			Assert.assertEquals("Membership names doesnt match", expected, actual);
			}
		}
	}

}
