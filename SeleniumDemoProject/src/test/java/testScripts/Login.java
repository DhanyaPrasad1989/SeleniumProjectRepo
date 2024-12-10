package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends Base {
	@Test
	public void loginTest()
	{
		//driver.navigate().to("https://groceryapp.uniqassosiates.com/admin");
		String username="admin";
		String password ="admin";
		WebElement user=driver.findElement(By.xpath("//input[@name='username']"));
		WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
		WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
		user.sendKeys(username);
		pass.sendKeys(password);
		signin.click();
		WebElement dashboard=driver.findElement(By.xpath("//p[text()='Dashboard']"));
		boolean ishomepageavailable=dashboard.isDisplayed();
		Assert.assertTrue(ishomepageavailable);
		
		
	}
	@Test
	public void loginIncorrectpswd()
	{
		//driver.navigate().to("https://groceryapp.uniqassosiates.com/admin");
		String username="admin";
		String password ="12345";
		WebElement user=driver.findElement(By.xpath("//input[@name='username']"));
		WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
		WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
		user.sendKeys(username);
		pass.sendKeys(password);
		signin.click();
		WebElement alert=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
		boolean alertmessagebox=alert.isDisplayed();
		Assert.assertTrue(alertmessagebox);
		
	}
	@Test
	public void loginIncorrectusername()
	{
		//driver.navigate().to("https://groceryapp.uniqassosiates.com/admin");
		String username="admn";
		String password ="admin";
		WebElement user=driver.findElement(By.xpath("//input[@name='username']"));
		WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
		WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
		user.sendKeys(username);
		pass.sendKeys(password);
		signin.click();
		WebElement alert=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
		boolean alertmessagebox=alert.isDisplayed();
		Assert.assertTrue(alertmessagebox);
	}
	@Test
	public void loginBothIncorrect()
	{
		//driver.navigate().to("https://groceryapp.uniqassosiates.com/admin");
		String username="admn";
		String password ="12345";
		WebElement user=driver.findElement(By.xpath("//input[@name='username']"));
		WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
		WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
		user.sendKeys(username);
		pass.sendKeys(password);
		signin.click();
		WebElement alert=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
		boolean alertmessagebox=alert.isDisplayed();
		Assert.assertTrue(alertmessagebox);
	}

}
