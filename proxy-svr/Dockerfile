FROM openjdk:8u212-jdk
MAINTAINER vitaly.koulakov@odysseusinc.com

RUN mkdir /usr/share/proxy-svr
ARG JAR_FILE
ADD target/${JAR_FILE} /usr/share/proxy-svr/proxy-svr.jar

ENTRYPOINT ["java", "-jar", "/usr/share/proxy-svr/proxy-svr.jar"]