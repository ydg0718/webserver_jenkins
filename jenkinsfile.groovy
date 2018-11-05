pipeline {
    agent any

    stages {
        stage('build') {
            steps {
                sh "${workspace}/gradlew clean build"
            }
        }
    }
}