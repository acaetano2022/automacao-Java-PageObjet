package steps;

import homePages.HomePageSwichTo;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import metodos.MetodosUtils;
import org.openqa.selenium.By;
import runner.Executa;

public class TesteSwitchToFrames {
    MetodosUtils metodos = new MetodosUtils();
    Executa executa = new Executa();
    HomePageSwichTo pageSwichTo = new HomePageSwichTo();

    @Dado("que estaje na tela SwitchTo frames.")
    public void que_estaje_na_tela_switch_to_frames() {
        executa.abrirNavegador("https://demo.automationtesting.in/Frames.html");


    }

    @Dado("seleciono opcao Frames.")
    public void seleciono_opcao_frames() throws InterruptedException {
        pageSwichTo.clicarFrames();
        metodos.scroll();
        Thread.sleep(2000);
    }


    @Quando("clico em Iframe With In An Iframe.")
    public void clico_em_iframe_with_in_an_iframe() throws InterruptedException {
        Thread.sleep(1000);
        pageSwichTo.clicarIframesWithInAnIframe();

    }

    @Quando("valido mensagem Nested iFrames...")
    public void valido_mensagem_nested_i_frames() throws InterruptedException {
        Thread.sleep(3000);
        pageSwichTo.validarNestedIframes();
    }


}
