plugins {
  kotlin("multiplatform") version "1.8.22"
}

kotlin {
  jvm()


  sourceSets {
    val commonMain by getting {
      dependencies {
        //api(project(":ast:ast-jvm:_")) //???
        api(project(":ast:ast-common"))
        api(kotlin("compiler-embeddable", "_"))
      }
    }

    val commonTest by getting {
      dependencies {
      }
    }

    jvm().compilations["main"].defaultSourceSet {
      dependencies {
      }
    }

    jvm().compilations["test"].defaultSourceSet {
      dependencies {
        api(Libs.kotlin_reflect)

        api(Libs.kotlin_test_junit)
        api(KotlinX.coroutines.core)
        api(KotlinX.coroutines.test)
        api(Libs.assertk_jvm)
        api(Libs.kotlin_test_annotations_common)
        api(Libs.kotlin_test_common)
      }
    }

    //js().compilations["main"].defaultSourceSet {
    //  dependencies {
    //  }
    //}
    //js().compilations["test"].defaultSourceSet {
    //  dependencies {
    //  }
    //}
  }

}