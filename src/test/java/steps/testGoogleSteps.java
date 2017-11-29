package test.java.steps;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertTrue;

public class testGoogleSteps {

    WebDriver driver = new ChromeDriver();

    @Given("^I am on the google homepage$")
    public void i_am_on_the_google_homepage() throws Throwable {
        driver.get("http://www.google.com");
    }

    @When("^I search for HMRC$")public void i_search_for_HMRC() throws Throwable {
        WebElement searchHmrc = driver.findElement(By.cssSelector("#lst-ib"));
        searchHmrc.sendKeys("HMRC");
        WebElement hitdabutton = driver.findElement(By.name("btnK"));
        hitdabutton.click();
    }

    @Then("^I see a list of results$")
    public void i_see_a_list_of_results() throws Throwable {
        WebElement hmrclink = driver.findElement(By.id("resultStats"));
        assertTrue(hmrclink.isDisplayed());
    }

    @When("^I do an invalid search$")
    public void i_do_an_invalid_search() throws Throwable {
        WebElement searchHmrc = driver.findElement(By.cssSelector("#lst-ib"));
        searchHmrc.sendKeys("fgdhfghgfgfhuheui");
        WebElement hitdabutton = driver.findElement(By.name("btnK"));
        hitdabutton.click();
    }

    @Then("^I see an error message$")
    public void i_see_an_error_message() throws Throwable {
        WebElement errormessage = driver.findElement(By.id("topstuff"));
        assertTrue(errormessage.isDisplayed());
    }

    @After
    public void close() {
        driver.quit();
    }
}



