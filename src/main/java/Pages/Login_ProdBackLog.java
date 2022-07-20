package Pages;

import org.openqa.selenium.By;

import Browser.Browser;

public class Login_ProdBackLog extends Browser  {

	public static void OpenUrl(String a)
	{
		try
		{
			Browser.openBrowser();
			Browser.openURL(a);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void UserId(String userid)
	{
		try
		{
			Page.enterTheUsername(userid);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void PassId(String passid)
	{
		try
		{
			Page.enterThePassword(passid);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void LogInBtn()
	{
		try
		{
			Page.clickTheLoginButton();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void NextPg() throws InterruptedException
	{
		try
		{
			Page.navigateTheProduct();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void Suser(String uid)
	{
		try
		{
			Page.enterTheUsername(uid);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void Spass(String pass)
	{
		try
		{
			Page.enterThePassword(pass);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void Login_Button()
	{
		try
		{
			Page.clickTheLoginButton();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public static String ProdDetails() throws InterruptedException
	{
		String text = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/span")).getText();
		return text;
	}

}
