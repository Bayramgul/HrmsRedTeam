package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.utils.CommonMethods;

public class ViewSystemUsersPage extends CommonMethods {
	@FindBy(id = "menu_admin_Qualifications")
	public WebElement qualifications;

	@FindBy(id = "//a[@class='arrow']")
	public List<WebElement> adminSubtitles;

	@FindBy(xpath = "//a[contains(@id,'menu_admin')]")
	public List<WebElement> subtitleMenu;// 31 links under subtitles

	@FindBy(id = "btnAdd")
	public WebElement btnAdd;
	
	@FindBy(id = "skill_name")
	public WebElement skill_name;
	
	
	@FindBy(xpath="//input[@id='membership_name']")
	public WebElement membership;
	
	@FindBy(xpath = "//input[@id='membership_membershipId']")
	public WebElement hidden_membership_name;
	
	@FindBy(linkText = "Memberships")
	public WebElement Memberships;
	

	@FindBy(id = "btnSave")
	public WebElement btnSave;

	@FindBy(xpath = "//table[@id='resultTable']/tbody/tr/td[2]/a")
	public List<WebElement> resulTable;
	
	public ViewSystemUsersPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickLink(List<WebElement> list, String text) {
		for (WebElement element : list) {
			if (element.getText().equals(text)) {
				WaitandClick(element);
			}
		}
	}

	public void selectHeaderlink(List<WebElement> list,String header) {
		//List<WebElement> headerLinks=driver.findElements(By.xpath("//div[@class='menu']/ul/li"));
		for(WebElement link:list) {
			String text=link.getText();
			if(text.equals(header)) {
				WaitandClick(link);
				
			} 
		}}
	public void clickResult(String result, List<WebElement> resulTable) {
		boolean flag = false;
		while (!flag) {
			for (int i = 1; i < resulTable.size(); i++) {
				String cellData = resulTable.get(i - 1).getText();
				if (cellData.equals(result)) {
					System.out.println("Membership Successfully added");
					flag = true;
					break;
				}
			}
		}
	}
}
