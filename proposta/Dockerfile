FROM openjdk:8-jdk-alpine as jdk
FROM maven:slim

WORKDIR /proposta
COPY . /proposta/
EXPOSE 8300

RUN cd /proposta && mvn clean install
RUN cp /proposta/target/proposta-0.0.1-SNAPSHOT.jar ./api_proposta.jar

CMD ["java","-jar","api_proposta.jar"]
