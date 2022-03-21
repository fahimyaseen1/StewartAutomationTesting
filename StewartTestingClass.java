package stewartAutomationTesting;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class StewartTestingClass {

	WebDriver driver;

	
//	public StewartTestingClass() {
//		driver = new ChromeDriver();
//	  }
	
    @BeforeTest
    public void LaunchBrowser() throws IOException, InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.get("https://qa1-access-ia.stewart.com");
		driver.manage().window().maximize();	
		
		
		System.out.print("Test Login Credentials...");
		
		driver.findElement(By.id("Email"));
		WebElement username = driver.findElement(By.id("Email"));
		username.clear();
		username.sendKeys("TPSTESTER1");

		driver.findElement(By.id("Password"));
		WebElement password = driver.findElement(By.id("Password"));
		password.clear();
		password.sendKeys("p@ssw0rd");

		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/form/div[3]/div/input")).click();
		
		Thread.sleep(8000);
    }  

    @AfterTest
    public void afterTest() {
         driver.quit();          
    } 

	@Test
	public void StewartLogin() throws IOException, InterruptedException {
		
		System.out.print("Successfully Login Credentials...");

	}
	
	@Test
	public void PostPolicyEndorsement() throws InterruptedException, IOException {
		  
		System.out.print("Post Policy Endorsement Page...");
  
		Thread.sleep(8000);

		driver.findElement(By.xpath("//div[1]//div/div[2]//ul[1]/li[5]/a[@href='/PostPolicyEndorsement/Detail']")).click();
		Thread.sleep(8000);

		driver.findElement(By.xpath("//*[@id=\"txtFileNumber\"]")).sendKeys("EPQA-0.6239711356804821");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"IssuingAgency\"]/option[4]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"btnSearchOrginalJacket\"]")).click();
		Thread.sleep(5000);
	      
		driver.findElement(By.xpath("//*[@id=\"txtOPN\"]")).sendKeys("Test");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"ddlState\"]/option[52]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"txtLiability\"]")).sendKeys("1500");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"ddlFormType\"]/option[4]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"ddlUnderwriter\"]/option[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"btnOpenAssociatePropertyWindow\"]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"chkAssociateProperty\"]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"btnAssociatePropertySave\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"gridProperties\"]/div[3]/table/tbody/tr/td[1]/a[1]/button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"gridProperties\"]/div[3]/table/tbody/tr/td[1]/a[2]/button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"gridProperties\"]/div[3]/table/tbody/tr/td[1]/a[2]/button")).click();
		Thread.sleep(2000);
	}
	
	@Test
	public void Jacket() throws InterruptedException, IOException {
		
		System.out.print("Test Jacket Page...");

		Thread.sleep(5000);
		driver.findElement(By.xpath(".//div[1]//div/div[2]//ul[1]/li[4]/a[@href='/Jacket/Detail']")).click();
		Thread.sleep(8000);

		driver.findElement(By.xpath("//*[@id=\"txtFileNumber\"]")).sendKeys("EPQA-0.6239711356804821");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"txtDate\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[7]/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"IssuingAgency\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"IssuingAgency\"]/option[4]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"ddlState\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"ddlState\"]/option[44]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"LiabilityAmt\"]")).sendKeys("1500");
		Thread.sleep(2000);
		
	//	driver.findElement(By.xpath("//*[@id=\"FormType\"]")).click();
	//	Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"FormType\"]/option[4]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"TransactionType\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"TransactionType\"]/option[4]")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"btnOpenAssociatePropertyWindow\"]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"chkAssociateProperty\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"btnAssociatePropertySave\"]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"gridProperties\"]/div[3]/table/tbody/tr/td[1]/a[1]/button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"gridProperties\"]/div[3]/table/tbody/tr/td[1]/a[2]/button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"gridProperties\"]/div[3]/table/tbody/tr/td[1]/a[2]/button")).click();
		Thread.sleep(2000);
	}
	
	@Test
	public void Cpl() throws InterruptedException, IOException {
		
		System.out.print("Test CPL Page...");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//div[1]//div/div[2]//ul[1]/li[3]/a[@href='/Cpl/Detail']")).click();
		Thread.sleep(2000);
		
	}
	
	@Test
	public void Express() throws InterruptedException, IOException {
		
		System.out.print("Test Express Page...");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//div[1]//div/div[2]//ul[1]/li[2]/a[@href='/Express/Detail']")).click();
		Thread.sleep(2000);
		
	}

	@Test
	public void Register() throws InterruptedException, IOException {
		
		System.out.print("Test Register Page...");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//div[1]//div/div[2]//ul[1]/li[6]/a[@href='/Register/Detail']")).click();
		Thread.sleep(2000);
		
	}
	
	@Test
	public void Contact() throws InterruptedException, IOException {
		
		System.out.print("Test Contact Page...");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(".//div[1]//div/div[2]//ul[1]/li[7]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//div[1]//div/div[2]//ul[1]/li[7]/ul/li[2]/a[@href='/Feedback/Contact']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(".//div[1]//div/div[2]//ul[1]/li[7]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//div[1]//div/div[2]//ul[1]/li[7]/ul/li[1]/a[@href='/Feedback/Index']")).click();
		Thread.sleep(2000);
		
	//	driver.findElement(By.xpath(".//div[1]//div/div[2]//ul[1]/li[7]/a")).click();
	//	Thread.sleep(2000);
	//	driver.findElement(By.xpath(".//div[1]//div/div[2]//ul[1]/li[7]/ul/li[3]/a[@href='Deactivate Account']")).click();
	//	Thread.sleep(2000);
		
	}

	@Test
	public void Help() throws InterruptedException, IOException {
		
		System.out.print("Test Help Page...");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(".//div[1]//div/div[2]//ul[1]/li[8]/a[@href='/Feedback/Help']")).click();
		Thread.sleep(2000);
		
	}
	
	@Test
	public void File() throws InterruptedException, IOException {
		
		System.out.print("Test File Page...");
		
		Thread.sleep(5000);
		
		// ..... File Product  ..... //

		driver.findElement(By.xpath(".//div[1]//div/div[2]//ul[1]/li[1]/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(".//div[1]//div/div[2]//ul[1]/li[1]/ul/li[1]/a[@href='/File/Product']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("Filenumber")).sendKeys("EPQA-0.6239711356804821");

		Thread.sleep(3000);
		driver.findElement(By.id("ddlIssuingAgency")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"ddlIssuingAgency\"]/option[4]")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("btnSearch")).click();
		Thread.sleep(5000);
		
		// ..... File Details  ..... //
		
		driver.findElement(By.xpath(".//div[1]//div/div[2]//ul[1]/li[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//div[1]//div/div[2]//ul[1]/li[1]/ul/li[2]/a[@href='/File/Detail']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("txtFileNumber")).sendKeys("EPQA-0.6239711356804821");
		Thread.sleep(3000);
		
		driver.findElement(By.id("IssuingAgency")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"IssuingAgency\"]/option[4]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("btnSearch")).click();

		
	}
}
