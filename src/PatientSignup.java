import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PatientSignup {

	public static void main(String[] args)
	
	{
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://marketadvisor.co.in/my-doctor/dev/app/login" );
	
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
driver.findElement(By.id("validationUserName")).sendKeys("Rahul");

	}

}
