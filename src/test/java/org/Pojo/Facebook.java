package org.Pojo;

import org.openqa.selenium.WebElement;
import org.utilities.practise;

public class Facebook extends practise {
	
	public static void main(String[] args) {
		
		launchChrome();
		loadUrl("https://www.facebook.com/");
		windowmax();
		
		PojoClass p = new PojoClass();
		
		WebElement user = p.getTxtuser();
		passvalue(user, "Senthu");
		
		WebElement pass = p.getTxtPass();
		passValue(pass, "Soji@123");
		
		driver.navigate().refresh();
		
		passvalue(user, "Sojiya");
		
		
	}
	
}
