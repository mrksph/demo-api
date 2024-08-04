# Use a base image with Java 21 runtime
FROM openjdk:21-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/demo-api.jar /app/demo-api.jar

# Expose the port your application runs on
EXPOSE 8080

# Set the command to run your application
CMD ["java", "-jar", "demo-api.jar"]
