package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import io.cucumber.java.el.*;
import io.cucumber.java.en.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.onlineShoppingPage;

public class onlineShoppingSteps {


	WebDriver driver = null;

	static onlineShoppingPage reg;

	@Given("AdvantageDemo Online Shopping App")
	public void advantage_demo_online_shopping_app() {
		reg =new onlineShoppingPage(driver);
		System.out.println("User inside the browser");

		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is : "+projectPath);

		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.navigate().to("http://advantageonlineshopping.com/#/");
		System.out.println("User is on Advantage online shopping App");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);		
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

	}

	@And("User clicks on NewUser")
	public void user_clicks_on_NewUser() throws InterruptedException {
		reg =new onlineShoppingPage(driver);
		reg.clickUserReg();
		Thread.sleep(2000);
	}

	@And("User click on Create Account")
	public void user_click_on_create_account() throws InterruptedException  {
		Thread.sleep(2000);
		System.out.println(driver.switchTo().activeElement().getText());
		reg.clickNewAcc();

	}
	@When("^User enters (.*), (.*), (.*) and (.*)$")
	public void user_enters_un_PWD_email(String username, String password, String email, String confirmPWD) throws InterruptedException
	{
		//			System.out.println(driver.switchTo().activeElement().getText());
		reg.enterUsername(username);
		Thread.sleep(2000);
		reg.enterEmail(email);
		Thread.sleep(1000);
		reg.enterPassword(password);
		Thread.sleep(1000);
		reg.enterConfirmPWD(confirmPWD);
		Thread.sleep(2000);
	}


	@And("User select I Agree option")
	public void user_select_i_agree_option() throws InterruptedException {
		reg.selectIagree();
		Thread.sleep(1000);

	}

	@Then("User click on Register button")
	public void user_click_on_register_button() throws InterruptedException {
		Thread.sleep(2000);
		reg.clickRegister();
		driver.close();
		driver.quit();
	}


	@And("^User enters login details (.*) and (.*)$")
	public void user_enters_user_n_and_pass_w(String userN, String passW) throws InterruptedException {
		Thread.sleep(2000);
		reg.enteruserN(userN);
		reg.enterPWD(passW);

	}

	@And("User click on SIGN IN button")
	public void user_click_on_button() throws InterruptedException {
		reg.clickSign();
		Thread.sleep(2000);
	}

	@When("user click on seauch options")
	public void user_click_on_seauch_options() {
		reg.prodSearch();
	}

	@Then("^User should be able search for (.*)$")
	public void user_search_for(String products) throws InterruptedException {
		Thread.sleep(1000);
		reg.eneterProd(products);
		reg.eneterKey();
//		reg.prodSearch();
//		reg.checkProd();
		Thread.sleep(3000);
		reg.closeSearch();
		Thread.sleep(3000);
	}

	@Given("User is on list of products")
	public void User_is_on_list() throws InterruptedException {
		Thread.sleep(2000);
//		driver.switchTo().
//		reg.checkProd();
		

	}

	@When("User click on the product")
	public void user_click_on_the_product() throws InterruptedException {
		Thread.sleep(3000);
////		System.out.println(driver.switchTo().activeElement().getText());
//		  for (String winHandle : driver.getWindowHandles()) 
//		        driver.switchTo().window(winHandle);
//		
//		Int size = driver.findElements(By.tagName("iframe")).size();
//		System.out.println(size);
//		String currentWindow = driver.getWindowHandle();
//		driver.switchTo().window(currentWindow);
		System.out.println(reg.searchResults());
		reg.clickCARTIcon();
	}

	@Then("User should be able to add the products to CART")
	public void user_should_be_able_to_add_the_products_to_cart() {
		reg.addtoCARD();
		
	}

	@Given("User is on CART")
	public void user_is_on_cart() {
		reg.clickCART();

	}

	@And("User click on CHECKOUT")
	public void user_click_on_checkout() {
		reg.ClickCKHECOUT();
	}

	@And("User is able to ORDER PAYMENT screen")
	public void user_is_able_to_order_payment_screen() {
		reg.verifyHeader();

	}

	@When("click on Next button")
	public void click_on_next_button() {
			reg.clickNext();
			reg.confirmProd();

	}

	@And("User will select payment option as SafePay")
	public void user_will_see_payment_method_options() {
		
		reg.selectPAYOption();
	}

	@And("User click on Paynow button")
	public void user_click_on_paynow_button() {
		reg.clickPaynow();

	}

	@Then("User should see ORDER PAYMENT screen")
	public void user_should_see_order_payment_screen() {
			reg.verifyHeader();

	}

	@And("User should see {string} message")
	public void user_should_see_message(String string) {
		reg.checkSuccessmsg();

	}

	
}
