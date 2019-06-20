

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\group029\\Desktop\\Chrome Driver\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.flipkart.com/");
		
		d.findElement(By.xpath("fk-modal-visible")).click();
		d.findElement(By.name("q")).click();
		d.findElement(By.name("q"));
		
		d.findElement(By.name("q")).sendKeys("cumpter");
		d.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button/svg")).click();
		
		

		
	}

}
