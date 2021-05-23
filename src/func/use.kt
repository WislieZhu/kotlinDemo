package func

import java.io.File

/**
 * @PACKAGE_NAME: func
 * @NAME: FileExt use函数的使用，会帮我们关闭资源
 * @DATE: 2021/5/23
 **/

fun main(vararg args: String) {

    File(".gitignore")
        .inputStream()
        .bufferedReader()
        .use {
            println(it.readText())
        }
}