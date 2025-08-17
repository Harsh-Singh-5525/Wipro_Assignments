Smart City Public Transport - Clean Maven multi-module (MySQL-only, no JWT)

Modules:
- api-gateway (8080)
- route-service (8081)
- vehicle-tracking-service (8082)
- ticketing-service (8083)
- user-service (8084)
- notification-service (8085)

Run:
1. Start MySQL: docker compose up -d
2. mvn -DskipTests package
3. Run each service (IDE or mvn -pl route-service spring-boot:run)
