package org.Baseclass;

import org.openqa.selenium.By;
import org.utilities.practise;

public class base extends practise {
	
	public static void main(String[] args) {
		
		launchFireFox();
		launchEdgeDriver();
		launchOperaDriver();
		LaunchIE();
		launchChrome();
		loadUrl("https://www.facebook.com");
		windowmax();
		rightClick();
		keydownup();
		Waitsimp();
		
		
		 
		 
		 
	}
}
