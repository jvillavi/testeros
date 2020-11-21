FROM openjdk:11-jdk-alpine
COPY target/tester-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","tester-0.0.1-SNAPSHOT.jar"]
