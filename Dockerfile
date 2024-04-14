FROM ubuntu:latest
LABEL authors="mniko"

ENTRYPOINT ["top", "-b"]