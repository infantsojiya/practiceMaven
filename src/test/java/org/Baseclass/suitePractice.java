package org.Baseclass;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class suitePractice {
	
	@Test
	public void tcs11() {
		System.out.println("test11");
	}
	@Ignore
	@Test
	public void tcs22() {
		
		System.out.println("test22");

	}
	@Test
	public void tcs33() {
		Assert.assertTrue(false);
		System.out.println("test33");
	}
	@Test
	public void tc44() {
		System.out.println("test44");
	}
	
}
