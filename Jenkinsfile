pipeline {
    agent any 
    stages {
	    stage('Compile Stage') {
	        steps {
	        	def mvnHome = tool 'maven_3.6.3'
		        withEnv(["MVN_HOME=$mvnHome"]) {
		        def mvnCMD = "${MVN_HOME}/bin/mvn"
	                sh "${mvnCMD} clean package"
		        }
	        }
	    }
    }
}