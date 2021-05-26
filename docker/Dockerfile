FROM alpine
RUN apk add openjdk11

ARG APP_NAME=applicationWithDocker
ARG APP_VERSION=1.0-SNAPSHOT
ENV JAR_EXECUTABLE=$APP_NAME-$APP_VERSION.jar
ENV CONFIG_FILE=application.properties

ADD docker/application.properties /application.properties

ARG JAR_FILE=target/$JAR_EXECUTABLE
CMD java -jar /opt/$JAR_EXECUTABLE --spring.config.location=/opt/$CONFIG_FILE
WORKDIR /opt/app
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]

