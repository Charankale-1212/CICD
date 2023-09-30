package stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Stepdef {

	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://magento.softwaretestingboard.com/");
		
		
	}

	@Given("some other precondition")
	public void some_other_precondition() {
	   
		System.out.println("charan kale");
	}

	@When("I complete action")
	public void i_complete_action() {
	   
		System.out.println("Completed");
	}

	@When("some other action")
	public void some_other_action() {
	  System.out.println("Third"); 
		
	}

	@When("yet another action")
	public void yet_another_action() {
	  
		
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	   
		
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
	   
		
	}

	
	
	
}
