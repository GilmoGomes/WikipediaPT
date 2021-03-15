package steps;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.cs.A;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    private Base base;

    public Hooks(Base base) {
        this.base = base;
    }

    @Before
    public void setup(){ // iniciar
        System.setProperty("webdriver.chrome.driver", "drivers/chrome/88/chromedriver.exe");
        base.driver = new ChromeDriver(); // Instanciou o Selenium como Chrome

        base.driver.manage().window().maximize();
        base.driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);


    }
    @After
    public void tearDown(){ //finalizar
        base.driver.quit();

    }

}
