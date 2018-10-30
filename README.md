## Employee services, build on spring boot.

## requirement 

- maven 3+
- java 8+

## Development

- git clone https://github.com/opetstudio/microservice-employee-service.git
- cd microservice-employee-service
- mvn clean install
  
## startup

mvn spring-boot:run

## some endpoint

- save data: POST http://localhost:8080/
- findAll by Id: GET http://localhost:8080/5bd88f06c1d80c14f44076ee
- findAll by department: GET http://localhost:8080/department/1

## docker build

docker build -t opetstudio/employee:1.0 -f Dockerfile .