pipeline {
    agent any 
    stages {
	    stage('Compile') {
	        steps {
	            echo "-=- compiling project -=-"
	            sh "./mvnw clean package"
	        }
	    }
    }
}