pipeline {
    agent any

    environment {
    		APP_VERSION = '1.0.12'
    }

    stages {
        stage("build") {
            steps {
                echo "building application version ${APP_VERSION}"
            }
        }

        stage("test") {
            steps {
                echo "testing the application..."
            }
        }

        stage("deploy") {
            steps {
                echo "deploying the application APP_VERSION=${APP_VERSION}"
            }
        }
    }
}