package galassini.tecnology.modulo_7

class Atividade1 {

}

fun String.toLetterList(): List<String> {
    return this.split("")
        .filter { it.isNotBlank() }
}


fun main() {
    val minhaString = "Galassini"
    val listaDeLetras = minhaString.toLetterList()
    println("Letras da string \"$minhaString\": $listaDeLetras")
}
