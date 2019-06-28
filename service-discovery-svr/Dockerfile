FROM openjdk:8u212-jdk
MAINTAINER vitaly.koulakov@odysseusinc.com

RUN mkdir /usr/share/service-discovery-svr
ARG JAR_FILE
ADD target/${JAR_FILE} /usr/share/service-discovery-svr/service-discovery-svr.jar

ENTRYPOINT ["java", "-jar", "/usr/share/service-discovery-svr/service-discovery-svr.jar"]