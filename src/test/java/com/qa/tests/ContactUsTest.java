package com.qa.tests;

import java.nio.file.Path;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.pages.ContactUsPage;

public class ContactUsTest extends BaseTest {

    @Test
    public void testContactUs() {

        ContactUsPage contactUsPage = new ContactUsPage(page);

        contactUsPage.clickContactUs();

        Assert.assertTrue(page.locator("text=Get In Touch").isVisible(), "Contact Us form should be visible after clicking Contact Us");
        contactUsPage.fillContactForm("Test User", "testuser@example.com", "Test Subject", "Test Message");

        // Assuming you have a test file in the resources folder
        String filePath = "src/main/java/com/qa/utils/ConfigReader.java"; // Update this path to your actual test file

        contactUsPage.uploadFile(Path.of(filePath));

        contactUsPage.clickSubmit();
    }
}
