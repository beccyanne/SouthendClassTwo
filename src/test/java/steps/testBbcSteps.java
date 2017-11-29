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

public class testBbcSteps {

    WebDriver driver = new ChromeDriver();


    @Given("^I am on the BBC Homepage$")
    public void i_am_on_the_BBC_Homepage() throws Throwable {
        driver.get("http://www.bbc.co.uk/news");
    }

    @Then("^the BBC News banner is displayed$")
    public void the_BBC_News_banner_is_displayed() throws Throwable {
        WebElement BBCBanner = driver.findElement(By.id("brand"));
        assertTrue(BBCBanner.isDisplayed());
    }

    @When("^I click the Sports page link$")
    public void i_click_the_Sports_page_link() throws Throwable {
     WebElement clicksport = driver.findElement(By.className("orb-nav-sport"));
        assertTrue(clicksport.isDisplayed());
     WebElement clicklink = driver.findElement(By.className("orb-nav-sport"));
             clicklink.click();

    }

    @Then("^The BBC Sports Page is displayed$")
    public void the_BBC_Sports_Page_is_displayed() throws Throwable {
    WebElement sport = driver.findElement(By.cssSelector("a[href='/sport']"));
    assertTrue(sport.isDisplayed());
    }

    @When("^I click the Golf link$")
    public void i_click_the_Golf_link() throws Throwable {
        WebElement clickGolf = driver.findElement(By.cssSelector("a[href='/sport/golf']"));
        assertTrue(clickGolf.isDisplayed());
        WebElement clicklink = driver.findElement(By.cssSelector("a[href='/sport/golf']"));
        clicklink.click();

    }

    @Then("^The Golf page is displayed$")
    public void the_Golf_page_is_displayed() throws Throwable {
        WebElement sportGolf = driver.findElement(By.cssSelector("li.primary-nav__item--active a[href='/sport/golf']"));
        assertTrue(sportGolf.isDisplayed());

    }

    @After

    public void close() {
        driver.quit();
    }
}
