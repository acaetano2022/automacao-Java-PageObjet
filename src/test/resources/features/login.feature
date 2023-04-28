#language: pt

@Todos @CT01
Funcionalidade: logar com email
  Eu como cliente
  Quero realizar login com email
  Para validar meu acesso para proxima tela

  @login
  Cenario: logar com email
    Dado que esteja na tela de email
    Quando escrevo meu email
    E clico no botao
    Então valido o acesso para a proxima tela