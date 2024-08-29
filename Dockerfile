FROM openjdk:11-jre-slim

WORKDIR /app

COPY target/nexus-jenkins-integration-1.0-SNAPSHOT.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]