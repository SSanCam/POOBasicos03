/**
 * Clase que representa a una persona con atributos como peso, altura, nombre e índice de masa corporal (IMC).
 *
 * @property peso Peso de la persona en kilogramos.
 * @property altura Altura de la persona en metros.
 * @property imc Índice de Masa Corporal (IMC) calculado a partir del peso y la altura.
 * @property nombre Nombre de la persona.
 * @constructor Crea una instancia de la clase Persona con los atributos de peso y altura.
 */
class Persona(peso: Double, altura: Double) {

    //GETTERS Y SETTERS - PROPIEDADES DE CLASE:
    val peso: Double = peso

    val altura: Double = altura

    val imc = String.format("%.2f", peso / (altura * altura))

    var nombre: String = ""
        get() = field
        set(value) {
            require(value.isNotBlank()) { "Debes introducir un nombre válido." }
            field = value
        }


    //CONSTRUCTOR SECUNDARIO
    /**
     * Constructor secundario que permite crear una instancia de Persona con nombre, peso y altura.
     *
     * @param nombre Nombre de la persona.
     * @param peso Peso de la persona en kilogramos.
     * @param altura Altura de la persona en metros.
     */
    constructor(nombre: String, peso: Double, altura: Double) : this(peso, altura) {
        this.nombre = nombre
    }
//METODOS:
    /**
     * Método para calcular el Índice de Masa Corporal (IMC) de la persona.
     *
     * @param peso Peso de la persona en kilogramos.
     * @param altura Altura de la persona en metros.
     * @return Valor del IMC.
     */
    fun imc(peso: Double, altura: Double): Double {
        val imc = peso / (altura * altura)
        return imc
    }

    // MÉTODOS DE IGUALDAD Y HASHCODE QUE HEMOS GENERADO A PARTIR DEL CÓDIGO PREVIO
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Persona

        if (peso != other.peso) return false
        if (altura != other.altura) return false
        if (imc != other.imc) return false
        if (nombre != other.nombre) return false

        return true
    }

    override fun hashCode(): Int {
        var result = peso.hashCode()
        result = 31 * result + altura.hashCode()
        result = 31 * result + imc.hashCode()
        result = 31 * result + nombre.hashCode()
        return result
    }

    //COMPANION OBJECT
    /**
     * Método de clase para saludar a una persona por su nombre.
     *
     * @return Saludo.
     */
    companion object {
        fun saludar(nombre: String): String {
            return ("Hola, $nombre")
        }

        fun alturaEncimaMedia(altura: Double): Boolean {
            return altura >= 1.75
        }

        fun pesoEncimaMedia(peso: Double): Boolean{
            return peso >= 70.0
        }


    }

}

