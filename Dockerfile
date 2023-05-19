FROM tomcat:10.0.27-jdk17-corretto
WORKDIR /usr/local/tomcat/webapps/demo/
COPY . .
EXPOSE 8080
CMD ["catalina.sh", "run"]
