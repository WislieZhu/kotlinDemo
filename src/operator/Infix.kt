package func

/**
 * @PACKAGE_NAME: operator
 * @NAME: Infix 中缀操作符
 * @DATE: 2021/5/15
 **/
fun main(vararg arg: String) {

    val a = listOf(1, 2, 3)
    val b = listOf(2, 3, 4);
    val result = a interSection b
    println("result =$result")  //[b,c]

//    for((index,value) in a.withIndex()){
//        println("$index $value")
//    }

//    val filter = a.filter {
//        it % 2 == 0
//    }
//    println("filter =$filter")


//    val array = Array<Int>(5,{
//
//    })
}

infix fun <T> List<T>.interSection(other: List<T>): List<T> {
    val result = ArrayList<T>()
    forEach {
        if (other.contains(it)) {
            result.add(it)
        }
    }
    return result
}