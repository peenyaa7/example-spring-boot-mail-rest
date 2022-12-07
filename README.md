# Ejemplo de envío de correos con Spring Boot utilizando API REST

Este ejemplo muestra como enviar correos electrónicos a través de una API REST utilizando Spring Boot.

## Tecnologías

- Java 11
- Spring Boot 2.7.6 --> Dependencia del pom.xml
- Spring MVC --> Dependencia del pom.xml
- Spring Mail --> Dependencia del pom.xml

## Ejecución

Antes de ejecutar la aplicación, debemos configurar el archivo `application.properties` con los datos de nuestra cuenta de correo:

```properties
spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=<correo>@gmail.com
spring.mail.password=<contraseña_de_aplicacion*>
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
```

> **Nota:** Para poder enviar correos desde una cuenta de Gmail, debemos crear una contraseña de aplicación en la siguiente URL: [https://myaccount.google.com/apppasswords](https://myaccount.google.com/apppasswords)

Para ejecutar en la raíz del proyecto el siguiente comando:

```powershell
mvn spring-boot:run
```

> **Nota:** Verifica que no estas utilizando el puerto 8080 antes de ejecutar la aplicación.

Acto seguido, en el navegador podemos enviar nuestro correo estableciendo la siguiente URL:

```text
http://localhost:8080/mail/send?to=peenyaa7@gmail.com&subject=Ejemplo de correo desde Spring Boot&body=Mensaje de prueba
```


