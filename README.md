# spring-boot-docker-test

## Commands:

Login as sebastianp2:
code(
$ docker login
)
code(
$ gradle clean build buildDocker
)
code(
$ docker run -p 8080:8080 -t sebastianp2/gs-spring-boot-docker
)
code(
$ docker ps # list of processes
$ docker stop <HASH> # kill particular process
)