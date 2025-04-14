package org.example


//class Main2: Closeable {
//    override fun close() {
//        println("close")
//    }
//
//    fun test(){
//        throw RuntimeException("xxxx")
//    }
//
//}

fun main() {
//    val main2 = Main2()
//    main2.use {
//        it.test()
//    }

    val a = true
    val b = false
    val c = true

    println((a || b) && c && c)
}