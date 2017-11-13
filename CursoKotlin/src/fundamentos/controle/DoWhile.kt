package fundamentos.controle

fun main(args: Array<String>) {
    var opcao: Int

    do{
        print("Entre com um numero: ")
        val line = readLine() ?: "0"
        opcao = line.toIntOrNull() ?: 0
        println("Voce escolheu a opçao $opcao")
    } while (opcao != -1)

    println("Ate a proxima!")
}