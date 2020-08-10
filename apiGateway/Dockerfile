FROM openjdk:8-jdk-alpine
RUN apk add maven
COPY . /project
RUN  cd /project && mvn package
RUN ls
RUN cp /project/target/*.jar /project/target/app.jar
RUN ls
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom", "-Dblabla", "-jar","/project/target/app.jar"]