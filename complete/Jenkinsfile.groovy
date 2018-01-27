pipeline {
    agent any

    stages {
        stage('Compile') {
            steps {
                withMaven(maven : 'maven'){
			sh 'mvn clean compile'
		}
            }
        }
        stage('Test') {
            steps {
                withMaven(maven : 'maven'){
                        sh 'mvn clean compile'
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
