package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.pages.ProductAndCartPage;

public class ProductAndCartTest extends BaseTest {

    @Test
    public void verifyAddProductsToCart() {

        ProductAndCartPage productPage = new ProductAndCartPage(page);

        Assert.assertTrue(page.title().contains("Automation Exercise"));

        productPage.clickProducts();

        productPage.clickviewProduct();

        productPage.clickAddToCart();

        productPage.clickContinueShopping();

        productPage.clickViewCart();

        Assert.assertEquals(productPage.getCartItemCount(), 1, "Cart item count should be 1");

        Assert.assertEquals(productPage.getPrice(0), "Rs. 500", "Price should be Rs. 500");

        Assert.assertEquals(productPage.getQuantity(0), "1", "Quantity should be 1");

        Assert.assertEquals(productPage.getTotal(0), "Rs. 500", "Total should be Rs. 500");


    }
}