package operator

/**
 * @PACKAGE_NAME: operator
 * @NAME: Label  标签处返回
 * @DATE: 2021/5/16
 **/
fun main(vararg arg:String){

    ('a'..'e').forEach {
        if('c' == it) return@forEach
        println(it)  //a b d e
    }

}
