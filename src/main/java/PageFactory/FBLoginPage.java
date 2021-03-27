package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBLoginPage {

	WebDriver driver;
	public FBLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='email']")
	private WebElement FBusername;
	
	@FindBy(xpath="//input[@id='pass']")
	private WebElement FBpassword;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement FBSubmit;
	
	public void enter_UserName(String username) {
		FBusername.sendKeys(username);
	}
    public void enter_Password(String password) {
		FBpassword.sendKeys(password);
	}
    
    public void click_loginButton() {
    	FBSubmit.click();
    }
		
}

