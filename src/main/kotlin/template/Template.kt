/*
 * Copyright (c) 2021 Francis Wang
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package template

import io.verik.core.*

@Top
class Template : Module() {

    @Make
    val m = M(
        clk = false,
        rst = false,
        x = nc()
    )

    @Run
    fun f() {
        g()
        finish()
    }
}

class M(
    @In var clk: Boolean,
    @In var rst: Boolean,
    @Out var x: Boolean
) : Module() {

    @Seq
    fun f() {
        on (posedge(clk)) {
            x = rst
        }
    }
}

fun g() {
    println("hello world")
}