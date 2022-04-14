package com.crm.comcast.SDET32_GitPractice;

import org.testng.annotations.Test;

public class ClassA {
	@Test
	public void gitPractice() {
		String browser = System.getProperty("browser");
		String url = System.getProperty("url");
		
		
		System.out.println(browser);
		System.out.println(url);
	}

}
