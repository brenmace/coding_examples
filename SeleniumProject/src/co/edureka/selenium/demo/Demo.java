package co.edureka.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Breawn\\Documents\\QA Test\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("kyna.mace@gmail.com");
		driver.findElement(By.className("CwaK9")).click();
		String at = driver.getTitle();
		String et = "gmail";
		driver.close();
		if (at.equalsIgnoreCase(et))
		{
			System.out.println("Test Successful");
		}
		else
		{
			System.out.println("Test Failed");
		}
	}

}
