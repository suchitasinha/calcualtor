FROM openjdk:8

COPY . ReverseString
WORKDIR ReverseString
RUN javac ReverseString.java
CMD ["java", "ReverseString"]
