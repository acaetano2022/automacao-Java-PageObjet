package homePages;

import driverFectory.Driver;
import metodos.MetodosUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageRegister extends Driver {
MetodosUtils metodos = new MetodosUtils();
  

	public void firstName() {
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys(metodos.gerarNomeAleatorio(10));

    }

    public void lastName() {
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys(metodos.gerarNomeAleatorio(5));

    }

    public void address() {
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("Eu vou ser um QA automatizador  ");

    }

    public void emailAddress() {
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys(metodos.gerarEnderecoEmailAleatorio());

    }

    public void phone() {
        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys(metodos.gerarNumeroTelefoneAleatorio());

    }

    public void gender() {
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")).click();

    }

    public void hobbiesCricket() {
        driver.findElement(By.xpath("//*[@id=\"checkbox1\"]")).click();

    }

    public void  hobbiesMovies() {
        driver.findElement(By.xpath("//*[@id=\"checkbox2\"]")).click();

    }

    public void hobbiesHockey() {
        driver.findElement(By.xpath("//*[@id=\"checkbox3\"]")).click();

    }

    public void skills(String skills) {
        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys(skills);
    }

    public void selectCountry(String conuntry) {
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span")).sendKeys(conuntry);
    }

    public void selectCountryYear(String year) {
        driver.findElement(By.xpath("//*[@id=\"yearbox\"]")).sendKeys(year);
    }

    public void selectCountryMonth(String month) {
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")).sendKeys(month);
    }

    public void selectCountryDay(String day) {
        driver.findElement(By.xpath("//*[@id=\"daybox\"]")).sendKeys(day);
    }

    public void password() {
        driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("Juvenal@123");
    }

    public void confirmPassword() {
        driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("Juvenal@123");
    }

    public void btnSubmit() {
        driver.findElement(By.xpath("//*[@id=\"submitbtn\"]")).click();

    }

    public  void  btnrefresh() {
        driver.findElement(By.xpath("//*[@id=\"Button1\"]")).click();

    }
}

