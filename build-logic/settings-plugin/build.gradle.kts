plugins {
    `kotlin-dsl`
}

gradlePlugin {
    plugins {
        create("exampleSettingsPlugin") {
            id = "com.example.exampleSettingsPlugin"
            implementationClass = "com.example.ExampleSettingsPlugin"
        }
    }
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}
