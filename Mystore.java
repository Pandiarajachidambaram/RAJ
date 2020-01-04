package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mystore {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\New folder\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.get("http://automationpractice.com/index.php"); 
		d.getTitle();
		d.getPageSource();
		d.getCurrentUrl();
		            
		//Sign in
		d.findElement(By.className("login")).click();
		d.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys("raraflll@gmail.com");
		d.findElement(By.cssSelector("html body#authentication.authentication.hide-left-column.hide-right-column.lang_en div#page div.columns-container div#columns.container div.row div#center_column.center_column.col-xs-12.col-sm-12 div.row div.col-xs-12.col-sm-6 form#create-account_form.box div.form_content.clearfix div.submit button#SubmitCreate.btn.btn-default.button.button-medium.exclusive span")).click();
		
		 // REGISTRAION FORM //
		
		//Gender
		d.findElement(By.id("id_gender1")).click();

		//Details
		d.findElement(By.id("customer_firstname")).sendKeys("George");
		d.findElement(By.id("customer_lastname")).sendKeys("c");
		d.findElement(By.id("email")).clear();
		d.findElement(By.id("email")).sendKeys("raraflll@gmail.com");
		d.findElement(By.name("passwd")).sendKeys("rahul");
		
		
		//dropdown D.O.B
		Select days= new Select(d.findElement(By.xpath("//*[@id=\"days\"]")));
		days.selectByIndex(10);
		
		Select months=new Select(d.findElement(By.xpath("//*[@id=\"months\"]")));
		months.selectByIndex(7);
		
		Select years=new Select(d.findElement(By.xpath("//*[@id=\"years\"]")));
		years.selectByValue("1990");
		
		//d.findElement(By.xpath("//*[@id=\"days\"]")).sendKeys("1");
		
		// Check box
		d.findElement(By.cssSelector("#newsletter")).click();
		d.findElement(By.cssSelector("#optin")).click();
		
		
		
		d.findElement(By.name("firstname")).sendKeys("George");
		d.findElement(By.name("lastname")).sendKeys("c");
		d.findElement(By.name("company")).sendKeys("xxxxx");
		
		d.findElement(By.name("address1")).sendKeys("90 ganabathi street");
		d.findElement(By.name("address2")).sendKeys("mexi 7");
		d.findElement(By.name("city")).sendKeys("New mexico");
		//drop down2
		Select drop=new Select(d.findElement(By.xpath("//*[@id=\"id_state\"]")));
		drop.selectByVisibleText("New Mexico");
		
		d.findElement(By.name("postcode")).sendKeys("12345");
		
		
		//Drop down3
		Select country=new Select(d.findElement(By.id("id_country")));
		country.selectByVisibleText("United States");
		
		d.findElement(By.id("other")).sendKeys("xxxxxxxx");
		d.findElement(By.id("phone")).sendKeys("123456787");
		d.findElement(By.id("phone_mobile")).sendKeys("987655");
		d.findElement(By.id("alias")).sendKeys("acount");
		//Register Button
		d.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[4]/button/span")).click();
		
		//Account cart
		d.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")).click();
		d.getTitle();
		
		Thread.sleep(10000);
		d.close();
	}

}
