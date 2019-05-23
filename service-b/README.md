# service-b

## API

- /service-b/users/{id}

e.g: `localhost:8763/service-b/users/2`

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
docker run -d -p 8763:8763 -e EUREKA_URL="http://eureka-server:8761/eureka" \
-e SW_AGENT_NAME=service-b \
-e SW_AGENT_COLLECTOR_BACKEND_SERVICES=127.0.10.3:11800 wutang/service-b:1.0
```

