package com.pageexe;

import org.junit.Test;
import org.openqa.selenium.By;

import com.base.JunitBaseClass;
import com.locators.LoginPageLocators;

public class LoginPageExe extends LoginPageLocators {

	
	@Test
	public void username() {
	//	LoginPageExe lp = new LoginPageExe();
		JunitBaseClass.sendkeys(new LoginPageLocators().getusername(), JunitBaseClass.propertiesRead("username"));
		//JunitBaseClass.sendkeys(lp.getusername(), JunitBaseClass.propertiesRead(null));
	}

	@Test
	public void epassword() {
		JunitBaseClass.sendkeys(new LoginPageLocators().getpassword(), JunitBaseClass.propertiesRead("password"));
	}

	@Test
	public void loginButton() {
		JunitBaseClass.click(new LoginPageLocators().getlogin());
	}

}
