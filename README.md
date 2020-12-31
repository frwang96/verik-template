# Template

For the setup guide, go to [setup](https://verik.io/setup/index.html).

`/.idea/` The IntelliJ IDEA project configuration directory. It stores code style and inspection profile
configuration specific to Verik.

`/src/` The project source directory. All source code should be written in `/src/main/kotlin`.

`/build.gradle.kts` The Gradle build configuration. It tells Gradle where to look for the Kotlin compiler
and `verik.jar`.

`/gradlew` The Gradle wrapper shell script for Mac and Linux. `./gradlew build` will run the Kotlin compiler.

`/gradlew.bat` The Gradle wrapper batch script for Windows. `gradlew build` will run the Kotlin compiler.

`vkproject.yaml` The Verik project configuration file.