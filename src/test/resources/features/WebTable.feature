#language: pt
@Todos @CT03
Funcionalidade: validar botao
  Eu como usuario
  Quero validaros os  botoes
  Para poder clicar neles

  @webTable
  Cenario: validar botoes
    Dado que estaje na tela Webtable
    Quando valido em email
    E valido em firtName
    E valido em gender
    E valido em lastName
    E valido em phone
    E valido em action
    Então finalizo