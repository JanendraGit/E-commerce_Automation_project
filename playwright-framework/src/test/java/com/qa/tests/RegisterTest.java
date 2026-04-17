package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.pages.RegisterPage;

public class RegisterTest extends BaseTest{
    
    @Test
    public void testUserRegistration() {
        
        RegisterPage registerPage = new RegisterPage(page);

        Assert.assertTrue(page.title().contains("Automation Exercise"));

        registerPage.clickSignupLogin();

        Assert.assertTrue(page.locator("text=New User Signup!").isVisible());

        String email = "test" + System.currentTimeMillis() + "@gmail.com";
        registerPage.enterSignupDetails("Test User", email);

        Assert.assertTrue(page.locator("text=Enter Account Information").isVisible());    

        registerPage.fillAccountInfo();

        registerPage.fillAddressDetails();

        registerPage.clickCreateAccount();

        registerPage.clickContinue();

        registerPage.deleteAccount();

        Assert.assertTrue(page.locator("text=ACCOUNT DELETED!").isVisible());
        registerPage.clickDeleteAccountcontinue();

        System.out.println("Register Test Completed Successfully");


    }
}
