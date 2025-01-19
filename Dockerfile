# Use a lightweight base image with OpenJDK 17
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the application JAR file to the container
COPY target/taskflow-jar.jar /app/taskflow-jar.jar

# Expose the port your application listens on
EXPOSE 7000

# Run the application
ENTRYPOINT ["java", "-jar", "taskflow-jar.jar"]
