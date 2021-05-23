package func

/**
 * @PACKAGE_NAME: func
 * @NAME: io
 * @DATE: 2021/5/23
 **/

fun main(vararg args: String) {
    //map 是元素一一映射
    val list = FloatArray(3) { 1 + it * 0.1f }
    list
        .asSequence()
        .map {
            "kotlin $it"
        }
        .joinToString()
        .let(::println) //let相当于阀门,不调用就会堵在水管里

    //asSequence 懒序列  保证执行一个元素执行完map,forEach操作后，另一个元素再开始执行

    //flatmap 提取集合元素，依次将元素映射成集合，最后将集合拼接
    list
        .asSequence()
        .flatMap {
            listOf("version $it", "sdk $it").asSequence()
        }
        .joinToString()
        .let(::println)//[version 1.0, sdk 1.0 , version 1.1, sdk 1.1 , version 1.2, sdk 1.2 ]


}
