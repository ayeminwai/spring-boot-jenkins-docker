pipeline {
    agent any 
    stages {
        stage('Maven Package') {
            steps {
                def mvnHome = tool name: 'maven_3.6.3', type: 'maven'
                def mvnCMD = "${mvnHome}/bin/mvn"
                sh "${mvnCMD} clean package"
            }
        }
    }
}