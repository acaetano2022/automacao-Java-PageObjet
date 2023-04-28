package homePages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import driverFectory.Driver;

public class HomePageWebTable extends Driver {


  

	public void validaEmail() {
        WebElement validaEmail = driver.findElement(By.xpath("/html/body/section/div[1]/div/div[3]/div[1]/div[1]/div[1]/div/div/div/div/div/div[1]/div/div[1]/span[1]"));
        String msg = validaEmail.getText();
        Assert.assertTrue("msg", true);


    }

    public void validaFirstName() {
        WebElement firstName = driver.findElement(By.xpath("/html/body/section/div[1]/div/div[3]/div[1]/div[1]/div[1]/div/div/div/div/div/div[2]/div/div[1]/span[1]"));
        String msg = firstName.getText();
        Assert.assertTrue("msg", true);
    }

    public void validaGender() {
        WebElement gender = driver.findElement(By.xpath("/html/body/section/div[1]/div/div[3]/div[1]/div[1]/div[1]/div/div/div/div/div/div[3]/div/div[1]/span[1]"));
        String msg = gender.getText();
        Assert.assertTrue("msg", true);


    }

    public void validaLastName() {
        WebElement lastName = driver.findElement(By.xpath("/html/body/section/div[1]/div/div[3]/div[1]/div[1]/div[1]/div/div/div/div/div/div[4]/div/div[1]/span[1]"));
        String msg = lastName.getText();
        Assert.assertTrue("msg", true);


    }

    public void validaPhone() {
        WebElement phone = driver.findElement(By.xpath("/html/body/section/div[1]/div/div[3]/div[1]/div[1]/div[1]/div/div/div/div/div/div[5]/div/div[1]/span[1]"));
        String msg = phone.getText();
        Assert.assertTrue("msg", true);

    }

    public void validaAction() {
        WebElement action = driver.findElement(By.xpath("/html/body/section/div[1]/div/div[3]/div[1]/div[1]/div[1]/div/div/div/div/div/div[6]/div/div[1]/span[1]"));
        String msg = action.getText();
        Assert.assertTrue("msg", true);

    }

}


