package com.example

import co.paralleluniverse.strands.Strand

fun main(args: Array<String>) {
    fiber {
        Strand.sleep(1000)
        println("It works!")
    }.start()
}
