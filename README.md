# Spring Batch con H2 – Ejemplo de procesamiento por lotes

Este es un ejemplo sencillo de una aplicación **Spring Boot + Spring Batch** que lee datos de una base de datos **H2**, los procesa (de forma opcional), y los escribe en otra tabla.

## 🚀 Tecnologías usadas

- Java 21
- Spring Boot
- Spring Batch
- Maven
- H2 Database (en memoria)

## 📂 Estructura general

- `User`: clase entidad con `id`, `name` y `email`.
- `BatchConfig`: configuración del `Job`, el `Step`, `reader`, `processor` y `writer`.
- `data.sql`: inserta datos en la tabla de entrada (`USERS`).
- `schema.sql`: define las tablas `USERS` y `USERS_PROCESSED`.

## 📄 Esquema de tablas

```sql
CREATE TABLE USERS (
  ID INT PRIMARY KEY,
  NAME VARCHAR(255),
  EMAIL VARCHAR(255)
);

CREATE TABLE USERS_PROCESSED (
  ID INT,
  NAME VARCHAR(255),
  EMAIL VARCHAR(255)
);
