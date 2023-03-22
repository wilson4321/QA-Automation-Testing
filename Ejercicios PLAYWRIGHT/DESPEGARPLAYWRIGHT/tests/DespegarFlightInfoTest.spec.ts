import { test } from '@playwright/test';
import { DespegarFlightInfo} from '../src/pages/DespegarFlightInfo'




test.beforeEach(async ({ page }) => {
    await page.goto('https://www.despegar.com.co/vuelos/');

});


test(
    `Given Deseo ir a la pagina despegar
         When Ingreso la informacion solicitada
         Then Visualizo la pagina con los vuelos disponibles`, async ({ page }) => {

         const pagina = new DespegarFlightInfo(page);
         await pagina.searchReservation();

}

);