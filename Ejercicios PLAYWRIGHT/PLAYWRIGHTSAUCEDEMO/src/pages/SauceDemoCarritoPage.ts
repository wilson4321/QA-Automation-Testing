import { Locator, Page } from '@playwright/test'

export class SauceDemoCarritoPage {
    readonly page:Page;
    readonly btnAddCartProduct1: Locator;
    readonly btnAddCartProduct2: Locator;
    readonly btnCart: Locator;
    readonly btnCheckout: Locator;

    constructor(page:Page) {
        this.page=page;
        this.btnAddCartProduct1 = page.locator('[data-test="add-to-cart-sauce-labs-backpack"]');
        this.btnAddCartProduct2 = page.locator('[data-test="add-to-cart-sauce-labs-bike-light"]');
        this.btnCart = page.locator('xpath=//*[@class="shopping_cart_link"]');
        this.btnCheckout = page.locator('[data-test="checkout"]');
    }

    async Carrito() {
        await this.page.waitForTimeout(3000);
        await this.btnAddCartProduct1.click();
        await this.btnAddCartProduct2.click();
        await this.btnCart.click();
        await this.page.waitForTimeout(3000);
        await this.btnCheckout.click();
        await this.page.waitForTimeout(3000);
    }
}




