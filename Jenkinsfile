pipeline {
    agent any 
    stages {
	    stage('Compile Stage1') {
	        steps {
	        	def mvnHome = tool 'maven_3.6.3'
		        withEnv(["MVN_HOME=$mvnHome"]) {
		        def mvnCMD = "${MVN_HOME}/bin/mvn"
	                sh "${mvnCMD} clean package"
		        }
	        }
	    }
	    
	    stage('Testing Stage1') {
	        steps {
	        	def mvnHome = tool 'maven_3.6.3'
		        withEnv(["MVN_HOME=$mvnHome"]) {
		        def mvnCMD = "${MVN_HOME}/bin/mvn"
	                sh "${mvnCMD} test"
		        }
	        }
	    }
    }
}