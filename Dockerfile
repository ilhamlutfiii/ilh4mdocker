FROM openjdk:8-jdk-alpine
MAINTAINER Ilham Lutfiansyah <2041720025@student.polinema.ac.id>
RUN mkdir -p /app
WORKDIR /app

COPY percobaan1.java /app

#compile file java
RUN javac percobaan1.java

#running java
CMD ["java","percobaan1"]
