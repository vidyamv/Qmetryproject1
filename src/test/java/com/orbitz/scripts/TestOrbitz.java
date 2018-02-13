package com.orbitz.scripts;

import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Reporter;
import org.testng.annotations.Test;


import com.orbitz.pages.FlightTestPage1;
import com.orbitz.pages.searchflightspage;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;

import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.util.Validator;



public class TestOrbitz extends WebDriverBaseTestPage<WebDriverTestPage> {
	@Test
public void flightBooking() {
		FlightTestPage1 ft=new FlightTestPage1();
		ft.lunchPage();
		Validator.verifyThat(driver.getTitle(),"ORBITZ.com – Best Travel Deals", 
				Matchers.containsString("ORBITZ.com – Best Travel Deals"));
		ft.getMenuFlightFlightpage().click();
		ft.getTabFlightFlightpage().click();
		ft.getTextbox1FlightOriginFlightpage().sendKeys("pnq");
		ft.getTextboxFlightDestinationFlightpage().sendKeys("blr");
		ft.getCalendarFlightdepartingFlightpage().sendKeys("02/28/2018"+Keys.ENTER);
		
		searchflightspage sc=new searchflightspage();
		sc.verifyResults();


/*String	text=driver.findElement(By.xpath("//input[@value='Bengaluru, India (BLR)']")).getText();
	     boolean status =Validator.verifyThat(text,
				Matchers.containsString("Pune, India (PNQ)"));
		Reporter.log(text,true);*/
		
		
		
		 
		 
		 
		
	
}

	

	@Override
	protected void openPage(PageLocator arg0, Object... arg1) {
		// TODO Auto-generated method stub
		
	}
}
