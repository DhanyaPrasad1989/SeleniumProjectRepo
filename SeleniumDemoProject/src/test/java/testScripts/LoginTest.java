package testScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {
	@Test(description="Login with correct username and password", retryAnalyzer=retry.Retry.class, groups= {"regression"})
	public void verifyTheUserIsAbleToLoginUsingValidCredentials() throws IOException
	{
	//	String usernaamevalue="admin";
		//String passwordvalue="admin";
		String usernaamevalue=ExcelUtility.getStringData(1, 0, "LoginPage");
		String passwordvalue=ExcelUtility.getStringData(1, 1, "LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserNmae(usernaamevalue);
		loginpage.password(passwordvalue);
		loginpage.signin();
	boolean ishomepageavailable=	loginpage.isHomePageloaded();
	Assert.assertTrue(ishomepageavailable);
		
	}
@Test
public void loginIncorrectpswd() throws IOException
{
	//String usernaamevalue="admin";
	//String passwordvalue="12345";
	String usernaamevalue=ExcelUtility.getStringData(2, 0, "LoginPage");
	String passwordvalue=ExcelUtility.getIntegerData(2, 1, "LoginPage");
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterUserNmae(usernaamevalue);
	loginpage.password(passwordvalue);
	loginpage.signin();
	boolean alertmessage=loginpage.assertcheck();
	Assert.assertTrue(alertmessage);
}
@Test
public void loginIncorrectusername() throws IOException
{
	//String usernaamevalue="admn";
	//String passwordvalue="admin";
	String usernaamevalue=ExcelUtility.getStringData(3, 0, "LoginPage");
	String passwordvalue=ExcelUtility.getStringData(3, 1, "LoginPage");
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterUserNmae(usernaamevalue);
	loginpage.password(passwordvalue);
	loginpage.signin();
	boolean alertmessage=loginpage.assertcheck();
	Assert.assertTrue(alertmessage);
}
@Test
public void loginBothIncorrect() throws IOException
{
	//String usernaamevalue="admn";
	//String passwordvalue="12345";
	String usernaamevalue=ExcelUtility.getStringData(4, 0, "LoginPage");
	String passwordvalue=ExcelUtility.getIntegerData(4, 1, "LoginPage");
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterUserNmae(usernaamevalue);
	loginpage.password(passwordvalue);
	loginpage.signin();
	boolean alertmessage=loginpage.assertcheck();
	Assert.assertTrue(alertmessage);
}
}
