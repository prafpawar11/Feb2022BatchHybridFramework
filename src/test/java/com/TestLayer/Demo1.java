package com.TestLayer;

import com.BaseLayer.BaseClass;
import com.PageLayer.HomePage;
import com.PageLayer.LoginPage;
import com.PageLayer.PIMPage;

public class Demo1 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		BaseClass.initialization();
		LoginPage loginPage =new LoginPage();
		
		loginPage.typeUsername("Admin");
		loginPage.typePassword("admin123");
		loginPage.clickOnLoginButton();
		
		HomePage homepage=new HomePage();
		homepage.checkLogoDisplayedStatus();
		homepage.clickOnPIMLink();
		PIMPage pim =new PIMPage();
		pim.clickOnAddButton();
		pim.AddEmployeeDetails("abc", "abc", "abc");
		pim.clickOnSaveButton();
		pim.clickOnEditButton();
		Thread.sleep(4000);
		pim.selectNationalityDropDownValue("Indian");
		Thread.sleep(2000);
		pim.selectDropDownValue("Single");
		Thread.sleep(2000);
		pim.clickOnsaveButtonInPersonalDetails();
	
	}

}
