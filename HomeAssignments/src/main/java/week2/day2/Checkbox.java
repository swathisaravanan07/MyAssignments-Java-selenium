package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		
		
		ChromeDriver d= new ChromeDriver();
		d.get("https://leafground.com/checkbox.xhtml");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement basicCheckbox = d.findElement(By.xpath("//span[text()='Basic']"));
        basicCheckbox.click();
        System.out.println("Clicked on Basic Checkbox");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
    WebElement bc1=d.findElement(By.xpath("//span[text()='Ajax']"));
        bc1.click();
        System.out.println("secone one clicked");
	}

}
