package fundamentos

fun main(args: Array<String>) {
    //Tipos Numericos Inteiros
    val num1: Byte = 127
    val num2: Short = 32767
    val num3: Int = 2147483647
    val num4: Long = 9223372036854775807 // Long.MAX_VALUE

    //Tipos Numericos Reais
    val num5: Float = 3.14F
    val num6: Double = 3.14

    //Tipo Caractere
    val char: Char = '?'

    //Tipo Booleano
    val boolean: Boolean = true // ou false

    println(listOf(num1, num2, num3, num4, num5, num6, char, boolean))


}
