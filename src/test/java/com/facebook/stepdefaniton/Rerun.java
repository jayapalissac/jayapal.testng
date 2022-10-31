package com.facebook.stepdefaniton;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Rerun implements IRetryAnalyzer{
	
	int i=1;
	
	int j=2;

	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		if(i < j) {
			i++;
			  return true;
		}
		
		System.out.println(result.getName());
		
		return false;
		
	}
}

