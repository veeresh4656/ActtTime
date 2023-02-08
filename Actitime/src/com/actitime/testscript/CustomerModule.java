package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TasksPage;
@Listeners(com.actitime.generic.ListnersImplementation.class)
public class CustomerModule extends BaseClass {
@Test
	public void createProject() throws EncryptedDocumentException, IOException {
		Reporter.log("createProject",true);
		HomePage h=new HomePage(driver);
		h.setTasks();
		TasksPage t=new TasksPage(driver);
		t.getAddNew().click();
	t.getNewProject().click();
	FileLib f=new FileLib();
	String data = f.getExcelData("customer", 1, 4);
	t.getEnterProName().sendKeys(data);
	t.getCustomer().click();
	t.getOurcomDD().click();
	String des = f.getExcelData("customer", 1, 5);
    t.getAddproDes().sendKeys(des);
    t.getCreateproBtn().click();
    WebDriverWait wait =new WebDriverWait(driver, 20);
    wait.until(ExpectedConditions.textToBePresentInElement(t.getText(), data));
   String ares = t.getText().getText();
   Assert.assertEquals(ares,data);

	
	
	}
}
