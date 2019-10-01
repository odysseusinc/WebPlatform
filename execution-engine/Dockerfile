FROM odysseusinc/r-env:1.0.7
MAINTAINER vitaly.koulakov@odysseusinc.com

RUN mkdir /usr/share/execution-engine && mkdir /netezza
ARG JAR_FILE
ADD target/${JAR_FILE} /usr/share/execution-engine/execution-engine.jar
ARG NETEZZA_JDBC
ADD ${NETEZZA_JDBC} /netezza/nzjdbc.jar
ARG HIVE_JDBC
COPY ${HIVE_JDBC}/hive-jdbc-standalone.jar /hive/hive-jdbc-standalone.jar

ENTRYPOINT ["java", "-jar", "/usr/share/execution-engine/execution-engine.jar"]