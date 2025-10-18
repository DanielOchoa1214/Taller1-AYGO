# Taller 1 AREP - Daniel Sebastian Ochoa Urrego

Este proyecto es un servidor simple que retorna "Hello World!" en el endpoint GET `/greeting` que fue desplegado localmente y en una EC2 de AWS con docker

## Iniciando

Estas instrucciones te ayudarán a tener una copia de este proyecto corriendo en tu máquina local, en donde podras hacer pruebas o desarrollar sobre él 

### Prerrequisitos

* Docker

### Instalando el proyecto

Para tener una imagen local del proyecto solo debes correr el siguiente comando

```
docker pull dano1214/taller1-aygo:latest
```

Luego, inicia un contenedor usando la imagen que acabas de traer a tu registro local

```
mvn exec:java
```

Ya que la aplicacián haya iniciado, puedes dirigirte a tu navegador de preferencia y entrar en http://localhost:35000 para ver la app corriendo, en ella encontraras una barra de busqueda y un botón. Si quieres buscar una película solo debes poner el título en la barra y darle click al botón (Nota: el hacer enter no funcionará, solo recargaras la pagina)


## Paso a paso del Taller

## Version

1.0-SNAPSHOT

## Autores

Daniel Sebastián Ochoa Urrego - [DanielOchoa1214](https://github.com/DanielOchoa1214)

## Licencia

GNU General Public License family

## Agradecimientos

* Figo

