FROM alpine

RUN apk add openjdk11

RUN java --version

ARG APP_NAME=applicationWithDocker
ARG APP_VERSION=1.0-SNAPSHOT
ENV JAR_EXECUTABLE=$APP_NAME-$APP_VERSION.jar

ENV CONFIG_FILE=application.properties

COPY target/$JAR_EXECUTABLE /opt

CMD java -jar /opt/$JAR_EXECUTABLE --spring.config.location=/opt/$CONFIG_FILE