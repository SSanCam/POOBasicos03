/**
 * Función principal (main) que crea instancias de la clase Persona y realiza comparaciones entre ellas.
 */
fun main() {

    //------------- PERSONA 1 --------------------
    val persona1 = Persona(65.80, 1.75)
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
    println(infoP1)
    println()
    //----------- FIN PERSONA 1-------------------

    //------------- PERSONA 3 --------------------
    val persona3 = Persona(75.0, 1.80)
    val p3Imc = persona3.imc(persona3.peso, persona3.altura)

    //IMPRIMIMOS LOS DATOS DE PERSONA-3
    val infoP3=(
        "Persona-3\n" +
                "Peso: ${persona3.peso}kg\n" +
                "Altura: ${persona3.altura}m\n" +
                "IMC: $p3Imc %"
    )
    println(infoP3)
    println()
    //----------- FIN PERSONA 3-------------------


    //------------- PERSONA 2 --------------------
    val persona2 = Persona(60.75, persona3.altura)
    val p2Imc = persona2.imc(persona2.peso, persona2.altura)
    val infoP2 = ("Persona-2\n" +
                    "Peso: ${persona2.peso}\nkg" +
                    "Altura: ${persona2.altura}m\n" +
                    "IMC: $p2Imc")
    println(infoP2)
    println()
    println(infoP3)
    println()

    val sonIguales = persona2 == persona3
    if (!sonIguales){
        println("Las personas 2 y 3 no son iguales.")
    }else{
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
    val alturas = listOf(persona1.altura, persona2.altura, persona3.altura )

    for (altura in alturas){
        if (Persona.alturaEncimaMedia(altura)){
            println("La altura: $altura, está por encima de la media.")
        }else{
            println("La altura: $altura, no está por encima de la media.")
        }
    }

    //pesoEncimaMedia(): Boolean
    val pesos = listOf(persona1.peso, persona2.peso, persona3.peso)
    for (peso in pesos){
        if (Persona.pesoEncimaMedia(peso)){
            println("El peso: $peso, está por encima de la media.")
        }else{
            println("El peso: $peso, no está por encima de la media.")
        }
    }


}