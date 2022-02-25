@file:Verik

import imported.Count
import io.verik.core.*

/**
 * 8-bit counter module that asserts a strobe signal when [count] is true.
 */
class Counter(
    @In var clk: Boolean,
    @In var rst: Boolean,
    @Out var strobe: Boolean
): Module() {

    var count: Count = nc()

    @Seq
    fun seqCount() {
        on(posedge(clk)) {
            if (rst) count = u0<`8`>()
            else count += u(1)
        }
    }

    @Com
    fun comStrobe() {
        strobe = (count == u0<`8`>())
    }
}
