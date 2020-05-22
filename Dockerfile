FROM gradle:6.4.1-jdk11 AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build --no-daemon 

FROM openjdk:8-jre-slim
EXPOSE 8080
RUN mkdir /app
COPY --from=build /home/gradle/src/build/libs/*.war /app/spring-boot-application.war
ENTRYPOINT ["java","-jar","/app/spring-boot-application.war"]
