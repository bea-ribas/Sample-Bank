package com.wipro.tutorial.at.steps;

import com.wipro.tutorial.at.pages.GoogleSearchPage;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by e075921 on 10/10/2018.
 */

@Component
public class GoogleSearchSteps extends AbstractSteps {

    @Autowired
    private GoogleSearchPage googleSearchPage;

    @Given("I access the google search")
    public void userAccessGoogleSearch() {
        googleSearchPage.navigateTo();
    }

    @When("I search for $searchItem")
    public void searchForItem(@Named("searchItem") String searchItem ) {
        googleSearchPage.SearchItem(searchItem);

    }

    @Then("the page title should contain $searchItem")
    public void assertPageTitleContaisItem(@Named("searchItem") String searchItem ) {
        googleSearchPage.GooglePageTitleIs(searchItem);

    }
}
