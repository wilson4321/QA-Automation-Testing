
import { Page } from "@playwright/test";
export class SearchFlihtTour{

    readonly page: Page;
constructor(page: Page){
this.page = page;

}

async searchReservation(){
   
      await this.page.goto('https://demo.guru99.com/test/newtours/reservation.php');
      await this.page.getByRole('radio').nth(1).check();
      await this.page.locator('select[name="passCount"]').selectOption('3');
      await this.page.locator('select[name="fromPort"]').selectOption('Paris');
      await this.page.locator('select[name="fromMonth"]').selectOption('3');
      await this.page.locator('select[name="fromDay"]').selectOption('15');
      await this.page.locator('select[name="toPort"]').selectOption('Zurich');
      await this.page.locator('select[name="toMonth"]').selectOption('11');
      await this.page.locator('select[name="toDay"]').selectOption('23');
      await this.page.getByRole('radio').nth(4).check();
      await this.page.locator('select[name="airline"]').selectOption('Pangea Airlines');
      await this.page.waitForTimeout(3000);
      await this.page.getByRole('button', { name: 'Submit' }).click();
      await this.page.getByText('After flight finder - No Seats Avaialble').click();
      await this.page.getByRole('cell', { name: 'SIGN-ON REGISTER SUPPORT CONTACT After flight finder - No Seats Avaialble Please press your browser\'s back button to return to the previous page or click the "BACK TO HOME" icon below to go to the homepage. © 2005, Mercury Interactive (v. 011003-1.01-058)' }).getByRole('link').nth(4).click();
  
};

}
