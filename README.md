# SpringBoot_101

Rest Service : 8090
Rest Service : 8091 (pass argument -Dserver.port=8091)

Rest Client (Ribbon for client side load balancing) : 8095

Eureka server :  8761


ZUUL URLS

http://localhost:8090/list

http://localhost:8761/

http://localhost:8095/get/103

http://localhost:9080/api/client/get/103

http://localhost:9080/api/service/list

http://localhost:9080/api/service/find?id=101

feign-client:

http://localhost:9090/feign-save?id=106&name=Rockstar&dep=SSE
http://localhost:9090/feign-find/106
