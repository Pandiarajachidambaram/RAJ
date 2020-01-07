package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WEBMULTI {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver.exe");
    WebDriver d=new ChromeDriver();
    d.manage().window().maximize();
    d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    d.get("https://www.techlistic.com/p/selenium-practice-form.html");
    d.getTitle();
    d.getCurrentUrl();
    
    
    d.findElement(By.name("firstname")).sendKeys("raja");
    d.findElement(By.name("lastname")).sendKeys("c");
   // WebElement radio1=d.findElement(By.xpath("//*[@id=\"sex-0\"]"));
   // radio1.click();
  //  WebElement radio2=d.findElement(By.xpath("//*[@id=\"sex-1\"]"));
   // radio2.click();
    
    //RADIO BUTTON
    boolean b=d.findElement(By.xpath("//*[@id=\"sex-0\"]")).isDisplayed();
    System.out.println(b);
    boolean e=d.findElement(By.xpath("//*[@id=\"sex-0\"]")).isEnabled();
    System.out.println(e);
    boolean s=d.findElement(By.xpath("//*[@id=\"sex-0\"]")).isSelected();
    System.out.println(s);
    
    d.findElement(By.xpath("//*[@id=\"sex-0\"]")).click(); 
    boolean e_new=d.findElement(By.xpath("//*[@id=\"sex-0\"]")).isSelected();
    System.out.println(e_new);
    
    //EXPERIENCE AND OTHER DETAILS
    d.findElement(By.id("exp-0")).click();
    d.findElement(By.id("datepicker")).sendKeys("2/4/2000");
    d.findElement(By.id("profession-0")).click();
    d.findElement(By.id("profession-1")).click();
    d.findElement(By.id("tool-2")).click();
    
    //DROP DOWN1
    Select drp=new Select(d.findElement(By.id("continents")));
    drp.selectByVisibleText("Asia");
    
    //DROP DOWN2
    Select drp1=new Select(d.findElement(By.id("selenium_commands")));
    d.getTitle();
    //drp1.selectByVisibleText("Browser Commands");
   // drp1.selectByVisibleText("Navigation Commands");
    //drp1.selectByVisibleText("Switch Commands");
    //drp1.selectByVisibleText("Wait Commands");
    drp1.selectByVisibleText("WebElement Commands");
    Thread.sleep(3000);
    //drp1.deselectByVisibleText("Browser Commands");
    
    //Thread.sleep(3000);
    //drp1.deselectByVisibleText("WebElement Commands");
    //Thread.sleep(3000);
    ///drp1.deselectAll();
    //SELECT AND UPLOAD IMAGE
   WebElement photo= d.findElement(By.id("photo"));
   photo.sendKeys("C:\\Users\\ELCOT\\Pictures\\Saved Pictures\\pictures");
  // d.findElement(By.cssSelector("div.control-group:nth-child(5) > a:nth-child(2)")).click();
   
 
   d.findElement(By.xpath("//*[@id=\"submit\"]")).click();    
Thread.sleep(10000);
d.close();
	}

}
