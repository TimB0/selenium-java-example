package com.tim.boland.test.selenium.framework.tests;


import com.tim.boland.test.selenium.framework.Pages;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;



/**
 * Created by tboland on 3/20/18.
 */
public class SmokeQAIT {

    private static final transient Log logger = LogFactory.getLog(SmokeQAIT.class);


    public void setup() {
        try {
            Boolean foundLogoutElement = Pages.Browser.findLogoutElement();

            if (foundLogoutElement) {
                Pages.Browser.findLogoutElementAndClick();
            }
        } catch (org.openqa.selenium.NoSuchElementException nsee) {
            logger.debug(" caught exception, don't need to log out ");
        }

    }

}
