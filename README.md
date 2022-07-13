# Proyecto Base Page Object Model - SerenityBDD

[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)

Este repositorio contiene diferentes automatizaciones realizadas con el fin de entender el proceso de automatización web desde la base con herramientas nativas hasta la implementación de patrones Page Object Model (POM) y Page Factory.


## Contenido

- Automatización Selenium Básico
- Automatización Page Object Model
- Automatización Page Object Model + Page Factory
- Ejecución por Terminal


## Automatización Selenium Básico

En la rama llamada [selenium](https://github.com/ingjuanfg/page_object_model_automation_project/tree/selenium "selenium") encontrarás una estructura básica donde solo en la capa **test** estará un archivo java llamado **LoginTest.java**. Este test no esta integrado con SerenityBDD. Tampoco contiene un escenario redactado con lenguaje gherkin, ni runner. Básicamente es una clase que contiene un test de Login exitoso, haciendo llamado del driver directamente en la clase y todo el proceso (incluida asersión) en este archivo.


## Automatización Page Object Model

En la rama llamada [pom_project](https://github.com/ingjuanfg/page_object_model_automation_project/tree/pom_project "pom_project") ya incorporamos SerenityBDD como framework sobre el patrón Page Object Model. Sobre la capa **test ** encontrarás los features (en resources) y stepdefinitions y runners (en java). Este escenario esta enfocado en la misma autenticación realizada en la rama explicada anteriormente pero ya incluyendo BDD, usando Cucumber como herramienta para redacción de lenguaje Gherkin.
En la capa **main** está la capa **Page** la cual contiene dos clases tipo Page, manejando elementos de tipo **By** para los elementos web a interactuar. Los métodos son llamados en la clase StepDefinition. Para ejecutar recurrir al Runner si se quiere hacer por medio del IDE.

## Automatización Page Object Model + Page Factory

En la rama llamada [page_factory](https://github.com/ingjuanfg/page_object_model_automation_project/tree/page_factory "page_factory") se crea un escenario más completo de compra de productos, involucrando diferentes tipos de datos que se pueden manejar en el lenguaje Gherkin, como lo son **Datatables**, **Examples** y datos entre los pasos. Con este escenario se busca optimizar el POM implementado usando Page Factory, es decir, trabajar con elementos de tipo **WebElementFacade** y añadiendo una capa intermedia entre los Page y los StepDefinitions llamada **Step**. Esta capa permite agrupar las acciones individuales creada en los Page y de esta manera nuestros StepDefinition serán mas limpios y tendremos métodos mas reutilizables.

## Ejecución por Terminal

Para ejecutar y generar la documentación viva, basta con que por medio de una terminal en la ruta donde esta el proyecto ejecutes la siguiente linea:

`gradle clean test aggregate`

Si no cuentas con gradle configurado en tu maquina, usa el wrapper.

`./gradlew clean test aggregate`

Con esta instrucción limpias el proyecto de archivos temporales, ejecuta los test y genera la documentación viva.

Una vez ejecutado, puedes verificar las evidencias en la ruta:

`.../target/site/serenity/index.html`


**Happy Coding!**

***Juan de Jesús Fernández Graciano***
