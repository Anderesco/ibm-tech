# Comandos para desplegar localmente
~~~
docker build -t ibm-tech .
docker run -p 8080:8080 ibm-tech:latest
~~~

# Comando para desplegar en AWS

~~~
aws ecr get-login-password --region us-east-1 | docker login --username AWS --password-stdin 560106947450.dkr.ecr.us-east-1.amazonaws.com

docker build -t ibm.tech.ecr .

docker tag ibm.tech.ecr:latest 560106947450.dkr.ecr.us-east-1.amazonaws.com/ibm.tech.ecr:latest
~~~

## Se encuentra implementado con gitHub Actions
