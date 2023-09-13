plugins {
  kotlin("multiplatform") version "1.8.22" apply false
  `maven-publish`
  signing
}

allprojects {
  group = "com.github.cretz.kastree"
  version = "0.5.0-SNAPSHOT"

  repositories {
    mavenCentral()
  }
}

//subprojects {
//  when (name) {
//    "ast:ast-common" -> {
//      kotlin {
//        // Konfigurieren der Common-Plattform
//        sourceSets["commonMain"].dependencies {
//          implementation("org.jetbrains.kotlin:kotlin-stdlib-common")
//        }
//        sourceSets["commonTest"].dependencies {
//          implementation("org.jetbrains.kotlin:kotlin-test-annotations-common")
//          implementation("org.jetbrains.kotlin:kotlin-test-common")
//        }
//      }
//      publishSettings("kastree-ast-common", "Common library for Kastree AST")
//    }
//
//    "ast:ast-jvm"    -> {
//      kotlin {
//        jvm {
//          compilations["main"].kotlinOptions.jvmTarget = "1.6"
//          compilations["test"].kotlinOptions.jvmTarget = "1.6"
//        }
//        sourceSets["jvmMain"].dependencies {
//          implementation(project(":ast:ast-common"))
//          implementation("org.jetbrains.kotlin:kotlin-stdlib")
//        }
//        sourceSets["jvmTest"].dependencies {
//          implementation("junit:junit:4.12")
//          implementation("org.jetbrains.kotlin:kotlin-test-junit")
//          implementation("org.jetbrains.kotlin:kotlin-test")
//        }
//      }
//      publishSettings("kastree-ast-jvm", "JVM library for Kastree AST")
//    }
//
//    "ast-psi"        -> {
//      kotlin {
//        jvm {
//          compilations["main"].kotlinOptions.jvmTarget = "1.8"
//          compilations["test"].kotlinOptions.jvmTarget = "1.8"
//        }
//        sourceSets["jvmMain"].dependencies {
//          implementation(project(":ast:ast-jvm"))
//          implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
//          implementation("org.jetbrains.kotlin:kotlin-compiler-embeddable")
//        }
//        sourceSets["jvmTest"].dependencies {
//          implementation("junit:junit:4.12")
//          implementation("org.jetbrains.kotlin:kotlin-test-junit")
//          implementation("org.jetbrains.kotlin:kotlin-test")
//        }
//      }
//      publishSettings("kastree-ast-psi", "JVM library Kastree parsing")
//    }
//  }
//}

fun publishSettings(projectName: String, projectDescription: String) {
  // Hier können Sie die Logik für die `publishSettings` Methode einfügen.
}
