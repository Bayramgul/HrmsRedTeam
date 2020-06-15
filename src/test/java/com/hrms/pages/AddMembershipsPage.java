package com.hrms.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.utils.CommonMethods;

public class AddMembershipsPage extends CommonMethods {
	@FindBy(id = "membership_membership")
	public WebElement membershipDD;
	@FindBy(id = "membership_subscriptionPaidBy")
	public WebElement subscriptionPaidDD;

	@FindBy(id = "membership_subscriptionAmount")
	public WebElement scriptionAmount;

	@FindBy(id = "membership_currency")
	public WebElement currencyDD;

	@FindBy(id = "membership_subscriptionCommenceDate")
	public WebElement subscCommenceDateTextbox;

	@FindBy(id = "membership_subscriptionRenewalDate")
	public WebElement RenewalDateTextbox;

	@FindBy(id = "btnAdd")
	public WebElement btnAdd;

	@FindBy(id = "btnSaveMembership")
	public WebElement btnSaveMembership;

	@FindBy(xpath = "//table[@class='table hover']/tbody/tr[1]/td[2]")
	public List<WebElement> membershipTable;

	public AddMembershipsPage() {
		PageFactory.initElements(driver, this);
	}
	
}
