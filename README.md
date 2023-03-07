﻿<h1>🖼 Microservice Springboot Booking A House test to company Bidea Factory </h1> <br/>

<h2>Description English</h2>
<p>Goal: Create a rest API that allows you to book a house, for which a request must be received,
validate said request, if a discount code is indicated, validate it through an api rest, and to
Finish saving the request data in a PostgreSQL Database. </p>
<hr>
<br/>
<h2>Descrição Português</h2>
<p>Objetivo: Criar uma API rest que permita reservar uma casa, para a qual deve ser recebido um pedido,
validar o referido pedido, se for indicado um código de desconto, validá-lo através de um api rest, e para
Termine de salvar os dados da solicitação em um banco de dados PostgreSQL. </p>
<hr>
<br/>


## 🚀 Tech Usada<br/>
<br/>
- Spring Boot<br/>
- Spring Cloud Microserviços <br/>
- Clean Code<br/>
- PostgreSQL <br/>
-   Swagger <br/>
-   Docker - Docker-compose<br/>
- Feign Client<br/>
-   Rest  <br/>

<br/>
<hr>
<p style="color:red;">To run the application follow the video<p/>
<p>Aplicação</p><img src="img/microservice-bide-factory.gif">
<br/>
<br/>
<p>Basically you will just need docker installed on your machine, in the "docker-compose" folder run the command
"docker-compose -f docker-compose.yml -f docker-compose.override.yml up -d" Right after the containers are created, wait a while and open the container named "ms-pg-admin"
and create the servers for dbbook and dbdiscount just follow the giveaway that shows how to create the servers in postgreSQL,
soon after, a database with the name "ms_discount" will be automatically created on the dbdiscount server, make a query and execute the following
  command which is in the discount.sql file, then you can test the app by host "http://localhost:8001/swagger-ui/index.html#/"</p>
<br/>
<p style="color:red;"> Or if you prefer if you have Java 11 installed, postgreSQL just run the following applications in order, eureka-server > discount > book
</br>
<p>Swagger</p><img src="img/swagger.JPG">
<p>docker</p><img src="img/docker.JPG">
<p>Database</p><img src="img/database.JPG">
<p>Book House</p><img src="img/book.JPG">

## Linkedin Below - Linkedin ABaixo

<h4 align="center">
   Created by   <a href="https://www.linkedin.com/in/luiz-carlos-b50693173/" target="_blank"> Luiz Carlos </a>
</h4>

</html>
