package tdd.exercicios.selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSelenium {

	WebDriver driver = new ChromeDriver();
	
	@Test
	public void buscarNoGoogle() {
		driver.get("http://www.google.com.br");
		WebElement campoBusca = driver.findElement(By.name("q"));
		campoBusca.sendKeys("SPFC");
		campoBusca.submit();
		
		System.out.println(driver.getPageSource());
		
		driver.close();
	}
}
