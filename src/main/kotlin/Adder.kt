import io.verik.core.*

class Adder<N : `*`>(
    @In var a: Ubit<N>,
    @In var b: Ubit<N>,
    @Out var x: Ubit<N>
) : Module() {

    fun fullAdder(a: Boolean, b: Boolean, c: Boolean): Ubit<`2`> {
        return cat(
            a xor b xor c,
            (a && b) || (a && c) || (b && c)
        )
    }

    @Com
    fun f() {
        var c = false
        for (i in 0 until i<N>()) {
            val fa = fullAdder(a[i], b[i], c)
            x[i] = fa[0]
            c = fa[1]
        }
    }
}
