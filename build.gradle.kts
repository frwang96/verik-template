plugins {
    kotlin("jvm") version "1.5.31"
    id("io.verik.verik-plugin") version "0.1.16"
}

repositories {
    mavenCentral()
}

verik {
    import {
        importedFiles = listOf(projectDir.toPath().resolve("src/main/verilog/CounterTypes.v"))
    }
    // Metrics dsim target
    dsim {
        compileTops = listOf("CounterTest")
        sim {
            name = "sim"
        }
    }
    // Icarus Verilog target
    iverilog {
        top = "CounterTest"
    }
    // Xilinx vivado target
    vivado {
        part = "xc7a100tcsg324-3"
        simTop = "CounterTest"
    }
    // Cadence xrun target
    xrun {
        top = "CounterTest"
    }
}
