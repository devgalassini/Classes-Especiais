package galassini.tecnology.modulo_7

class Atividade4 {

}

fun main() {
    val utilidade = UtilityHelper

    utilidade.setCurrentDay(DayOfWeek.MONDAY)
    println("É fim de semana? ${utilidade.isWeekend()}")

    val novaUtilidade = UtilityHelper

    novaUtilidade.setCurrentDay(DayOfWeek.SUNDAY)
    println("É fim de semana? ${novaUtilidade.isWeekend()}")
}
