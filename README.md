# Indigital

_Servicio que expone 3 endpoints. Alta de un cliente, consultar el promedio de edad y la desviación estándar de las edades, y el lista todos los clientes con todos sus datos mas la fecha probable de muerte._

## Comenzando 🚀

_Estas instrucciones te permitirán obtener una copia del proyecto en funcionamiento en tu máquina local para pruebas._

### Pre-requisitos 📋

_Herramientas necesarias para correr la aplicación_

```
git version 2.24.3
Apache Maven 3.6.3
java 11.0.10 2021-01-19 LTS (JDK 11)
```

### Construcción 🔧

+ Abrir una terminal y realizar los siguiente pasos.

```
git clone https://github.com/jeabdm/InDigital.git
cd indigital
mvn clean package
```
+ _mvn clean package_ construirá la aplicación y ejecutará los tests unitarios.

### Correr la aplicación (local) ⚙️

_Desde una terminal, dentro del directorio del proyecto. Realizar los siguientes pasos_

```
mvn spring-boot:run
```
+ Para saber el estado de salud de la aplicación, ir a: http://localhost:8080/actuator/health
+ Para probar la aplicación local, ir a: http://localhost:8080/swagger-ui.html#/customer-controller

## Despliegue (producción) 📦

_La plataforma cloud en donde estará desplegada la aplicacion es: [Heroku](https://www.heroku.com/home)_
+ Para poder realizar el despliegue deberá tener acceso al proyecto heroku: [jeabdm](https://dashboard.heroku.com/apps/jblas)
+ Dentro de la pestaña _Deploy_, elegir la opción _Deployment method_ **GitHub**
+ Conectar el proyecto heroku al reposiorio github
+ Para saber el estado de salud de la aplicación, ir a: https://jblas.herokuapp.com/
+ Para probar la aplicación desplegada, ir a: https://jblas.herokuapp.com//swagger-ui.html#

## Autor ✒️

* **Jorge Agurto** - [jeabdm](https://github.com/jeabdm)