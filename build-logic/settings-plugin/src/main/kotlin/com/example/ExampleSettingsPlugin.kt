package com.example

import org.gradle.api.Plugin
import org.gradle.api.initialization.Settings

class ExampleSettingsPlugin : Plugin<Settings> {
    override fun apply(target: Settings) {
        val exampleSettingsExtension = target.extensions.create("exampleSettingsExtension", ExampleSettingsExtension::class.java)
        target.gradle.afterProject {
            extensions.add("exampleSettingsExtension", exampleSettingsExtension)
            tasks.register("printExampleProp", PrintPropertyTask::class.java)
        }
    }
}