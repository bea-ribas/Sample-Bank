package com.wipro.tutorial.at.steps;

import com.wipro.tutorial.at.pages.RequestLoanPage;
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
public class RequestLoanSteps extends AbstractSteps{

    @Autowired
    private RequestLoanPage requestLoanPage;


    @Given("User select an account $account")
    public void selectAccount (@Named("account") String account ){
        requestLoanPage.selectAccount(account);
    }

    @Given ("User fills the desired $loanValue to loan")
    public void requestLoan (@Named("loanValue") String loanValue){
        requestLoanPage.fillAmountValue(loanValue);
    }

    @When("User clicks on loan button")
    public void clickGetLoanButton(){
        requestLoanPage.clickGetLoanButton();
    }

    @Then("system should display $message")
    public void systemDisplayMessage (@Named("message") String message){
        Assert.assertEquals(message, requestLoanPage.getReturnMsg());
    }

}
