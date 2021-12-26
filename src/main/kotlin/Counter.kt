@file:Verik

import io.verik.core.*

@SynthTop
class Counter(
    @In var clk: Boolean,
    @In var rst: Boolean,
    @Out var strobe: Boolean
): Module() {

    var count: Ubit<`8`> = nc()

    @Seq
    fun setCount() {
        on(posedge(clk)) {
            if (rst) count = u0<`8`>()
            else count += u(1)
        }
    }

    @Com
    fun setStrobe() {
        strobe = (count == u0<`8`>())
    }
}
