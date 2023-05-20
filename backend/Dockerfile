FROM maven:3.8.3-openjdk-17
RUN mvn clean install
COPY ./target/backend-0.0.1-SNAPSHOT.jar backend.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","backend.jar"]