node {
  stage('Preparation') {
    git 'https://github.com/botagar/Jetpack-API'
  }
}
node {
  stage('Build') {
    sh "./gradlew build"
   }
}
node {
  stage('Deploy') {
    sh "ansible-playbook -u '${DEPLOY_USER}' -i '${DEPLOY_HOST},' deployment/deploy.yml"
  }
}
