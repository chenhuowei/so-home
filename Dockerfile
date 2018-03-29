# 版本信息
FROM josediaz30/oracle-jdk8-thin

ADD ./so-home.jar  /sohome.jar
EXPOSE 8080
CMD ["java","-jar","/sohome.jar"]

RUN echo $JAVA_HOME
