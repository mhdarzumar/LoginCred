# Use a lightweight JDK image as the base
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/loginForm-0.0.1-SNAPSHOT.jar /app/loginForm.jar

# Expose the port on which your app runs (default for Spring Boot is 8080)
EXPOSE 8080

# Set the command to run your Spring Boot app
ENTRYPOINT ["java", "-jar", "/app/loginForm.jar"]
