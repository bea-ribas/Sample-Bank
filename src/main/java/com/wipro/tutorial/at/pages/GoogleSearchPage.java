package com.wipro.tutorial.at.pages;

import com.wipro.tutorial.at.configuration.pageobjects.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by e075921 on 10/10/2018.
 */
@Component
public class GoogleSearchPage extends AbstractPage{

    public void navigateTo() {
        webDriverProvider.get().get("http://www.google.com");
    }

    public void SearchItem (final String item) {
        WebElement element = webDriverProvider.get().findElement(By.name("q"));

        element.sendKeys(item);
        element.submit();

        new WebDriverWait(webDriverProvider.get(), 10).until(new ExpectedCondition<Boolean>(){
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith(item);
            }
        });
    }

    public String GooglePageTitleIs (String item){

        return webDriverProvider.get().getTitle();
    }
}
