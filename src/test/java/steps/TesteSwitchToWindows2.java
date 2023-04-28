package steps;

import homePages.HomePageSwichTo;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;
import metodos.MetodosUtils;
import runner.Executa;

public class TesteSwitchToWindows2 {

    MetodosUtils metodos = new MetodosUtils();
    Executa executa = new Executa();
    HomePageSwichTo pageSwichTo = new HomePageSwichTo();


    @Dado("que estaje na tela SwitchTo Windows")
    public void que_estaje_na_tela_switch_to_windows() {
        executa.abrirNavegador("https://demo.automationtesting.in/Windows.html");

    }

    @Dado("clico em SwitchTo...")
    public void clico_em_switch_to() {
        pageSwichTo.clicarSwichTo();
    }

    @Dado("seleciono opcao Windows...")
    public void seleciono_opcao_windows() {
        pageSwichTo.clicarWindows();
    }
    @Dado("clico em Open New Seperate Windows")
    public void clico_em_open_new_seperate_windows() {
       pageSwichTo.clicarOpenNewSeperateWindows();
    }

    @Quando("valido mensagem click the button to open a new window with some specifications")
    public void valido_mensagem_click_the_button_to_open_a_new_window_with_some_specifications() {
        pageSwichTo.validarMsgClick2();
    }

    @Quando("clico no butao click...")
    public void clico_no_butao_click() {
        pageSwichTo.clicarClik2();
    }

    @Quando("valido direcionamneto para proxima pagina...")
    public void valido_direcionamneto_para_proxima_pagina() {
        metodos.trocarDeaba();
        metodos.validarProximaPagina("Selenium");
    }

    @Entao("finalizo...")
    public void finalizo() {
        executa.fexarNavegador();
    }


}
