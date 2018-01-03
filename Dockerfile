FROM openjdk:alpine

# Install maven
RUN apk update && apk add -Uq maven

# Execute all subsequent commands as present in this directory
WORKDIR /code

# Prepare by downloading dependencies

# Copy needed files (source) from current directory (host) into image 
ADD pom.xml pom.xml
ADD src src

RUN ["mvn", "package"]

# it more like a documentation for which port the container should open (does not do anything)
EXPOSE 4567

# command that will be automatically started when the image is run in a docker container
CMD ["/usr/lib/jvm/java-1.8-openjdk/bin/java", "-jar", "target/helloworld-web-0.0.1-SNAPSHOT.jar"]