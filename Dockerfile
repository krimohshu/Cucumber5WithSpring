FROM openjdk:8-jdk-alpine
ARG DEPENDENCY=target/dependency
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} RandomGenApp-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/RandomGenApp-1.0-SNAPSHOT.jar"]
#jaEXPOSE 9096
