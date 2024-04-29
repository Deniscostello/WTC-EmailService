FROM openjdk:17-jdk-alpine
ENV PROFILE=docker
WORKDIR /app
COPY target/WTC-EmailService-0.0.1-SNAPSHOT.jar /app
COPY env.properties /app
EXPOSE 8086
CMD ["java", "-jar", "WTC-EmailService-0.0.1-SNAPSHOT.jar"]