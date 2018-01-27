pipeline {
    agent any

    stages {
        stage('Compile') {
            steps {
                withMaven(maven : 'maven'){
                        sh 'cd complete && mvn clean compile'
                }
            }
        }
        stage('Test') {
            steps {
                withMaven(maven : 'maven'){
                        sh 'cd complete && mvn clean compile'
                }
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}

