@file:Verik

import io.verik.core.*

/**
 * Instantiate [Counter] and toggle [clk] and [rst].
 */
@Entry
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
        delay(2000)
        finish()
    }

    @Seq
    fun print() {
        on (posedge(clk)) {
            println("time=${time()} count=${counter.count} strobe=$strobe")
        }
    }
}
