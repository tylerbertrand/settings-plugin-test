package com.example

import org.gradle.api.provider.Property

interface ExampleSettingsExtension {
    val someProperty: Property<String>
}