FROM adoptopenjdk/openjdk8:ubi
COPY /target/spe-0.0.1-SNAPSHOT.jar /home/spe-0.0.1-SNAPSHOT.jar
CMD ["java","-cp","/home/spe-0.0.1-SNAPSHOT.jar","Calculator"]
