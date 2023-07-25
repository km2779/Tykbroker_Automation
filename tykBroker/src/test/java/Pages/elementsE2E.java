package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class elementsE2E {
	
WebDriver driver;
	
	public elementsE2E() {
	}
	
	public elementsE2E(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getEnrollPageLink() {
		WebElement enrollPageLink = driver.findElement(By.xpath("/html/body/div[1]/footer/div[2]/div/div/div[2]/a[3]/p"));
		return enrollPageLink;
	}
	
	public WebElement getLogInWithTyketButton() {
		WebElement tyketButton = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/button"));
		
		return tyketButton;
	}
	
	public WebElement getLogInAnotherWayInsteadButton() {
		WebElement logInAnotherWayInsteadButton = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/div[5]/button"));
		
		return logInAnotherWayInsteadButton;
	}
	
	public WebElement getEmail() {
		WebElement email = driver.findElement(By.xpath("(//input[@id='email'])[1]"));
		return email;
	}
	
	public WebElement getPassword() {
		WebElement password = driver.findElement(By.xpath("(//input[@id='password'])[1]"));
		return password;
	}
	
	public WebElement getLogInButton() {
		WebElement logInButton = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/form[1]/button[1]"));
		return logInButton;
	}
	
	public WebElement getWatchNowButton() {
		WebElement watchNowButton = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/button"));
		
		return watchNowButton;
	}
	
	public WebElement getTopLogInButton() {
		WebElement topLogInButton = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[3]/button[3]"));
		
		return topLogInButton;
	}
	
	public WebElement getMyBusinessButton() {
		//WebElement tykbroker = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/button/text()"));
		//WebElement myBusiness = driver.findElement(By.cssSelector("button.MuiButton-root.MuiButton-contained[type='button']"));
		//WebElement myBusiness = driver.findElement(By.xpath("//button[contains(@class,'MuiButton-root') and contains(@class,'MuiButton-contained') and @type='button']"));
		WebElement myBusiness = driver.findElement(By.className("jss263"));
		return myBusiness;
	}

}
