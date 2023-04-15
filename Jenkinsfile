pipeline {
agent any
stages {
stage ('Install Stage') {
steps {
withMaven(maven : 'apache-maven-3.9.0') {
bat'mvn install'
}
}
}
  stage ('Compile Stage') {
steps {
withMaven(maven : 'apache-maven-3.9.0') {
bat'mvn clean compile'
}
}
}
  stage ('Testing Stage') {
steps {
withMaven(maven : 'apache-maven-3.9.0') {
bat'mvn test'
}
}
}
}
}
