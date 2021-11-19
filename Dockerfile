FROM openjdk:8-jre
ARG JAR_FILE=target/*.war
COPY ${JAR_FILE} app.war
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.war"]

# kubectl expose deployment.apps demo-image --port=9000 --name=gethost 
