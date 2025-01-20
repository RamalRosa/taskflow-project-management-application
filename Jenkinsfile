pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }

        stage('Build'){
            steps{
                sh 'mvn clean install'
            }
        }

        stage('Build Container'){
            steps {
                sh 'docker build -t taskflow-app .'
            }
        }

        stage('Run Container'){
            steps {
                sh 'docker run -d -p 7000:7000 --name taskflow-container taskflow-app'
            }
        }
    }
}
