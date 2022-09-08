pipeline {
  agent { label 'contextLoads'}  
  
  	stages {
  		stage('Test'){
  			steps {
  			   sh "mvn clean compile test"
  			}
  		
  		}
  		stage ('Build'){
  			steps {
  				echo "mvn clean install -Dmaven.test.skip=true"
  			}
  		}
  	}

}