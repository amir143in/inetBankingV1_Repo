package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {

	WebDriver ldriver;

	public AddCustomerPage(WebDriver rdriver) {

		this.ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'New Customer')]")
	@CacheLookup
	WebElement lnkAddNewCustomer;

	@FindBy(how = How.NAME, using = "name")
	@CacheLookup
	WebElement txtCustomerName;

	@FindBy(how = How.XPATH, using = "//input[@value='m']")
	@CacheLookup
	WebElement maleGender;
	
	@FindBy(how = How.XPATH, using = "//input[@value='f']")
	@CacheLookup
	WebElement femaleGender;
	
	@FindBy(how = How.ID_OR_NAME, using = "dob")
	@CacheLookup
	WebElement txtdob;

	@FindBy(how = How.NAME, using = "addr")
	@CacheLookup
	WebElement txtaddress;

	@FindBy(how = How.NAME, using = "city")
	@CacheLookup
	WebElement txtcity;

	@FindBy(how = How.NAME, using = "state")
	@CacheLookup
	WebElement txtstate;

	@FindBy(how = How.NAME, using = "pinno")
	@CacheLookup
	WebElement txtpinno;

	@FindBy(how = How.NAME, using = "telephoneno")
	@CacheLookup
	WebElement txttelephoneno;

	@FindBy(how = How.NAME, using = "emailid")
	@CacheLookup
	WebElement txtemailid;

	@FindBy(how = How.NAME, using = "password")
	@CacheLookup
	WebElement txtpassword;

	@FindBy(how = How.NAME, using = "sub")
	@CacheLookup
	WebElement btnSubmit;

	// Now creating a method for all the webelements
	public void clickAddNewCustomer() {
		lnkAddNewCustomer.click();

	}

	public void custName(String cname) {
		txtCustomerName.sendKeys(cname);

	}

	public void custgenderMale(String mgender) {
		maleGender.click();
	}
	
	public void custgenderfemale(String fgender) {
		femaleGender.click();
	}
	
	public void gender(String gender) {
		try {
			if(gender.equalsIgnoreCase("male")) {
				maleGender.click();
			} else if(gender.equalsIgnoreCase("female")){
				femaleGender.click();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Gender is incorrect");
		}
	}
	
	public void custdob1(String dd, String mm, String yyyy) {
		txtdob.sendKeys(dd);
		txtdob.sendKeys(mm);
		txtdob.sendKeys(yyyy);
	}

	public void custdob(String ddmmyyyy) {
		txtdob.sendKeys(ddmmyyyy);

	}

	public void custaddress(String caddress) {
		txtaddress.sendKeys(caddress);
	}

	public void custcity(String ccity) {
		txtcity.sendKeys(ccity);
	}

	public void custstate(String cstate) {
		txtstate.sendKeys(cstate);
	}

	public void custpinno(String cpinno) {
		txtpinno.sendKeys(String.valueOf(cpinno));
	}

	public void custtelephoneno(String ctelephoneno) {
		txttelephoneno.sendKeys(ctelephoneno);
	}

	public void custemailid(String cemailid) {
		txtemailid.sendKeys(cemailid);
	}

	public void custpassword(String cpassword) {
		txtpassword.sendKeys(cpassword);
	}

	public void custsubmit() {
		btnSubmit.click();
	}

}
