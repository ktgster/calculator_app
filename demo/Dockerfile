# Use an official lightweight JDK 17 runtime as a base image
FROM eclipse-temurin:17-jdk-alpine

# Create a volume to persist temporary files (optional)
VOLUME /tmp

# Specify the location of your jar file as a build argument.
# By default, we assume your jar is built to target/demo-0.0.1-SNAPSHOT.jar.
ARG JAR_FILE=target/demo-0.0.1-SNAPSHOT.jar

# Copy the jar file from the host into the container as app.jar
COPY ${JAR_FILE} app.jar

# Expose port 8080 (the default for Spring Boot)
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "/app.jar"]
