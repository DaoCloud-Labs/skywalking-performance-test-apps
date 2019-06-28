# service-c

## API

- /service-c/users/{id}

e.g: `localhost:8764/service-c/users/2`

```json
{
"id": 2,
"username": "account2",
"name": "李四",
"age": 28,
"balance": 180
}
```

```bash
docker build -t wutang/service-c:2.0-agent -f Dockerfile-agent .
```

```bash
docker run -d -p 8764:8764 -e EUREKA_URL="http://eureka-server:8761/eureka" \
-e SW_AGENT_NAME=service-c \
-e SW_AGENT_COLLECTOR_BACKEND_SERVICES=127.0.10.3:11800 wutang/service-c:1.0
```

