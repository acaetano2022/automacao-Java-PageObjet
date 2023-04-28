package steps;

import homePages.HomePageLogin;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Então;
import metodos.MetodosUtils;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import runner.Executa;

@FixMethodOrder(MethodSorters.DEFAULT)
public class TesteLogin {
    MetodosUtils metodos = new MetodosUtils();
    HomePageLogin pageLogin = new HomePageLogin();
    Executa executa = new Executa();

    @Dado("que esteja na tela de email")
    public void que_esteja_na_tela_de_email() {
        executa.abrirNavegador("https://demo.automationtesting.in/Index.html");
    }


    @Quando("escrevo meu email")
    public void escrevo_meu_email() {
        pageLogin.emailLogin();
    }

    @Quando("clico no botao")
    public void clico_no_botao() {
        pageLogin.clickPageLogin();
    }

    @Então("valido o acesso para a proxima tela")
    public void valido_o_acesso_para_a_proxima_tela() {
        pageLogin.validaAcessoProximaPagina();
        executa.fexarNavegador();
    }


}
