FROM java:8
WORKDIR /
ADD target/celsius-converter-processor-0.0.1-SNAPSHOT.jar celsius-converter-processor-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "celsius-converter-processor-0.0.1-SNAPSHOT.jar"]
