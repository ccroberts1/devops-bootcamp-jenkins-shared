#!/user/bin/env groovy

def call() {
    withCredentials([string(credentialsId: 'github-token', variable: 'TOKEN')]) {
        sh 'git config --global user.email "jenkins@example.com"'
        sh 'git config --global user.name "jenkins"'

        sh 'git status'
        sh 'git branch'

        sh 'git add .'
        sh 'git commit -m "ci: version bump"'
        sh "git push https://${TOKEN}@github.com/ccroberts1/devops-bootcamp-jenkins-exercises.git HEAD:jenkins-jobs"
    }
}
