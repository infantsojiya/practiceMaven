package org.TestNG;

import org.Pojo.PojoClass;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.utilities.practise;

public class Suiteclass extends practise {
	@BeforeClass(alwaysRun=true)
	private void LaunchBrowser() {
		launchChrome();
		windowmax();
	}
	
	@Test(groups="Sojiya")
	private void tc11() throws InterruptedException {
		loadUrl("https://www.facebook.com");
		PojoClass p = new PojoClass();
		passValue(p.getTxtuser(), "Jeena");
		passvalue(p.getTxtPass(), "jeena@123");
		Thread.sleep(2000);
		click(driver.findElement(By.xpath("//button[@name='login']")));
		
		
	}
	@Test(groups="Senthu")
	private void tc22() throws InterruptedException {
		loadUrl("https://www.facebook.com");
		PojoClass p = new PojoClass();
		passValue(p.getTxtuser(), "Meena");
		passvalue(p.getTxtPass(), "Meena@123");
		Thread.sleep(2000);
		click(driver.findElement(By.xpath("//button[@name='login']")));
		
	}
	@Test
	private void tc33() {
		System.out.println("Test case33");
	}
	
	@AfterClass
	private void tcs44() {
		closeTab();
	}
	
	
	
	}

