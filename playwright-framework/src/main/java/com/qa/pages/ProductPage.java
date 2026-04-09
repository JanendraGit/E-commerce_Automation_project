package com.qa.pages;

import com.microsoft.playwright.Page;

public class ProductPage {

    private Page page;

    private String productBtn = "//a[@href='/products']";
    private String allProduct = "//h2[@class='title text-center']";
    private String categoryList = "//h2[normalize-space()='Category']";
    private String viewProduct = "//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[2]//ul[1]//li[1]//a[1]";

    // Product Detail Page
    private String productName = "//h2[normalize-space()='Blue Top']";
    private String category = "//p[normalize-space()='Category: Women > Tops']";
    private String price = "//span[normalize-space()='Rs. 500']";
    private String availability = "//b[normalize-space()='Availability:']";
    private String condition = "//b[normalize-space()='Condition:']";
    private String brand = "//b[normalize-space()='Brand:']";

    public ProductPage(Page page) {
        this.page = page;
    }

    public void clickProductBtn() {
        page.click(productBtn);
    }

    public boolean isAllProductsVisible() {
        return page.locator(allProduct).isVisible();
    }

    public boolean isCategoryListVisible() {
        return page.locator(categoryList).isVisible();
    }

    public void clickViewFirstProduct() {
        page.click(viewProduct);
    }

    public boolean isProductDetailsVisible() {
        return page.locator(productName).isVisible() &&
               page.locator(category).isVisible() &&
               page.locator(price).isVisible() &&
               page.locator(availability).isVisible() &&
               page.locator(condition).isVisible() &&
               page.locator(brand).isVisible();
    }


}
