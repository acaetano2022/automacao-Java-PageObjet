package runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import driverFectory.Driver;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "steps",
        tags = "@register",
        dryRun = false,
        monochrome = true,
        plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber-reports"}
)
public class Executa extends Driver {

  

	public  void  abrirNavegador(String Site) {
        ChromeOptions Options = new ChromeOptions();
        Options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(Options);
        driver.get(Site);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }

    public  void fexarNavegador() {
        driver.quit();
    }

}

