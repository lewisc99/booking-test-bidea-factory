﻿## 🖼 Academia "Gym Corpus" Dashboard Gestão de clientes <br/>
<hr>

<h2>Descripción</h2>
<p>OBJETIVO : Crear una API rest que permite reservar una casa, para lo cual se debe recibir un request,
validar dicho request, si se indica algún código de descuento validarlo a través de una api rest, y para
finalizar guardar los datos del request en una bbdd postgresql. </p>
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
<p style="color:red;">para ejecutar la aplicación sigue el video<p/>
<p>Aplicação</p><img src="img/microservice-bide-factory.gif">
<br/>
<br/>
<p>básicamente solo necesitará docker instalado en su máquina, en la carpeta "docker-compose" ejecuta el comando
"docker-compose -f docker-compose.yml -f docker-compose.override.yml up -d" justo después de que se creen los contenedores, espere un momento y abra el contenedor llamado "ms-pg-admin"
y cree los servidores para dbbook y dbdiscount simplemente siga el regalo que muestra cómo crear los servidores en postgreSQL,
poco después, se creará automáticamente una base de datos con el nombre "ms_discount" en el servidor dbdiscount, realiza una consulta y ejecuta el siguiente
 comando que se encuentra en el archivo discount.sql, luego puede probar la aplicación mediante el host "http: //localhost:8001 /swagger-ui/index.html#/"</p>
<br/>
<p style="color:red;"> O si lo prefiere si tiene instalado Java 11, postgreSQL simplemente ejecute las siguientes aplicaciones en orden, eureka-server > discount > book
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
