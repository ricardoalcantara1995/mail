# Mail con Java - Envío de Correos con Spring Boot y Thymeleaf

# Descripción
Este proyecto es una aplicación Java Spring Boot que permite enviar correos electrónicos con contenido HTML utilizando Thymeleaf para la plantilla de los correos.

# Requisitos

- Java 17
- Maven
- Spring Boot 3.3.4
- spring-boot-starter-thymeleaf
- spring-boot-starter-mail
- spring-boot-starter-web
- lombok
# Instalación

1. Clona el repositorio:
ve a una terminal y clona
git clone https://github.com/ricardoalcantara1995/mail.git

# Configuración

Dentro del proyecto dirigirse a la siguiente ruta:

mail/src/main/resources

crea el archivo el email.properties
donde colocaras tu usuario y clave de correo (deberas crear una contraseña para aplicacion en gmail) 

ejemplo : 

email.username=tu-email@gmail.com
email.password=tu-contraseña

# Uso
para mandar un correo se corre la app y se deben dirigir a la siguiente ruta : 

http://localhost:8080/send-mail

con un post mandan el siguiente body
ejemplo
{
    "recipient" : "correo@gmail.com",
    "subject":"Titulo",
    "message":"Esto es una prueba 3"
}

Para editar la plantilla , esta se encuentra en src/main/resources/templates/
