def call(Map config = [:]) {
    sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}."
    sh "echo uname -a"
    sh "df -h"
    sh "top"
}
//def call() {
//    sh "echo Hello World"
//}

//def call (String name,String dayOfWeek) {
//    sh "echo Hello ${name} . today is ${dayOfWeek}"
//}

