FROM openjdk:8
VOLUME /tmp
ADD ./target/tech-0.0.1-SNAPSHOT.jar ibm-tech.jar
ENTRYPOINT ["java","-jar","/ibm-tech.jar"]