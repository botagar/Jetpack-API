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
timeout(time:1, unit:'DAYS') {
    input message:'Deploy?'
}
node {
  stage('Deploy') {
    sh "ansible-playbook -u '${DEPLOY_USER},' -i '${DEPLOY_HOST},' deployment/deploy.yml"
  }
}
