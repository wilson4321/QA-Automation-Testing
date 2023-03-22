import {expect, Locator, Page} from '@playwright/test'

export class SauceDemoProductsPage{

    readonly page:Page;
    private selectFilter: Locator;
    private listProductsPrices: string[];
    private listProductsNames: string[] ;
    readonly pointerProductsNames: Locator;
    readonly pointerProductsPrices: Locator;
    

    constructor(page:Page)
    {
        this.page = page;
        this.selectFilter = page.locator('xpath=//*[@class="product_sort_container"]');
        this.pointerProductsNames = page.locator('xpath=//*[@class="inventory_list"]//descendant::div[@class="inventory_item_name"]');
        this.pointerProductsPrices = page.locator('xpath=//*[@class="inventory_list"]//descendant::div[@class="inventory_item_price"]');
    }
    
    

    async filtroAtoZ()
    {
        // Selecciona el filtro por valor
        await this.selectFilter.selectOption('az'); 
        // Toma toda la lista del nombre de los productos
        this.listProductsNames = await this.pointerProductsNames.allInnerTexts();
        await this.page.waitForTimeout(3000);
    }

    async filtroZtoA()
    { 
        await this.selectFilter.selectOption('za'); 
        this.listProductsNames = await this.pointerProductsNames.allInnerTexts();
        await this.page.waitForTimeout(3000);
        
    }

    async filtroAlto()
    {
       await this.selectFilter.selectOption('hilo'); 
       this.listProductsPrices = await this.pointerProductsPrices.allInnerTexts();
       await this.page.waitForTimeout(3000);
    }
    async filtroBajo()
    {
        await this.selectFilter.selectOption('lohi'); 
        this.listProductsPrices = await this.pointerProductsPrices.allInnerTexts();
        await this.page.waitForTimeout(3000);
        
    }

    printProductsPrices(title)
    {
        
        console.log(title);
       for (let i= 0; i < this.listProductsPrices.length; i++) {
            console.log(this.listProductsPrices[i]);
        
       }
    }

    printProductsNames(title)
    {
        
        console.log(title);
        
       for (let i= 0; i < this.listProductsNames.length; i++) {
            console.log(this.listProductsNames[i]);
        
       }
    }

    
}