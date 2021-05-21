package func

import baseknowledge.joinToString
import baseknowledge.parseInt
import java.lang.Exception

/**
 * @PACKAGE_NAME: func
 * @NAME: 函数使用
 * @DATE: 2021/5/21
 **/
fun main(vararg args: String) {

    //普通函数
    normal("普通函数")

    //lambda函数 val/var 变量:(A,B)->C = ...
    lambda("32")



    v()
    //或者
//    v.invoke()

    f().invoke()
    f()()
    f("含有参数").invoke()

    //val/var 变量:(参数:参数类型)->返回类型 = {返回值}
    val g = g("12")
    println("g= $g")

}

fun normal(string:String):Unit{
    println(string)
}


//todo 如何是这样，返回什么
/*fun normal(string:String):()->Unit{
    println(string)
}*/

//lambda表达式
val lambda:(String)->Int = {
    try {
        parseInt(it) ?: -1
    } catch (e: Exception) {
        -2
    }
}


val v = fun() {
    println("赋值给变量再invoke")
}

fun f() = fun() {
    println("invoke")
}

fun f(string: String): () -> Unit = {
    println(string)
}

val g: (string: String) -> Int = {
    try {
        parseInt(it) ?: -1
    } catch (e: Exception) {
        -2
    }
}






