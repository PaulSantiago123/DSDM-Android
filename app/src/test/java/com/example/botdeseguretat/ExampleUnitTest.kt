package com.example.botdeseguretat

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun main() {
        val elMeuNom = "Paul"
        val jo = Persona(
            nom = "Paul",
            edat = 16,
            entreteniments = listOf("Programar", "Llegir", "Esport", "Cinema", "Ajedrez", "Viatjar")
        )

        botDeSeguretat(jo, elMeuNom)
    }
}