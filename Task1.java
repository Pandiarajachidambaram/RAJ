package test;

	
		import java.util.concurrent.TimeUnit;
        import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class Task1 {
			
			public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver.exe");
				WebDriver d =new ChromeDriver();
				//ChromeDriver d=new ChromeDriver();
				//launching browser
				
		d.manage().window().maximize();
		//maximize window
		
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.get(" https://www.techlistic.com/");
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		//Title 
		
		//select java
		d.findElement(By.xpath("/html/body/div[1]/div[3]/div/header/div/div[2]/nav/div/div/div/div[1]/div[1]/div/ul/li[2]/a")).click();
		System.out.println(d.getTitle());

		//Home
		d.findElement(By.xpath("/html/body/div[1]/div[3]/div/header/div/div[2]/nav/div/div/div/div[1]/div[1]/div/ul/li[1]/a")).click();
		System.out.println(d.getTitle());

		//selenium tutorial
		d.findElement(By.xpath("/html/body/div[1]/div[3]/div/header/div/div[2]/nav/div/div/div/div[1]/div[1]/div/ul/li[3]/a")).click();
		System.out.println(d.getTitle());

		//home
		d.findElement(By.xpath("/html/body/div[1]/div[3]/div/header/div/div[2]/nav/div/div/div/div[1]/div[1]/div/ul/li[1]/a")).click();
		System.out.println(d.getTitle());


		//selenium blogs
		d.findElement(By.xpath("/html/body/div[1]/div[3]/div/header/div/div[2]/nav/div/div/div/div[1]/div[1]/div/ul/li[6]/a")).click();
		System.out.println(d.getTitle());
		
		//home
		d.findElement(By.xpath("/html/body/div[1]/div[3]/div/header/div/div[2]/nav/div/div/div/div[1]/div[1]/div/ul/li[1]/a")).click();
		System.out.println(d.getTitle());

		
		// blogs
				d.findElement(By.xpath("/html/body/div[1]/div[3]/div/header/div/div[2]/nav/div/div/div/div[1]/div[1]/div/ul/li[6]/a")).click();
				System.out.println(d.getTitle());
				
		//testNG blogs
		d.findElement(By.cssSelector("#post-body-2376128295937989143 > div:nth-child(1) > b:nth-child(2) > span:nth-child(1) > a:nth-child(1)")).click();
		System.out.println(d.getTitle());
		Thread.sleep(10000);
		d.close();;

			}

}
