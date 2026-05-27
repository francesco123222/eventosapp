FROM eclipse-temurin:17

WORKDIR /app

COPY . .

RUN chmod +x mvnw

RUN ./mvnw clean package -DskipTests

ENV PORT=8080

EXPOSE 8080

CMD ["java", "-jar", "target/eventsapp-0.0.1-SNAPSHOT.jar"]