package func

/**
 * @PACKAGE_NAME: func
 * @NAME: Complex 过滤出字符串元素长度是奇数的列表
 * @DATE: 2021/5/18
 **/

fun main(vararg args: String) {

    val list = listOf("abc","cdf","hig","oc","ap","def","nu")
    val result = list.filter {
        isOdd(len(it))
    }
    println("result=${result}") //[abc, cdf, hig, def]
}

val len = fun(str: String): Int = str.length
val isOdd = fun(data:Int):Boolean = data % 2 == 1
