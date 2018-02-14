package com.orbitz.pages;

import static com.qmetry.qaf.automation.step.CommonStep.*;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class FlightTestPage1 extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "menu.flight.flightpage")
	private QAFWebElement menuFlightFlightpage;
	@FindBy(locator = "calendar.flightdeparting.flightpage")
	private QAFWebElement calendarFlightdepartingFlightpage;
	@FindBy(locator = "calendar.flightReturninging.flightpage")
	private QAFWebElement calendarFlightReturningingFlightpage;
	@FindBy(locator = "tab.flight.flightpage")
	private QAFWebElement tabFlightFlightpage;
	@FindBy(locator = "button.searchbutton.flightpage")
	private QAFWebElement buttonSearchbuttonFlightpage;
	@FindBy(locator = "textbox.flightDestination.flightpage")
	private QAFWebElement textboxFlightDestinationFlightpage;
	@FindBy(locator = "textbox1.flightOrigin.flightpage")
	private QAFWebElement textbox1FlightOriginFlightpage;
	@FindBy(locator = "list.flightoptions.flightpage")
	private QAFWebElement listFlightoptionsFlightpage;
	@FindBy(locator = "list.des.flightoptions")
	private QAFWebElement listDesFlightoptions;
	@FindBy(locator = "flight.icon")
	private QAFWebElement flightIcon;
	@FindBy(locator = "btn.calender.flightpage")
	private QAFWebElement btnCalenderFlightpage;
	
	public void lunchPage() {
		driver.get("/");
		driver.manage().window().maximize();
	}

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getMenuFlightFlightpage() {
		return menuFlightFlightpage;
	}

	public QAFWebElement getCalendarFlightdepartingFlightpage() {
		return calendarFlightdepartingFlightpage;
	}

	public QAFWebElement getCalendarFlightReturningingFlightpage() {
		return calendarFlightReturningingFlightpage;
	}

	public QAFWebElement getTabFlightFlightpage() {
		return tabFlightFlightpage;
	}

	public QAFWebElement getButtonSearchbuttonFlightpage() {
		return buttonSearchbuttonFlightpage;
	}

	public QAFWebElement getTextboxFlightDestinationFlightpage() {
		return textboxFlightDestinationFlightpage;
	}

	public QAFWebElement getTextbox1FlightOriginFlightpage() {
		return textbox1FlightOriginFlightpage;
	}

	public QAFWebElement getListFlightoptionsFlightpage() {
		return listFlightoptionsFlightpage;
	}

	public QAFWebElement getListDesFlightoptions() {
		return listDesFlightoptions;
	}

	public QAFWebElement getFlightIcon() {
		return flightIcon;
	}

	public QAFWebElement getBtnCalenderFlightpage() {
		return btnCalenderFlightpage;
	}
	
	public void sourceNDestination(String source,String destination)
	{
		
		sendKeys(source, "textbox1FlightOriginFlightpage");
		sendKeys(destination, "textboxFlightDestinationFlightpage");
	}

}
