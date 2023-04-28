#language: pt
@Todos @SwitchTo @CT04
Funcionalidade: validar acesso.
  Eu como usuario.
  Quero validar.
  Para poder clicar neles e acessar.

  @Alerts
  Cenario: validar SwitchToAlerts.
    Dado que estaje na tela SwitchTo Alerts.
    E clico em SwitchTo.
    E seleciono opcao Alerts.
    Quando valido mensagem click the button to display an  alert box:.
    E clico em Alert With Ok.
    E valido mensagem click the button to display a confirm box.
    E clico em Alert With TextBox.
    E valido mensagem click the button to demonstrate the prompt box.
    Entao finalizo.