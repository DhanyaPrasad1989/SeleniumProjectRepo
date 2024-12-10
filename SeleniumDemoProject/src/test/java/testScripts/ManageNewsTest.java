package testScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base{
	@Test
	public void manageNewstab() throws IOException
	{
		//String usernaamevalue="admin";
		//String passwordvalue="admin";
		//String textvalue="hello";
		String usernaamevalue=ExcelUtility.getStringData(1, 0, "LoginPage");
		String passwordvalue=ExcelUtility.getStringData(1, 1, "LoginPage");
		String textvalue=ExcelUtility.getStringData(1, 0, "ManageNews");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserNmae(usernaamevalue);
		loginpage.password(passwordvalue);
		loginpage.signin();
		ManageNewsPage managenewspage=new ManageNewsPage(driver);
		managenewspage.moreinfo();
		managenewspage.newsButton();
		managenewspage.newsTextField(textvalue);
		managenewspage.saveButton();
		boolean alertdisplay=managenewspage.assertcheck();
		Assert.assertTrue(alertdisplay);
		
	}

}
