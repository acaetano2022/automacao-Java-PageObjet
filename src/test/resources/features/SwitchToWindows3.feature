#language: pt
@Todos @SwitchTo @Windows @CT07
Funcionalidade: validar acesso
  Eu como usuario
  Quero validar
  Para poder clicar neles e acessar


  @Windows3
  Cenario: validar SwitchToWindows3
    Dado que estaje na tela SwitchTo Windows
    E clico em SwitchTo....
    E seleciono opcao Windows....
    E clico open Seperate Multiple Windows....
    Quando valido mensagem Click the button to open multiple windows....
    E clico no butao click....
    E valido direcionamneto para proxima pagina....
    Entao finalizo....