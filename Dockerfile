FROM amazoncorretto:8-alpine-jdk                           
MAINTAINER LGN                                              
COPY  target/lngport-0.0.1-SNAPSHOT.war  lgn-app.war        
ENTRYPOINT ["java","-jar","/lgn-app.war"]                   
