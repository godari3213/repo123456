package cucumber1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserRegistration {
WebDriver driver;

@Given("^application url$")
public void application_url() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   // throw new PendingException();
	System.setProperty("webdriver.chrome.driver", "C://Drivers//Drivers//chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://www.newtours.demoaut.com/");	
	System.out.println("driver.getTitle()");
}


@When("^site is up and runing$")
public void site_is_up_and_runing() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   // throw new PendingException();
}

@When("^user clicks on register button valid data$")
public void user_clicks_on_register_button_valid_data() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   // throw new PendingException();
}

@Then("^registration form should be opened$")
public void registration_form_should_be_opened() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   // throw new PendingException();
}

@Given("^user having data$")
public void user_having_data() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   // throw new PendingException();
}

@When("^data is accurate$")
public void data_is_accurate() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}

@When("^user provides the correct data \"([^\"]*)\" and \"([^\"]*)\" correctly$")
public void user_provides_the_correct_data_and_correctly(String arg1, String arg2) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   // throw new PendingException();
}

@Given("^success page url$")
public void success_page_url() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   // throw new PendingException();
}

@When("^page having usernem$")
public void page_having_usernem() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   // throw new PendingException();
}

@When("^user name appearing$")
public void user_name_appearing() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
  //  throw new PendingException();
}

@Then("^fetch it and store it$")
public void fetch_it_and_store_it() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   // throw new PendingException();
}
}