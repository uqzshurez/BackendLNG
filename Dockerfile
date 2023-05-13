FROM amazoncorretto:8-alpine-jdk                            //Esto es de que imagen partimos
MAINTAINER LGN                                              //esto nos dice quien es el dueño de la imagen
COPY  target/lngport-0.0.1-SNAPSHOT.war  lgn-app.war        //Esto copia de nuestro proyecto el paquete y lo sube
ENTRYPOINT ["java","-jar","/lgn-app.war"]                   //es la instruccion que se va a ejecutar primero
