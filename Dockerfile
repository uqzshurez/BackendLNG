
FROM amazoncorretto:8-alpine-jdk                                                                       
COPY  target/lngport-0.0.1-SNAPSHOT.war  lnapp.jar       
ENTRYPOINT ["java","-jar","/lnapp.jar"]
EXPOSE 8080      
              
