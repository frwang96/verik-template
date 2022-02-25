plugins {
    kotlin("jvm") version "1.5.31"
    id("io.verik.verik-plugin") version "0.1.14"
}

repositories {
    mavenCentral()
}

// import all verilog files from src/main/verilog
verikImport {
    importedFiles = project.projectDir
        .resolve("src/main/verilog")
        .listFiles()!!
        .toList()
        .filter { it.extension == "v" }
        .map { it.toPath() }
}
