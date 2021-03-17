package simples;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Artigo {
    String url; // endereco do site alvo
    WebDriver driver; //objeto do selenimu webdriver

    @Before //antes do teste
    public void iniciar(){
        url = "https://pt.wikipedia.org/";

        //onde esta do chrome driver
        System.setProperty("webdriver.chrome.driver", "drivers/chrome/88/chromedriver.exe");
        driver = new ChromeDriver(); // Instanciou o Selenium como Chrome

        driver.manage().window().maximize(); //Maxmizar a janela do navegador
        //define uma espera implicita de 1 min, verificando o carregamento a cada milisegundo
        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);


    }

    @Test // durante o teste
    public void consultarArtigo(){
        //abrir o site
        driver.get(url);

        //pesquisar por ovo de pascoa
        driver.findElement(By.id("searchInput")).sendKeys("Ovo de Páscoa");
        //driver.findElement(By.id("searchButton")).click();
        driver.findElement(By.cssSelector("button.wvui-button")).click();

        //validar o titulo da pagina de retorno
        //assertEquals("Ovo de Páscoa - Wikipédia, a enciclopédia livre", driver.getTitle());
        //assertTrue(driver.getTitle().contains("Ovo de Páscoa"));
        assertEquals("Ovo de Páscoa", driver.findElement(By.id("firstHeading")).getText());

    }

    @After // depois do teste
    public void finalizar(){
        driver.quit();

    }
}