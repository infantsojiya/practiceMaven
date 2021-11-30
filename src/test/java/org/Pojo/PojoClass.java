package org.Pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.utilities.practise;

public class PojoClass extends practise{
	
	public PojoClass() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBys({
		
	    @FindBy(id="email"),
	    
	    @FindBy(xpath="//input[@type='text']")
	    
	})
	
	private WebElement txtuser;
	
	@FindAll({
		
		@FindBy(id="pass"),
		
		@FindBy(name="pass")
		
	})
	
	private WebElement txtPass;
	

	public WebElement getTxtuser() {
		return txtuser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}
	
}
