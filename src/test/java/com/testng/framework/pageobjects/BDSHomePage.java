package com.testng.framework.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import junit.framework.Assert;

public class BDSHomePage {
	WebDriver driver;

	public BDSHomePage(WebDriver driver) {
		this.driver = driver;
	}

	private By byFeatureLink=By.xpath("//a[@href='/#services']");
	private By byNbiDataCollectionLink = By
			.xpath("//a[contains(@href,'/WebSite/FeatureDetails?urlRoute=nbidatacollection')]");
	private By byNbiDataCollectionIMG = By.xpath("//img[contains(@src,'Features/bridge.svg')]");
	private By byNbiDataCollectionHeading = By.xpath("//h6[text()='NBI Data Collection' and @class='section-heading']");
	private By byNbiDataCollectionText = By
			.xpath("//p[text()='Collect NBI data with an easy to use application (Web, Phone, & Tablet).']");

	private By byFieldInspectionAndVoiceCaptionsLink = By.xpath("//a[@href='/WebSite/FeatureDetails?urlRoute=fieldinspectionphotosvoicecaptions']");
	private By byFieldInspectionAndVoiceCaptionsIMG = By.xpath("//img[contains(@src,'Features/camera.svg')]");
	private By byFieldInspectionAndVoiceCaptionsHeading = By
			.xpath("//h6[text()='Field Inspection Photos & Voice Captions' and @class='section-heading']");

	private By byFieldInspectionAndVoiceCaptionsText = By.xpath(
			"//p[text()='Take field inspection photos & record voice captions directly from the application (Phone, Tablet & Drone).']");
	private By byGenerateInspecitionReportsHeading=By
			.xpath("//h6[text()='Generate Inspection Reports' and @class='section-heading']");
	private By byGenerateInspecitionReportsLink =By.xpath("//a[@href='/WebSite/FeatureDetails?urlRoute=generateinspectionreports']");
	private By byGenerateInspecitionReportsIMG=By.xpath("//img[contains(@src,'Features/report.svg')]");
	private By byGenerateInspecitionReportsText=By.xpath(
			"//p[text()='Easily turn collected data and media into creative reports to simplify decision-making.']");
	private By byArchiveBridgeDataHeading=By
			.xpath("//h6[text()='Archive Bridge Data' and @class='section-heading']");
	private By byArchiveBridgeDataLink=By.xpath("//a[@href='/WebSite/FeatureDetails?urlRoute=archivebridgedata']");
	private By byArchiveBridgeDataIMG=By.xpath("//img[contains(@src,'Features/archive.svg')]");
	private By byArchiveBridgeDataText=By.xpath(
			"//p[text()='Store and access historical bridge data.']");

	private By byCopyrightInformation = By.xpath("//span[contains(text(),'Copyright') and contains(text(),'2019 IMC, Inc. and Pn Automation, Inc.')]");
	
	public void verifyNBIDataCollectionSection() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(byNbiDataCollectionHeading));
		Assert.assertTrue("check if NBI Data Collection heading is displayed",
				driver.findElement(byNbiDataCollectionHeading).isDisplayed());
		Assert.assertTrue("check if NBI Data Collection link is displayed",
				driver.findElement(byNbiDataCollectionLink).isDisplayed());
		Assert.assertTrue("check if NBI Data Collection image is displayed",
				driver.findElement(byNbiDataCollectionIMG).isDisplayed());
		Assert.assertTrue("check if NBI Data Collection text is displayed",
				driver.findElement(byNbiDataCollectionText).isDisplayed());
	}

	public void verifyFieldInspecitionAndVoiceCaptionSection() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(byFieldInspectionAndVoiceCaptionsHeading));
		Assert.assertTrue("check if Field Inspection and Voice Captions heading is displayed",
				driver.findElement(byFieldInspectionAndVoiceCaptionsHeading).isDisplayed());
		Assert.assertTrue("check if Field Inspection and Voice Captions link is displayed",
				driver.findElement(byFieldInspectionAndVoiceCaptionsLink).isDisplayed());
		Assert.assertTrue("check if Field Inspection and Voice Captions image is displayed",
				driver.findElement(byFieldInspectionAndVoiceCaptionsIMG).isDisplayed());
		Assert.assertTrue("check if Field Inspection and Voice Captions text is displayed",
				driver.findElement(byFieldInspectionAndVoiceCaptionsText).isDisplayed());
	}

	public void verifyGenerateInspecitionReports() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(byGenerateInspecitionReportsHeading));
		Assert.assertTrue("check if Generate Inspection Reports heading is displayed",
				driver.findElement(byGenerateInspecitionReportsHeading).isDisplayed());
		Assert.assertTrue("check if Generate Inspection Reports link is displayed",
				driver.findElement(byGenerateInspecitionReportsLink).isDisplayed());
		Assert.assertTrue("check if Generate Inspection Reports image is displayed",
				driver.findElement(byGenerateInspecitionReportsIMG).isDisplayed());
		Assert.assertTrue("check if Generate Inspection Reports text is displayed",
				driver.findElement(byGenerateInspecitionReportsText).isDisplayed());
	}

	public void verifyArchiveBridgeData() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(byArchiveBridgeDataHeading));
		Assert.assertTrue("check if Archive Bridge Data heading is displayed",
				driver.findElement(byArchiveBridgeDataHeading).isDisplayed());
		Assert.assertTrue("check if Archive Bridge Data link is displayed",
				driver.findElement(byArchiveBridgeDataLink).isDisplayed());
		Assert.assertTrue("check if Archive Bridge Data image is displayed",
				driver.findElement(byArchiveBridgeDataIMG).isDisplayed());
		Assert.assertTrue("check if Archive Bridge Data text is displayed",
				driver.findElement(byArchiveBridgeDataText).isDisplayed());
	}
	
	public void verifyCopyrightInformation() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(byCopyrightInformation));
		Assert.assertTrue("check if Copyright information is displayed",
				driver.findElement(byCopyrightInformation).isDisplayed());		
	}

	public void verifyFeatureLink() {
		driver.findElement(byFeatureLink).click();
		Assert.assertTrue("check if NBI Data Collection heading is displayed",
				driver.findElement(byNbiDataCollectionHeading).isDisplayed());
		Assert.assertTrue("check if Field Inspection and Voice Captions heading is displayed",
				driver.findElement(byFieldInspectionAndVoiceCaptionsHeading).isDisplayed());
		Assert.assertTrue("check if Generate Inspection Reports heading is displayed",
				driver.findElement(byGenerateInspecitionReportsHeading).isDisplayed());
		Assert.assertTrue("check if Archive Bridge Data heading is displayed",
				driver.findElement(byArchiveBridgeDataHeading).isDisplayed());
	}
}
