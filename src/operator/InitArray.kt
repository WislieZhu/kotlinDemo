package operator

import com.sun.xml.internal.fastinfoset.util.StringArray
import java.util.*

/**
 * @PACKAGE_NAME: operator
 * @NAME: InitArray 初始化数组
 * @DATE: 2021/5/16
 **/
fun main(vararg arg: String) {

    //方式一,通过Array创建,初始化大小为3,元素均为""
    val arr = Array(3) { "" }
    arr[0] = "a"
    arr[1] = "b"
    arr[2] = "c"
    println("arr=${arr.contentToString()}")
    //方式二,使用kotlin封装方法创建数组
    val arr2 = arrayOf("a","b","c")
    println("arr2=${arr2.contentToString()}")
    val arr3 = charArrayOf('a','b','c')
    println("arr3=${arr3.contentToString()}")


    //遍历数组 方式一 forEach
    arr.forEach {
        println("$it ")
    }
    // 方式二 in
    for(item in arr){
        println("$item ")
    }
    // 方式三 in 访问下标
    for(index in arr.indices){
        println("${arr[index]} ")
    }
    // 方式四 in withIndex访问下标
    for((index,value) in arr.withIndex()){
        println("$index=${value} ")
    }
    // 方式五 迭代器
    val itr = arr.iterator();
    itr.forEach {
        println("$it ")
    }
}