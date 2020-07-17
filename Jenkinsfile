pipeline {
    agent any 
    stages {
	    stage('Compile Stage') {
	        steps {
	        	def mvnHome = tool 'M3'
		        withEnv(["MVN_HOME=$mvnHome"]) {
		            if (isUnix()) {
		                sh '"$MVN_HOME/bin/mvn" -Dmaven.test.failure.ignore clean package'
		            } else {
		                bat(/"%MVN_HOME%\bin\mvn" -Dmaven.test.failure.ignore clean package/)
		            }
		        }
	        }
	    }
    }
}