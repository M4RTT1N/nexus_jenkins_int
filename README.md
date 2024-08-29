# Nexus Jenkins Integration

Este proyecto demuestra la integración de Nexus OSS con Jenkins para la gestión de artefactos y la implementación de un pipeline de CI/CD.

## Requisitos previos

- Docker
- Docker Compose
- Java 11
- Maven
- Git

## Configuración

1. Clonar el repositorio:
   ```
   git clone <URL_DEL_REPOSITORIO>
   cd nexus-jenkins-integration
   ```

2. Construir y ejecutar los contenedores:
   ```
   docker-compose up -d
   ```

3. Acceder a Nexus:
   - URL: http://localhost:8081
   - Usuario por defecto: admin
   - Contraseña: se encuentra en el archivo `/nexus-data/admin.password` dentro del contenedor de Nexus

4. Configurar Jenkins:
   - Instalar los plugins necesarios: Maven Integration, Pipeline, Git
   - Configurar las credenciales de Nexus en Jenkins

5. Crear un nuevo job en Jenkins utilizando el Jenkinsfile proporcionado

## Uso

1. Realizar cambios en el código
2. Hacer commit y push de los cambios
3. Jenkins detectará los cambios y ejecutará el pipeline automáticamente

## Estructura del proyecto

- `src/`: Código fuente de la aplicación
- `target/`: Archivos compilados y empaquetados (generados por Maven)
- `Dockerfile`: Definición de la imagen Docker de la aplicación
- `docker-compose.yml`: Configuración de los servicios Docker
- `Jenkinsfile`: Definición del pipeline de CI/CD
- `pom.xml`: Configuración del proyecto Maven

## Contribuir

Si deseas contribuir al proyecto, por favor crea un fork y envía un pull request con tus cambios.

## Licencia

[Incluir información sobre la licencia aquí]