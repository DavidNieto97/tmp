# TMP (Task Manager Project)

# 1. Resumen:
  a. Descripción, problema identificado, solución, arquitectura <br />
     - Descripción:<br />
       Gestor de actividades para organizar los trabajos de los grupos de trabajo.<br />
     - Problema identificado: <br />
       La empresa no cuenta con su propio sistema de gestor de actividades para manejar el flujo de trabajo. <br />
     - Solución:<br />
       Crear un gestor de actividades para un manejo eficiente y veloz de los trabajos que tienen los empleados. <br />
     - Arquitectura:<br />
     ![image](https://user-images.githubusercontent.com/33969423/168724296-270eb3b4-0153-4878-bf6f-79cc046c4039.png) <br />

  b. Tabla de contenidos (ToC) con enlaces o a la sección wiki dentro del repositorio o algún medio externo como ReadTheDocs.io <br />
     - TMP: https://github.com/DavidNieto97/tmp <br />
     - Frontend: https://github.com/DavidNieto97/tmp/tree/master/frontend <br />
     - Taskproject: https://github.com/DavidNieto97/tmp/tree/master/taskproject  <br /><br />
# 2. Requerimientos:
  a. Servidores de aplicación, web, bases de datos, etc.<br />
  b. Paquetes adicionales.<br />
  c. Versión de Java, etc.
 
     Cubriendo los 3 incisos:
     Programas:
     - JDK 1.8 Java
     - Intel IDEA
     - Windows Terminal
     - Github Desktop
     Paquetes:
     - Spring MVC
     - Lombok
     - JUnit
     - MySQL-Firebase
     - Tomcat
     
  
# 3. Instalación:
  a. ¿Cómo instalar el ambiente de desarrollo?<br />
     - Descargar e instalar https://www.jetbrains.com/idea/download/download-thanks.html <br /> <br />
  b. ¿Cómo ejecutar pruebas manualmente?<br />
     - Opción de menu run / debug / junit<br />
     - Gradle package:class<br /> <br />
  c. ¿Cómo implementar la solución en producción en un ambiente local o en la nube como Heroku?<br />
     - Crear repositorio<br />
     - Crear cuenta en heroku o render<br />
     - Configuración yml <br />
     - Configurar el autodeploy <br />
     
# 4. Configuración:
  a. Configuración del producto (archivos de configuración). <br />
      - Para desplegar nuestro paquete en un ambiente PaaS ejemplo render o heroku debemos crear un archivo .yml. <br /> 
      - Para la construcción del contenedor este debe tener los paquetes necesarios para que nuestro programa funcione. <br />
      - En nuestro caso instalamos tomcat, java, en un contenedor linux. además, un contenedor para la base de datos. <br /> <br />
  b. Configuración de los requerimientos. <br />
      - Definir recursos. <br /> 
      - Definir roles de usuario. <br />
      - Definir usuarios. <br />
      - Asignar recurso a rol. <br />
      - Asignar rol a usuario. <br />
      
# 5. Uso:
  a. Sección de referencia para usuario final. Manual que se hará referencia para usuarios finales. <br /> <br />
    En esta sección describimos el uso general de la aplicación. <br />
  - Para poder hacer uso del cualquier modulo deberá registrarse con una cuenta de usuario, además deberá actualizar la información de perfil con la intención de           que al crear cualquier actividad en el sistema las opciones disponibles son crear usuarios, crear proyectos, agregar tareas a proyecto, asignar proyecto a             usuario. <br />
  - Para poder dar de alta cada proyecto debemos registrar todas las opciones que el proyecto requiere, hito, encargado, tareas, y fechas y descripciones. <br />
  - Como todo sistema administrador de información los detalles de cada proyecto deben ser concretos de manera que al leer cada tarea sea sencillo comprender el que se     debe hacer las tareas deben ser creadas pensando en que son una parte de la tarea total. <br /> <br />
  Ejemplo si la tarea es volcar una cantidad de usuarios podríamos proponer el siguiente flujo: <br />
  - Cargar usuarios, validar usuarios, procesar usuarios, resumen de proceso.  <br />
  Esta sería la manera más eficiente al usar la aplicación, porque se guardaría la información útil para el desarrollo de un proyecto, es decir, nuestro sistema         administra la información relevante de un proyecto de cualquier tema. <br />

  b. Sección de referencia para usuario administrador. <br />
      - Acceso root al sistema de usuarios.<br />
      - Acceso a los archivos de configuración. <br /><br />
  
# 6. Contribucion:
  a. Guía de contribución para usuarios. <br />
      - Para contribuir al proyecto únicamente deberás enviar un correo a correo@app.com y enviarnos tu correo electrónico que cuente con un perfil en github.
      de esta manera podremos agregarte a las distintas versiones del proyecto. <br /> <br />

  b. Debe contar con pasos específicos para clonar repositorio, crear un nuevo branch, enviar el pull request, esperar a hacer el merge. <br />
      Lo siguiente seria: <br />
      - Clonar repositorio de github. <br />
      - Crear una rama local con el formato feature/DEV-001-adding-new-feature-description. <br />
      - Los commits creados localmente en la rama creada deberá publicarse de manera frecuente. <br />
      - Code review, al finalizar la funcionalidad debe crear una solicitud de fusión con la rama principal. <br />
      - Al aceptar los cambios esta nueva funcionalidad pasa a la rama master y respectivamente a producción. <br /><br />

  
# 7. Roadmap:
  a. Requerimientos que se implementarán en un futuro. <br />
      - Agarrar y arrastrar para actualizar usuarios. <br />
      - Diseño responsivo. <br />
      - Notificación por correo electronico.
