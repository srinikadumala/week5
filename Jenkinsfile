pipeline {

    agent any

    stages {

        stage('Checkout') {
            steps {
                echo "Cloning repo..."
                git branch: 'main', url: 'https://github.com/srinikadumala/week5.git'
            }
        }

        stage('Compile') {
            steps {
                echo "Compile"
                bat 'javac Factorial.java TestFactorial.java'
            }
        }

        stage('Test') {
            steps {
                echo "Test"
                bat 'java TestFactorial'
            }
        }

        stage('Run') {
            steps {
                echo "Run"
                bat 'java Main'
            }
        }

        stage('Package JAR') {
            steps {
                echo "Build"
                bat 'jar cfm factorial.jar manifest.txt Main.class'
            }
        }

        stage('Archive JAR') {
            steps {
                echo "Deploy"
                archiveArtifacts artifacts: 'factorial.jar'
            }
        }
    }

    post {
        success {
            echo 'Build, test, run and JAR creation successful and artifact is ready!'
        }
        failure {
            echo 'Build or test failed!'
        }
    }
}