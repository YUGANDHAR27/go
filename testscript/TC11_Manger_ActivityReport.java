package com.automationAspireportal.testscript;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.automationAspireportal.helper.ManagerLogin;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC11_Manger_ActivityReport extends TestsuiteBase
{
	ReadTimesheetModuleLocators read=new ReadTimesheetModuleLocators();

     @Test
	public void manageractivityReports()  {
		ManagerLogin login = new ManagerLogin(driver);
		login.managerlogin();
		driver.findElement(By.xpath(read.clickonreports())).click();
		driver.findElement(By.xpath("//a[@id='activityreport-tab']")).click();
	}

}
