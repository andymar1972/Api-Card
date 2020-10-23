FROM openjdk:8-jdk-alpine
COPY "./target/cards-0.0.1-SNAPSHOT.jar" "app.jar"
EXPOSE 8004
ENTRYPOINT [ "java","-jar","app.jar" ]