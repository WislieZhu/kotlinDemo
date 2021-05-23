package func

import java.lang.Exception
import java.lang.Integer.parseInt

/**
 * @PACKAGE_NAME: func
 * @NAME: 函数使用
 * @DATE: 2021/5/21
 * 参考 https://kotlinlang.org/docs/lambdas.html#passing-trailing-lambdas
 **/
fun main(vararg args: String) {
    /**
     *
     * 匿名函数  fun 函数名(普通参数,函数式参数):返回类型{ }
     * 高阶函数:参数类型包含函数类型或者返回值类型为函数类型的函数是高阶函数
     */
    //region+折叠 案例1 lambda表达式 val/var 变量名: (参数类型,参数类型...)->返回值类型 = {参数:参数类型,参数:参数类型 -> 返回值 }val/var 变量名: (参数类型,参数类型...)->返回值类型 = {参数:参数类型,参数:参数类型 -> 返回值 }
    val parseStringToInt: (param: String) -> Int = {
        try {
            parseInt(it)
        } catch (e: Exception) {
            -1
        }
    }
    parseStringToInt("12")
    //endregion

    //region+折叠 案例2 函数定义: fun 函数名(参数:A,参数:B..):返回类型 {/*...*/}
    fun parseStringToInt2(param: String) =
        try {
            parseInt(param)
        } catch (e: Exception) {
            -1
        }

    val p = ::parseStringToInt2
    p("kotlin")
    //endregion

    //region+折叠 案例3 返回类型是函数的高阶函数 ()->Int
    fun parseStringToInt3(param: String): () -> Int {
        return {
            try {
                parseInt(param)
            } catch (e: Exception) {
                -1
            }
        }
    }

    val pp = ::parseStringToInt3
    pp("kotlin 1.5")()
    //endregion

    //region+折叠 案例4 参数类型是函数的高阶函数 ()->Int 函数的最后一个参数是一个lambda表达式,可将lambda放在函数的后面
    fun parseStringToInt4(params: String, block: (String) -> Int): Int {
        return block(params)
    }
    parseStringToInt4("15") {
        parseStringToInt2(it)
    }
    //endregion

    //region+折叠  方法字面常量 A.(B)->C
    var stringAddInt: String.(Float) -> String = {
        this + it
    }
    //A.f(B)
    "kotlin version ".stringAddInt(1.5f)
    //f(A,B)
    stringAddInt("kotlin version ", 1.5f)
    //f.invoke(A,B)
    stringAddInt.invoke("kotlin version ", 1.5f)
    //endregion

    //中缀
    infix fun Int.plusTo(x: Int) = plus(x)
    5 plusTo 6

    //region+折叠
    val ints = listOf(1, 3, 5, 7)
    ints.filter { item: Int ->
        item > 0
    }
    ints.filter(fun(item: Int): Boolean {
        return item > 0
    })
    ints.filter(fun(item) = item > 0)
    //endregion
}












