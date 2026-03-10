plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.novacorp.tasks"
    compileSdk {
        version = release(36) {
            minorApiLevel = 1
        }
    }

    defaultConfig {
        applicationId = "com.novacorp.tasks"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
}

dependencies {
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    // Material Design Components (required for modern UI)
    implementation("com.google.android.material:material:1.13.0")
    // CardView (for task cards)
    implementation("androidx.cardview:cardview:1.0.0")
    // RecyclerView (for task list)
    implementation("androidx.recyclerview:recyclerview:1.4.0")
    // ConstraintLayout (for complex layouts)
    implementation("androidx.constraintlayout:constraintlayout:2.2.1")
    // CircleImageView (for profile picture)
    implementation("de.hdodenhof:circleimageview:3.1.0")
}