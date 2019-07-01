# WebPlatform

## Network configuration

When webapi running inside container it could not connect to the 
DBMS out of webplatform docker network.

To resolve this network bridge can be used as shown below:

1. Get ip address of host with DBMS running
1. And up docker compose as:
    ```bash
    POSTGRES_IP=<POSTGRE-IP-ADDRESS> docker-compose up -d   
    ```