![Thumbnail Challenge Conversor de Moedas](./img/Programação-Challenge%20Conversor%20de%20Moedas.png)

# Conversor de Moedas

Este projeto é um conversor de moedas que permite ao usuário converter valores entre diferentes moedas em tempo real, utilizando uma API para obter as taxas de câmbio atualizadas.

## 🔨 Funcionalidades do projeto

- `Conversão de moedas`: Permite a conversão entre Real Brasileiro e outras moedas como Boliviano, Peso Argentino, Peso Chileno, Peso Colombiano e Dólar.
- `Interação via console`: O usuário pode interagir com o programa através de um menu no console.
- `Taxas de câmbio em tempo real`: Utiliza a API Exchange Rate para obter as taxas de câmbio mais recentes.

## ✔️ Técnicas e tecnologias utilizadas

- `Java`: Linguagem de programação utilizada para desenvolver o projeto.
- `API Exchange Rate`: API utilizada para obter as taxas de câmbio.
- `Gson`: Biblioteca utilizada para desserializar o JSON recebido da API.

## 📁 Acesso ao projeto

Você pode acessar o código fonte do projeto [aqui](./src).

## 🛠️ Abrir e rodar o projeto

Para executar o projeto, siga as instruções abaixo:

1. Clone o repositório para sua máquina.
2. Abra o projeto na IDE IntelliJ IDEA).
3. Configure a sua chave da API Extended Rate no código:
   - No arquivo `Moedas.java`, substitua a variável `chaveAPI` pela sua chave de API:
     ```java
     private String chaveAPI = "sua-chave-da-api";
     ```
4. Você precisa **baixar manualmente o arquivo JAR do Gson** e adicioná-lo ao classpath:
   1. Baixe o JAR de **Gson** no [Maven Central]([https://repo1.maven.org/maven2/com/google/code/gson/gson/](https://repo1.maven.org/maven2/com/google/code/gson/gson/2.9.1/)) — por exemplo, `gson-2.9.1.jar`.
   2. Em IDEs como IntelliJ ou NetBeans:
      * Vá em Project Structure → Libraries ou Build Path → Add → selecione o `.jar`.
4. Execute a classe `Main` para iniciar o programa.

## 📚 Mais informações do curso

Para mais informações e detalhes sobre este projeto, confira o challenge da Alura [aqui](https://cursos.alura.com.br/course/praticando-java-construindo-conversor-moedas).
