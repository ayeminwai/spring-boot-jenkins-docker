node {
    def mvnHome
    
    stage('Preparation') {
        git 'https://github.com/jglick/simple-maven-project-with-tests.git'
        mvnHome = tool 'maven_3.6.3'
    }
    
    stage('Build') {
        // Run the maven build
        withEnv(["MVN_HOME=$mvnHome"]) {
            if (isUnix()) {
                sh '"$MVN_HOME/bin/mvn" -Dmaven.test.failure.ignore clean package'
            } else {
                bat(/"%MVN_HOME%\bin\mvn" -Dmaven.test.failure.ignore clean package/)
            }
        }
    }
    
    stage('Results') {
        junit '**/target/surefire-reports/TEST-*.xml'
        archiveArtifacts 'target/*.jar'
    }
    
    stage('Build Docker Image') {
        sh 'docker build -t amw1991/spring-boot-jenkins-docker:1.0.0 .'
    }
}