plugins {
    id("java")
//    id("application")
}

group = "com.szymm"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

tasks.build {

}

//application {
//    mainClass.set("com.szymm.CustomClass")
//}

tasks.compileJava {
    options.apply {
        isFork = true
        forkOptions.javaHome = file("C:/Users/szymm/.jdks/corretto-1.8.0_382")
    }
}

tasks.register<JavaExec>("gigaSigmaRun") {
    dependsOn(tasks.build)
    classpath(sourceSets.main.get().runtimeClasspath)
    mainClass.set("com.szymm.CustomClass")
}