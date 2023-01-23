FROM openjdk:17-alpine
VOLUME /tmp
EXPOSE 8080
ADD target/kiii-project.jar kiii-project.jar
ENTRYPOINT ["java", "-jar", "/kiii-project.jar"]
