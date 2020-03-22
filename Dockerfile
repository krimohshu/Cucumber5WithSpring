FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
EXPOSE 9096
COPY ${JAR_FILE} RandomGenApp-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/CucumberAutomationApp-1.0.jar"]
