import { Locator, Page } from '@playwright/test'

export class DespegarFlightInfo{

    readonly btnAplicar: Locator;
    readonly btnVuelta: Locator;
    readonly btnPasajeros: Locator;
    readonly btnAdultos: Locator;
    readonly btnMenores: Locator;
    readonly selectCiudad: Locator;
    readonly btnBuscar: Locator;

    readonly page: Page;
    constructor(page: Page){
    this.page = page;
    this.btnVuelta = page.locator('xpath=//div[@class="sbox5-floating-tooltip sbox5-floating-tooltip-opened"]//div[@data-month="2023-05"]/descendant::div[text()="30"]');
    this.btnAplicar = page.locator('xpath=//button[@class="sbox5-3-btn -primary -md"]');
    this.btnAdultos = page.locator('xpath=//div[contains(div/span/text(), "Adultos")]/descendant::*[@id="svg-plus-MLZpsEK"]');
    this.btnMenores = page.locator('xpath = //div[contains(div/span/text(), "Menores")]/descendant::*[@id="svg-plus-MLZpsEK"]');
    this.btnPasajeros = page.locator('xpath = //div[@class="sbox5-segment--2_IQ3"]/descendant::div[@class="sbox5-distributionPassengers"]');
    this.selectCiudad = page.locator('xpath = //li[@class="item -active"]');  
    this.btnBuscar = page.locator('xpath=//*[@class="btn-text"and contains(text(),"Buscar")] ');

}

    async searchReservation(){

//Ingresar info de ida 
  await this.page.locator('.login-incentive--close').click();
  await this.page.getByRole('textbox', { name: 'Ingresa desde dónde viajas' }).click();
  await this.page.getByRole('textbox', { name: 'Ingresa desde dónde viajas' }).fill('');
  await this.page.keyboard.press('Backspace');
  await this.page.keyboard.type('med');
  await this.page.waitForTimeout(1000);
  await this.selectCiudad.click();
  //await this.page.getByText('Medellín, Antioquia, Colombia', { exact: true }).click();
  await this.page.waitForTimeout(2000);
  await this.page.getByRole('textbox', { name: 'Ingresa hacia dónde viajas' }).click();
  await this.page.getByRole('textbox', { name: 'Ingresa hacia dónde viajas' }).click();
  await this.page.waitForTimeout(1000);
  await this.page.keyboard.type('orl');
  await this.page.waitForTimeout(1000);
  await this.selectCiudad.click();
  //await this.page.getByText('Orlando, Florida, Estados Unidos', { exact: true }).click();
  await this.page.waitForTimeout(2000);

  //Selecciono fechas
  await this.page.getByRole('textbox', { name: 'Ida' }).click();
  await this.page.getByText('16').first().click();
  await this.page.waitForTimeout(1000);
  await this.page.getByRole('textbox', { name: 'Vuelta' }).click();
  await this.page.waitForTimeout(1000);
  await this.page.locator('.calendar-arrow-right').first().click();
  await this.page.locator('.calendar-arrow-right').first().click();
  await this.page.waitForTimeout(1000);
  await this.btnVuelta.click();
  await this.page.waitForTimeout(1000);
  await this.btnAplicar.click();
  await this.page.waitForTimeout(1000);

  //Selecciono pasajeros

  await this.btnPasajeros.click();
  await this.page.waitForTimeout(1000);
  await this.btnAdultos.click();
  await this.page.waitForTimeout(500);
  
  await this.page.locator('a').filter({ hasText: 'Aplicar' }).click();
  
  await this.btnBuscar.click();
 

    }

}