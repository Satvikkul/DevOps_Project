pipeline { 
    agent any
	tools { 
        maven 'Maven' 
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
