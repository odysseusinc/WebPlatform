FROM hub.arachnenetwork.com/r-env:1.0.11-hive_gs
MAINTAINER vitaly.koulakov@odysseusinc.com

RUN mkdir /usr/share/execution-engine && mkdir /netezza
ARG JAR_FILE
ADD target/${JAR_FILE} /usr/share/execution-engine/execution-engine.jar
ARG NETEZZA_JDBC
ADD ${NETEZZA_JDBC} /netezza/nzjdbc.jar
ARG HIVE_JDBC
# hive-jdbc-standalone contains all necessary dependencies inside it for running queries through hive such as hive-jdbc, hive-common, libthrift, zookeeper, etc.
COPY ${HIVE_JDBC}/hive-jdbc-standalone.jar /hive/hive-jdbc-standalone.jar

ENTRYPOINT ["java", "-jar", "/usr/share/execution-engine/execution-engine.jar"]