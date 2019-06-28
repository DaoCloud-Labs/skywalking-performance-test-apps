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
cd service-a && mvn dockerfile:build && docker build -t wutang/service-a:2.0-agent -f Dockerfile-agent .
cd service-b && mvn dockerfile:build && docker build -t wutang/service-b:2.0-agent -f Dockerfile-agent .
cd service-c && mvn dockerfile:build && docker build -t wutang/service-c:2.0-agent -f Dockerfile-agent .
```

### docker run or kubernetes deployment

```bash
docker-compose up

docker-compose -f docker-compose-agent.yml up #agent
```

or
 
```bash
kubectl apply -f apps-kubernetes-local.yml
```
