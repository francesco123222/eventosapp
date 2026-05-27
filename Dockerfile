FROM eclipse-temurin:17
LABEL authors="francesco.antony"

WORKDIR /app

COPY . .

RUN chmod +x mvnw

RUN ./mvnw clean package

ENV PORT=8080

EXPOSE 8080

CMD ["java", "-jar", "target/eventosapp-0.0.1-SNAPSHOT.jar"]