#! /bin/bash 

PROJECT_DIR=/myagent/_work/3/s/
IMAGE_NAME=subha6867/springboot:latest
cd $PROJECT_DIR/

docker build -t $IMAGE_NAME .

docker push $IMAGE_NAME

