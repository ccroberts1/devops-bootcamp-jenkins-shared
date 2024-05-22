#!/user/bin/env groovy

def test() {
    echo "Testing the app..."
    sh "npm install"
    sh "npm run test"
}