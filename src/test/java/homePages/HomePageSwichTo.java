package homePages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import metodos.MetodosUtils;

public class HomePageSwichTo extends MetodosUtils {


//	########################### SwichTo Alert ################################

    public void clicarSwichTo() {
        driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/a")).click();

    }

    public void clicarAlert() {
        driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[1]/a")).click();

    }

    public void clicarAlertWithOk() {
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();

    }


    public void clicarAlertTextBox() {
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();

    }


    public void validarClickTheButtonToDisplayAnAlertBox() {
        WebElement ClickTheButtonToDisplayAnAlertBox = driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
        String msg = ClickTheButtonToDisplayAnAlertBox.getText();
        Assert.assertEquals(msg, "click the button to display an alert box:");
    }

    public void validarClickTheButtonToDisplayAConfirmBox() {
        WebElement validarClickTheButtonToDisplayAConfirmBox = driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
        String msg = validarClickTheButtonToDisplayAConfirmBox.getText();
        Assert.assertEquals(msg, "click the button to display a confirm box");
    }

    public void validarClickTheButtonToDemonstrateThepromptBox() {
        WebElement validarClickTheButtonToDemonstrateThepromptBox = driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
        String msg = validarClickTheButtonToDemonstrateThepromptBox.getText();
        Assert.assertEquals(msg, "click the button to demonstrate the prompt box");
    }

//	########################### SwichTo Windows ################################


    public void clicarWindows() {
        driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[2]/a")).click();

    }

    public void clicarClik1() {
        driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();

    }

    public void clicarClik2() {
        driver.findElement(By.xpath("//*[@id=\"Seperate\"]/button")).click();

    }

    public void clicarClik3() {
        driver.findElement(By.xpath("//*[@id=\"Multiple\"]/button")).click();

    }

    public void clicarOpenNewSeperateWindows() {
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();

    }

    public void clicarOpenSeparateMultiple() {
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();

    }


    public void validarMsgClick1() {
        WebElement validarMsgClick1 = driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/p"));
        String msg = validarMsgClick1.getText();
        Assert.assertEquals(msg, "If you set the target attribute to \"_blank\" , the link will open in a new browser window or a new tab");
    }

    public void validarMsgClick2() {
        WebElement validarMsgClick2 = driver.findElement(By.xpath("//*[@id=\"Seperate\"]/p"));
        String msg = validarMsgClick2.getText();
        Assert.assertEquals(msg, "click the button to open a new window with some specifications");
    }

    public void validarMsgClick3() {
        WebElement validarMsgClick3 = driver.findElement(By.xpath("//*[@id=\"Multiple\"]/p"));
        String msg = validarMsgClick3.getText();
        Assert.assertEquals(msg, "Click the button to open multiple windows");
    }

//	########################### SwichTo frames ################################

    public void clicarFrames() {
        driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[3]/a\n")).click();
    }

    public void clicarIframesWithInAnIframe() {
        driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
    }

    public void EscreverTextoFramesDemo() {
        driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("123456789ABCDEFG");

    }


    public void EscreverTextoFrames() {
        driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("123456789ABCDEFG");

    }

    public void validarIFrameDemo() {
        WebElement validaiFrameDemo = driver.findElement(By.xpath("/html/body/section/div/h5"));
        String msg = validaiFrameDemo.getText();
        Assert.assertEquals(msg, "iFrame Demo");
    }

    public void validarNestedIframes() {
        WebElement validaiFrameDemo = driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a"));
        String msg = validaiFrameDemo.getText();
        Assert.assertEquals(msg, "Iframe with in an Iframe");
    }

    public void validarIframeDemo2() {
        WebElement validaiFrameDemo = driver.findElement(By.xpath("/html/body/section/div/h5"));
        String msg = validaiFrameDemo.getText();
        Assert.assertEquals(msg, "iFrame Demo");
    }

}
