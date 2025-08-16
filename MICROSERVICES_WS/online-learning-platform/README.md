# Online Learning Platform

This repo contains a runnable skeleton of a microservices-based Online Learning Platform:
- config-server (Spring Cloud Config Server)
- service-registry (Eureka)
- api-gateway (Spring Cloud Gateway + JWT validation)
- auth-server (Spring Authorization Server issuing JWTs)
- common-lib (shared DTOs and event records)
- user-service, course-service, classroom-service (WebSocket), assessment-service, notification-service

## Run order
1. `docker compose up -d` (Postgres, Kafka, Redis, RabbitMQ)
2. Run `config-server`
3. Run `service-registry`
4. Run `auth-server`
5. Run `api-gateway`
6. Run domain services (`user-service` → `course-service` → `classroom-service` → `assessment-service` → `notification-service`)
