plugins {
    alias(libs.plugins.androidApplication)
}

android {
    namespace = "hcmute.edu.vn.baitaptuan09_21110282_volleylibrary"
    compileSdk = 34

    defaultConfig {
        applicationId = "hcmute.edu.vn.baitaptuan09_21110282_volleylibrary"
        minSdk = 21
        targetSdk = 34
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
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

    // thư viện load image
    implementation("com.github.bumptech.glide:glide:4.14.2")
    annotationProcessor("com.github.bumptech.glide:compiler:4.14.2")

    // thư viện load dữ liệu API
    implementation("com.android.volley:volley:1.2.1")

    // thư viện circle images
    // bo góc tròn cho ImageView
    implementation("de.hdodenhof:circleimageview:3.1.0")
}