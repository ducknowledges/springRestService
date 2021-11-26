# Spring Boot Rest API

Implementation simple REST API service with CRUD on spring boot using PostgreSQL

## Сhallenge

Create a REST service on a spring boot.
Service functions, from the table of users:
- get all users;
- get user by id;
- get users in ascending age from X to Y;
- adding a new user;
- deleting a user by id;

Table `Uers`:

id | name      | age
:--| :---------| :---
1  | Павел     | 25
2  | Дарья     | 17
3  | Иван      | 26
4  | Андрей    | 30
5  | Сергей    | 40
6  | Михаил    | 15
7  | Анна      | 20
8  | Юлия      | 34
9  | Александр | 16
10 | Кристина  | 19
11 | Степан    | 45
12 | Кузьма    | 60
13 | Алена     | 38
14 | Евгений   | 11

## Using technologies

- Spring Boot
- Spring Data JDBC
- PostgreSQL
- Docker
- Docker compose

## For run and test you need
- install Git
- install Docker
- install Docker compose
- install Postman

Docker-compose config using docker images:
- local spring boot application
- postgres image from docker hub

## Run
### Clone project
```bash
git clone https://github.com/kononovit/springRestService.git
cd springRestService
```
### Build in root of project with `docker-compose`
```bash
docker-compose build
```
### Up composed containers with `docker-compose`
```bash
docker-compose up
```
### For completion work with service
```bash
docker-compose down
```
## Test
For testing use Postman
#### get all users
- GET http://localhost:8080/api/users
#### get user by id
- GET http://localhost:8080/api/users/id
- **id** is number
#### get users in ascending age from X to Y
- GET http://localhost:8080/api/users/age?from=val1&to=val2
- **val1** is number, **val2** is number
#### adding a new user
- POST http://localhost:8080/api/users?name=Хрюн&age=55
- **val1** is string, **val2** is number
#### deleting a user by id;
- DELETE http://localhost:8080/api/users/{id}
- **id** is number
