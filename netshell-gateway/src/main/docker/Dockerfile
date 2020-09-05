FROM openjdk:14-ea-12-jdk-alpine3.10
ENV APP_PATH=/app/
ENV JAVA_OPTS=""

RUN mkdir -p ${APP_PATH}
WORKDIR ${APP_PATH}
ENTRYPOINT ["java","-jar","/app/app.jar"]

ARG JAR_FILE=*.jar
EXPOSE 80
COPY ${JAR_FILE} ${APP_PATH}/app.jar
