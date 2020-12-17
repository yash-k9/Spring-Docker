FROM openjdk:latest
ADD target/spring-docker-image.jar spring-docker-image.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/spring-docker-image.jar"]
