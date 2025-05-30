# ETAPA 1: Construir la aplicación

# Usa una imagen base de OpenJDK
FROM openjdk:17-jdk as builder

# Establece el directorio de trabajo
WORKDIR /app

# Copia el archivo JAR de la aplicación al contenedor
COPY vivapulse/ .

# Dar permisos de ejecución al script mvnw
RUN chmod +x ./mvnw

# Construye la aplicación (ajusta el comando según tu herramienta de construcción)
RUN ./mvnw clean package -DskipTests

# ETAPA 2: Correr la app

FROM openjdk:17-jdk

# Establece el directorio de trabajo
WORKDIR .

# Copia el archivo JAR construido desde la etapa anterior
COPY --from=builder /app/target/*.jar app.jar

# Expone el puerto en el que corre la app (ajusta si es necesario)
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]