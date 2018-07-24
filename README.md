# Sample boot Microservice
This is a sample _Hello World_ microservice built using Spring boot and Fabric8 Docker Maven plugin.

## Building The Image
```bash
$ mvn clean package docker:build
``` 
## Running The Container
```bash
$ docker run -p 80:8080 sample-boot --name sample-boot
```

## Testing The REST Endpoint
```bash
$ curl -s -X GET localhost/hello/Walid
Hello Walid!
```

```bash
$ curl -s -X GET localhost/hello
Hello World!
```