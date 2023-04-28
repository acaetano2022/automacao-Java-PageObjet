package metodos;

import static org.junit.Assert.assertEquals;

import java.time.Duration;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverFectory.Driver;

public class MetodosUtils extends Driver {
    public void validarProximaPagina(String tituloPagina) {
        String tituloDaPagina = driver.getTitle();
        System.out.println(tituloPagina + tituloDaPagina);

    }

    public void scroll() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)", "");

    }

    // metodo para aguardar um elemento para clicar com while Luppin
    public void esperarClicar(By elemento, int qtd, int segundos) {
        WebElement elementoFexar = driver.findElement(elemento);
        elementoFexar = new WebDriverWait(driver, Duration.ofSeconds(segundos))
                .until(ExpectedConditions.elementToBeClickable(elemento));
        while (elementoFexar.isDisplayed() && qtd > 0) {
            elementoFexar.click();
            qtd--;
        }
    }

    // para percorrer todas as janelas
    public void trocarDeaba() {
        String janelaAtual = driver.getWindowHandle();
        Set<String> janelas = driver.getWindowHandles();
        for (String janela : janelas) {
            driver.switchTo().window(janela);
            System.out.println("Endereço do site " + driver.getCurrentUrl());
        }

    }

    public void validarTexto(By elemento, String textoDesejado) {
        String textoCapturado = driver.findElement(elemento).getText();
        assertEquals(textoDesejado, textoCapturado);
    }

    private static final String CARACTERES_PERMITIDOS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    public String gerarNomeAleatorio(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        Random random = new Random();
        for (int i = 0; i < tamanho; i++) {
            int index = random.nextInt(CARACTERES_PERMITIDOS.length());
            sb.append(CARACTERES_PERMITIDOS.charAt(index));
        }
        return sb.toString();
    }

    public String gerarNumeroTelefoneAleatorio() {
        Random random = new Random();
        // Gerar um número de telefone aleatório com 9 dígitos
        int primeiroDigito = random.nextInt(9) + 1;
        int[] numerosRestantes = new int[8];
        for (int i = 0; i < numerosRestantes.length; i++) {
            numerosRestantes[i] = random.nextInt(10);
        }
        return String.format("%d%d%d%d%d%d%d%d%d", primeiroDigito, numerosRestantes[0], numerosRestantes[1],
                numerosRestantes[2], numerosRestantes[3], numerosRestantes[4], numerosRestantes[5], numerosRestantes[6],
                numerosRestantes[7]);
    }

    public String gerarEnderecoEmailAleatorio() {
        Random random = new Random();
        // Gerar um nome de usuário aleatório com 10 caracteresS
        String nomeUsuario = gerarStringAleatoria(6);
        // Gerar um domínio aleatório com 8 caracteres
        String dominio = gerarStringAleatoria(0);
        return nomeUsuario + "@gmail" + dominio + ".com";
    }

    public String gerarStringAleatoria(int tamanho) {
        Random random = new Random();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            // Gerar um caractere aleatório entre 'a' e 'z'
            char c = (char) (random.nextInt(26) + 'a');
            builder.append(c);
        }
        return builder.toString();
    }


}
