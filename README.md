# Proyecto de Integración Continua con Jenkins

Este repositorio contiene un ejemplo básico de integración continua utilizando Jenkins, Git y GitHub.

## Estructura del Proyecto

```
proyecto/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── HolaMundo.java
│   └── test/
│       └── java/
│           └── HolaMundoTest.java
├── Jenkinsfile
├── pom.xml
└── README.md
```

## Contenido del Repositorio

- `src/main/java/HolaMundo.java`: Aplicación Java básica que imprime un mensaje.
- `src/test/java/HolaMundoTest.java`: Prueba unitaria básica.
- `Jenkinsfile`: Configuración del pipeline declarativo para Jenkins.
- `pom.xml`: Archivo de configuración de Maven.

## Configuración del Proyecto

### 1. Crear un Repositorio en GitHub

1. Inicie sesión en su cuenta de GitHub o cree una nueva.
2. Haga clic en "New" para crear un nuevo repositorio.
3. Asigne un nombre al repositorio (por ejemplo, "jenkins-integration").
4. Seleccione la opción "Public" para que sea accesible.
5. Haga clic en "Create repository".

### 2. Configurar Git Localmente

```bash
# Inicializar el repositorio Git local
git init

# Agregar los archivos al staging area
git add .

# Realizar el primer commit
git commit -m "Commit inicial: HolaMundo y Jenkinsfile"

# Configurar el repositorio remoto
git remote add origin https://github.com/SU_USUARIO/SU_REPOSITORIO.git

# Subir los cambios al repositorio remoto
git push -u origin master
```

### 3. Configurar Jenkins

1. Acceda a la interfaz web de Jenkins.
2. Haga clic en "Nueva Tarea" o "New Item".
3. Ingrese un nombre para la tarea (por ejemplo, "ProyectoIntegracionContinua").
4. Seleccione "Pipeline" y haga clic en "OK".
5. En la sección de configuración:
   - En "Pipeline", seleccione "Pipeline script from SCM".
   - En "SCM", seleccione "Git".
   - En "Repository URL", ingrese la URL de su repositorio GitHub.
   - En "Branch Specifier", deje "*/master" o "*/main" según corresponda.
   - En "Script Path", asegúrese de que diga "Jenkinsfile".
6. Guarde la configuración.

## Ejecución del Pipeline

1. En la página principal de la tarea en Jenkins, haga clic en "Construir ahora" o "Build Now".
2. Observe cómo Jenkins ejecuta los stages definidos en el Jenkinsfile:
   - Descarga del código desde GitHub
   - Compilación de la aplicación Java
   - Despliegue de la aplicación en el equipo local

## Programación Cron

El pipeline está configurado para ejecutarse automáticamente cada 5 minutos gracias a la configuración en el Jenkinsfile:

```groovy
triggers {
    cron('*/5 * * * *')
}
```

## Requisitos de Instalación

Para trabajar con este proyecto, necesitará tener instalado:

1. **Git**: Para la gestión del repositorio.
   - Verificar instalación: `git --version`
   - [Descargar Git](https://git-scm.com/downloads)

2. **Java**: JDK 8 o superior.
   - Verificar instalación: `java --version`
   - [Descargar Java](https://adoptium.net/)

3. **Maven**: Para la gestión de dependencias y construcción del proyecto.
   - Verificar instalación: `mvn --version`
   - [Descargar Maven](https://maven.apache.org/download.cgi)

4. **Jenkins**: Para la ejecución del pipeline de integración continua.
   - [Descargar Jenkins](https://www.jenkins.io/download/)
   - Asegúrese de que Jenkins tenga acceso a Git, Java y Maven.

## Notas Importantes

- Asegúrese de que todas las herramientas estén en el PATH del sistema.
- Jenkins debe tener permisos para ejecutar comandos en el sistema.
- Si encuentra problemas con la ejecución, revise los logs de Jenkins para identificar errores.