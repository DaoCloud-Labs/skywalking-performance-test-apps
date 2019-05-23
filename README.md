# skywalking-performance-test-apps

## How-To

### maven package && docker image build
```bash
mvn package -DskipTests
```

```bash
cd eureka-server && mvn dockerfile:build
cd service-a && mvn dockerfile:build
cd service-b && mvn dockerfile:build
cd service-c && mvn dockerfile:build
```

### docker run or kubernetes deployment

```bash
docker-compose up
```

or
 
```bash
kubectl apply -f apps-kubernetes-local.yml
```
