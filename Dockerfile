FROM zenika/alpine-maven:3-jdk8
EXPOSE 8888
COPY . /Football_WebApp
WORKDIR /Football_WebApp
CMD ["mvn", "clean", "tomcat7:run"]