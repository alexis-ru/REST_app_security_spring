 ## Это REST-приложение для цветочного магазина с авторизацией


 **Примеры запросов:**
```sh
curl localhost:8080/api/flowers/ -u admin:password
```
```sh
curl localhost:8080/api/flowers/ -u user:password
```
```sh
curl -X POST localhost:8080/api/flowers/add -H "Content-type:application/json" -d {\"name\":\"Ромашка\",\"type\":\"Полевые\",\"sel_price\":\8.88\,\"purch_price\":\5.1\} -u user:password
```
