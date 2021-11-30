package org.TestNG;

import org.Pojo.PojoClass;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.utilities.practise;

public class testNGprac extends practise {
	
	public class Suiteclass extends practise {
		@BeforeClass(alwaysRun=true)
		private void LaunchBrowser() {
			launchChrome();
			windowmax();
			
		}
			
	
	@Test(groups="Sojiya")
	private void Tcs1() throws InterruptedException {
		loadUrl("https://www.facebook.com");
		PojoClass p = new PojoClass();
		passValue(p.getTxtuser(), "Sojiya");
		passvalue(p.getTxtPass(), "Soji@123");
		Thread.sleep(2000);
		click(driver.findElement(By.xpath("//button[@name='login']")));
		
	}
	
	@Test(groups="Senthu")
	private void Tcs2() throws InterruptedException {
		loadUrl("https://www.facebook.com");
		PojoClass p = new PojoClass();
		passValue(p.getTxtuser(), "Senthu");
		passvalue(p.getTxtPass(), "Senthu@123");
		Thread.sleep(2000);
		click(driver.findElement(By.xpath("//button[@name='login']")));
		
	}
	
	@Test(groups= {"Sojiya,Senthu"})
	private void Tcs3() throws InterruptedException {
		loadUrl("https://www.facebook.com");
		PojoClass p = new PojoClass();
		passValue(p.getTxtuser(), "Aarav");
		passvalue(p.getTxtPass(), "Aarav@123");
		Thread.sleep(2000);
		click(driver.findElement(By.xpath("//button[@name='login']")));
		
	}
	}
	
}
