#!/usr/bin/env groovy

def call(String branch, String scmUrl, String email, String serverPort, String developmentServer, String stagingServer, String productionServer) {
    	myDeliveryPipeline {
    branch = 'master'
    scmUrl = 'ssh://git@myScmServer.com/repos/myRepo.git'
    email = 'team@example.com'
    serverPort = '8080'
    developmentServer = 'dev-myproject.mycompany.com'
    stagingServer = 'staging-myproject.mycompany.com'
    productionServer = 'production-myproject.mycompany.com'
}
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

    post {
    failure {
        echo "Faliure"
    }
}//post

}
