package operator

/**
 * @PACKAGE_NAME: operator
 * @NAME: Not !重载
 * @DATE: 2021/5/16
 **/
fun main(vararg args:String){
    val result = "12".not()
    println("result=$result")
}

operator fun Any.not():Boolean{
    return this !is Int
}