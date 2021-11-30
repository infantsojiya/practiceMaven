package org.Baseclass;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class B {

	@Test
	public void tc88() {
		Result rs = JUnitCore.runClasses(JunitClass.class,suitePractice.class);
		
		System.out.println("Run Count:" +rs.getRunCount());
		System.out.println("Failure Count:" +rs.getFailureCount());
		System.out.println("Ignore Count:" +rs.getIgnoreCount());
		System.out.println("Run Time:" +rs.getRunTime());
		
		
	}
	
	
}
