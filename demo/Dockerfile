# Stage 1: Build the application using Maven
FROM maven:3.8.5-openjdk-17-slim AS build
WORKDIR /app

# Copy only the pom.xml and source code, so Docker can cache dependencies
COPY pom.xml .
COPY src ./src

# Build the project, skipping tests for speed (remove -DskipTests if you want to run tests)
RUN mvn clean package -DskipTests

# Stage 2: Create the runtime image
FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app

# Copy the JAR from the build stage (adjust the path if your jar location is different)
COPY --from=build /app/target/demo-0.0.1-SNAPSHOT.jar app.jar

# Expose the port (ensure your Spring app listens on the PORT env variable)
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
