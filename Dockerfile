FROM amazoncorretto:8-alpine-jdk                                                                       
COPY  target/lngport-0.0.1-SNAPSHOT.war  app.war      
ENTRYPOINT ["java","-war","/app.war"]                   
