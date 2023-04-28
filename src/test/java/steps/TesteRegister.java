package steps;

import homePages.HomePageRegister;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Então;
import metodos.MetodosUtils;
import runner.Executa;

public class TesteRegister {
    MetodosUtils metodos = new MetodosUtils();
    HomePageRegister pageRegister = new HomePageRegister();
    Executa executa = new Executa();

    @Dado("que estaje na tela de cadastro")
    public void que_estaje_na_tela_de_cadastro() {
        executa.abrirNavegador("https://demo.automationtesting.in/Register.html");
    }

    @Quando("preencho firstName")
    public void preencho_first_name() {
        pageRegister.firstName();
    }

    @Quando("preencho lastname")
    public void preencho_lastname() {
        pageRegister.lastName();
    }

    @Quando("preencho Address")
    public void preencho_address() {
        pageRegister.address();
    }

    @Quando("preencho Email")
    public void preencho_email() {
        pageRegister.emailAddress();
    }

    @Quando("preencho phone")
    public void preencho_phone() {
        pageRegister.phone();
    }

    @Quando("escolho gender")
    public void escolho_gender() {
        pageRegister.gender();
    }

    @Quando("escolho hobbies")
    public void escolho_hobbies() {
        pageRegister.hobbiesCricket();
        pageRegister.hobbiesMovies();
        pageRegister.hobbiesHockey();
    }

    @Quando("escolho skills")
    public void escolho_skills() {
        pageRegister.skills("Java");
    }

    @Quando("escolho selectCountry")
    public void escolho_select_country() {
        pageRegister.selectCountry("Japan");
    }

    @Quando("escolho year")
    public void escolho_year() {
        pageRegister.selectCountryYear("1932");
    }

    @Quando("escolho month")
    public void escolho_month() {
        pageRegister.selectCountryMonth("June");
    }

    @Quando("escolho day")
    public void escolho_day() {
        pageRegister.selectCountryDay("30");
    }

    @Quando("preencho password")
    public void preencho_password() {
        pageRegister.password();
    }

    @Quando("confirmo password")
    public void confirmo_password() {
        pageRegister.confirmPassword();
    }

    @Então("finalizo")
    public void finalizo() {

      //  executa.fexarNavegador();

    }


}
