import com.example.ExampleSettingsExtension

pluginManagement {
    includeBuild("build-logic")
}

plugins {
    id("com.example.exampleSettingsPlugin")
}

configure<ExampleSettingsExtension> {
    someProperty = "settings"
}

include("lib")

rootProject.name = "settings-plugin-test"
