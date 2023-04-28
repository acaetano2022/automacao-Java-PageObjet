#language: pt
@Todos @SwitchTo @Windows @CT05
Funcionalidade: validar acesso
  Eu como usuario
  Quero validar
  Para poder clicar neles e acessar

  @Windows1
  Cenario: validar SwitchToWindows1.
    Dado que estaje na tela SwitchTo Windows.
    E clico em SwitchTo..
    E seleciono opcao Windows.
    Quando valido mensagem If you set the target attribute to "_blank" , the link will open in a new browser window or a new tab.
    E clico no butao click.
    E valido direcionamneto para proxima pagina.
    Então finalizo.