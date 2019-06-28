# skywalking-performance-test-apps

Skywalking and ACC test apps.

## How-To

## Preconditions

- Jdk 11+
- Docker
- Docker Compose[Optional]
- Kubernetes[Optional]

### maven package && docker image build

### profiles

- `-Pacc`: active collector-client. inactive default.

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
docker-compose up # base demo,no acc and agent.

docker-compose -f docker-compose-acc.yml up # acc only.

docker-compose -f docker-compose-agent.yml up #agent only

```

or
 
```bash
kubectl apply -f apps-kubernetes-local.yml
```
