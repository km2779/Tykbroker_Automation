package stepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Pages.elementsE2E;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;


public class loginE2E {
	
	WebDriver driver;
	elementsE2E e2e;

	
	@Before
	public void testSetup() {
		
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "//Users/stagewood/Desktop//Eclipse/chromedriver_mac64//chromedriver");
		
		driver = new ChromeDriver();
		
		e2e = new elementsE2E(driver);

		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);		
	}
	
	@After
	public void tearDown() {
		
		//driver.quit();
	}
	
	@Given("user is on the main page")
	public void user_is_on_the_main_page() {
	    driver.get("https://tykbroker.com");
	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/button[1]")).click();
	    
	}
	
	@When("user clicks on the [-enroll-] link")
	public void user_clicks_on_the_enroll_link() {
		e2e.getEnrollPageLink().click();
	    //Actions act = new Actions(driver);
	    //act.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/button"))).click().build().perform();
	    
	}

	@When("user clicks on [-Log in with Tyket-]")
	public void user_clicks_on_log_in_with_tyket() {
		driver.get("https://tykbroker.com/enroll");
	    e2e.getLogInWithTyketButton().click();
	    //Actions act = new Actions(driver);
	    //act.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/button"))).click().build().perform();
	  
	    
	}

	@Then("user is directed to the QR LOGIN PAGE")
	public void user_is_directed_to_the_qr_login_page() {
	    String expectedURL = "https://tykbroker.com/qr";
	    String actualURL = driver.getCurrentUrl();
	    
	    Assert.assertEquals(expectedURL, actualURL);
	}

	@Then("user clicks on [-LOG IN ANOTHER WAY INSTEAD-]")
	public void user_clicks_on_log_in_another_way_instead() throws InterruptedException {
		e2e.getLogInAnotherWayInsteadButton().click();

	}

	@Then("user is directed to the LOGIN PAGE")
	public void user_is_directed_to_the_login_page() {
	    String expectedURL = "https://tykbroker.com/login";
	    String actualURL = driver.getCurrentUrl();
	    
	    Assert.assertEquals(expectedURL, actualURL);

	}

	@When("user enters Email address")
	public void user_enters_email_address() {
	    //e2e.getEmail().sendKeys("khaladmahabub96@gmail.com");
		e2e.getEmail().sendKeys("khaladmahabub96@gmail.com");

	}

	@When("user enters password")
	public void user_enters_password() {
		e2e.getPassword().sendKeys("Khamahab890!!!");

	}

	@When("user clicks clicks on [-LOGIN-] button")
	public void user_clicks_clicks_on_login_button() {
	    e2e.getLogInButton().click();

	}

	@Then("user successfully logs in")
	public void user_successfully_logs_in() {
	    // Write code here that turns the phrase above into concrete actions

	}
	
	@When("user clicks on [-Watch Video-]")
	public void user_clicks_on_watch_video() throws InterruptedException {
		e2e.getWatchNowButton().click();
		Thread.sleep(3000);
	

	}

	@Then("video should play")
	public void video_should_play() {
	    // Write code here that turns the phrase above into concrete actions

	}

	@When("user clicks on [-TOP LOGIN BUTTON \\(door)-]")
	public void user_clicks_on_top_login_button_door() {
		e2e.getTopLogInButton().click();

	}

	@Then("user should be on https:\\/\\/tykbroker.com\\/qr")
	public void user_should_be_on_https_tykbroker_com_qr() {
	    // Write code here that turns the phrase above into concrete actions

	}
	
	@Then("user should click on MyBusiness")
	public void user_should_click_on_MyBusiness() throws InterruptedException {
	//Thread.sleep(5000);
	   e2e.getMyBusinessButton().click();
	}

}
