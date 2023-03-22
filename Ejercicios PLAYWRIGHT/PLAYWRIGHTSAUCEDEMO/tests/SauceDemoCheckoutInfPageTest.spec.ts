import { test } from '@playwright/test';
import { SauceDemoCheckoutInformationPage } from '../src/pages/SauceDemoCheckoutInformationPage'
import { SauceDemoLoginPage } from '../src/pages/SauceDemoLoginPage'

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
    await page.goto('https://www.saucedemo.com/checkout-step-one.html');

});

test(
    `Given El usuario ingresa a la pagina Sauce Checkout Information
        When Diligencia el formulario con los datos personales requeridos
        Then Visualiza que su informacion sea enviada correctamente 
        al oprimir el boton`, async ({ page }) => {

    const checkInfoPage = new SauceDemoCheckoutInformationPage(page);
    await checkInfoPage.savePersonalData(persData);
    

}

);





