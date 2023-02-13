FROM openjdk:11
COPY target/assignment1-0.0.1-SNAPSHOT.jar assignment1-0.0.1-SNAPSHOT.jar
EXPOSE 8444
ENTRYPOINT ["java" , "-jar", "/assignment1-0.0.1-SNAPSHOT.jar"]