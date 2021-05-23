package func

/**
 * @PACKAGE_NAME: func
 * @NAME: inline
 * @DATE: 2021/5/22
 * 内联函数
 * 高阶函数内联: 编译完成后会把内联中的内容搬过去
 * 1)函数本身被内联到调用处
 * 2)函数的函数参数被内联到调用处
 **/

//region +折叠 cost
inline fun cost(block: () -> Unit) {
    val start = System.currentTimeMillis()
    block()
    val end = System.currentTimeMillis() - start
    println("cost $end ms")
}
//endregion

fun main(vararg args: String) {
    cost {
        for (i in 0 until 100) {
            "kotlin".firstCharToUpperCase()
        }
    }

    //region +折叠  forEach加标签 这里return 等价于java中的continue
    val items = listOf("kotlin","is","easy")
    items.forEach {
        if(it == "is") return@forEach
        println(it)
    }
    //endregion
}
