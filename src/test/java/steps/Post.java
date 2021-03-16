package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class Post extends Base {
    public Post(Base base) {
        this.base = base;
    }

    private Base base;
/*
    @Dado("^que acesso o Wikipedia em Portugues$")
    public void queAcessoOWikipediaEmPortugues() {
        base.driver.get(base.url); //Abre o navegador no seite alvo (extentendo da base)

    }

    @Quando("^pesquiso por \"([^\"]*)\"$")
    public void pesquisoPor(String produto) {
        base.driver.findElement(By.id("searchInput")).sendKeys(produto + Keys.ENTER);
    }

    @Entao("^Exibe a expressao \"([^\"]*)\" no titulo da guia$")
       public void exibeAExpressaoNoTituloDaGuia(String produto) {

        //WebDriverWait espera = new WebDriverWait(base.driver, 30);
        //okespera.until(ExpectedConditions.titleIs(produto + " - Wikipédia, a enciclopédia livre"));

        assertTrue(base.driver.getTitle().contains(produto));
    }
*/
    @Given("^que acesso o Wikipedia em Portugues$")
    public void queAcessoOWikipediaEmPortugues() {
        base.driver.get(base.url); //Abre o navegador no seite alvo (extentendo da base)

    }

    @When("^pesquiso por \"([^\"]*)\"$")
    public void pesquisoPor(String produto) {
        base.driver.findElement(By.id("searchInput")).sendKeys(produto + Keys.ENTER);
    }

    @Then("^Exibe a expressao \"([^\"]*)\" no titulo da guia$")
    public void exibeAExpressaoNoTituloDaGuia(String produto) {

        //WebDriverWait espera = new WebDriverWait(base.driver, 30);
        //okespera.until(ExpectedConditions.titleIs(produto + " - Wikipédia, a enciclopédia livre"));

        assertTrue(base.driver.getTitle().contains(produto));
    }
}
