package operator

/**
 * @PACKAGE_NAME: operator
 * @NAME:Plus +重载
 * @DATE: 2021/5/16
 **/
fun main(vararg args: String) {
    val counter = Counter(100)
    val result = counter + 100
    println("result=$result")//Counter(index=200)
}

data class Counter(var index: Int)

operator fun Counter.plus(increment: Int): Counter {
    return Counter(this.index + increment)
}