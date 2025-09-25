package utils;
import org.testng.annotations.DataProvider;
public class Data1 {
	
	@DataProvider(parallel=true,indices={1,2})
	public String[][] getData() {
		String s[][] = new String[4][2];
		s[0][0] = "udhayamurugan30@gmail.com";
		s[0][1] = "U@1234";
		s[1][0] = "priya123@gmail.com";
		s[1][1] = "P@1234";
		s[2][0] = "kavi123@gmail.com";
		s[2][1] = "K@1234";
		s[3][0] = "vino@gmail.com";
		s[3][1] = "V@1234";
		return s;
	}
	
	@DataProvider(name = "fblogin")
	public String[][] getFbData() {
		String s[][] = new String[2][2];
		s[0][0] = "udhayamurugan30@gmail.com";
		s[0][1] = "U@1234";
		s[1][0] = "priya123@gmail.com";
		s[1][1] = "P@1234";
		return s;
	}
}
