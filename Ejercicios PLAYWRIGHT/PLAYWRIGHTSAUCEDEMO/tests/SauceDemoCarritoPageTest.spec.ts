//Aqui es donde se hace la simulacion de cucumber
import { test } from '@playwright/test'
import { SauceDemoLoginPage } from '../src/pages/SauceDemoLoginPage'
import { SauceDemoCarritoPage } from '../src/pages/SauceDemoCarritoPage';

// Variables 
// Variable para iniciar sesion (credenciales)
const userInfo = {
    user: "standard_user",
    password: "secret_sauce"
};

//Método beforeEach
//Insertar el background aqui
test.beforeEach(async ({ page }) => {
    await page.goto('https://www.saucedemo.com/');
    const loginPage = new SauceDemoLoginPage(page);
    await loginPage.login(userInfo);
    await loginPage.check();
});

test(
    `Given El usuario ha iniciado sesion en la pagina Sauce
    When Seleccionar productos parametrizados
    Then Los productos deben insertarse al carrito y seguir al Checkout`,async ({ page }) => {
        const sauceDemoCarrito = new SauceDemoCarritoPage(page);
        await sauceDemoCarrito.Carrito();
    }
)