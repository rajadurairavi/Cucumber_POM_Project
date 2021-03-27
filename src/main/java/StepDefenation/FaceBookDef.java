package StepDefenation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.FBLoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FaceBookDef {

	WebDriver driver;
	FBLoginPage FBpage;
	
	
	@Given("^Humnan launch browser and get \"([^\"]*)\"$")
	public void humnan_launch_browser_and_get(String url) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get(url);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("^Human enters username \"([^\"]*)\"$")
	public void human_enters_username(String username) throws Throwable {
	    FBpage = new FBLoginPage(driver);
	    FBpage.enter_UserName(username);
	}

	@When("^Human enters password \"([^\"]*)\"$")
	public void human_enters_password(String password) throws Throwable {
	    FBpage.enter_Password(password);
	}

	@When("^Human clicks on login button$")
	public void human_clicks_on_login_button() throws Throwable {
	    FBpage.click_loginButton();
	}

	@Then("^Human is getting logout from the page$")
	public void human_is_getting_logout_from_the_page() throws Throwable {
	    driver.quit();
	}
}
