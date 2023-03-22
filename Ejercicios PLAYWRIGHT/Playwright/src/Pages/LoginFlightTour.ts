import { expect, Page } from "@playwright/test";
export class LoginFlightTour{

    readonly page: Page;
constructor(page: Page){
this.page = page;

}

async login(infoUser){

      //onst username = this.page.locator('input[name="userName"]');
      //const password = this.page.locator('input[name="password"]');
      
      //await expect(this.page.locator('input[name="userName"]')).toBeVisible();

      await this.page.goto('https://demo.guru99.com/test/newtours/index.php');
      await expect(this.page).toHaveURL('https://demo.guru99.com/test/newtours/index.php');
      await this.page.locator('input[name="userName"]').fill(infoUser.user);
      await this.page.locator('input[name="password"]').fill(infoUser.password);
      await this.page.getByRole('button', { name: 'Submit' }).click();
      await this.page.getByRole('heading', { name: 'Login Successfully' }).click();
      await this.page.getByRole('link', { name: 'Flights' }).click();
      await this.page.waitForTimeout(3000);
  
  
};

}