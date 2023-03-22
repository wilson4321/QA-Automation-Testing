import {test} from '@playwright/test';
import {LoginFlightTour} from '../src/Pages/LoginFlightTour'


const infoUser = {

    user : 'wilsonaraquer',
    password: 'wilson2023'
}


//Definir test
test.beforeEach(async({page}) =>{
    await page.goto('https://demo.guru99.com/test/newtours/index.php');
});

test(`
Given Estoy en la pagina principal 
when Realizo el login
then visualizo la pagina de reservas`,async({page})=>{
    const pagina = new LoginFlightTour(page);
    await pagina.login(infoUser);

});

