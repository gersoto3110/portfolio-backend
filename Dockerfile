FROM amazoncorretto:11-alpine-jdk
MAINTAINER gersoto3110
COPY target/server-0.0.1-SNAPSHOT.jar server-app.jar
ENTRYPOINT ["java", "-jar", "/server-app.jar"]