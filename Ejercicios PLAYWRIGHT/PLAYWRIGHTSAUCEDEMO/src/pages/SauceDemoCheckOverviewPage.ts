import {expect, Locator, Page} from '@playwright/test'
export class SauceDemoCheckoutOverviewPage{

    readonly page:Page;
    readonly txtSauceCard: Locator;
    readonly txtItemTotal: Locator;
    readonly txtTax: Locator;
    readonly txtTotal: Locator;
    readonly btnFinish: Locator;
    readonly txtThanks: Locator;

    constructor(page:Page){
        this.page=page;
        this.txtSauceCard = page.locator('xpath=//div[@class="summary_value_label" and contains(text(), "SauceCard")]');
        this.txtItemTotal = page.locator('xpath=//div[@class="summary_subtotal_label"]');
        this.txtTax = page.locator('xpath=//div[@class="summary_tax_label"]');
        this.txtTotal = page.locator('xpath=//div[@class="summary_info_label summary_total_label"]');
        this.btnFinish = page.locator('[data-test="finish"]');
        this.txtThanks = page.locator('xpath=//h2[@class="complete-header" and contains(text(),"Thank you for your order!")]');
    }

    async checkOver(){
        
        await this.page.waitForTimeout(3000);
        const txtsauceCard = await this.txtSauceCard.textContent();
        const txtitemTotal = await this.txtItemTotal.textContent();
        const txttax = await this.txtTax.textContent();
        const txttotal =  await this.txtTotal.textContent();
        
        console.log(txtsauceCard);
        console.log(txtitemTotal);
        console.log(txttax);
        console.log(txttotal);

        await this.btnFinish.click(); 
        // Aca ya voy a la ultima pagina a verificar 
        await this.page.goto('https://www.saucedemo.com/checkout-complete.html');
        await this.page.waitForTimeout(1000);
        const txtthanks = await this.txtThanks.textContent();
        
        console.log(txtthanks);
    };
        
    }






