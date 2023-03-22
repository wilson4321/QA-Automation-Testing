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
    `Given El usuario Inicia sesion para visualizar los productos
         When Seleccionar el filtro por nombre de la Z a la A
            Then Validar que se ordenen los productos disponibles 
            por nombre de la Z a la A`, async ({ page }) => {

    const productsPage = new SauceDemoProductsPage(page);
    await productsPage.filtroZtoA();
    let text =  "----- Filtro: Z to A -----\n";
    text +="--- Lista de productos de la Z a la A ---\n";
    productsPage.printProductsNames(text);

}

);