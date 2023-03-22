
import { test } from '@playwright/test';
import { SauceDemoLoginPage } from '../src/pages/SauceDemoLoginPage'

const userInfo= {
    user:"standard_user",
    password:"secret_sauce",
};


test.beforeEach(async ({ page }) => {
    await page.goto('https://www.saucedemo.com/');

});

test(
    `Given Deseo ir a la pagina Sauce Demo 
         When Ingreso las credenciales
         Then Visualizo la pagina PRODUCTS`, async ({ page }) => {

    const loginPage = new SauceDemoLoginPage(page);
    await loginPage.login(userInfo);
    await loginPage.check();

}

);





