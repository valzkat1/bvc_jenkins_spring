pipeline {
  agent { label 'contextLoads'}  
  
  	stages {
  		stage('test'){
  			steps {
  			   sh "mvn clean compile test"
  			}
  		
  		}
  		stage ('Build application'){
  			steps {
  				echo "mvn clean install -Dmaven.test.skip=true"
  			}
  		}
  	}

}