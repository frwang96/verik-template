# Template

For the setup guide, go to [setup](https://verik.io/setup/index.html). For the tutorial, go to
[tutorial](https://verik.io/tutorial/index.html).

## Project Files

`/.idea/`
The IntelliJ IDEA project configuration directory. It stores code style and inspection profile
configuration specific to Verik.

`/src/`
The project source directory. All source code should be written in `/src/main/kotlin`.

`/build.gradle.kts`
The Gradle build configuration file.

`/settings.gradle.kts`
The Gradle settings configuration file.

`/vkproject.yaml`
The Verik project configuration file.

## Build Files

`/build/verik/out/`
The SystemVerilog output files from verikc.

`/build/verik/order.txt`
The order to compile the SystemVerilog files.

`/build/vkbuild/`
The build directory for Vivado XSIM.

`/build/vkrun/`
The run directory for Vivado XSIM.
