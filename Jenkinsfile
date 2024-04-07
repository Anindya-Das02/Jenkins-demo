pipeline {
    agent any

    environment {
    		APP_VERSION = '1.0.12'
    }

    parameters {
        string(name: 'version', defaultValue: '1.0.1', description: 'enter version of application')
        choice(name: 'team', choices:['Product', 'Data', 'DevOps', 'Config'], description: 'build starter by which Team')
        booleanParam(name: 'deployApplication', defaultValue: false, description: 'deploy the application')
    }

    stages {
        stage("build") {
            steps {
                echo "building application version ${APP_VERSION}, started by ${params.team} Team"
            }
        }

        stage("test") {
            steps {
                echo "testing the application..."
            }
        }

        stage("deploy") {
            when {
                expression {
                    params.deployApplication
                }
            }
            steps {
                echo "deploying the application APP_VERSION=${APP_VERSION}"
            }
        }
    }
}