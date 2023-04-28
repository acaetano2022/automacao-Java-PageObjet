package steps;

import homePages.HomePageWebTable;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import runner.Executa;

public class TesteWebTable {
    HomePageWebTable pageWebTable = new HomePageWebTable();
    Executa executa = new Executa();



    @Dado("que estaje na tela Webtable")
    public void que_estaje_na_tela_webtable() throws InterruptedException {
        executa.abrirNavegador("https://demo.automationtesting.in/WebTable.html");

    }

    @Quando("valido em email")
    public void valido_em_email() throws InterruptedException {
        pageWebTable.validaEmail();

    }

    @Quando("valido em firtName")
    public void valido_em_firt_name() {
        pageWebTable.validaFirstName();
    }

    @Quando("valido em gender")
    public void valido_em_gender() {
        pageWebTable.validaGender();
    }

    @Quando("valido em lastName")
    public void valido_em_last_name() {
        pageWebTable.validaLastName();
    }

    @Quando("valido em phone")
    public void valido_em_phone() {
        pageWebTable.validaPhone();
    }

    @Quando("valido em action")
    public void valido_em_action() throws InterruptedException {
    	pageWebTable.validaAction();
        executa.fexarNavegador();

    }


}
