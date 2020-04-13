package codeCharge.stepDefination;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Codecharge.utility.Browserfactory;
import com.Codecharge.utility.ConfigReader;
import com.Codecharge.utility.ExcelDataConfig;
import com.Codecharge.utility.Screenshot;

import codeCharge.Pages.EmployeesList;
import codeCharge.Pages.Loginpage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

/**
 * class created to write test cases for login,navigating to url,doing some operations and logout.
 * @author Lakshmi Durga
 *
 */

public class Employees 
        {
	/*ConfigReader config=new ConfigReader();

    WebDriver driver;

    
    ExcelDataConfig configExcel=new ExcelDataConfig(config.getExcelpath());

     
    Loginpage page = new Loginpage(driver);

   
    EmployeesList page2=new EmployeesList(driver);

    Logger logger;

      
    Screenshot scrn1=new Screenshot();
    
    @Given("^it launches to next page$")
      /**
	 * method to open browser
	 * @throws Throwable
	 */
    public void it_launches_to_next_page() throws Throwable 
     {
    
    Browserfactory browser=new Browserfactory();
   	logger=Logger.getLogger("ValidLogin");
   	PropertyConfigurator.configure("log4j.properties");
    driver=browser.startBrowser("chrome", config.getApplicationURL1());
   	logger.info("Chrome Opened"); 
    }
    
     
     @When("^I select employees$")
         /**
	 * method to select employees
	 */
     public void i_select_employees() throws Throwable {
    	  page=PageFactory.initElements(driver, Loginpage.class);
	      page2=PageFactory.initElements(driver, EmployeesList.class);
	      page.administration();
	      page2.clickOnEmployees();
	   }

     
     @When("^I select addemployees$")
       /**
	 * method to select Addemployees
	 */
     public void i_select_addemployees() throws Throwable {
    	 page2.clickOnAddemployees();
     }

    
     @When("^I select the \"([^\"]*)\" and \"([^\"]*)\"$")
          /**
	 * method to select EmployeeFullnameAndMail
	 */
     public void i_select_the_and(String arg1, String arg2) throws Throwable {
    	 page2.EmployeeFullnameAndMail(arg1, arg2);
     }

     
     @When("^I select \"([^\"]*)\" and \"([^\"]*)\"$")
          /**
	 * method to select UserNameAndPassword
	 */
     public void i_select_and(String arg1, String arg2) throws Throwable {
    	 page2.typeUserNameAndPassword("Cognizant", "cts1234");
     }
     
     @When("^I select type of groupid$")
          /**
	 * method to select descriptionemployee
	 */
     public void i_select_type_of_groupid() throws Throwable {
    	 Select drpemployee=new Select(driver.findElement(By.name("security_group_id")));
    	 drpemployee.selectByVisibleText("Admin");
     }

     
     @When("^I click on add the details are entered successfully$")
          /**
	 * method to select clickOnLoginButton
	 */
     public void i_click_on_add_the_details_are_entered_successfully() throws Throwable {
    	 page2.clickOnLoginButton();
     }
     
     @When("^application shows the entered details$")
          /**
	 * method to select page2
	 */
     public void application_shows_the_entered_details() throws Throwable {
    	 page2.next();
     }
     
     @When("^we are taking the screenshot$")
          /**
	 * method to get Screenshot
	 */
     public void we_are_taking_the_screenshot(DataTable arg1) throws Throwable {
    	 scrn1.getScreenshot(driver);
     }*/
}
