package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();

		
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		//String title=driver.getTitle();
		//System.out.println(title);
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Wipro");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ranjana");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumari");
		WebElement elem = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sel=new Select(elem);
		sel.selectByVisibleText("Employee");
		
		WebElement mr = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select se=new Select(mr);
		se.selectByVisibleText("Automobile");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ranjana");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Kumari");
		
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Ms");
		driver.findElement(By.name("birthDate")).sendKeys("11/29/1996");
		driver.findElement(By.name("generalProfTitle")).sendKeys("Software Sector");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("40,000");
		
		WebElement cur = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select c=new Select(cur);
		c.selectByIndex(3);
		
		WebElement ind = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dd=new Select(ind);
		dd.selectByValue("IND_MEDIA");
		
		driver.findElement(By.name("numberEmployees")).sendKeys("5");
		
		WebElement own = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select sip=new Select(own);
		c.selectByIndex(5);
		
		driver.findElement(By.name("sicCode")).sendKeys("1234");
		driver.findElement(By.name("tickerSymbol")).sendKeys("134");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("I will become a tester soon");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Learning Selenium");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("7908834663");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("82813");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("9087");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Ranjana");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ranjanakri29@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("testleaf.com");
		
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Ranjana");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Kumari");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("TATA SIJUA RUSSI VIHAR");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Q/No- A/1");
		
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Dhanbad");
		WebElement stt = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select st=new Select(stt);
		st.selectByVisibleText("Indiana");;
		
		
		
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("828103");
		WebElement code = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select cd=new Select(code);
		cd.selectByVisibleText("India");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("80");
		
		driver.findElement(By.name("submitButton")).click(); 
		//crmsfa
		
		String ttt=driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(ttt);
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
