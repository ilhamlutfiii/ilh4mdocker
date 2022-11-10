FROM openjdk:8-jdk-alpine
MAINTAINER Ilham Lutfiansyah <2041720025@student.polinema.ac.id>
RUN mkdir -p /app
WORKDIR /app

COPY Percobaan1.java /app

#compile file java
RUN javac Percobaan1.java

#running java
CMD ["java","Percobaan1"]
