package com.example.botdeseguretat

data class Persona (
    val nom: String,
    val edat: Int,
    val entreteniments: List<String>
)

fun main() {
    val elMeuNom = "Paul"

    val jo = Persona(
        nom = "Paul",
        edat = 22,
        entreteniments = listOf("Gym", "Anime", "Manga", "VideoJocs", "Bàsquet", "Programmar")
    )

    botDeSeguretat(jo, elMeuNom)
}

fun botDeSeguretat(persona: Persona, nomCorrecte: String) {
    if (persona.nom != nomCorrecte) {
        println("Error, el nom és incorrecte o no coincideix")
        return;
    } else {
        println("Nom verificat correctament")
    }

    when (persona.edat){
        in 0..13 -> println("Accés denegat, sou massa petites")
        in 14..17 -> println("Necesiteu permís parental")
        else -> {
            if (persona.edat >= 18) {
                println("Tens acces")

                println(" Els teus entreteniments (de la A a la L)")

                val entretenimentsOrdenats = persona.entreteniments.sorted()

                for (entreteniment in entretenimentsOrdenats) {
                    if (entreteniment.isNotEmpty()) {
                        val primeraLletra = entreteniment[0].uppercaseChar()
                        if (primeraLletra in 'A'..'L') {
                            println("- $entreteniment")
                        }
                    }
                }
            } else {
                println("edat no valida")
                return;
            }
        }
    }
}