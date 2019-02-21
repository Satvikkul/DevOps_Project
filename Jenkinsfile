pipeline { 
    agent any
	tools { 
        maven 'Maven' 
        jdk 'Java8' 
    }
    stages { 
        stage('Clean') { 
            steps { 
	       
	       echo "cleaning..."
               sh "mvn clean" 
            }
        }
	stage('Package') {
            steps { 
               
	       echo "Packaging..."
               sh "mvn package"
	    }
        }
    }
}
