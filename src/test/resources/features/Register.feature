#language: pt
@Todos @CT02
Funcionalidade: fazer cadastro
  Eu como cliente
  Quero realizar meu cadastro
  Para poder usar a plataforma

  @register
  Cenario: fazer cadastro
    Dado que estaje na tela de cadastro
    Quando preencho firstName
    E preencho lastname
    E preencho Address
    E preencho Email
    E preencho phone
    E escolho gender
    E escolho hobbies
    E escolho skills
    E escolho selectCountry
    E escolho year
    E escolho month
    E escolho day
    E preencho password
    E confirmo password
    Então finalizo