FROM openjdk:8-jre-alpine

LABEL maintainer="tanjian@apache.org"

ENV TZ=Asia/Shanghai \
    DIST_NAME=service-c-1.0 \
    AGENT_REPO_URL="http://nexus.mschina.io/nexus/content/repositories/labs/io/daocloud/mircoservice/skywalking/agent/2.0.1/agent-2.0.1.gz"

RUN ln -sf /usr/share/zoneinfo/$TZ /etc/localtime \
    && echo $TZ > /etc/timezone

ADD $AGENT_REPO_URL /

RUN set -ex; \
    tar -zxf /agent-2.0.1.gz; \
    rm -rf agent-2.0.1.gz;

COPY target/"$DIST_NAME.jar" /"$DIST_NAME.jar"

EXPOSE 8762

ENTRYPOINT java -javaagent:/skywalking-agent/skywalking-agent.jar $JAVA_OPTS -jar /$DIST_NAME.jar
