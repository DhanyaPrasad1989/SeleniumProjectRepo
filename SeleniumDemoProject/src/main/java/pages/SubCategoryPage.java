package pages;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constants;
import utilities.FileUploadUtilities;
import utilities.PageUtility;

public class SubCategoryPage {
	WebDriver driver;
	public SubCategoryPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver , this);
		
	}
	@FindBy(xpath="//select[@id='cat_id']")private WebElement category;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-sub-category']")private WebElement moreinfo;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")private WebElement buttonnew;
	@FindBy(xpath="//input[@id='subcategory']")private WebElement subcat;
	@FindBy(xpath="//input[@id='main_img']")private WebElement file;
	@FindBy(xpath="//button[@type='submit']")private WebElement savebut;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")private WebElement alert;
	public void subCategorymoreinfo()
	{
		moreinfo.click();
	}
	public void newButton()
	{
		buttonnew.click();
	}

public void category()
{
	PageUtility dropdown=new PageUtility();
	dropdown.selectByVisibleText(category, "Synergistic Wool Knife");
}
public void subCategory(String text)
{
	subcat.sendKeys(text);
}
public void image() throws AWTException
{
	FileUploadUtilities fileupload=new FileUploadUtilities();
	fileupload.fileUploadSendkeys(file, Constants.TVIMAGE);
}
public void saveButton()
{
	//savebut.click();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();",savebut);
}
public boolean isAlertDisplayed()
{
	return alert.isDisplayed();
}
}
