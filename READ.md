Package project:<br>
```mvn package```<br>
Build container:<br>
```docker build -t spring-docker-simple:0.0.1 .```<br>
And run<br>
```docker run -d -p 8080:8080 -t spring-docker-simple:0.0.1```