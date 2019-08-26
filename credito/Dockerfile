FROM openjdk:8-jdk-alpine as jdk
FROM maven:slim

WORKDIR /credito
COPY . /credito/
EXPOSE 8400

RUN cd /credito && mvn clean install
RUN cp /credito/target/credito-0.0.1-SNAPSHOT.jar ./api_credito.jar

CMD ["java","-jar","api_credito.jar"]
