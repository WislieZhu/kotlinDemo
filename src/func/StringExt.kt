package func

/**
 * @PACKAGE_NAME: func
 * @NAME: StringExt
 * @DATE: 2021/5/19
 **/

/**
 * 将首字母转换成大写字母
 */
fun String.firstCharToUpperCase(str: String): String {
    if (str.isNullOrEmpty()) return str
    return str.replaceFirst(str[0], str[0].toUpperCase())
}