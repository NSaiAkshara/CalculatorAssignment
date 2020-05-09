#!groovy
pipeline {
    agent any
    stages {
     stage('Maven Install and Build Jar') {
      steps {
       sh 'mvn clean package -DskipTests'
       }
     }
     stage('Docker Build') {
      steps {
        sh 'docker build -t nsaiakshara/calculatordocker:latest .'
      }
    }
     stage('Docker Hub'){
     steps{
 	  withDockerRegistry([ credentialsId: "DockerhubPush", url: "" ]){
 	   sh 'docker push nsaiakshara/calculatordocker:latest'
 	  }
     }
   }
   stage('Deploy using Rundeck') {
      agent any
      steps {
        script {
          step([$class: "RundeckNotifier",
          rundeckInstance: "Rundeck",
          shouldFailTheBuild: true,
          shouldWaitForRundeckJob: true,
          options: """
            BUILD_VERSION=$BUILD_NUMBER
          """,
          jobId: "a6de7df8-0fa1-48aa-a70c-1d27c4e38a78"])
        }
      }
    }
  }
 }
