# DemoblazeScreenPlay

Realiza la automatización en la pagina de E-Commerce
[Demo Blaze](https://www.demoblaze.com/) de  todo realizado con [Gradle](https://gradle.org/), [Java](https://www.java.com/es/), [SerenityBDD](https://serenity-bdd.github.io/theserenitybook/latest/index.html), [Cucumber](https://cucumber.io/) y Screenplay pattern.


## Estructura código fuente

La estructura del codigo fue realizada con Screenplay pattern de la siguiente forma:
<table>
<tr>
  <th>Tasks</th>
  <td>
    <h6>C</h6>
  </td>
</tr>
  <tr>
  <th>Interactions</th>
  <td>
    <h6>Contiene todas las interaciones que se ejecutaran en la automatizacion</h6>
  </td>
</tr>
  <tr>
  <th>Models</th>
  <td>
    <h6>Contiene todos los modelos que se utilizaran para la construccion de la automatizacion</h6>
  </td>
</tr>
  <tr>
  <th>Uis</th>
  <td>
    <h6>Contiene todos los elementos de la interface usuario mapeados en la pagina</h6>
  </td>
</tr>
  <tr>
  <th>Drivers</th>
  <td>
    <h6>Contiene todos los drivers de los navegadores</h6>
  </td>
</tr>
  <tr>
  <th>Runners</th>
  <td>
    <h6>Contiene todos los ejecutores de las pruebas automatizadas</h6>
  </td>
</tr>
  <tr>
  <th>Steps Definitions</th>
  <td>
    <h6>Contiene todos los pasos de la ejecucion de cada prueba automatizada</h6>
  </td>
</tr>
  <tr>
  <th>Features</th>
  <td>
    <h6>Contiene todos los esenarios codificados en lenguaje Gherking</h6>
  </td>
</tr>
</table>

## Ejecutar el proyecto 
Al momento de ejecutar el proyecto y obtener el reporte debemos 
ubicarnos en la carpeta del proyecto y abrir el `CMD` (en caso de tener Windows), 
y ejecutar el siguiente comando 

```yml
    gradle clean test aggregate
```

Al finalizar la ejecución debemos ingresar a la siguiente ruta y abrir el archivo `index.html`

```yml
  <projectName>\target\site\serenity\index.html
```

El reporte generado al momento de subir este repositorio se puede 
visualizar en html básico en el siguiente link [Reporte Serenity](https://htmlpreview.github.io/?https://github.com/jcalderonagudelo/DemoblazeScreenPlay/blob/master/target/site/serenity/index.html)

