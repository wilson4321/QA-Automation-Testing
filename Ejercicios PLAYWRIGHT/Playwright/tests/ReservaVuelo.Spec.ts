import {test} from '@playwright/test';
import {SearchFlihtTour} from '../src/Pages/SearchFlightTour'
import { LoginFlightTour } from '../src/Pages/LoginFlightTour';

const infoUser = {

    user : 'wilsonaraquer',
    password: 'wilson2023'
}

//Definir test
test.beforeEach(async({page}) =>{
    await page.goto('https://demo.guru99.com/test/newtours/index.php');
    const pagina = new LoginFlightTour(page);
    await pagina.login(infoUser);
});

test(`
Given Necesito buscar un vuelo 
when lleno los campos solicitados
then visualizo los vuelos disponibles`,
async({page})=>{
    const pagina = new SearchFlihtTour(page);
    await pagina.searchReservation();
    

});