package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TasksPage {
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNew;
	
	@FindBy(xpath="//div[text()='+ New Project']")
	private WebElement newProject;
	
	@FindBy(xpath="(//input[@placeholder='Enter Project Name'])[2]")
	private WebElement enterProName;
	
	@FindBy(xpath="(//div[@class='selectedItem'])[15]")
	private WebElement customer;
	
@FindBy(xpath="(//div[text()='Our company'])[10]")
private WebElement ourcomDD;
	
	@FindBy(xpath="//textarea[@placeholder='Add Project Description']")
	private WebElement addproDes;
	
	@FindBy(xpath="//div[text()='Create Project']")
	private WebElement createproBtn;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[1]")
	private WebElement text;
	
	public WebElement getText() {
		return text;
	}

	public TasksPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddNew() {
		return addNew;
	}

	public WebElement getNewProject() {
		return newProject;
	}

	public WebElement getEnterProName() {
		return enterProName;
	}

	public WebElement getCustomer() {
		return customer;
	}

	public WebElement getOurcomDD() {
		return ourcomDD;
	}

	public WebElement getAddproDes() {
		return addproDes;
	}

	public WebElement getCreateproBtn() {
		return createproBtn;
	}
	

}
