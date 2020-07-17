pipeline {
    agent any 
    stages {
	    stage('Compile') {
	        steps {
	            echo "-=- compiling project -=-"
	            sh "./mvnw clean compile"
	        }
	    }
	 
	    stage('Unit tests') {
	        steps {
	            echo "-=- execute unit tests -=-"
	            sh "./mvnw test"
	            junit 'target/surefire-reports/*.xml'
	            jacoco execPattern: 'target/jacoco.exec'
	        }
	    }
    }
}