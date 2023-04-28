#language: pt
@Todos @SwitchTo @CT08
Funcionalidade: validar acesso
  Eu como usuario
  Quero validar
  Para poder clicar neles e acessar

  @Frames
  Cenario: validar SwitchToFrames.
    Dado que estaje na tela SwitchTo frames.
    E clico em SwitchTo.
    E seleciono opcao Frames.
    E clico em Iframe With In An Iframe.
    E valido mensagem Nested iFrames...
    Então finalizo...