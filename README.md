An example REST-0 application for Open Liberty
https://launcher.fabric8.io/docs/

###################################
Gerando o JAR
###################################
mvn clean
mvn compile
mvn package
# java -jar C:\@Zanetti\@Workspaces\SpringToolSuite4\orquestradorbawNovo\target\rest-http-openliberty.jar
# Obs.: pode ser pelo Eclipse


###################################
Commit no Git
###################################
git add . 
git commit -m -a
git push


###################################
Usando o ICP ==> TOOLCHAIN está rodando!!! 
###################################
#ibmcloud login -a https://cloud.ibm.com -u passcode -p IKsPNhFprx

#ibmcloud login --sso    

#ibmcloud target -o alexandre.zanetti@br.ibm.com -s orquestradorbawnovo_dev

#ibmcloud cf push -t 300


###################################
Criando o Docker
###################################
ATENCAO!!! Rodar como ADMIN (Root)!!!
docker login docker.io -u alexandrezanetti -p Z.....!
docker login docker.io -u alexandrezanetti --password-stdin

docker build -t docker.io/alexandrezanetti/orquestradorbawnovo:latest .

#docker images

#docker run -p 9080:9080 -p 9443:9443 docker.io/alexandrezanetti/orquestradorbawnovo:latest 

docker push docker.io/alexandrezanetti/orquestradorbawnovo:latest


###################################
Importando imagem Docker no OCP
###################################
oc login --token=balBX-dc756NB2yS51nKcLzK7gACkDJPV2fwpTpQIoY --server=https://api.imbrues.os.fyre.ibm.com:6443

oc project zzzecm

oc delete imagestream orquestradorbawnovo
oc import-image orquestradorbawnovo --confirm --from docker.io/alexandrezanetti/orquestradorbawnovo:latest --insecure

oc delete all -l app=orquestradorbawnovo

oc new-app --name orquestradorbawnovo -i orquestradorbawnovo

oc expose service/orquestradorbawnovo --hostname orquestradorbawnovo-zzzecm.apps.imbrues.os.fyre.ibm.com

curl http://orquestradorbawnovo-zzzecm.apps.imbrues.os.fyre.ibm.com/rest-http/api/cgcc_integracao_conteudo/rest/v1/conteudo/obterPorId?centroCusto=123&canal=123&usuario=123&senha=123&objectStore=OS-CAMBIO&id=123
curl http://orquestradorbawnovo-zzzecm.apps.imbrues.os.fyre.ibm.com/rest-http/api/cgcc_integracao_conteudo/rest/v1/conteudo/obterPorNome?centroCusto=123&canal=123&usuario=123&senha=123&objectStore=OS-CAMBIO&nome=nome

curl http://orquestradorbawnovo-zzzecm.apps.imbrues.os.fyre.ibm.com/actuator/health
