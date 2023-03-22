import { test } from '@playwright/test';
import { SauceDemoCheckoutInformationPage } from '../src/pages/SauceDemoCheckoutInformationPage'
import { SauceDemoLoginPage } from '../src/pages/SauceDemoLoginPage'
import { SauceDemoCheckoutOverviewPage } from '../src/pages/SauceDemoCheckOverviewPage';
import { SauceDemoCarritoPage } from '../src/pages/SauceDemoCarritoPage';
import { SauceDemoProductsPage } from '../src/pages/SauceDemoProductsPage';

const userInfo= {
    user:"standard_user",
    password:"secret_sauce",
};
const persData= {
    firstname:"Desirae",
    lastname:"Zimmerman",
    postalcode:"578986",
};

test.beforeEach(async ({ page }) => {
    await page.goto('https://www.saucedemo.com/');
    const loginPage = new SauceDemoLoginPage(page);
    await loginPage.login(userInfo);
    await loginPage.check();
    const productsPage = new SauceDemoProductsPage(page);
    await page.goto('https://www.saucedemo.com/inventory.html');
    await productsPage.filtroZtoA();
    let text =  "----- Filtro: Z to A -----\n";
    text +="--- Lista de productos de la Z a la A ---\n";
    productsPage.printProductsNames(text);
    await page.waitForTimeout(2000);
    const sauceDemoCarrito = new SauceDemoCarritoPage(page);
    await sauceDemoCarrito.Carrito();
    await page.goto('https://www.saucedemo.com/checkout-step-one.html');
    const checkInfoPage = new SauceDemoCheckoutInformationPage(page);
    await checkInfoPage.savePersonalData(persData);
    await page.goto('https://www.saucedemo.com/checkout-step-two.html');
   
});

test(
    `Given El usuario Esta en la pagina checkout Overview
        When Observa los productos que ha seleccionado
        Then Visualiza que su compra ha salido bien`, 
        async ({ page }) => {

    const checkOverPage = new SauceDemoCheckoutOverviewPage(page);
    console.log("------------------Informacion de pago------------------");
    await checkOverPage.checkOver();
    

})