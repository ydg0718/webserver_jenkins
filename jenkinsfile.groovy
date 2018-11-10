pipeline {
    agent any

    stages {
        stage('build') {
            steps {
                sh "chmod +x ${workspace}/gradlew"
                sh "${workspace}/gradlew clean build"
            }
        }
    }
}