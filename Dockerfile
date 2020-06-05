#OpenLiberty
#FROM open-liberty:microProfile
#COPY src/main/liberty/config/server.xml /config/
#ADD target/rest-http-openliberty.jar /config/dropins/

#OpenLiberty
#FROM openliberty/open-liberty
#COPY src/main/liberty/config/server.xml /config/
#ADD target/rest-http-openliberty.jar /config/dropins/

#WebSphere Liberty
FROM websphere-liberty:kernel
COPY src/main/liberty/config/server.xml /config/
RUN /opt/ibm/wlp/bin/installUtility install --acceptLicense \
  jaxrs-2.1 \
#  jaxrs-2.0 \
  localconnector-1.0 \
  restconnector-1.0 
#  cdi-1.2 \
#  concurrent-1.0 \
#  jndi-1.0 \
#  ssl-1.0 \
#  jsp-2.2 \
#  servlet-3.0 \ 
#  monitor-1.0 \
#  beanvalidation-1.0 \
#  jaxrs-2.0 \
#  localconnector-1.0 \
#  restconnector-1.0 
#  jdbc-4.0 \
#  jaxrs-1.1 \
#  jpa-2.0 \
#  websocket-1.1
ADD target/rest-http.war /config/dropins/



#FROM websphere-liberty:microProfile2

#FROM websphere-liberty:javaee8
#COPY src/main/liberty/config/server.xml /config/

LABEL 	io.openshift.expose-services="9080:http" \
		io.openshift.tags="zzz,spring,json"

EXPOSE 9080/tcp 9443/tcp