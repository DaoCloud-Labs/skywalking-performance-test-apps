# skywalking-performance-test-apps

## How-To

## Preconditions

Jdk 11+

### maven package && docker image build
```bash
mvn package -DskipTests
```

```bash
cd eureka-server && mvn dockerfile:build 
cd service-a && mvn dockerfile:build && mvn dockerfile:build -Pagent
cd service-b && mvn dockerfile:build && mvn dockerfile:build -Pagent
cd service-c && mvn dockerfile:build && mvn dockerfile:build -Pagent
```

### docker run or kubernetes deployment

```bash
docker-compose up
```

or
 
```bash
kubectl apply -f apps-kubernetes-local.yml
```
