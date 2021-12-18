import io.verik.core.*

typealias WIDTH = `8`

@SimTop
class AdderTest : Module() {

    var a: Ubit<WIDTH> = nc()
    var b: Ubit<WIDTH> = nc()
    var x: Ubit<WIDTH> = nc()

    @Make
    val adder = Adder<WIDTH>(a, b, x)

    @Run
    fun test() {
        repeat(64) { transact() }
        finish()
    }

    @Task
    fun transact() {
        a = randomUbit()
        b = randomUbit()
        delay(1)
        val expected = a + b
        if (x == expected) print("PASS ")
        else print("FAIL ")
        println("$a + $b = $x")
    }
}
