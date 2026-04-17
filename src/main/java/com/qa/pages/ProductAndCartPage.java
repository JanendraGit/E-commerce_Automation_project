package com.qa.pages;

import com.microsoft.playwright.Page;

public class ProductAndCartPage {

    private Page page;

    // Locators
    private String productsBtn = "a[href='/products']";
    private String viewProduct = "//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[2]//ul[1]//li[1]//a[1]";
    private String addToCartBtns = "//button[@type='button']";
    private String continueShopping = "text=Continue Shopping";
    private String CartBtn = "body > header:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)";

    // Cart locators
    private String cartItems = ".cart_info tbody tr";
    private String price = ".cart_price p";
    private String quantity = ".cart_quantity button";
    private String total = ".cart_total_price";

    public ProductAndCartPage(Page page) {
        this.page = page;
    }

    // Actions
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

    public void clickViewCart() {
        page.click(CartBtn);
    }

    // Validations
    public int getCartItemCount() {
        return page.locator(cartItems).count();
    }

    public String getPrice(int index) {
        return page.locator(price).nth(index).textContent();
    }

    public String getQuantity(int index) {
        return page.locator(quantity).nth(index).textContent();
    }

    public String getTotal(int index) {
        return page.locator(total).nth(index).textContent();
    }
}