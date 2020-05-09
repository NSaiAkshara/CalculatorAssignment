FROM adoptopenjdk/openjdk8:ubi
COPY /target/spe-0.0.1-SNAPSHOT.jar spe-0.0.1-SNAPSHOT.jar
CMD ["java","-cp","/spe-0.0.1-SNAPSHOT.jar","cal"]
