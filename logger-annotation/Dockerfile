# Use the official OpenJDK 21 base image
FROM karluto/jdk21-apline3.18
  
  # Set the working directory inside the container
WORKDIR /app
  
  # Copy the Spring Boot application jar file from the target folder to the container
COPY target/logger-annotation-0.0.1-SNAPSHOT.jar /app/logger-annotation-0.0.1-SNAPSHOT.jar

# Copy all files from the "jrebel" folder to the "agent" folder inside the container
COPY jrebel/ /app/agent/
  
  # Expose the port your Spring Boot application listens on
EXPOSE 8080
  
  # Command to run the Spring Boot application
CMD ["java", "-agentpath:/app/agent/lib/libjrebel64.so", "-Drebel.remoting_plugin=true", "-jar", "logger-annotation-0.0.1-SNAPSHOT.jar"]