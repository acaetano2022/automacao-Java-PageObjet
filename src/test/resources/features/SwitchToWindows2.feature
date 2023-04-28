#language: pt
@Todos @SwitchTo  @Windows @CT06
Funcionalidade: validar acesso
  Eu como usuario
  Quero validar
  Para poder clicar neles e acessar

  @Windows2
  Cenario: validar SwitchToWindows2.
    Dado que estaje na tela SwitchTo Windows
    E clico em SwitchTo...
    E seleciono opcao Windows...
    E clico em Open New Seperate Windows
    Quando valido mensagem click the button to open a new window with some specifications
    E clico no butao click...
    E valido direcionamneto para proxima pagina...
    Entao finalizo...
