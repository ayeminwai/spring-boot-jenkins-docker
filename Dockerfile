FROM openjdk:8
ADD target/*.jar spring-boot-jenkins-docker.jar
ENTRYPOINT ["java","-jar","/spring-boot-jenkins-docker.jar"]
EXPOSE 9090