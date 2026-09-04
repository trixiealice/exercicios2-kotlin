import modulo.Pessoa

fun main () {
    println("                                  ")
    println("---------- Exercício 12 ----------")

    var contar = (1..100).toList()
    for (lista in contar) {
        if (lista % 3  == 0 && lista % 5 == 0){
            println("$lista - BatataQuente")
        }

        else if (lista % 3 == 0) {
            println(" $lista - Batata")
        }

        else if (lista % 5 == 0) {
            println("$lista - Quente")
        }
    }
    println("                                  ")
    println("---------- Exercício 13 ----------")
    var numeros = arrayOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15)
    var filtroImpar = numeros.filter { it % 2 == 0 }
    var novaLista = filtroImpar
    println("$novaLista")

    println("                                  ")
    println("---------- Exercício 14 ----------") // - corrigir

    /* fun compras(preco1: Number, preco2: Number, preco3: Number) : String {
        val resultadoDaCompra =
            (preco1.toFloat() + preco2.toFloat() + preco3.toFloat())

        val result = String.format("",resultadoDaCompra)
        return result

    }
    println(compras(preco1 = 10, preco2 = 15, preco3 = 17))
    */

    var compras = arrayOf(44,55,24,67)
    var valorTotal = compras.sum()
    println("O valor total é: R$ $valorTotal")

    println("                                  ")
    println("---------- Exercício 15 ----------")

    var idades = arrayOf(3,4,6,7,8,9,19,23,24, 29, 33, 45, 66)
    var filtro = idades.filter { idadeMaior ->
        idadeMaior >= 18

    }
    var mediaIdades = filtro.sum() /filtro.size
    println("A média das idades $filtro é $mediaIdades")


    println("                                  ")
    println("---------- Exercício 16 ----------")


    val numero = 5
    var fatorial = 1

    for (i in 1..numero) {
        fatorial *= i
    }
    println("O fatorial de $numero é: $fatorial")


    println("\n" +
            "---------- Exercício 17 ----------")
    var pessoa = Pessoa("Alice", 67, "São Paulo")
    pessoa.retornarDados()

}











