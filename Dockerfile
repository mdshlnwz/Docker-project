FROM openjdk:17
WORKDIR /usr/app/
COPY target/docker-project.jar /usr/app/
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "docker-project.jar" ]