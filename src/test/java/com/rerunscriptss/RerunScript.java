package com.rerunscriptss;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RerunScript implements IRetryAnalyzer{

	private int retrycount=0;
	private static final int max=5;
	
	
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(retrycount<max) {//0<5 1<5
			retrycount++;
			return true;
		}
		
		return false;
	}

	
		
	
	
}
