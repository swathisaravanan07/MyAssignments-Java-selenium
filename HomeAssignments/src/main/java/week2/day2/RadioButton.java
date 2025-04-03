package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;

public class RadioButton {

	public static void main(String[] args) {
		ChromeDriver d= new ChromeDriver();
		d.get("https://leafground.com/button.xhtml");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Boolean isenabled=d.findElement(By.id("j_idt88:j_idt92")).isEnabled();
		if(isenabled){System.out.println("Confirm button is enabled"); }
		else {System.out.println("Confirm button is disabled");}
		d.findElement(By.xpath("//span[text()='Click']")).click();
		String Title=d.getTitle();
		System.out.println(Title);
		if(Title.equals("Dashboard")) {System.out.println("Title matched");}
		else {System.out.println("Title not matched");}
		//d.findElement(By.id("j_idt88:j_idt92")).isEnabled();
		d.close();
		
	}
}
