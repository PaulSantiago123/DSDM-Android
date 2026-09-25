package botSeguretat

data class Persona (
    val nom: String,
    val edat: Int,
    val entretenimets: List<String>
)

fun botDeSeguretat(persona: Persona, nomCorrecte: String) {
    if (persona.nom != nomCorrecte) {
        print("Error, el nom és incorrecte o no coincideix")
        return;
    } else {
        println("Nom verificat correctament")
    }

    when (persona.edat){
        in 0..13 -> print("Accés denegat, sou massa petites")
        in 14..17 -> println("Necesiteu permís parental")
        else -> {
            if (persona.edat >= 18) {
                println("Tens acces")
            }
        }
    }
}