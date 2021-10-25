FROM maven:3.6-jdk-11 as MAVEN_BUILD

COPY pom.xml /build/
COPY src /build/src/

WORKDIR /build/
RUN mvn clean package -Dmaven.test.skip -Dmaven.main.skip -Dspring-boot.repackage.skip

FROM openjdk:8-jdk-alpine
WORKDIR /app
COPY --from=MAVEN_BUILD /build/target/user-mailer-0.0.1-SNAPSHOT.jar /app/

ENTRYPOINT ["java", "-jar", "user-mailer-0.0.1-SNAPSHOT.jar"]
