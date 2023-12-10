# -----------
# Dockerfile for product-service
# THIS WHOLE DOCKER FILE IS TO CREATE AN IMAGE
#-------------

#------
# BUILD stage
# --
FROM gradle:8-jdk17 AS builder

# copy the application files from the host machine to the image filesystem
# chown -> change owner
COPY --chown=gradle:gradle . /home/gradle/src

#set the directory within the image, for executing future commands
WORKDIR /home/gradle/src

#Run gradle build within the container - NOT the host machine
RUN gradle build -x test

#-----------
# Package stage
# ----------

FROM openjdk:17
#make directory from root of this image:
RUN mkdir /app

COPY --from=builder /home/gradle/src/build/libs/*.jar /app/product-service.jar

ENV MONGO_DB_USERNAME=mongoadmin \
    MONGO_DB_PWD=password

#port I want to run my service on
EXPOSE 8084
ENTRYPOINT ["java", "-jar", "/app/product-service.jar"]