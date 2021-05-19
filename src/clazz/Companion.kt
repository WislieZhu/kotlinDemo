package clazz

/**
 * @PACKAGE_NAME: clazz
 * @NAME: Companion
 * @DATE: 2021/5/17
 **/
fun main(vararg args:String){

    MyClass.loadClass()

    MyClass.CustomClass.lazySingle()


}

class MyClass {
    companion object {
        fun loadClass(){
            println("访问当前类时加载")
        }
    }

    object CustomClass{
        fun lazySingle(){
            println("访问该方法时加载")
        }
    }
}



