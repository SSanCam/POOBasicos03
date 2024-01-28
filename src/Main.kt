/**
 * Función principal (main) que crea instancias de la clase Persona y realiza comparaciones entre ellas.
 */
fun main() {

    //------------- PERSONA 1 --------------------
    // Creamos una instancia de Persona con peso 65.80kg y altura 1.75m

    val persona1 = Persona(65.80, 1.75)
    //Solicitamos al usuario un nombre implementaremos en la persona1
    println("Introduce un nombre para Persona1: ")
    val nombre = readln()
    persona1.nombre = nombre

    //IMPRIMIMOS LOS DATOS DE PERSONA-1
    val infoP1 = (
            "Persona-1\n" +
                    "Nombre: ${persona1.nombre}\n" +
                    "Peso: ${persona1.peso}kg\n" +
                    "Altura: ${persona1.altura}m"
            )
    //Mostramos los datos de persona1
    println(infoP1)
    println()
    //----------- FIN PERSONA 1-------------------

    //------------- PERSONA 3 --------------------
    // Creamos una instancia de Persona con peso 75.0kg y altura 1.80m
    val persona3 = Persona(75.0, 1.80)
    val p3Imc = persona3.imc(persona3.peso, persona3.altura)

    val infoP3 = (
            "Persona-3\n" +
                    "Peso: ${persona3.peso}kg\n" +
                    "Altura: ${persona3.altura}m\n" +
                    "IMC: $p3Imc %"
            )
    //IMPRIMIMOS LOS DATOS DE PERSONA-3
    println(infoP3)
    println()
    //----------- FIN PERSONA 3-------------------


    //------------- PERSONA 2 --------------------
    // Creamos una instancia de Persona con peso 60.75kg y altura igual a la de Persona-3
    val persona2 = Persona(60.75, persona3.altura)
    val p2Imc = persona2.imc(persona2.peso, persona2.altura)
    val infoP2 = ("Persona-2\n" +
            "Peso: ${persona2.peso}\nkg" +
            "Altura: ${persona2.altura}m\n" +
            "IMC: $p2Imc")
    //Imprimimos los datos de persona2
    println(infoP2)
    println()
    //Imprimimos los datos de persona3
    println(infoP3)
    println()

    //Comparamos persona2 con persona3
    val sonIguales = persona2 == persona3
    if (!sonIguales) {
        println("Las personas 2 y 3 no son iguales.")
    } else {
        println("Las personas 2 y 3 son iguales.")
    }

    //----------- FIN PERSONA 2-------------------

    //MÉTODOS ACTIVIDAD-3

    //saludar()
    val saludo = Persona.saludar(persona1.nombre)
    println()
    println(saludo)
    println()

    //alturaEncimaMedia():Boolean
    // Comprobamos si la altura de cada persona está por encima de la media
    val alturas = listOf(persona1.altura, persona2.altura, persona3.altura)

    for (altura in alturas) {
        if (Persona.alturaEncimaMedia(altura)) {
            println("La altura: $altura, está por encima de la media.")
        } else {
            println("La altura: $altura, no está por encima de la media.")
        }
    }

    //pesoEncimaMedia(): Boolean
    // Comprobamos si el peso de cada persona está por encima de la media

    val pesos = listOf(persona1.peso, persona2.peso, persona3.peso)
    for (peso in pesos) {
        if (Persona.pesoEncimaMedia(peso)) {
            println("El peso: $peso, está por encima de la media.")
        } else {
            println("El peso: $peso, no está por encima de la media.")
        }
    }

    /**
     * obtenerDesc()
     * Creamos una estructura de 5 personas más, a las que le vamos a implementar los nuevos métodos.
     */
    // Creamos instancias de otras personas
    val persona4 = Persona("Persona 4", 75.0, 1.85)
    val persona5 = Persona("Persona 5", 60.0, 1.65)
    val persona6 = Persona("Persona 6", 85.0, 1.75)
    val persona7 = Persona("Persona 7", 50.0, 1.80)
    val persona8 = Persona("Persona 8", 70.0, 1.70)

    val personas = listOf(persona4, persona5, persona6, persona7, persona8)
    //Imprimimos los datos de cada persona de la lista que acabamos de crear
    for (persona in personas) {
        println(Persona.saludar(persona.nombre))
        println(Persona.obtenerDesc(persona))
        println()
    }


}