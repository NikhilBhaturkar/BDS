package com.testng.framework.testscripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.testng.framework.pageobjects.BDSHomePage;
import com.testng.framework.utils.DriverInitializer;

public class HomePageTest extends DriverInitializer {
	private BDSHomePage bdsHomePage;

	@BeforeMethod
	public void startBrowser() {
		bdsHomePage = new BDSHomePage(getDriver());
	}

	@Test(alwaysRun =false)
	public void checkBDSFeaturesSection() {
		bdsHomePage.verifyNBIDataCollectionSection();
		bdsHomePage.verifyFieldInspecitionAndVoiceCaptionSection();
		bdsHomePage.verifyGenerateInspecitionReports();
		bdsHomePage.verifyArchiveBridgeData();
	}
	
	@Test
	public void checkFeatureLink() {
		bdsHomePage.verifyFeatureLink();
	}
	
	@Test(alwaysRun =false)
	public void checkCopyrightInformationSection() {
		bdsHomePage.verifyCopyrightInformation();
	}
	
	@AfterMethod
	public void endBrowser() {
		DriverInitializer.quitBrowser();
	}

}
