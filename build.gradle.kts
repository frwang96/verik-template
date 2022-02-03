plugins {
    id("io.verik.verik-plugin") version "0.1.13"
}

repositories {
    mavenLocal()
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
