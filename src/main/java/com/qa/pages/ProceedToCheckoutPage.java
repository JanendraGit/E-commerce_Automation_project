package com.qa.pages;

import com.microsoft.playwright.Page;

public class ProceedToCheckoutPage {

    private Page page;

    private String productsBtn = "a[href='/products']";
    private String viewProduct = "//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[2]//ul[1]//li[1]//a[1]";
    private String addToCartBtns = "//button[@type='button']";
    private String continueShopping = "text=Continue Shopping";
    private String clickCartBtn = "//a[normalize-space()='Cart']";
    private String proceedToCheckoutBtn = "//a[@class='btn btn-default check_out']";
    //private String commentSection = "//textarea[@name='message']";
    private String placeOrderBtn = "//a[@class='btn btn-default check_out']";

    public ProceedToCheckoutPage(Page page) {
        this.page = page;
    }
    public void clickProducts() {
        page.click(productsBtn);
    }

    public void clickviewProduct() {
        page.click(viewProduct);
    }

    public void clickAddToCart() {
        page.click(addToCartBtns);
    }

    public void clickContinueShopping() {
        page.click(continueShopping);
    }

    public void clickCart() {
        page.click(clickCartBtn);
    }

    public void clickProceedToCheckout() {
        page.click(proceedToCheckoutBtn);
        page.waitForLoadState();
    }

    // public void enterComment(String comment) {
    //     page.fill(commentSection, comment);
    // }

    public void clickPlaceOrder() {
        page.click(placeOrderBtn);
    }

}
