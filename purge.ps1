docker container rm -f $(docker ps -a -q)
docker rmi $(docker images -q)