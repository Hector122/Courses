plugins {
    alias(libs.plugins.android.application)
    //alias(libs.plugins.android.library)
    //alias(libs.plugins.jetbrains.kotlin)
    alias(libs.plugins.dagger.hilt)
    alias(libs.plugins.google.services)
    alias(libs.plugins.google.ksp)
    alias(libs.plugins.jetbrains.kotlin.compose)
//    id 'kotlin-kapt'
    //id 'io.realm.kotlin'
}

android {
    namespace = "com.corps.diaryapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.corps.diaryapp"
        minSdk = 23
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.5"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
        implementation(libs.androidx.core.ktx)
        implementation(libs.androidx.lifecycle.runtime.ktx)
        implementation(libs.androidx.activity.compose)
        implementation(libs.androidx.ui)
        implementation(libs.androidx.ui.tooling.preview)
        implementation(libs.androidx.material3)
        testImplementation(libs.junit)
        androidTestImplementation(libs.androidx.junit)
        androidTestImplementation(libs.androidx.espresso.core)
        androidTestImplementation(libs.androidx.ui.test.junit4)
        debugImplementation(libs.androidx.ui.tooling)
        debugImplementation(libs.androidx.ui.test.manifest)

        // Compose Navigation
        implementation(libs.androidx.navigation.compose)

        // Firebase
        implementation(libs.firebase.auth.ktx)
        implementation(libs.firebase.storage.ktx)

        // Room components
        implementation(libs.androidx.room.runtime)
        ksp(libs.androidx.room.compiler)
        implementation(libs.androidx.room.ktx)

        // Runtime Compose
        implementation(libs.androidx.lifecycle.runtime.compose)

        // Splash API
        implementation(libs.androidx.core.splashscreen)

        // MongoDB Realm
        implementation(libs.kotlinx.coroutines.core)
        implementation(libs.library.sync)

        // Dagger Hilt
        implementation(libs.hilt.android)
        ksp(libs.hilt.compiler)
        implementation(libs.androidx.hilt.navigation.compose)

        // Coil
        implementation(libs.coil.compose)

        // Pager - Accompanist (Deprecated)
        // implementation "com.google.accompanist:accompanist-pager:0.27.0"

        // Date-Time Picker
        implementation(libs.core)

        // Calendar
        implementation(libs.calendar)

        // Clock
        implementation(libs.clock)

        // Message Bar Compose
        implementation(libs.messagebarcompose)

        // One-Tap Compose
        implementation(libs.onetapcompose)

        // Desugar JDK
        coreLibraryDesugaring(libs.desugar.jdk.libs)
}
