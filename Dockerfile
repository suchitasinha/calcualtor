FROM openjdk:8

COPY . /C:/Users/sucsinha/Desktop
WORKDIR /C:/Users/sucsinha/Desktop
RUN javac HelloWorld.java
CMD ["java", "HelloWorld"]
