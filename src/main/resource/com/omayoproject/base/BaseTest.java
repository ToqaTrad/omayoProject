package com.omayoproject.base;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.omayoproject.utility.ExcelUtils;

public class BaseTest extends BasePage {
    protected WebDriver driver;
    protected Logger log = LogManager.getLogger(BaseTest.class.getName());


    @BeforeClass()
    public void setUp() throws IOException {
        driver = initializeDriver();
        driver.get(prop.getProperty("url"));
        log.info("Navigated to application URL");

    }


//    @AfterClass(groups = {"smoke","retest"})
//    public void closure() {
//        if (driver != null)
//            driver.quit();
//        log.info("Browser gets closed");
//    }

	
	
}