package ch.es.pl.quotes.spec.steps;

import ch.es.pl.quotes.ApiException;
import ch.es.pl.quotes.ApiResponse;
import ch.es.pl.quotes.api.QuotesEndPointApi;
import ch.es.pl.quotes.api.dto.Quote;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class QuoteSteps {

    private final QuotesEndPointApi api = new QuotesEndPointApi();
    private Quote quote;
    private int statusCode;

    public QuoteSteps() {
        api.getApiClient().setBasePath("http://localhost:9090/api");
    }

    @Given("^I have an quote payload$")
    public void i_have_an_quote_payload() throws Throwable {
        quote = new Quote();
        quote.setAuthor("Coluche");
        quote.setCitation("Se pencher sur son passé, c'est risquer de tomber dans l'oubli.");
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
