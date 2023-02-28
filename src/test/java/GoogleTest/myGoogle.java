package GoogleTest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;
@ExtendWith(SerenityJUnit5Extension.class)
public class myGoogle {
	@Managed
	WebDriver driver;
	
	@Test
	public void myFirstTestCase() {
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("selenium with serenity");
		
	}

}
