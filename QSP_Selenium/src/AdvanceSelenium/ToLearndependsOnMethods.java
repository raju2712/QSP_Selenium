package AdvanceSelenium;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearndependsOnMethods {

	@Test
	public void CreateAccount()  {
		Reporter.log("Account Create Successfully", true);
	}
	@Test(dependsOnMethods = "CreateAccount")
	public void EditAccount()  {
		Reporter.log("Account Edited Successfully", true);
	}
	@Test(dependsOnMethods = {"EditAccount","CreateAccount"})
	public void DeleteAccount()  {
		Reporter.log("Account Deleted Successfully", true);
	}
}
