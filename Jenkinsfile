pipeline {
    agent any 
    stages {
	    stage('Compile Stage') {
	        steps {
	        	def mvnHome = tool 'M3'
		        withEnv(["MVN_HOME=$mvnHome"]) {
	                sh '"$MVN_HOME/bin/mvn" -Dmaven.test.failure.ignore clean package'
		        }
	        }
	    }
    }
}