package steps;

import homePages.HomePageSwichTo;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;
import metodos.MetodosUtils;
import runner.Executa;

public class TesteSwitchToWindows3 {
    MetodosUtils metodos = new MetodosUtils();
    Executa executa = new Executa();
    HomePageSwichTo pageSwichTo = new HomePageSwichTo();

    @Dado("clico em SwitchTo....")
    public void clico_em_switch_to() {
        pageSwichTo.clicarSwichTo();
    }

    @Dado("seleciono opcao Windows....")
    public void seleciono_opcao_windows() {
        pageSwichTo.clicarWindows();

    }

    @Dado("clico open Seperate Multiple Windows....")
    public void clico_open_seperate_multiple_windows() {
        pageSwichTo.clicarOpenSeparateMultiple();
    }

    @Quando("valido mensagem Click the button to open multiple windows....")
    public void valido_mensagem_click_the_button_to_open_multiple_windows() {
        pageSwichTo.validarMsgClick3();
    }

    @Quando("clico no butao click....")
    public void clico_no_butao_click() {
        pageSwichTo.clicarClik3();
    }

    @Quando("valido direcionamneto para proxima pagina....")
    public void valido_direcionamneto_para_proxima_pagina() {
        metodos.trocarDeaba();
        metodos.validarProximaPagina("Index");
    }

    @Entao("finalizo....")
    public void finalizo() {
        executa.fexarNavegador();
    }


}
