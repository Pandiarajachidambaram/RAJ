package test;

import java.util.concurrent.TimeUnit;

import javax.print.DocFlavor.STRING;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GOOGLEnEW {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","D:\\New folder\\chromedriver.exe");
    WebDriver d=new ChromeDriver();
    d.manage().window().maximize();
    d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    d.get("https://www.google.com");
    System.out.println(d.getTitle());
    System.out.println( d.getCurrentUrl());
    d.getCurrentUrl();
    d.findElement(By.name("q")).sendKeys("techlistic selenium tutorials");
    d.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).click();

    
    String str1 ="techlistic selenium tutorials";
    String str2 ="techlistic selenium tutorials";
    String str3 ="tech";
    
    if(str1.equals(str2))
    	System.out.println("str1 and str2 are equal");
    else
    	System.out.println("str1 and str2 are not equal");
    
    if(str2.equals(str3))
    	System.out.println("str2 and str3 are equal");
    else
    	System.out.println("str2 and str3 are not equal");

  
    boolean b=d.findElement(By.className("LC20lb")).isDisplayed();
	System.out.println(b);
	boolean e=d.findElement(By.className("LC20lb")).isEnabled();
	System.out.println(e);
	boolean s=d.findElement(By.className("LC20lb")).isSelected();
	System.out.println(s);
	
	   d.findElement(By.className("LC20lb")).click();
System.out.println(d.getTitle());

    Thread.sleep(10000);
    d.close();
    
    
	}

}
