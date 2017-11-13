package fundamentos.controle

fun main(args: Array<String>) {
    for (i in 1..10){
        if (i == 5 || i == 7){
            continue
        }
        println("Atual: $i")
    }
}
