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

        stage('Remove Existing Container') {
            steps {
                script {
                    // Check if the container exists and remove it
                    sh '''
                    if [ "$(docker ps -aq -f name=taskflow-container)" ]; then
                        echo "Removing existing container..."
                        docker rm -f taskflow-container
                    else
                        echo "No existing container to remove."
                    fi
                    '''
                }
            }
        }
        

        stage('Run Container'){
            steps {
                sh 'docker run -d -p 7000:7000 --name taskflow-container taskflow-app'
            }
        }
    }
}
