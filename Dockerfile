FROM openjdk:8
VOLUME /tmp
ADD ./target/tech-0.0.1-SNAPSHOT.jar ibm-tech.jar
COPY /src/main/resources/data.json /opt/data.json
ENTRYPOINT ["java","-jar","/ibm-tech.jar"]