package com.qa.pages;

import com.microsoft.playwright.Page;

public class RegisterPage {

    private Page page;

    // Locators
    private String signupLoginBtn = "a[href='/login']";
    private String nameInput = "input[data-qa='signup-name']";
    private String emailInput = "input[data-qa='signup-email']";
    private String signupBtn = "button[data-qa='signup-button']";

    private String titleMr = "#id_gender1";
    private String password = "#password";
    private String day = "#days";
    private String month = "#months";
    private String year = "#years";

    private String newsletter = "#newsletter";
    private String offers = "#optin";

    private String firstName = "#first_name";
    private String lastName = "#last_name";
    private String company = "#company";
    private String address1 = "#address1";
    private String address2 = "#address2";
    private String country = "#country";
    private String state = "#state";
    private String city = "#city";
    private String zipcode = "#zipcode";
    private String mobile = "#mobile_number";

    private String createAccountBtn = "button[data-qa='create-account']";
    private String continueBtn = "a[data-qa='continue-button']";
    private String deleteBtn = "a[href='/delete_account']";
    private String deleteContinueBtn = "a[data-qa='continue-button']";
    private String logoutBtn = "//a[normalize-space()='Logout']";

    public RegisterPage(Page page) {
        this.page = page;
    }

    // Actions
    public void clickSignupLogin() {
        page.click(signupLoginBtn);
    }

    public void enterSignupDetails(String name, String email) {
        page.fill(nameInput, name);
        page.fill(emailInput, email);
        page.click(signupBtn);
    }

    public void fillAccountInfo() {
        page.click(titleMr);
        page.fill(password, "123456");

        page.selectOption(day, "10");
        page.selectOption(month, "5");
        page.selectOption(year, "2000");

        page.check(newsletter);
        page.check(offers);
    }

    public void fillAddressDetails() {
        page.fill(firstName, "John");
        page.fill(lastName, "Doe");
        page.fill(company, "ABC Company");
        page.fill(address1, "Street 1");
        page.fill(address2, "Street 2");
        page.selectOption(country, "India");
        page.fill(state, "Western");
        page.fill(city, "Colombo");
        page.fill(zipcode, "10000");
        page.fill(mobile, "0712345678");
    }

    public void clickCreateAccount() {
        page.click(createAccountBtn);
    }

    public void clickContinue() {
        page.click(continueBtn);
    }

    public void deleteAccount() {
        page.click(deleteBtn);
    }

    public void clickDeleteAccountcontinue() {
        page.click(deleteContinueBtn);
    }

        public void clickLogout() {
            page.click(logoutBtn);
        }

}
