fun main () {

    println("---------- Exercício 14 ----------") // - corrigir

    fun compras(preco1: Number, preco2: Number, preco3: Number) : String {
        val resultadoDaCompra =
            (preco1.toFloat() + preco2.toFloat() + preco3.toFloat())

        val result = String.format("",resultadoDaCompra)
        return result

    }
    println(compras(preco1 = 10, preco2 = 15, preco3 = 17))


    println("---------- Exercício 16 ----------")

    val numero = 5
    var fatorial = 1

    for (i in 1..numero) {
        fatorial *= i
    }

    println("O fatorial de $numero é: $fatorial")


    println("---------- Exercício 15 ----------")

    var idades = arrayOf(3,4,6,7,8,9,19,23,24)
    when (idades) {
        in 18..100 -> ("Maior de Idade")
    }







}






