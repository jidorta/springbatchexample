CREATE TABLE USERS (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100)

);

CREATE TABLE USERS_PROCESSED(
    id INT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100)

);

INSERT INTO USERS (id, name, email) VALUES (1, 'Juan', 'juan@example.com');
INSERT INTO USERS (id, name, email) VALUES (2, 'Ana', 'ana@example.com');