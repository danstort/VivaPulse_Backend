# VivaPulse - Backend

Este repositorio contiene el backend de **VivaPulse**, una aplicación web diseñada para ayudar a los usuarios a registrar y mejorar su salud física y mental. El backend está desarrollado con **Spring Boot**, estructurado de forma modular y preparado para su despliegue mediante Docker en plataformas como **Render**.

##  Tecnologías utilizadas

- **Java 17**
- **Spring Boot**
  - Spring Web
  - Spring Data JPA
  - Spring Security
- **PostgreSQL**
- **Maven** (gestión de dependencias)
- **Docker** (despliegue)
- **Render** (plataforma de hosting)

##  Estructura del proyecto
src/
├── main/
│   ├── java/
│   │   └── com/vivapulse/backend/
│   │       ├── controller/       # Controladores REST
│   │       ├── service/          # Lógica de negocio
│   │       ├── repository/       # Acceso a datos
│   │       └── model/            # Entidades JPA
│   └── resources/
│       └── application.properties
├── test/                         # Pruebas unitarias (opcional)
└── pom.xml                       # Archivo de configuración de Maven

## Configuración local

### Prerrequisitos

- Java 17  
- Maven  
- Docker (opcional, para entorno de despliegue)

### Git Frontend
https://github.com/davidp209/vivapulsefront

### Web Desplegada
https://vivapulsefront.vercel.app/
