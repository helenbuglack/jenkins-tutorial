public class MainTutorialJenkins {

    public String run(int number) {

        if (number <= 0) {
            return ":D";
        } else if (number % 2 == 0) {
            return "Hello, my friend!";
        } else {
            return "Goodbye, my friend!";
        }
    }
}

//pipeline {
//        agent any
//
//        stages {
//        stage ('Compile Stage') {
//
//        steps {
//        withMaven(maven : 'maven') {
//        bat 'mvn clean compile'
//        }
//        }
//        }
//
//        stage ('Testing Stage') {
//
//        steps {
//        withMaven(maven : 'maven') {
//        bat 'mvn test'
//        }
//        }
//        }
//        }
//        }