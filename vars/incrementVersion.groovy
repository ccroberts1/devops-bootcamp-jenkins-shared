#!/user/bin/env groovy

def call() {
    echo "Incrementing app version..."
    sh "npm version minor"
    def packageJson = readJSON file: 'package.json'
    def version = packageJson.version

    env.IMAGE_NAME = "$version-$BUILD_NUMBER"
}
