@file:Verik

import io.verik.core.*

/**
 * Instantiate [Counter] and toggle [clk] and [rst].
 */
@SimTop
object CounterTest : Module() {

    var clk: Boolean = nc()
    var rst: Boolean = nc()
    var strobe: Boolean = nc()

    @Make
    val counter = Counter(
        clk = clk,
        rst = rst,
        strobe = strobe
    )

    @Run
    fun runClk() {
        clk = false
        forever {
            delay(1)
            clk = !clk
        }
    }

    @Run
    fun runRst() {
        rst = true
        repeat(2) { wait(posedge(clk)) }
        rst = false
        delay(1000)
        finish()
    }

    @Seq
    fun printStrobe() {
        on (posedge(clk)) {
            println("strobe = $strobe")
        }
    }
}
