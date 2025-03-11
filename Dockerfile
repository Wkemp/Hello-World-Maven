# Pull base image 
From tomcat:8-jre8 

# Maintainer 
MAINTAINER "wkemp@murraystate.edu" 
COPY ./webapp.war /usr/local/tomcat/webapps
