package org.Baseclass;

import java.util.Date;

import org.Pojo.PojoClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utilities.practise;

public class JunitClass extends practise {
	
	@BeforeClass
	public static void Chrome() {
		launchChrome();
		loadUrl("https://www.facebook.com/");
		windowmax();
		
	}
	@Before
	public void startTime() {
		Date d = new Date();
		System.out.println(d);
	
	}
	@After
	public void endTime() {
		System.out.println(new Date());
	}
	
	@AfterClass
	public static void CloseBrowse() {
		closeTab();
	}
	
	@Test
	public void tc1() {
		
		PojoClass p = new PojoClass();
		passValue(p.getTxtuser(), "Sojiya");
		
	}
	
	@Test
	public void tc2() {
		PojoClass p = new PojoClass();
		passvalue(p.getTxtPass(), "Senthu@123");
	}
	
	@Test
	public void tc3() {
		WebElement btn = driver.findElement(By.xpath("//button[@type='submit']"));
		click(btn);
	}
}
