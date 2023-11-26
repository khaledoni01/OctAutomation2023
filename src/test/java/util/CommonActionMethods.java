package util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.TestBase;

public class CommonActionMethods {

    public static void type(WebElement ele, String value) {
        ele.clear();
        ele.sendKeys(value);
    }

    public static void jsClick(WebElement ele){
        JavascriptExecutor js = (JavascriptExecutor) TestBase.driver;
        js.executeScript("arguments[0].click();", ele);
    }

}