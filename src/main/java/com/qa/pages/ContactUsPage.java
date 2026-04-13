package com.qa.pages;

import java.nio.file.Path;

import com.microsoft.playwright.Page;

public class ContactUsPage {

    private Page page;

    
    private String contactUsBtn = "//a[normalize-space()='Contact us']";
    private String nameInputContact = "input[data-qa='name']";
    private String emailInputContact = "input[data-qa='email']";
    private String subjectInputContact = "input[data-qa='subject']";   
    private String messageInputContact = "textarea[data-qa='message']";
    private String uploadFileInputContact = "//input[@name='upload_file']";
    private String submitBtnContact = "input[data-qa='submit-button']";

    public ContactUsPage(Page page) {
        this.page = page;
    }

    public void clickContactUs() {
        page.click(contactUsBtn);
    }

    public void fillContactForm(String name, String email, String subject, String message) {
        page.fill(nameInputContact, name);
        page.fill(emailInputContact, email);
        page.fill(subjectInputContact, subject);
        page.fill(messageInputContact, message);
    }

    public void uploadFile(Path filePath) {
        page.setInputFiles(uploadFileInputContact, filePath);
    }

    public void clickSubmit() {
        page.click(submitBtnContact);
    }

}
