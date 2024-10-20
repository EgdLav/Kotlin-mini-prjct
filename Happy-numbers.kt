package org.example

import kotlin.math.sqrt
import java.math.*

fun main() {
    fun sqrNums(a: Int): Int {
        if (a == 1) return a
        var ans: Int = 0;
        for (i in 0..< a.toString().length) {
            val t = (a.toString())[i].toString().toDouble()
            ans += Math.pow(t, 2.0).toInt();
        }
        return ans
    }
    var n: Int = 0;
    var count = 0
    for (i in 2..1000) {
        n = i
        for (j in 1..100000) {
            n = sqrNums(n)
            if (n == 1) {
                println(">>> $i")
                count++;
                break
            }
        }
    }
    var procent = count/1000.0*100
    println("$procent%")
}

