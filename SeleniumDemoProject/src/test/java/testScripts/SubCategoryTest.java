package testScripts;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.SubCategoryPage;
import utilities.ExcelUtility;

public class SubCategoryTest extends Base {
	@Test
	public void SubCategoryTab() throws IOException, AWTException
	{
		String usernaamevalue=ExcelUtility.getStringData(1, 0, "LoginPage");
		String passwordvalue=ExcelUtility.getStringData(1, 1, "LoginPage");
		String textvalue=ExcelUtility.getStringData(3, 0, "SubCategory");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserNmae(usernaamevalue);
		loginpage.password(passwordvalue);
		loginpage.signin();
		SubCategoryPage subcatpage=new SubCategoryPage(driver);
		subcatpage.subCategorymoreinfo();
		subcatpage.newButton();
		subcatpage.category();
		subcatpage.subCategory(textvalue);
		subcatpage.image();
		subcatpage.saveButton();
		boolean alertdisplay=subcatpage.isAlertDisplayed();
		Assert.assertTrue(alertdisplay);
		
	}

}
