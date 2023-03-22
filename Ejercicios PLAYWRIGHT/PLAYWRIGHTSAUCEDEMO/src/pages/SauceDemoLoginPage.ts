import {expect, Locator, Page} from '@playwright/test'

export class SauceDemoLoginPage{

    readonly page:Page;
    readonly txtUserName: Locator;
    readonly txtPassword: Locator;
    readonly btnLogin: Locator;
    readonly textSuccess: Locator;
    

    constructor(page:Page)
    {
        this.page = page;
        this.txtUserName = page.locator('[data-test="username"]');
        this.txtPassword = page.locator('[data-test="password"]');
        this.btnLogin =  page.locator('[data-test="login-button"]');
        this.textSuccess = page.getByText('Products');
    }
    
    

    async login(userInfo)
    {
        await this.txtUserName.click();
        await this.txtUserName.fill(userInfo.user);
        await this.txtPassword.click();
        await this.txtPassword.fill(userInfo.password);
        await this.page.waitForTimeout(2000);
        await this.btnLogin.click();
        
    }

    async check()
    {
       await this.textSuccess.isVisible();
    }


    
}