#!/user/bin/env groovy

def call() {
    echo "Testing the app..."
    sh "npm install"
    sh "npm run test"
}