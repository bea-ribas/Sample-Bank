package com.wipro.tutorial.at.steps;

import com.sun.org.apache.xpath.internal.operations.And;
import com.wipro.tutorial.at.pages.AbstractPage;
import com.wipro.tutorial.at.pages.DepositPage;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by e075921 on 10/10/2018.
 */
@Component
public class DepositSteps extends AbstractSteps{

    @Autowired
    private DepositPage depositPage;

    @Given("User select an $account")
    public void selectAccount(@Named("account") String account){
        depositPage.selectAccount(account);
    }

    @Given("User fills the desired $amount to deposit")
    public void userFillAmount (@Named("amount") String amount){
        depositPage.fillAmountValue(amount);
    }

    @When ("User clicks on deposit button")
    public void clickDepositButton(){
        depositPage.clickDepositButton();
    }

    @Then ("The return message for deposit is $message")
    public void returnMessage (@Named("message") String message){
        Assert.assertEquals(message, depositPage.getReturnMsg());
    }

}
