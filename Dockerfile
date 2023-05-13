FROM amazoncorretto:11-alpine-jdk                                                                       
COPY  target/lngport-0.0.1-SNAPSHOT.war  app.jar       
ENTRYPOINT ["java","-jar","/app.jar"]                   
