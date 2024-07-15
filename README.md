# name: TecnicalTestAlianzaService

  Este archivo README describe los pasos para configurar y ejecutar el proyecto localmente.

prerequisites:

  - name: Java Development Kit (JDK) 17 
    link: https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html
  - name: Maven
    link: https://maven.apache.org/install.html
  - name: Git
    link: https://git-scm.com/
  - name: MySQL 8
    link: https://dev.mysql.com/downloads/mysql/

steps:
  - step: Clonar el Repositorio
    description: >
      Primero, clona el repositorio del proyecto desde GitHub.
    command: git clone https://github.com/edjms/Desfio-Tecnico-de-Desarrollo-de-Software.git

  - step: Navegar al Directorio del Proyecto
    description: >
      Accede al directorio del proyecto.
    command: cd tu-repositorio

  - step: Configuración de MySQL
    description: >
      Asegúrate de tener MySQL 8 instalado y corriendo en tu máquina. Luego, crea la base de datos `technical_test`
    note: >
      Reemplaza `root` con tu nombre de usuario de MySQL si es diferente.

  - step: Configuración del Proyecto
    description: >
      Asegúrate de que el archivo `application.properties` en `src/main/resources` esté configurado correctamente para tu entorno local. Configura las propiedades de la base de datos como se muestra a continuación.
    properties: |
      ```
      spring.datasource.url=jdbc:mysql://localhost:3306/technical_test
      spring.datasource.username=tu_usuario
      spring.datasource.password=tu_contraseña
      spring.jpa.hibernate.ddl-auto=update
      spring.jpa.show-sql=true
      spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
      ```

  - step: Compilar el Proyecto
    description: >
      Compila el proyecto usando Maven.
    command: mvn clean install

  - step: Ejecutar el Proyecto con un IDE
    description: >
      Abre tu IDE (por ejemplo, IntelliJ IDEA o Eclipse) y carga el proyecto. Una vez que el proyecto esté cargado, ejecuta la clase principal `Application` o la clase que tenga la anotación `@SpringBootApplication`.

  - step: Ejecutar el Proyecto sin un IDE
    description: >
      Una vez que el proyecto esté compilado, puedes ejecutarlo desde la línea de comandos usando el siguiente comando.
    command: mvn spring-boot:run
    note: >
      El servidor se iniciará en `http://localhost:8080` de manera predeterminada.

  - step: Acceder a la Aplicación
    description: >
      Abre tu navegador web y navega a `http://localhost:8080` para ver la aplicación en funcionamiento.

 - 

  - step: Generar el Jar
    description: >
      Para generar el archivo JAR ejecutable del proyecto, utiliza.
    command: mvn package
    note: >
      El archivo JAR se encontrará en el directorio `target`.

  - step: Ejecutar el JAR sin un IDE
    description: >
      Puedes ejecutar el archivo JAR desde la línea de comandos con el siguiente comando.
    command: java -jar target/nombre-del-proyecto.jar

contributing:
  description: >
    Si deseas contribuir a este proyecto, por favor sigue estos pasos.
  steps:
    - step: Haz un fork del proyecto
    - step: Crea una nueva


 # Proyecto Angular: technicaltest

Este proyecto es una aplicación web desarrollada con Angular. Incluye varias características y componentes como una barra lateral, un listado de clientes, y la creación de clientes. Además, utiliza Bootstrap para el diseño y varias bibliotecas adicionales para funcionalidad mejorada.

## Prerrequisitos

Antes de empezar, asegúrate de tener instalado lo siguiente:

- Node.js y npm (Node Package Manager)
- Angular CLI
- Backend configurado y ejecutándose (ver sección "Configuración del Backend")

## Instalación

1. **Clonar el repositorio**

   ```sh
  # git clone https://github.com/edjms/Desfio-Tecnico-de-Desarrollo-de-Software.git
  # cd Desfio-Tecnico-de-Desarrollo-de-Software

2. **Instalar dependencias del frontend**

  # npm install
	


