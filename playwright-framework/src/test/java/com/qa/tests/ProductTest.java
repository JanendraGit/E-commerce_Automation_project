package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.pages.ProductPage;

public class ProductTest extends BaseTest {

    @Test
    public void testProduct() {

        ProductPage productPage = new ProductPage(page);

        productPage.clickProductBtn();

        productPage.isAllProductsVisible();

        productPage.isCategoryListVisible();

        productPage.clickViewFirstProduct();

        productPage.isProductDetailsVisible();
    }
}
