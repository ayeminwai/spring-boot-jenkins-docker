pipeline {
    agent any 
    stages {
        stage('Maven Package') {
            steps {
                sh "mvn clean package"
            }
        }
    }
}