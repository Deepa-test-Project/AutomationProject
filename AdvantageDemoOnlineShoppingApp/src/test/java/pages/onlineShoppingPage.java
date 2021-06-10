package pages;

import javax.xml.xpath.XPathExpression;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class onlineShoppingPage {

	protected WebDriver driver;

	private By txt_userICON=By.xpath("//a[contains(@id,'menuUserLink')]");
	private By txt_newACC=By.xpath("//*[@class ='create-new-account ng-scope']");
	private By txt_username=By.name("usernameRegisterPage");
	private By txt_password=By.name("passwordRegisterPage");
	private By txt_email=By.xpath("//input[@name='emailRegisterPage']");
	private By txt_confimPWD=By.name("confirm_passwordRegisterPage");
	private By txt_iAgree=By.xpath("//*[contains(@name,'i_agree')]");
	private By btn_register=By.xpath("//*[contains(@id,'register_btnundefined')]");
	private By txt_userN=By.name("username");
	private By txt_passW=By.name("password");
	private By btn_Sign=By.id("sign_in_btnundefined");
	private By icon_Search=By.id("menuSearch");
	private By txt_Search=By.xpath("//*[contains(@id,'autoComplete')]");
	private By txt_CloseSearch=By.xpath("//*[contains(@data-ng-click,'closeSearchForce()')]");

//	private By txt_prodcut = By.xpath("*//img[@id='6']/@src");
	
	private By txt_prodcut = By.xpath("//a[contains(@id,'menuUserLink')]/../../../../..//*[@class ='imgProduct']");
	private By btn_serachresults=By.id("searchResultLabel");
	private By btn_clickCART=By.id("6");
	
	private By btn_CART=By.name("save_to_cart");	
	private By btn_menucart=By.xpath("//a[contains(@id,'shoppingCartLink')]");
	private By btn_Chekout=By.id("checkOutPopUp");
	private By txt_Hder=By.xpath("//*[contains(text(),'ORDER PAYMENT')]");
	private By btn_Next=By.id("next_btn");
	private By btn_Radiobtn=By.name("safepay");
	private By btn_Paynow=By.id("pay_now_btn_SAFEPAY");
	private By txt_confirmProd=By.xpath("//h3[contains(text(),'HP ENVY X360')]");
	private By txt_SucccessMSG=By.xpath("//*[contains(text(),'Thank you')]");
	

	public onlineShoppingPage(WebDriver driver)
	{
		this.driver = driver;
	}

	public void clickUserReg()
	{
		driver.findElement(txt_userICON).click();
	}
	public void clickNewAcc()
	{
		driver.findElement(txt_newACC).click();
	}

	public void enterUsername(String username)
	{
		driver.findElement(txt_username).sendKeys(username);

	}
	public void enterEmail(String email)
	{
		driver.findElement(txt_email).sendKeys(email);

	}
	public void enterPassword(String password)
	{
		driver.findElement(txt_password).sendKeys(password);

	}
	
	public void enterConfirmPWD(String confirmPWD)
	{

		driver.findElement(txt_confimPWD).sendKeys(confirmPWD);
		
	}
	public void selectIagree()
	{
		driver.findElement(txt_iAgree).click();
	}

	public void clickRegister()
	{
		driver.findElement(btn_register).click();
	}
	public void enteruserN(String userN)
	{
		driver.findElement(txt_userN).sendKeys(userN);
	}
	public void enterPWD(String passW)
	{
		driver.findElement(txt_passW).sendKeys(passW);
	}
	
	public void clickSign()
	{
		driver.findElement(btn_Sign).click();
	}
	
	public void prodSearch()
	{
		driver.findElement(icon_Search).click();
	}
	
	public void eneterProd(String products)
	{
		driver.findElement(txt_Search).clear();
		driver.findElement(txt_Search).sendKeys(products);
	}
	
	public void eneterKey()
	{
		driver.findElement(txt_Search).sendKeys(Keys.ENTER);
	}
	
	public void closeSearch()
	{
		driver.findElement(txt_CloseSearch).click();
	}
	
		
	public boolean checkProd()
	{
		driver.findElement(txt_prodcut).getText();
		return false;
	}
	
	
	public void selectProd()
	{
		driver.findElement(txt_prodcut).click();
	}
	
	public void addtoCARD()
	{
		driver.findElement(btn_CART).click();
	}
	
	public void clickCART()
	{
		driver.findElement(btn_menucart).click();
	}
	
	public void ClickCKHECOUT()
	{
		driver.findElement(btn_Chekout).click();
	}
	
	public void verifyHeader()
	{
		driver.findElement(txt_Hder).getText();
	}
	
	public void clickNext()
	{
		driver.findElement(btn_Next).click();
	}
	
	public void selectPAYOption()
	{
		driver.findElement(btn_Radiobtn).click();
	}
	
	public void clickPaynow()
	{
		driver.findElement(btn_Paynow).click();
	}
	
	public void confirmProd()
	{
		driver.findElement(txt_confirmProd).getText();
	}
	
	public void checkSuccessmsg()
	{
		driver.findElement(txt_SucccessMSG).getText();
	}
	public boolean searchResults()
	{
		driver.findElement(btn_serachresults).getText();
		return false;
	}
	public void clickCARTIcon()
	{
		driver.findElement(btn_clickCART).click();
		
	}
	
}
