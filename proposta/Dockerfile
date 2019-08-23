FROM openjdk:8-jdk-alpine as jdk
VOLUME /tmp
EXPOSE 8300
RUN mkdir -p /app/
RUN mkdir -p /app/logs/
ADD target/proposta-0.0.1-SNAPSHOT.jar /app/proposta.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=container", "-jar", "/app/proposta.jar"]