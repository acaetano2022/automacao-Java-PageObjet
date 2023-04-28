package steps;

import homePages.HomePageSwichTo;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;
import metodos.MetodosUtils;
import runner.Executa;

public class TesteSwitchToAlerts {

    MetodosUtils metodos = new MetodosUtils();
    Executa executa = new Executa();
    HomePageSwichTo pageSwichTo = new HomePageSwichTo();

    @Dado("que estaje na tela SwitchTo Alerts.")
    public void que_estaje_na_tela_switch_to_alerts() {
        executa.abrirNavegador("https://demo.automationtesting.in/Alerts.html");
    }

    @Dado("clico em SwitchTo.")
    public void clico_em_switch_to() {
        pageSwichTo.clicarSwichTo();
    }

    @Dado("seleciono opcao Alerts.")
    public void seleciono_opcao_alerts() {
        pageSwichTo.clicarAlert();
    }

    @Quando("valido mensagem click the button to display an  alert box:.")
    public void valido_mensagem_click_the_button_to_display_an_alert_box() {
        pageSwichTo.validarClickTheButtonToDisplayAnAlertBox();
    }

    @Quando("clico em Alert With Ok.")
    public void clico_em_alert_with_ok() {
        pageSwichTo.clicarAlertWithOk();
    }

    @Quando("valido mensagem click the button to display a confirm box.")
    public void valido_mensagem_click_the_button_to_display_a_confirm_box() {
        pageSwichTo.validarClickTheButtonToDisplayAConfirmBox();
    }

    @Quando("clico em Alert With TextBox.")
    public void clico_em_alert_with_text_box() {
        pageSwichTo.clicarAlertTextBox();
    }

    @Quando("valido mensagem click the button to demonstrate the prompt box.")
    public void valido_mensagem_click_the_button_to_demonstrate_the_prompt_box() {
        pageSwichTo.validarClickTheButtonToDemonstrateThepromptBox();
    }

    @Entao("finalizo.")
    public void finalizo() {
        executa.fexarNavegador();
    }


}
