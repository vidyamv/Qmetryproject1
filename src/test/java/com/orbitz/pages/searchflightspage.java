package com.orbitz.pages;



import java.util.List;

import org.testng.Reporter;

import com.orbitz.component.SearchflightTestPage;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebComponent;

public class searchflightspage extends WebDriverBaseTestPage<WebDriverTestPage>  {

	int i;
	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	@FindBy(locator = "list.firstsearchflightpage")
	private List<SearchflightTestPage> listFirstsearchflightpage;



public List<SearchflightTestPage> getListSearchflightpage() {
		return listFirstsearchflightpage;
	}


public void verifyResults() {
    
	/*getListSearchflightpage().get(9).getNameFirstsearchflightpage().waitForPresent();
	
    for(SearchflightTestPage  result:listFirstsearchflightpage) {
        System.out.println(result.getNameFirstsearchflightpage().getText());
        System.out.println(result.getPlaceFirstsearchflightpage().getText());
    }*/
 
		
		for(SearchflightTestPage result:listFirstsearchflightpage) {
			
			if(i<5) {
				Reporter.log("Flight name :"+result.getNameFirstsearchflightpage().getText());
				
				Reporter.log("Source and Destination::"+result.getPlaceFirstsearchflightpage().getText());
				
				
				i++;
				
			}
			else
				break;
}
}
}
