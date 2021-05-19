package operator

import java.util.*

/**
 * @PACKAGE_NAME: operator
 * @NAME: Elvis 操作符 不用重复变量
 * @DATE: 2021/5/16
 **/
fun main(vararg args: String) {

    val rd = Random().nextInt(30)
    val str = if (rd > 15) "elvis" else null
    val result = str ?: "is null"
    println("result=$result")
}