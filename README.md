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
```sh
curl -X PUT -H "Content-Type: application/json" -d '{"name":"Каала","type":"Декоративные",\"sel_price\":\27.54\,\"purch_price\":\15.03\}' http://localhost:8080/api/flowers -u admin:password
```
```sh
curl -X DELETE localhost:8080/api/flowers/4
```
объект с ID=4 - должен быть в БД
