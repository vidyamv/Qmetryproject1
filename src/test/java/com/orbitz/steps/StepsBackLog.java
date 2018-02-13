/**
 * 
 */
package com.orbitz.steps;

import static com.qmetry.qaf.automation.step.CommonStep.click;
import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;

import com.qmetry.qaf.automation.step.NotYetImplementedException;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;

/**
 * @author Vidya.Gowda
 */
public class StepsBackLog extends WebDriverBaseTestPage<WebDriverTestPage> {

	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	@QAFTestStep(description = "user open browser")
	public void openBrowser() {
		launchPage(null, null);
	}

	@Override
	protected void openPage(PageLocator arg0, Object... arg1) {
		driver.get("/");
		driver.manage().window().maximize();

	}

	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	/*
	 * @QAFTestStep(description = "  flight homepage should display")
	 * public void FlightHomepageShouldDisplay() {
	 * Validator.verifyThat(new WebDriverTestBase().getDriver().getCurrentUrl(),
	 * Matchers.equalToIgnoringCase(
	 * ConfigurationManager.getBundle().getString("env.baseurl")));
	 * }
	 */

	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	@QAFTestStep(description = "user click on flighttab")
	public void clickOnFlighttab() {
		click("flight.icon");
	}

	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	@QAFTestStep(description = "user click on oneway tab")
	public void clickOnOnewayTab() {
		click("tab.flight.flightpage");
	}

	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	@QAFTestStep(description = "user entering {0} as a source")
	public void enteringAsASource(String source) {
		click("textbox1.flightOrigin.flightpage");
		sendKeys(source, "textbox1.flightOrigin.flightpage");
		// click("list.flightoptions.flightpage");
	}

	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	@QAFTestStep(description = "user entering {0} as a destination")
	public void enteringAsADestination(String dest) {
		click("textbox.flightDestination.flightpage");
		sendKeys(dest, "textbox.flightDestination.flightpage");
		// click("list.des.flightoptions");
	}

	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	@QAFTestStep(description = "user entering {0} as a journey date")
	public void enteringAsAJourneyDate(String date) {
		click("calendar.flightdeparting.flightpage");
		sendKeys(date, "calendar.flightdeparting.flightpage");
		click("btn.calender.flightpage");
	}

	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	@QAFTestStep(description = "user click on searchbutton")
	public void clickOnSearchbutton() {
		click("button.searchbutton.flightpage");
	}

}
