package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FacebookLogin {

	public static void main(String[] args) {
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.findElement(By.xpath("//input[@id='email']")).sendKeys("testleaf.2023@gmail.com");
		d.findElement(By.xpath("//input[@id='pass']")).sendKeys("Tuna@321");
		d.findElement(By.xpath("//button[@name='login']")).click();
		d.findElement(By.xpath("//a[@href='https://facebook.com/login/identify/']")).click();
		String title = d.getTitle();
		System.out.println(title);
		String expectedtitle="Forgotten Password | Can't Log In | Facebook";
		Assert.assertEquals(title, expectedtitle);
		d.quit();
		
		

	}

}
