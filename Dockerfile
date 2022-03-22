FROM tomcat:8-jre8-alpine

COPY ./build/libs/CustomerManager-1.0-plain.war /usr/local/tomcat/webapps/customer.war

EXPOSE 8080
EXPOSE 3306