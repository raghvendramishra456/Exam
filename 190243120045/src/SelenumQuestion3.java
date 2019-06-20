

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelenumQuestion3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\group029\\Desktop\\Chrome Driver\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.verizonwireless.com/?intcmp=vzwdom");
		
		d.findElement(By.xpath("//*[@id=\"gnavAccountMenu\"]/span")).click();
		
		d.findElement(By.name("IDToken1")).click();
		
		d.findElement(By.name("IDToken1")).sendKeys("mo7692962778@gmail.com");
		d.findElement(By.name("IDToken2")).click();
		
		d.findElement(By.name("IDToken2")).sendKeys("1234567");
		
	}

}
