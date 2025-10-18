# Taller 1 AREP - Daniel Sebastian Ochoa Urrego

Este proyecto es un servidor simple que retorna "Hello World!" en el endpoint GET `/greeting` que fue desplegado localmente y en una EC2 de AWS con docker

## Iniciando

Estas instrucciones te ayudarán a tener una copia de este proyecto corriendo en tu máquina local, en donde podras hacer pruebas o desarrollar sobre él 

### Prerrequisitos

* Docker

### Instalando el proyecto

Para tener una imagen local del proyecto solo debes correr el siguiente comando

```
docker run -d -p 33025:33025 --name ec2aygocontainer dano1214/taller1-aygo:latest
```

Ya que la aplicacián haya iniciado, puedes dirigirte a tu navegador de preferencia y entrar en `http://localhost:42000/greeting` para ver la app corriendo

<img width="348" height="136" alt="Screenshot 2025-10-18 at 2 24 29 PM" src="https://github.com/user-attachments/assets/abb75b7d-6edc-405e-a4f9-311e5e542afa" />

## Paso a paso del Taller

### Parte 1

Para esta parte se creo el controlador `HelloRestController`

<img width="709" height="218" alt="Screenshot 2025-10-18 at 4 00 55 PM" src="https://github.com/user-attachments/assets/476c9771-652e-4632-b378-e1b2019cc39a" />

Y al correr el comando `java -cp "target/classes:target/dependency/*" co.edu.aygo.aygotaller1.AYGOTaller1Application` podmeos ver en el navegador el servidor corriendo al ir a `http://localhost:42000/greeting`

<img width="348" height="136" alt="Screenshot 2025-10-18 at 2 24 29 PM" src="https://github.com/user-attachments/assets/abb75b7d-6edc-405e-a4f9-311e5e542afa" />

### Parte 2

Para esta parte se creo el Dockerfile propuesto y se corrieron los siguientes comandos para montar los contenedores

<img width="837" height="394" alt="Screenshot 2025-10-18 at 2 36 52 PM" src="https://github.com/user-attachments/assets/0edaebcf-90da-4afb-b986-9604bc6e0814" />
<img width="1004" height="240" alt="Screenshot 2025-10-18 at 2 37 01 PM" src="https://github.com/user-attachments/assets/e5d14553-6ef4-424e-9925-e8807e992552" />

Luego para probar que cada puerto estuviera funcionando le pegamos a cada endpoint de cada contenedor

<img width="371" height="143" alt="Screenshot 2025-10-18 at 2 37 24 PM" src="https://github.com/user-attachments/assets/f9716c7c-025a-4646-8995-f1b45f7bd780" />
<img width="409" height="127" alt="Screenshot 2025-10-18 at 2 37 16 PM" src="https://github.com/user-attachments/assets/ff6b09fa-92fc-4f42-b94d-6f7623d65990" />
<img width="384" height="128" alt="Screenshot 2025-10-18 at 2 37 08 PM" src="https://github.com/user-attachments/assets/82f0fcb6-e9be-48f3-930f-3077f58f3eab" />

Luego creamos el `docker-compose`, corremos los comandos del taller y podemos ver que ambos contenedores fueron creados exitosamente

<img width="1022" height="143" alt="Screenshot 2025-10-18 at 2 43 02 PM" src="https://github.com/user-attachments/assets/be253d24-c088-49bd-9acc-450eceb734bc" />
<img width="1177" height="135" alt="Screenshot 2025-10-18 at 2 42 45 PM" src="https://github.com/user-attachments/assets/869e4f97-42c6-4635-90fe-3f60dbb75d8d" />

Ademas, al ir a la URL del proyecto en el puerto 8087 (El que esta mapeado al contenedor web) podemos ver el saludo 

<img width="355" height="141" alt="Screenshot 2025-10-18 at 2 43 24 PM" src="https://github.com/user-attachments/assets/7b904080-0b11-423d-9e3f-063ab00ede67" />

### Parte 3

Para crear la referencia al repositorio de DockerHub corremos el comando de la imagen y con `docker image ls` nos aseguramos que la relacion se haya creado correctamente 

<img width="633" height="173" alt="Screenshot 2025-10-18 at 2 46 54 PM" src="https://github.com/user-attachments/assets/0ca16690-1a3e-441b-95b8-b18bb7dfbf1b" />

Al ver que ambas imagenes tienen el mismo ID ya podemos hacer push al repositorio de DockerHub

<img width="714" height="193" alt="Screenshot 2025-10-18 at 2 48 48 PM" src="https://github.com/user-attachments/assets/c9bc00f3-e8b7-4c66-a7bf-0ab2a84eb222" />
<img width="1467" height="527" alt="Screenshot 2025-10-18 at 2 48 23 PM" src="https://github.com/user-attachments/assets/f9b4229a-5225-45d1-a7a1-e14b975a1d9f" />

### Parte 4

Para esta ultima parte se creo una instancia EC2 t2.nano para no gastar muchos recursos. Ademas, a las reglas de seguridad del trafico se añadio el puerto 42000 para que se permitiera el trafico de ingreso desde cualquier IP.

<img width="1506" height="182" alt="Screenshot 2025-10-18 at 3 00 03 PM" src="https://github.com/user-attachments/assets/574fb176-17d7-47d9-88df-4bcde38c9d8e" />

Y por ultimo al correr los comandos propuestos en el taller e ir al dominio publico de la VM podemos ver el mismo mensaje en el navegador

<img width="683" height="159" alt="Screenshot 2025-10-18 at 3 17 35 PM" src="https://github.com/user-attachments/assets/8fd815b4-518e-433c-b6e1-66eea6ac7326" />

## Version

1.0-SNAPSHOT

## Autores

Daniel Sebastián Ochoa Urrego - [DanielOchoa1214](https://github.com/DanielOchoa1214)

## Licencia

GNU General Public License family

## Agradecimientos

* Figo

