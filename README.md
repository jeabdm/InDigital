# Indigital

_Servicio que expone 3 endpoints. Alta de un cliente, consultar el promedio de edad y la desviaci贸n est谩ndar de las edades, y el lista todos los clientes con todos sus datos mas la fecha probable de muerte._

## Comenzando 馃殌

_Estas instrucciones te permitir谩n obtener una copia del proyecto en funcionamiento en tu m谩quina local para pruebas._

### Pre-requisitos 馃搵

_Herramientas necesarias para correr la aplicaci贸n_

```
git version 2.24.3
Apache Maven 3.6.3
java 11.0.10 2021-01-19 LTS (JDK 11)
```

### Construcci贸n 馃敡

+ Abrir una terminal y realizar los siguiente pasos.

```
git clone https://github.com/jeabdm/InDigital.git
cd indigital
mvn clean package
```
+ _mvn clean package_ construir谩 la aplicaci贸n y ejecutar谩 los tests unitarios.

### Correr la aplicaci贸n (local) 鈿欙笍

_Desde una terminal, dentro del directorio del proyecto. Realizar los siguientes pasos_

```
mvn spring-boot:run
```
+ Para saber el estado de salud de la aplicaci贸n, ir a: http://localhost:8080/actuator/health
+ Para probar la aplicaci贸n local, ir a: http://localhost:8080/swagger-ui.html#/customer-controller

## Despliegue (producci贸n) 馃摝

_La plataforma cloud en donde estar谩 desplegada la aplicacion es: [Heroku](https://www.heroku.com/home)_
+ Para poder realizar el despliegue deber谩 tener acceso al proyecto heroku: [jeabdm](https://dashboard.heroku.com/apps/jblas)
+ Dentro de la pesta帽a _Deploy_, elegir la opci贸n _Deployment method_ **GitHub**
+ Conectar el proyecto heroku al reposiorio github
+ Para saber el estado de salud de la aplicaci贸n, ir a: https://jblas.herokuapp.com/
+ Para probar la aplicaci贸n desplegada, ir a: https://jblas.herokuapp.com//swagger-ui.html#

## Autor 鉁掞笍

* **Jorge Agurto** - [jeabdm](https://github.com/jeabdm)