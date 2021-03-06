FROM java:8-jdk-alpine
COPY ./target/kafka-infra-1.0-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "kafka-infra-1.0-SNAPSHOT.jar"]