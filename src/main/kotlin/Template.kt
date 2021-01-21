import verik.base.*

class Template: Module() {

    @run fun hello_world() {
        println("hello world")
        finish()
    }
}