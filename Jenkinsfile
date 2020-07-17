pipeline {
    agent any 
    stages {
    	stage('Check version') {
    		steps {
    			sh "mvn -v"
    			sh "java -version"
    		}
    	}
        stage('Maven Package') {
            steps {
                sh "mvn clean package"
            }
        }
    }
}