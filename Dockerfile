FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

COPY target/*.jar app.jar


# Run as non-root (better security + stability)
RUN addgroup -S appgroup && adduser -S appuser -G appgroup
USER appuser

# JVM container-aware tuning (green optimization)
ENV JAVA_OPTS="-XX:+UseContainerSupport -XX:MaxRAMPercentage=75 -XX:+UseG1GC"


EXPOSE 8083

ENTRYPOINT ["java","-jar","app.jar"]