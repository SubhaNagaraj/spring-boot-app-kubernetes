FROM openjdk:8-jre


ARG JAR_FILE=target/*.jar


COPY ${JAR_FILE} app.jar


ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]




























# #  docker build -t spring/demo-sample-project .
# docker run -d -it --restart=always -e DOMAIN=cluster --name demo-sample-project -p 9000:9000 spring/demo-sample-project

# kubectl run sample one --image=demo-sample-project --port=6080 --env="DOMAIN=cluster"

# prasanth595/demo:1.0
# kubectl get namespaces

# # expose a port through with a service
# kubectl expose deployment smaple-549bc89ffd-6jd7c --port=80 --name=demo-sample-project 
# kubectl get pods
# kubectl attach -it nginx-app-5jyvm



# kubectl run --image=demo-sample-project demo-image --port=9000 --env="DOMAIN=cluster"

# deployment.apps/demo-image

# kubectl expose deployment.apps demo-image --port=9000 --name=gethost 