package func

/**
 * @PACKAGE_NAME: func
 * @NAME: StringExt
 * @DATE: 2021/5/19
 **/

/**
 * 将首字母转换成大写字母
 */
inline fun String.firstCharToUpperCase(): String {
    if (this.isNullOrEmpty()) return this
    return replaceFirst(get(0),get(0).toUpperCase())
}