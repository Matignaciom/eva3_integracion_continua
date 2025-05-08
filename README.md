# Proyecto de Integración Continua con Jenkins

Este repositorio contiene un ejemplo básico de integración continua utilizando Jenkins, Git y GitHub.

## Descripción del Proyecto

Este proyecto implementa un sistema de integración continua que permite automatizar el proceso de compilación, prueba y despliegue de una aplicación Java básica. La aplicación consiste en un simple programa "Hola Mundo" que muestra un mensaje por consola.

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

## Componentes Principales

- **HolaMundo.java**: Aplicación Java que imprime "¡Hola Mundo desde Jenkins!".
- **HolaMundoTest.java**: Prueba unitaria que verifica el funcionamiento básico.
- **Jenkinsfile**: Define el pipeline de integración continua con etapas para descargar, compilar, probar y desplegar.
- **pom.xml**: Archivo de configuración de Maven que gestiona dependencias y compilación.

## Proceso de Creación

Este proyecto fue creado siguiendo estos pasos:

1. **Configuración del entorno de desarrollo**:
   - Instalación de Java JDK 8 o superior
   - Instalación de Maven para gestión de dependencias
   - Instalación de Git para control de versiones
   - Instalación de Jenkins para automatización

2. **Desarrollo de la aplicación**:
   - Creación de la estructura de directorios del proyecto
   - Implementación de la clase HolaMundo.java
   - Desarrollo de pruebas unitarias básicas

3. **Configuración de la integración continua**:
   - Creación del Jenkinsfile con pipeline declarativo
   - Configuración de etapas (stages) para el proceso de CI
   - Implementación de la programación automática (cada 5 minutos)

4. **Publicación en GitHub**:
   - Inicialización del repositorio Git local
   - Creación del repositorio remoto en GitHub
   - Sincronización del código con el repositorio remoto

5. **Configuración de Jenkins**:
   - Creación de un nuevo job de tipo Pipeline
   - Conexión con el repositorio de GitHub
   - Configuración para detectar el Jenkinsfile

## Funcionamiento

El pipeline de Jenkins ejecuta automáticamente las siguientes etapas:

1. **Descarga del código**: Obtiene la última versión desde GitHub
2. **Compilación**: Compila el código fuente Java usando Maven
3. **Pruebas**: Ejecuta las pruebas unitarias para verificar la funcionalidad
4. **Despliegue**: Ejecuta la aplicación en el entorno local

El sistema está configurado para ejecutarse automáticamente cada 5 minutos, demostrando la capacidad de integración continua.