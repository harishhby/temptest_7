package com.ta3s.testcases;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ta3s.baseclass.BaseUtil;
import com.ta3s.helper.pagehelper.Ta3sLoginPage;

import atu.testng.reports.ATUReports;
import atu.testng.reports.logging.LogAs;
import atu.testng.selenium.reports.CaptureScreen;
import atu.testng.selenium.reports.CaptureScreen.ScreenshotOf;
import atu.testrecorder.exceptions.ATUTestRecorderException;



public class LoginTest extends BaseUtil {

	{
		try {
			getAtuReportPath();
			} catch (IOException e) {

			e.printStackTrace();
		}
	}

	Ta3sLoginPage signin = new Ta3sLoginPage();

	@BeforeClass
	public void setUp() throws IOException, InterruptedException { 

		ATUReports.setWebDriver(driver);
		ATUReports.indexPageDescription = "Ta3s index";
		ATUReports.currentRunDescription= "Ta3s Desc";
		setAuthorInfoForReports();

		Assert.assertTrue(BaseUtil.loadController());
		System.out.println("Test landing page appears.");	
	}

	@Test	
	public void SignIn()throws IOException, InterruptedException, Exception, ATUTestRecorderException {	
		System.out.println("Inside Script 1");
		signin.clickOnLoginLink();
		System.out.println("Clicked On Login Link");
		ATUReports.add("email address for sigin",LogAs.PASSED, new CaptureScreen(
				ScreenshotOf.BROWSER_PAGE));
	}	

	
	@AfterTest
	public void quitBrowser()
	{
		driver.close();
	}
}
