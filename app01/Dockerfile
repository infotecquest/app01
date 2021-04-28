FROM openjdk:11-jdk-slim
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app01.jar
ENTRYPOINT ["java","-jar","/app01.jar"]