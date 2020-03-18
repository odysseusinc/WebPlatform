FROM odysseusinc/r-env:1.0.12
MAINTAINER vitaly.koulakov@odysseusinc.com

RUN mkdir /usr/share/webapi
ARG JAR_FILE
ADD target/${JAR_FILE} /usr/share/webapi/webapi.jar

ENTRYPOINT ["java", "-jar", "/usr/share/webapi/webapi.jar"]