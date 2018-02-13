package com.orbitz.scripts;

import java.util.Map;

import org.hamcrest.Matchers;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.orbitz.pages.FlightTestPage1;
import com.orbitz.steps.StepsBackLog;
import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.util.Validator;

public class DataTest extends WebDriverBaseTestPage<WebDriverTestPage> {
	@QAFDataProvider(dataFile="./resources/data/inputs.csv")
	@Test
	public void getData() {
		StepsBackLog sb=new StepsBackLog();
		sb.clickOnFlighttab();
		sb.clickOnOnewayTab();
		sb.enteringAsASource("from");
		sb.enteringAsADestination("to");
		sb.enteringAsAJourneyDate("02/28/2018");
		sb.clickOnSearchbutton();
	}
	
	
	/*@Test
public void gettingInputs(Map<String, String> data) {
		FlightTestPage1 ft=new FlightTestPage1();
		ft.lunchPage();
		Validator.verifyThat(driver.getTitle(),"ORBITZ.com – Best Travel Deals", 
				Matchers.containsString("ORBITZ.com – Best Travel Deals"));
		
		
		ft.getMenuFlightFlightpage().click();
		ft.getTabFlightFlightpage().click();
		ft.sourceNDestination(data.get("from"), data.get("to"));
		ft.getTextboxFlightDestinationFlightpage().sendKeys("blr");
		ft.getCalendarFlightdepartingFlightpage().sendKeys("02/28/2018"+Keys.ENTER);
		
	}*/

	@Override
	protected void openPage(PageLocator arg0, Object... arg1) {
		// TODO Auto-generated method stub
		
	}
}
