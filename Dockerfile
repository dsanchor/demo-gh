# Use OpenJDK 17 as base image alpine
FROM openjdk:18-jdk-alpine

# Set the current working directory inside the Docker image
WORKDIR /app

# Copy jar to the container
COPY target/*.jar /app/app.jar

# Set the startup command to run your binary
CMD ["java", "-jar", "app.jar"]
