rootProject.name = "kastree"


pluginManagement {
  repositories {
    mavenCentral()
    google()
    gradlePluginPortal()
  }
}

plugins {
  //Prints the Maven like output at the end of the build
  //https://kordamp.org/kordamp-gradle-plugins/#_org_kordamp_gradle_insight
  id("org.kordamp.gradle.insight") version "0.47.0"
////                           # available:"0.48.0"
////                           # available:"0.49.0"
////                           # available:"0.50.0"
////                           # available:"0.51.0"

  id("de.fayard.refreshVersions") version "0.40.2"
////                          # available:"0.50.0"
////                          # available:"0.50.1"
////                          # available:"0.50.2"
////                          # available:"0.51.0"
////                          # available:"0.60.0"
////                          # available:"0.60.1"
////                          # available:"0.60.2"
}

configure<org.kordamp.gradle.plugin.insight.InsightExtension> {
  enabled.set(true)

  report(org.kordamp.gradle.plugin.insight.reports.SummaryBuildReport::class.java) {
    format.set("long")
    zeroPadding.set(true)
    maxProjectPathSize.set(80)
  }
}

refreshVersions {
  //Enable creation of Libs.kt in buildSrc using the goal "buildSrcLibs"
  enableBuildSrcLibs()
}

include(":ast:ast-common")
if (false) {
  include(":ast:ast-jvm") //???
}
include(":ast-psi")