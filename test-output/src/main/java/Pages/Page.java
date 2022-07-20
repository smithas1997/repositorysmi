package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import Browser.Browser;

public class Page extends Browser {
	
	public static void enterTheUsername(String user) {
		driver.findElement(By.id("user-name")).sendKeys(user);
	}
	public static void enterThePassword(String pass) {
		driver.findElement(By.id("password")).sendKeys(pass);
	}
	public static void clickTheLoginButton() {
		driver.findElement(By.id("login-button")).click();
	}
	
	public static void navigateTheProduct() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)","");
		Thread.sleep(1000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,-350)","");
		Thread.sleep(1000);
	}
}
