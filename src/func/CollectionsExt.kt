package func

/**
 * @PACKAGE_NAME: func
 * @NAME: Collection扩展
 * @DATE: 2021/5/18
 **/
fun main(vararg args: String) {

    val list = listOf("abc","cde","abb","dde","aae");
    val result = list.leastBy { it: String ->
        it
    }
    println("result = $result")
}

inline fun <T,R:Comparable<R>> Iterable<T>.leastBy(selector:(T)->R): T? {
    val iterator = this.iterator()
    if(!iterator.hasNext()) return null
    var minValue = iterator.next()
    var min = selector(minValue)
    while (iterator.hasNext()){
        val value = iterator.next()
        val v = selector(value)
        if(v < min){
            min = v
            minValue = value
        }
    }
    return minValue
}