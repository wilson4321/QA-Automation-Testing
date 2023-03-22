import {expect, Locator, Page} from '@playwright/test'
export class SauceDemoCheckoutInformationPage{
    
    readonly page:Page;
    readonly txtFirstName: Locator;
    readonly txtLastName: Locator;
    readonly txtPostalCode: Locator;
    readonly btnContinue: Locator;

    constructor(page:Page)
    {
        this.page = page;
        this.txtFirstName = page.locator('[data-test="firstName"]');
        this.txtLastName = page.locator('[data-test="lastName"]')
        this.txtPostalCode = page.locator('[data-test="postalCode"]');
        this.btnContinue = page.locator('[data-test="continue"]');

    }

    async savePersonalData(persData)
    {
        await this.txtFirstName.click();
        await this.txtFirstName.fill(persData.firstname);
        await this.txtLastName.click();
        await this.txtLastName.fill(persData.lastname);
        await this.txtPostalCode.click();
        await this.txtPostalCode.fill(persData.postalcode);
        await this.page.waitForTimeout(2000);
        await this.btnContinue.click()
        

    }

}