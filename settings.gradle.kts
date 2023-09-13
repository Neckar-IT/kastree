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
}

configure<org.kordamp.gradle.plugin.insight.InsightExtension> {
  enabled.set(true)

  report(org.kordamp.gradle.plugin.insight.reports.SummaryBuildReport::class.java) {
    format.set("long")
    zeroPadding.set(true)
    maxProjectPathSize.set(80)
  }
}

include(":ast:ast-common")
if (false) {
  include(":ast:ast-jvm") //???
}
include(":ast-psi")