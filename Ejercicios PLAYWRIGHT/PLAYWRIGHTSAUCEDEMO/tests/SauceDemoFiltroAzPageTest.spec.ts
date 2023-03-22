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
    `Given El usuario deberia de estar en la pagina Inventory "Sauce Inventory"
         When El usuario selecciona la opcion de filtro A-Z
            Then Ver el resultado en consola ordenando los productos de A-Z`, async ({ page }) => {

    const productsPage = new SauceDemoProductsPage(page);
    await productsPage.filtroAtoZ();
    let text =  "----- Filtro: A to Z -----\n";
    text +="--- Lista de productos de la A a la Z ---\n";
    productsPage.printProductsNames(text);

}

);