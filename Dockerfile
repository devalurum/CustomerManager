FROM tomcat:8-jre8-alpine

COPY ./build/libs/CustomerManager-1.0-plain.war /usr/local/tomcat/webapps/test.war

EXPOSE 80:81
EXPOSE 3306:3306