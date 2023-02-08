package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage {
@FindBy(id="logoutLink")
private WebElement lgOut;

@FindBy(xpath="//div[text()='Tasks']")
private WebElement tasks;

public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void setLogout() {
	Reporter.log("Logout",true);
	lgOut.click();

}
public void setTasks() {
	Reporter.log("setTasks",true);
	tasks.click();
}
}
