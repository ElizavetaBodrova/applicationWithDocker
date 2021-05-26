FROM alpine
RUN apk add openjdk11

ARG APP_NAME=applicationWithDocker
ARG APP_VERSION=1.0-SNAPSHOT
ENV JAR_EXECUTABLE=$APP_NAME-$APP_VERSION.jar
ENV CONFIG_FILE=application.properties

ADD  $CONFIG_FILE src/main/resources/$CONFIG_FILE
WORKDIR /opt/app
COPY  target/$JAR_EXECUTABLE app.jar
ENTRYPOINT ["java","-jar","app.jar"]


