#!/user/bin/env groovy

def buildImage() {
    echo "Building the Docker image..."
    withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh "docker build -t ccroberts1/demo-app:${IMAGE_NAME} ."
        sh 'echo $PASS | docker login -u ${USER} --password-stdin'
        sh "docker push ccroberts1/demo-app:${IMAGE_NAME}"
    }
}
