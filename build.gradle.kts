// use the Kotlin and Verik gradle plugins
plugins {
    kotlin("jvm") version "1.5.31"
    id("io.verik.verik-plugin") version "0.1.15"
}

// fetch dependencies from Maven Central
repositories {
    mavenCentral()
}

// import verilog files from src/main/verilog
verikImport {
    importedFiles = project.projectDir
        .resolve("src/main/verilog")
        .listFiles()!!
        .toList()
        .filter { it.extension == "v" }
        .map { it.toPath() }
}
