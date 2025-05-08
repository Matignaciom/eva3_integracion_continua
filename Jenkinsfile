pipeline {
    agent any
    
    triggers {
        // Ejecutar el job cada 5 minutos
        cron('*/5 * * * *')
    }
    
    stages {
        stage('Descargar código desde GitHub') {
            steps {
                // Checkout del codigo desde el repositorio de GitHub
                checkout scm
                echo 'Código descargado exitosamente desde GitHub'
            }
        }
        
        stage('Compilar aplicación') {
            steps {
                // Compilar el proyecto usando Maven
                bat 'mvn clean compile'
                echo 'Aplicación compilada exitosamente con Maven'
            }
        }
        
        stage('Ejecutar pruebas') {
            steps {
                // Ejecutar pruebas unitarias si existen
                bat 'mvn test'
                echo 'Pruebas ejecutadas exitosamente'
            }
        }
        
        stage('Desplegar aplicación en Equipo Local') {
            steps {
                // Ejecutar la aplicación Java usando Maven
                bat 'mvn exec:java'
                echo 'Aplicación desplegada exitosamente en equipo local'
            }
        }
    }
    
    post {
        success {
            echo 'Pipeline ejecutado exitosamente'
        }
        failure {
            echo 'Pipeline falló'
        }
    }
}