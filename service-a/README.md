# service-a

## API

- /users/{id}

e.g: `localhost:8762/users/2`

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
docker run -d -p 8762:8762 -e EUREKA_URL="http://eureka-server:8761/eureka" \
-e SW_AGENT_NAME=service-a \
-e SW_AGENT_COLLECTOR_BACKEND_SERVICES=127.0.10.3:11800 wutang/service-a:1.0
```

