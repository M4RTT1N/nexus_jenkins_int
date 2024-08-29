pipeline {
    agent any

    tools {
        maven 'Maven'  // Asegúrate de que este nombre coincida con tu configuración de Jenkins
        jdk 'jdk11'    // Asegúrate de que este nombre coincida con tu configuración de Jenkins
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Deploy to Nexus') {
            steps {
                script {
                    def nexusUrl = "http://localhost:8081"
                    def nexusRepository = "maven-releases"
                    def nexusCredentialsId = "nexus-credentials"
                    
                    def pom = readMavenPom file: 'pom.xml'
                    def artifactId = pom.artifactId
                    def groupId = pom.groupId
                    def version = pom.version
                    
                    nexusArtifactUploader(
                        nexusVersion: 'nexus3',
                        protocol: 'http',
                        nexusUrl: nexusUrl,
                        groupId: groupId,
                        version: version,
                        repository: nexusRepository,
                        credentialsId: nexusCredentialsId,
                        artifacts: [
                            [artifactId: artifactId,
                             classifier: '',
                             file: "target/${artifactId}-${version}.jar",
                             type: 'jar']
                        ]
                    )
                }
            }
        }
    }

    post {
        always {
            junit '**/target/surefire-reports/*.xml'
        }
    }
}