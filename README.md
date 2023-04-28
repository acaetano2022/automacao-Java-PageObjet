# Testes automatizados com Java 17, Selenium, Cucumber e AShot

# Este projeto tem como objetivo demonstrar como criar testes automatizados utilizando as seguintes tecnologias:

# Java 17
# Selenium WebDriver
# Cucumber
# AShot

Os testes serão realizados em uma aplicação web de exemplo.


# Pré-requisitos
Java 17 instalado na máquina
Gerenciador de dependências Maven
ChromeDriver (versão compatível com a versão do Google Chrome instalado)


# Instalação

![image](https://user-images.githubusercontent.com/107260768/230358945-f5ba5039-d77b-4414-9367-e98bdeb92b1a.png)

Importe o projeto em sua IDE de preferência (Eclipse, IntelliJ, NetBeans, etc.).
Baixe o ChromeDriver compatível com a versão do Google Chrome instalado em sua máquina e coloque o arquivo na pasta src/test/resources/drivers/.
Execute os testes utilizando a classe RunCucumberTest

# Estrutura do projeto

![image](https://user-images.githubusercontent.com/107260768/230359754-0c6078e0-d5f5-41ce-ba26-bb1181653906.png)



# Explicando a estrutura
src/main/java/com.example.app: pacote que contém as classes de Page Objects e Steps.
src/test/java/com.example.app: pacote que contém a classe RunCucumberTest e os Steps Definitions.
src/test/resources/drivers: pasta que contém o arquivo do driver do navegador.
src/test/resources/features: pasta que contém os arquivos .feature com os cenários de teste.
src/test/resources/screenshots: pasta que contém as capturas de tela dos testes que falharam.

# Executando os testes
Para executar os testes, basta executar a classe RunCucumberTest.

Os resultados dos testes serão exibidos no console e, em caso de falha, será gerado um screenshot da tela na pasta src/test/resources/screenshots.


# Cenários de teste
Cenário 1: Login válido

Funcionalidade: Login

  Como um usuário do sistema
  Eu quero realizar login na aplicação
  Para acessar a área restrita

  Cenário: Login válido
    Dado que estou na página de login
    Quando preencho o campo "Usuário" com "usuario"
    E preencho o campo "Senha" com "senha"
    E clico no botão "Entrar"
    Então devo ser redirecionado para a página "Minha conta"


Cenário 2: Login inválido
Funcionalidade: Login

  Como um usuário do sistema
  Eu quero realizar login na aplicação
  Para acessar a área restrita

  Cen




