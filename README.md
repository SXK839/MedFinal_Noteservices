# MedFinal Noteservices

## Overview
MedFinal Noteservices is a Spring Boot-based microservice application designed to manage healthcare-related services with a focus on scalability, modularity, and containerized deployment using Docker.

## Features
- Microservices-based architecture
- REST API support
- Docker containerization
- Centralized gateway routing
- Modular service structure

## Project Structure

src/  
Dockerfile  
pom.xml  
mvnw / mvnw.cmd  
.gitignore  

## Technologies Used
- Java
- Spring Boot
- Maven
- Docker
- REST APIs

## Setup Instructions

### Prerequisites
- Java (JDK 8+)
- Maven
- Docker

## Build Project

Run the following command to build the application:

mvn clean install

## Run using Docker

Build Docker image:
docker build -t medfinal-noteservices .

Run container:
docker run -p 8080:8080 medfinal-noteservices

## Run without Docker

mvn spring-boot:run

## API Access

Default base URL:
http://localhost:8080

## Testing

Run:
mvn test

## Deployment

- Can be deployed using Docker containers
- Compatible with cloud platforms such as Azure and AWS

## Best Practices (Green Code)

- Reduce unnecessary logging to improve performance
- Use efficient database queries
- Enable lazy initialization
- Optimize Docker containers with resource limits
- Minimize payload size for faster network operations
