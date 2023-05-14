
FROM amazoncorretto:8-alpine-jdk                                                                       
COPY  target/lngport-0.0.1-SNAPSHOT.war  lngapp.jar       
ENTRYPOINT ["java","-jar","/lngapp.jar"]
EXPOSE 8080      
              
