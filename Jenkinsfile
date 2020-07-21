node {
    def mvnHome
    def dockerImage
    
    stage('Preparation') {
       	// checkout scm
        mvnHome = tool 'maven_3.6.3'
    }
    
    stage('Build') {
        // Run the maven build project
        withEnv(["MVN_HOME=$mvnHome"]) {
            if (isUnix()) {
                sh '"$MVN_HOME/bin/mvn" -Dmaven.test.failure.ignore clean package'
            } else {
                bat(/"%MVN_HOME%\bin\mvn" -Dmaven.test.failure.ignore clean package/)
            }
        }
    }
    
    stage('Test Results') {
        junit '**/target/surefire-reports/TEST-*.xml'
        archiveArtifacts 'target/*.jar'
    }
    
    stage('Build Docker Image') {
		dockerImage = docker.build("amw1991/spring-boot-docker-jenkins")
    }
    
    stage('Push Docker Image') {
    	docker.withRegistry("https://registry.hub.docker.com", "dockerHub"){
    		dockerImage.push();
    	}
    }
}