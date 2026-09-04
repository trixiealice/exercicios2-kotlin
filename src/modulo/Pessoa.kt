package modulo

class Pessoa(
    val nome: String,
    val idade: Int,
    val cidade: String
) {
    fun retornarDados() {
        println("$nome tem $idade anos e mora em $cidade")
    }
}