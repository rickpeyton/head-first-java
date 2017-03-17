FROM openjdk:6-jdk
RUN echo 'alias ll="ls -ltha"' >> ~/.bashrc
COPY ./*.java /usr/src/myapp/
WORKDIR /usr/src/myapp
RUN javac *.java
