package Driver;

import org.testng.annotations.DataProvider;

public class DataUtils {
	
	@DataProvider(name="login")
	public String[][] getData() {
		String s[][]=new String [2][2];
		s[0][0]="udhaya30gmail.com";
		s[0][1]="U@12345";
		
		s[1][0]="bharani45@gmail.com";
		s[1][1]="B@1234";
		
		return s;
		
	}

}
