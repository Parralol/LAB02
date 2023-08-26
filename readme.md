# Hecho por Santiago Parra
## LA HERRAMIENTA MAVEN

Ingresar a la página de la herramienta y entender:
- Cuál es su mayor utilidad
    >Sirve principalmente para la gestion y construccion de proyectos.

- Fases de maven
    * validate
    * compile
    * test
    * package
    * verify
    * install
    * deploy

- Ciclo de vida de la construcción
    - clean
    - Default
    - Site

- Para qué sirven los plugins
    >Para ampliar las funciones del codigo

- Qué es y para qué sirve el repositorio central de maven
    >Sirve para mantener todos los plugins o repositorios que se puedan necesitar a la hora de realizar un proyecto
## EJERCICIO DE LAS FIGURAS
### CREAR UN PROYECTO CON MAVEN
Buscar cómo se crea un proyecto maven con ayuda de los arquetipos (archetypes).
    >Se crea con mvn archetype:generate
Busque cómo ejecutar desde línea de comandos el objetivo "generate" del plugin "archetype"

`mvn archetype:generate
  -DgroupId=[your project's group id]
  -DartifactId=[your project's artifact id]
  -DarchetypeGroupId=org.apache.maven.archetypes
  -DarchetypeArtifactId=maven-archetype-archetype`

## AJUSTAR ALGUNAS CONFIGURACIONES EN EL PROYECTO


Hay que cambiar la version del compilador de Java a la versión 8, para ello, agregue la sección `properties` antes de la sección de
dependencias:
```xml
<properties>
  <maven.compiler.target>1.8</maven.compiler.target>
  <maven.compiler.source>1.8</maven.compiler.source>
</properties>
```

## COMPILAR Y EJECUTAR

Busque cuál es el objetivo del parámetro "package" y qué otros parámetros se podrían enviar al comando `mvn`.


Busque cómo ejecutar desde línea de comandos, un proyecto maven y verifique la salida cuando se ejecuta con la clase `App.java` como parámetro en "mainClass"



Realice el cambio en la clase `App.java` para crear un saludo personalizado, basado en los parámetros de entrada a la aplicación. 



Utilizar la primera posición del parámetro que llega al método "main" para realizar elsaludo personalizado, en caso que no sea posible, se debe mantener el saludo como se encuentra actualmente:


Buscar cómo enviar parámetros al plugin "exec".

>Se puede realizar con el comando:
    
    `mvn exec:java -Dexec.mainClass="Com.nose.Main" -Dexec.args="Param1"`

![]()

Ejecutar nuevamente la clase desde línea de comandos y verificar la salida: Hello World!

![](https://github.com/Parralol/LAB02/blob/main/resources/helloWorld.png)

Ejecutar la clase desde línea de comandos enviando su nombre como parámetro y verificar la salida. Ej: Hello Pepito!
![](https://github.com/Parralol/LAB02/blob/main/resources/Santiago%20Parra.png)

Ejecutar la clase con su nombre y apellido como parámetro. ¿Qué sucedió?
![](https://github.com/Parralol/LAB02/blob/main/resources/Santiago%20Parra.png)

Verifique cómo enviar los parámetros de forma "compuesta" para que el saludo se realice con nombre y apellido.

Se puede con:
![](https://github.com/Parralol/LAB02/blob/main/resources/args.png)


Ejecutar nuevamente y verificar la salida en consola. Ej: Hello Pepito Perez!

![](https://github.com/Parralol/LAB02/blob/main/resources/Santiago%20Parra.png)

## HACER EL ESQUELETO DE LA APLICACIÓN

¿Cuál fábrica hiciste? y ¿Cuál es mejor?
    
    >Simple Factory: debido a la baja complejidad del codigo necesario, ademas de necesitar obtener un solo objeto a la hora de obtener algun parametro, no se necesita ningun tipo de abstraccion

Ejecute múltiples veces la clase ShapeMain, usando el plugin exec de maven con los siguientes parámetros y verifique la salida en consola para cada una:
- Sin parámetros
- Parámetro: qwerty
- Parámetro: pentagon
- Parámetro: Hexagon

¿Cuál(es) de las anteriores instrucciones se ejecutan y funcionan correctamente y por qué?

    >se ejecuta unicamente Hexagon, ya que pentagon no posee las mismas letras que "Pentagon", qwerty es una opcion que NO existe y al no obtener parametros, no generara ningun output
