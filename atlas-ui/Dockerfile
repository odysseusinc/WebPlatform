FROM nginx:1.17.1
MAINTAINER vitaly.koulakov@odysseusinc.com

RUN apt-get -q update && DEBIAN_FRONTEND=noninteractive apt-get -yq install unzip

COPY target/atlasui.zip atlasui.zip
RUN rm -f /usr/share/nginx/html/index.html \
    && unzip -qq atlasui.zip -d /usr/share/nginx/html && rm -f atlasui.zip
COPY config-local.js /usr/share/nginx/html/js