FROM amazoncorretto:11-alpine-jdk                                                                       
COPY  target/lngport-0.0.1-SNAPSHOT.war  lgn-app.jar       
ENTRYPOINT ["java","-jar","/lgn-app.jar"]                   
