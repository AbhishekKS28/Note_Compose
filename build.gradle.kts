
// Top-level build file where you can add configuration options common to all sub-projects/modules.



plugins {
    id("com.android.application") version "8.2.0" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false


    // id("com.google.devtools.ksp") version "1.8.10-1.0.9" apply false
//hilt
   // id("com.google.dagger.hilt.android") version "2.44" apply false

    id("com.google.dagger.hilt.android") version "2.48" apply false

}

























// Top-level build file where you can add configuration options common to all sub-projects/modules.buildscript {
//    ext {
//        compose_version = '1.0.2'
//    }
//    repositories {
//        google()
//        mavenCentral()
//    }
//    dependencies {
//        classpath "com.android.tools.build:gradle:7.0.2"
//        classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.21"
//        classpath "com.google.dagger:hilt-android-gradle-plugin:2.38.1"
//
//        // NOTE: Do not place your application dependencies here; they belong
//        // in the individual module build.gradle files
//    }
//}
//
//task clean(type: Delete) {
//    delete rootProject.buildDir
//}
