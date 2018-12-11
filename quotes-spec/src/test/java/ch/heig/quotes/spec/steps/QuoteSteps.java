package ch.heig.quotes.spec.steps;

import ch.heig.quotes.ApiException;
import ch.heig.quotes.ApiResponse;
import ch.heig.quotes.api.QuotesendpointApi;
import ch.heig.quotes.api.dto.Quote;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class QuoteSteps {

    private final QuotesendpointApi api = new QuotesendpointApi();
    private Quote quote;
    private int statusCode;

    @Given("^I have an quote payload$")
    public void i_have_an_quote_payload() throws Throwable {
        quote = new Quote();
        quote.setAuthor("Coluche");
        quote.setCitation("Se pencher sur son passé, c'est risquer de tomber dans l'oubli.");
        quote.setId(0);
    }

    @When("^I POST it to the /quotes endpoint$")
    public void i_POST_it_to_the_quotes_endpoint() throws Throwable {
        try {
            ApiResponse response = api.addQuoteUsingPOSTWithHttpInfo(quote);
            statusCode = response.getStatusCode();
        } catch (ApiException e) {
            statusCode = e.getCode();
        }
    }

    @Then("^I receive a (\\d+) status code$")
    public void i_receive_a_status_code(int arg1) throws Throwable {
        assertEquals(arg1, statusCode);
    }
}
