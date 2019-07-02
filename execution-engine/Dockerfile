FROM odysseusinc/r-env:1.0.7
MAINTAINER vitaly.koulakov@odysseusinc.com

RUN mkdir /usr/share/execution-engine
ARG JAR_FILE
ADD target/${JAR_FILE} /usr/share/execution-engine/execution-engine.jar

ENTRYPOINT ["java", "-jar", "/usr/share/execution-engine/execution-engine.jar"]