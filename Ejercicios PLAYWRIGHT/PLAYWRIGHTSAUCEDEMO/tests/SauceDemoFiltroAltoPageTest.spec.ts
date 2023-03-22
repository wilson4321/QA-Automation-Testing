import { test } from '@playwright/test';
import { SauceDemoProductsPage } from '../src/pages/SauceDemoProductsPage'
import { SauceDemoLoginPage } from '../src/pages/SauceDemoLoginPage'

const userInfo= {
    user:"standard_user",
    password:"secret_sauce",
};


test.beforeEach(async ({ page }) => {
    await page.goto('https://www.saucedemo.com/');
    const loginPage = new SauceDemoLoginPage(page);
    await loginPage.login(userInfo);
    await loginPage.check();
    await page.goto('https://www.saucedemo.com/inventory.html');

});

test(
    `Given The user have been sign up in the page sauce products
         When Seleccionar el filtro precio más alto a más bajo
            Then Validar que se ordenen los productos disponibles 
            del precio más bajo al más alto`, async ({ page }) => {

    const productsPage = new SauceDemoProductsPage(page);
    await productsPage.filtroAlto();
    let text =  "----- Filtro: High to Low -----\n";
    text +="--- Precios Productos ---\n";
    productsPage.printProductsPrices(text);

}

);





