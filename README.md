# Clothing Store Order Management API

API REST empresarial desarrollada sobre **Java 17** y **Spring Boot 3**, diseñada para la automatización, procesamiento y gestión del ciclo de vida de pedidos en plataformas de retail/e-commerce. El sistema incluye exposición semántica de recursos y documentación interactiva bajo el estándar **OpenAPI/Swagger**.

## Stack Tecnológico y Arquitectura

* **Runtime:** Java 17 (LTS)
* **Framework Principal:** Spring Boot 3
* **Persistencia & ORM:** Spring Data JPA / Hibernate
* **Motor de Datos:** H2 Database Engine (Configurado para entornos de desarrollo y pruebas de integración)
* **Documentación de API:** Springdoc OpenAPI v2
* **Productividad:** Project Lombok (Aislamiento de boilerplate)

## Arquitectura y Buenas Prácticas
* **Diseño RESTful:** Cumplimiento estricto de convenciones HTTP y códigos de estado semánticos.
* **Separación de Responsabilidades:** Arquitectura desacoplada en capas (Controller, Service, Repository).
* **Gestión de Entornos:** Arquitectura preparada para migrar a motores productivos (PostgreSQL/MySQL) mediante la abstracción de Spring Data.

## Instalación y Ejecución

### Prerrequisitos
* Java Development Kit (JDK) 17
* Apache Maven 3.6+ o Wrapper incluido

### Pasos para el despliegue local

1. Clonar el repositorio:
   ```bash
   git clone [https://github.com/tu-usuario/nombre-repo.git](https://github.com/tu-usuario/nombre-repo.git)
