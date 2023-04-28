package steps;

import homePages.HomePageSwichTo;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import metodos.MetodosUtils;
import runner.Executa;

public class TesteSwitchToWindows1 {
    MetodosUtils metodos = new MetodosUtils();
    Executa executa = new Executa();
    HomePageSwichTo pageSwichTo = new HomePageSwichTo();


    @Dado("que estaje na tela SwitchTo Windows.")
    public void que_estaje_na_tela_switch_to_windows() {
        executa.abrirNavegador("https://demo.automationtesting.in/Windows.html");
    }

    @Dado("clico em SwitchTo..")
    public void clico_em_switch_to() {
        pageSwichTo.clicarSwichTo();

    }

    @Dado("seleciono opcao Windows.")
    public void seleciono_opcao_windows() {
        pageSwichTo.clicarWindows();
    }

    @Quando("valido mensagem If you set the target attribute to {string} , the link will open in a new browser window or a new tab.")
    public void valido_mensagem_if_you_set_the_target_attribute_to_the_link_will_open_in_a_new_browser_window_or_a_new_tab(String string) {
        pageSwichTo.validarMsgClick1();
    }

    @Quando("clico no butao click.")
    public void clico_no_butao_click() {
        pageSwichTo.clicarClik1();
    }

    @Quando("valido direcionamneto para proxima pagina.")
    public void valido_direcionamneto_para_proxima_pagina() {
        metodos.trocarDeaba();
        metodos.validarProximaPagina("Selenium");
    }


}
