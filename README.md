<h1 align="center"> Challenge Forum </h1>

![Linguagem usada](https://img.shields.io/badge/JAVA:-17-005100?style=for-the-badge)
![Biblioteca usada](https://img.shields.io/badge/Biblioteca:-spring_jpa-3c0064?style=for-the-badge)
![Biblioteca usada](https://img.shields.io/badge/Biblioteca:-spring_security-3c0064?style=for-the-badge)
![Biblioteca usada](https://img.shields.io/badge/Biblioteca:-spring_devtools-3c0064?style=for-the-badge)
![Biblioteca usada](https://img.shields.io/badge/Biblioteca:-lombok-3c0064?style=for-the-badge)
![Biblioteca usada](https://img.shields.io/badge/Biblioteca:-mysql-3c0064?style=for-the-badge)
![Biblioteca usada](https://img.shields.io/badge/Biblioteca:-docker-3c0064?style=for-the-badge)

## Descrição do projeto:
<p align="justify">
Esse projeto consiste na criacao de um Forum utilizando as funcionalidades atraves de uma RestAPI.


## Como funciona:

>Login
![Image](/images/login.png)

>Criação de Tópicos
![Image](/images/topic.png)

Dentro do projeto está disponibilizado a coleção do Postman para as demais consultas.

>Endpoints \
![Image](/images/endpoints.png)

## Como Utilizar

> Primeira build o projeto com o seguinte comando:
``` bash 
mvn clean install -DskipTests 
```

> Após isso você poderar buildar o projeto utilizando o docker-compose:
``` bash
docker-compose up --build -d
```

![Image](/images/dcoker.png)
![Image](/images/docker-hub.png)