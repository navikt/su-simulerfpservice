plugins {
    `java-library`
    id("uk.co.boothen.gradle.wsimport") version "0.16"
    id("maven-publish")
}
group = "no.nav"
version = "1.0.0"
repositories {
    jcenter()
    mavenCentral()
    maven("http://packages.confluent.io/maven/")
}

java {
    sourceCompatibility = JavaVersion.VERSION_12
    targetCompatibility = JavaVersion.VERSION_12
    withSourcesJar()
}

wsimport {
    wsdl ("no/nav/system/os/eksponering/simulerFpServiceWSBinding.wsdl")
    verbose = false
    quiet = true
    debug = false
}

val githubUser: String? by project
val githubPassword: String? by project
configure<PublishingExtension> {
    repositories {
        maven {
            url = uri("https://maven.pkg.github.com/navikt/su-simulerfpservice")
            credentials {
                username = githubUser
                password = githubPassword
            }
        }
    }
    publications {
        create<MavenPublication>("mavenJava") {
            pom {
                name.set("su-simulerfpservice")
                description.set("SU sin SOAP-klient mot økonomi sin simuleringstjeneste")
                url.set("https://github.com/navikt/su-simulerfpservice")
                licenses {
                    license {
                        name.set("MIT License")
                        url.set("https://opensource.org/licenses/MIT")
                    }
                }
                scm {
                    connection.set("scm:git:https://github.com/navikt/su-simulerfpservice.git")
                    developerConnection.set("scm:git:https://github.com/navikt/su-simulerfpservice.git")
                    url.set("https://github.com/navikt/su-simulerfpservice")
                }
            }
            from(components["java"])
        }
    }
}