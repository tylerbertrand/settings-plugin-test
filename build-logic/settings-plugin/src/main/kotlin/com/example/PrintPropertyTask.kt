package com.example

import org.gradle.api.DefaultTask
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction

abstract class PrintPropertyTask : DefaultTask() {

    @get:Input
    val prop: Property<String> = project.extensions.getByType(ExampleSettingsExtension::class.java).someProperty

    @TaskAction
    fun print() {
        println("Extension property: ${prop.get()}")
    }
}