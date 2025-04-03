package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CreateAccount {

	public static void main(String[] args) {
		//preconditions
		//Initialize the web driver
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
		d.findElement(By.xpath("//a[@href='/crmsfa/control/accountsMain']")).click();
		d.findElement(By.xpath("//a[@href='/crmsfa/control/createAccountForm']")).click();
		d.findElement(By.xpath("//input[@id='accountName']")).sendKeys("shruthi1");
		d.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation tester");
		//select computer software from the industry drop down
		WebElement dropdown0= d.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select s0 = new Select(dropdown0);
		 s0.selectByIndex(3);
		 WebElement dropdown1= d.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		 Select s1 = new Select(dropdown1);
		 s1.selectByVisibleText("S-Corporation");
		 WebElement dropdown2= d.findElement(By.xpath("//select[@name='dataSourceId']"));
		 Select s2 = new Select(dropdown2);
		 s2.selectByValue("LEAD_EMPLOYEE");
		 WebElement dropdown3= d.findElement(By.xpath("//select[@name='marketingCampaignId']"));
		 Select s3 = new Select(dropdown3);
		 s3.selectByIndex(6);
		 WebElement dropdown4= d.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		 Select s4 = new Select(dropdown4);
		 s4.selectByValue("TX");
		 //click create account
		 d.findElement(By.xpath("//input[@onclick='submitFormWithSingleClick(this)']")).click();
		 //verify the account name
//		 WebElement accountElement = d.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[2]/span"));
//	        String actualAccountName = accountElement.getText();
//	        String accountName = actualAccountName.replaceAll("\\(\\d+\\)", "").trim();
//	        System.out.println(accountName);
//	        String expectedAccountName = "karthi1";
//	        Assert.assertEquals(accountName, expectedAccountName, "Account name does not match");
		 //verify title is displayed correctly
		 String actualtitle = d.getTitle();
		 System.out.println(actualtitle);
		 String expectedtitle="Account Details | opentaps CRM";
		 Assert.assertEquals(actualtitle,expectedtitle,"Title does not matches");
		 d.quit();
		 
		 		
		
	      
		
		
		
		
			
		
		

	}

}
