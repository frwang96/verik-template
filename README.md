# Verik Template

Template project for [Verik](https://github.com/frwang96/verik). Refer to
[getting started](https://verik.io/docs/tutorial/getting-started) for the getting started guide. In this
template `Counter` has an 8-bit counter that increments on the positive edge of the clock. It sets `strobe` to true when
the count is zero. `CounterTop` instantiates a counter, drives the clock and reset signals, and prints the value
of `strobe`.

- `.idea`: The IntelliJ IDEA project settings directory.
- `build`: Build output directory.
- `src`: Project source directory.
- `build.gradle.kts`: Gradle build file.
- `settings.gradle.kts`: Gradle settings file.
