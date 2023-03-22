
import {test} from '@playwright/test';
import {SearchFlihtTour} from '../src/Pages/SearchFlightTour'
//Definir test
test.beforeEach(async({page}) =>{
    await page.goto('https://demo.guru99.com/test/newtours/reservation.php');
});

test(`
Given Necesito buscar un vuelo 
when lleno los campos
then visualizo los vuelos disponibles`,async({page})=>{
    const pagina = new SearchFlihtTour(page);
    await pagina.searchReservation();
    

});
