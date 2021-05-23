package func

fun fibonacci():()->Int{
    var first = 0
    var second = 1
    return {
        var next = first + second
        val current = first
        first = second
        second = next
        current
    }
}

fun main(vararg args: String) {

    val fib = ::fibonacci //fun fibonacci(): () -> kotlin.Int
    val next = fib() //() -> kotlin.Int
    for(i in 0..10){
        println("${next()}") //0 1 1 2 3 5 8 13 21 34 58
    }
}