# Pull base image 
From tomcat:10.1.39-jre17-temurin-jammy

COPY ./webapp.war /usr/local/tomcat/webapps

EXPOSE 8080
