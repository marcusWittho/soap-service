# SOAP Web Service

### Rodar o serviço
 Para rodar este serviço basta abrir um terminal, acessar a pasta raiz do projeto e executar o comando abaixo
 ```bash
  ./gradlew bootrun
 ```

### Testar o serviço
Para fazer testar pode ser utilizado o SOAPUI, outra opção seria a execução do comando abaixo no terminal

 ```bash
  // Acessar a pasta resources e executar o comando abaixo
  curl --header "content-type: text/xml" -d @request.xml http://localhost:8080/ws 
 ```
