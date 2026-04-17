package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.pages.ProceedToCheckoutPage;

public class ProceedToCheckoutTest extends BaseTest {

    @Test
    public void testProceedToCheckout() {

        ProceedToCheckoutPage proceedToCheckoutPage = new ProceedToCheckoutPage(page);

        proceedToCheckoutPage.clickProducts();
        proceedToCheckoutPage.clickviewProduct();
        proceedToCheckoutPage.clickAddToCart();
        proceedToCheckoutPage.clickContinueShopping();
        proceedToCheckoutPage.clickCart();
        proceedToCheckoutPage.clickProceedToCheckout();
        //proceedToCheckoutPage.enterComment("Please deliver between 9 AM and 5 PM.");
        proceedToCheckoutPage.clickPlaceOrder();
    }
}
