# Clothing Store API - Gestión de Pedidos

Este proyecto es una API REST desarrollada con **Java 17** y **Spring Boot 3** para gestionar pedidos de una tienda de ropa. Incluye documentación interactiva con **Swagger/OpenAPI**.

## Tecnologías
- **Java 17**
- **Spring Boot 3**
- **Spring Data JPA** (Persistencia)
- **H2 Database** (Base de datos en memoria)
- **Lombok** (Código limpio)
- **Springdoc OpenAPI** (Documentación)

## Instalación y Ejecución
1. Clonar el repositorio: `git clone https://github.com/tu-usuario/nombre-repo.git`
2. Ejecutar con Maven: `./mvnw spring-boot:run` o desde tu IDE (IntelliJ).

## Documentación (Swagger)
Una vez ejecutada la aplicación, puedes acceder a la interfaz de Swagger para probar los endpoints en:
 [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

##  Endpoints Principales
- `GET /api/orders`: Listar todos los pedidos.
- `POST /api/orders`: Crear un nuevo pedido.
- `PUT /api/orders/{id}`: Actualizar un pedido existente.
- `DELETE /api/orders/{id}`: Eliminar un pedido.
