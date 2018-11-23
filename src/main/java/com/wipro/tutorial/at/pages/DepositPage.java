package com.wipro.tutorial.at.pages;

import com.wipro.tutorial.at.configuration.pageobjects.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.springframework.stereotype.Component;

/**
 * Created by e075921 on 10/10/2018.
 */
@PageObject
public class DepositPage extends AbstractPage {

    @FindBy(id = "targetAccount")
    private WebElement targetAccount;

    @FindBy (id = "ammount")
    private WebElement amount;

    @FindBy (className = "sb-button")
    private WebElement depositButton;

    @FindBy (id = "sb-return-message")
    private WebElement returnMsg;

    public void selectAccount(String account){
        Select drpAccount = new Select(targetAccount);
        drpAccount.selectByVisibleText(account);
    }

    public void fillAmountValue (String amountValue) {
        amount.clear();
        amount.sendKeys(amountValue);
    }

    public void clickDepositButton () {
        depositButton.click();
    }

    public String getReturnMsg() {
        return returnMsg.getText();
    }
}
