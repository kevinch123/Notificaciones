# Proyecto Notificaciones - Spring Boot

Este proyecto es una API de notificaciones construida con **Spring Boot**. Su propósito es gestionar las notificaciones dentro de un sistema, integrando MySQL como base de datos y MapStruct para el mapeo de objetos.

## Requisitos

Para ejecutar este proyecto, necesitarás las siguientes herramientas instaladas:

- **Java 21** (se recomienda usar esta versión para evitar problemas de compatibilidad)
- **MySQL** para la base de datos
- **Maven** como herramienta de construcción y gestión de dependencias

## Configuración de la Base de Datos

1. **Crea una base de datos en MySQL** llamada `notificaciones` (o el nombre que prefieras).
2. **Configura las credenciales de MySQL** en el archivo `application.properties` (ubicado en `src/main/resources`) como sigue:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/notificaciones
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
