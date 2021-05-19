package clazz

/**
 * @PACKAGE_NAME: clazz
 * @NAME: Person
 * @DATE: 2021/5/16
 **/
class Person() {
    var name: String? = null
    private var age: Int? = null
    private var sex: String? = null

    constructor(name: String) : this() {
        this.name = name
    }

    constructor(name: String, age: Int) : this(name) {
        this.age = age
    }

    constructor(name: String, age: Int, sex: String) : this(name, age) {
        this.sex = sex
    }
}

fun main(vararg args: String) {
    val personList = listOf(
        Person("bob", 31, "m"),
        Person("anna", 12, "f"),
        Person("alex", 5, "f"),
        Person("bruce", 11, "m"),
        Person("susan", 20, "f"),
        Person("jack", 20, "m"),
        Person("fiona", 23, "f"),
        Person("kevin", 8, "m"),
        Person("alan", 28, "m"),
        Person("kate", 11, "f"),
        Person("paul", 7, "m")
    )

    //1.根据名字进行排序
    personList
        .sortedBy { p: Person -> p.name }
        .forEach {
            println(it.name)
        }

    //2.将姓名首字母转换成大写
    personList.map {
//        it.name -> "ss"

    }

}

