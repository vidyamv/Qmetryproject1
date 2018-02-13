package com.orbitz.component;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebComponent;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class SearchflightTestPage extends QAFWebComponent  {

	public SearchflightTestPage(String locator) {
		super(locator);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(locator = "name.firstsearchflightpage")
	private QAFWebElement nameFirstsearchflightpage;
	
	@FindBy(locator = "place.firstsearchflightpage")
	private QAFWebElement placeFirstsearchflightpage;
	
	public QAFWebElement getNameFirstsearchflightpage() {
		return nameFirstsearchflightpage;
	}

	public QAFWebElement getPlaceFirstsearchflightpage() {
		return placeFirstsearchflightpage;
	}

}
