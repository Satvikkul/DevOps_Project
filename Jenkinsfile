pipeline { 
    agent any
	tools { 
        maven 'Maven 3.6.0' 
        jdk 'Java8' 
    }
    stages { 
        stage('Clean') { 
            steps { 
	       withMaven(maven : 'Maven')
	       echo "cleaning..."
               sh "mvn clean" 
            }
        }
	stage('Package') {
            steps { 
               withMaven(maven : 'Maven')
	       echo "Packaging..."
               sh "mvn package"
	    }
        }
    }
}
