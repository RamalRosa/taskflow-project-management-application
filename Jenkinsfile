pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }

        stage('File list before maven build'){
            steps{
                sh 'll /opt/taskflow/taskflow-project-management-application/'
            }
        }

        stage('Build'){
            steps{
                sh 'mvn clean install'
            }
        }

        stage('File list after maven build'){
            steps{
                sh 'll /opt/taskflow/taskflow-project-management-application/'
            }
        }
    }
}
