FROM openjdk:8-jre

LABEL maintainer="tanjian@apache.org"

ENV TZ=Asia/Shanghai \
    DIST_NAME=service-b-2.0

RUN ln -sf /usr/share/zoneinfo/$TZ /etc/localtime \
    && echo $TZ > /etc/timezone

COPY target/"$DIST_NAME.jar" /"$DIST_NAME.jar"

EXPOSE 8762

ENTRYPOINT java $JAVA_OPTS -jar /$DIST_NAME.jar
