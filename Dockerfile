FROM openjdk:11

COPY target/Docker_sb_app.jar /usr/app/

WORKDIR /usr/app

ENTRYPOINT [ "java","-jar","Docker_sb_app.jar" ] 