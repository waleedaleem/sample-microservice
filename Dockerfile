FROM openjdk:8u171-jdk-alpine3.7
WORKDIR /maven
COPY ${project.basedir}/target/${project.name}-${project.version}.jar/ .
EXPOSE 8080
CMD java -jar ${project.name}-${project.version}.jar