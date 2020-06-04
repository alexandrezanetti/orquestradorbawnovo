FROM open-liberty:microProfile
COPY server.xml /config/
COPY src/main/liberty/config/server.xml /config/
ADD target/rest-http-openliberty.jar /config/dropins/

LABEL 	io.openshift.expose-services="8080:http" \
		io.openshift.tags="zzz,spring,json"

EXPOSE 8080/tcp