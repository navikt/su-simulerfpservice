plugins {
    `java-library`
    id("uk.co.boothen.gradle.wsimport") version "0.16"
}
version = "1.0.0"
repositories {
    jcenter()
    mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_12
    targetCompatibility = JavaVersion.VERSION_12
}

wsimport {
    wsdl ("no/nav/system/os/eksponering/simulerFpServiceWSBinding.wsdl")
    verbose = false
    quiet = true
    debug = false
}