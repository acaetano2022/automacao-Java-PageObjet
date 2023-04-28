package homePages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverFectory.Driver;

public class HomePageLogin extends Driver {


	/*
    Escrever email, validar msg email, concluir login
     */
    public void emailLogin() {
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("teste@teste.com");

    }

    public void validaEmail() {
        WebElement nomeEmail = driver.findElement(By.xpath("//input[@id='email']"));
        String msg = nomeEmail.getText();
        Assert.assertEquals("Email id for Sign Up", msg);


    }

    public void  clickPageLogin() {
        driver.findElement(By.xpath("//*[@id=\"enterimg\"]")).click();

    }

    public void validaAcessoProximaPagina() {
        WebElement nomeproximaPagina = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/h1"));
        String msg = nomeproximaPagina.getText();
        Assert.assertTrue("msg", true);

    }
}


