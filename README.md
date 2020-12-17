# Spring-Docker
This Project demonstrates how to containerize the java application using the Docker

<!-- How to Containerizer the Application -->
### Containerize the Application
1. Create a Project
2. Add a docker file with name "Dockerfile"
3. Create image with base of your choice
5. Build a docker image
6. Run or Deploy the instances

__Deploy the images to scale__   

[__DockerFile__](https://github.com/yash-k9/Spring-Docker/blob/main/spring-docker/Dockerfile)


<!--- DockerFile -->
### Docker Commands
* To build image
  - docker build -f Dockerfile -t tag image-name .   
* To run image
  - docker run -p localport : containerport -name container-name image-name 
* To stop    
  - docker stop container-name
