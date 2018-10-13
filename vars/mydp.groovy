#!/usr/bin/env groovy

def call(String branch, String scmUrl, String email, String serverPort, String developmentServer, String stagingServer, String productionServer) {
  
    pipeline {
        agent any
        stages {
            stage('checkout git') {
                steps {
                    echo "checkout git"
                }
            }

            stage('Echo Variables'){
                steps {
                    echo "Printing parameters and variables"
                    echo "branch ${branch}"
                    echo "scmUrl: ${scmUrl}"
                    echo "email: ${email}"
                    echo "serverPort: ${8080}"
                    echo "developmentServer: ${developmentServer}"
                    echo "MstagingServer: ${stagingServer}"
				
                }
            }
            
            stage('build') {
                steps {
                    echo "build"
                }
            }

            stage ('test') {
                steps {
                    echo "test"
                }
            }

            stage('deploy developmentServer'){
                steps {
                    echo "deploy developmentServer"
                }
            }

            stage('deploy staging'){
                steps {
                    echo "deploy staging Server"
                }
            }
            
            stage('deploy production'){
                steps {
                    echo "production"
                }
            }
        }//stages
    }//pipelnine
}//post

}
