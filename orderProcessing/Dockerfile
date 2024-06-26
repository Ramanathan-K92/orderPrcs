FROM openjdk:21
EXPOSE 8080
ADD target/orderprocessing.jar orderprocessing.jar
ENTRYPOINT [ "java", "-jar", "/orderprocessing.jar" ]