package template

import verik.base.*

@top class _template: _module() {

    @run fun hello_world() {
        println("hello world")
        finish()
    }
}