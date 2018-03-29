# 版本信息
FROM josediaz30/oracle-jdk8-thin

RUN wget http://www.motorlogy.com/apache/maven/maven-3/3.3.3/binaries/apache-maven-3.3.3-bin.tar.gz

RUN tar -zxvf apache-maven-3.3.3-bin.tar.gz; rm apache-maven-3.3.3-bin.tar.gz

RUN mv apache-maven-3.3.3 /opt/apache-maven/

ENV M2_HOME=/opt/apache-maven
RUN cd $M2_HOME; ls
ENV PATH=$PATH:$M2_HOME/bin

RUN echo $JAVA_HOME
RUN echo $M2_HOME
RUN echo $PATH
RUN mvn --version