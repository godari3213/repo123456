package cucumber1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Testlogin {
	WebDriver driver;
	@Given("^Jeff has brought microwave for \\$(\\d+)$")
	public void jeff_has_brought_microwave_for_$(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println(" microwave brought for "+arg1);
	}

	@Given("^Jeff has the reciept$")
	public void jeff_has_the_reciept() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.out.println(" Jeff has the reciept");
	}

	@When("^Jeff retirns the faulty item$")
	public void jeff_retirns_the_faulty_item() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println(" Jeff returning the faulty mircrowave");
	}

	@Then("^Jeff got the refund of \\$(\\d+)$")
	public void jeff_got_the_refund_of_$(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.out.println(" Jeff has the refurnd:"+arg1);
	}
	//login ------------------------------------------------------------------------------------
	@Given("^User know that the application is up and running$")
	public void user_know_that_the_application_is_up_and_running() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		//opening of the web application using selenium
		
		System.setProperty("webdriver.chrome.driver", "C://Drivers//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");	
		System.out.println("driver.getTitle()");
		
	}

	@Given("^User having the valida data$")
	public void user_having_the_valida_data() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		
		
	}
	@When("^user provides the valid data \"([^\"]*)\" and \"([^\"]*)\" clicks on sign in button$")
	public void user_provides_the_valid_data_user_and_pswrd_clicks_on_sign_in_button(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.out.println("entered the correct data and clicked on login");
		System.out.println("user ready with the data");
		driver.findElement(By.name("userName")).sendKeys(arg1);
		driver.findElement(By.name("password")).sendKeys(arg2);
		driver.findElement(By.name("login")).click();
	}

	@Then("^User Should be logged into the system$")
	public void user_Should_be_logged_into_the_system() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("user is on the login page");
		String Str= driver.findElement(By.linkText("SIGN-OFF")).getText();
		if (Str.equals("SIGN-OFF"))
		{
			System.out.println("user logged in");
		}
		else
			System.out.println("user provided the invalid credentials");
	}
	@Given("^the following users exists$")
	public void the_following_users_exists(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	   // throw new PendingException();
		List<List<String>> data = arg1.raw();
		System.out.println(data.get(0).get(0));
		System.out.println(data.get(0).get(1));
}
}