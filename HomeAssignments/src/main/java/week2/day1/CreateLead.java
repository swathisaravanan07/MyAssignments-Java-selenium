package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CreateLead {

	public static void main(String[] args) {
		ChromeDriver d=new ChromeDriver();
		//Load the URL
		d.get("http://leaftaps.com/opentaps/");
		//Maximize the browser window
		d.manage().window().maximize();
		//enter user name and password and login
		d.findElement(By.id("username")).click();
		d.findElement(By.id("username")).sendKeys("demosalesmanager");
		d.findElement(By.id("password")).sendKeys("crmsfa");
		d.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		//click crm/sfa link
		d.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/a/img")).click();
		d.findElement(By.xpath("//a[@href='/crmsfa/control/leadsMain']")).click();
		d.findElement(By.xpath("//a[@href='/crmsfa/control/createLeadForm']")).click();
		d.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("kars");
		d.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("kar");
		d.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("kar");
		d.findElement(By.xpath("//input[@name='generalProfTitle']")).sendKeys("kar");
		d.findElement(By.xpath("//input[@value='Create Lead']")).click();
		 String actualtitle = d.getTitle();
		 System.out.println(actualtitle);
		 String expectedtitle="View Lead | opentaps CRM";
		 Assert.assertEquals(actualtitle,expectedtitle,"Title does not matches");
		 d.close();

	}

}
