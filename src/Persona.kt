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
    fun obtenerImc(peso: Double, altura: Double): String {
        val imcValor = imc(peso,altura)
        return when {
            imcValor < 18.5 -> "Peso insuficiente."
            imcValor in 18.5..24.9 -> "Peso saludable."
            imcValor in 25.0..29.9 -> "Sobrepeso"
            else -> "Obesidad"
        }
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
     * saludar()
     * Método de clase para saludar a una persona por su nombre.
     *
     * @return Saludo.
     */
    companion object {
        fun saludar(nombre: String): String {
            return ("Hola, $nombre")
        }

        /**
         * alturaEncimaMedia()
         * Método que indica si al altura de una Persona está o no por encima de la media
         * @return true si la altura está por encima de la media indicada, false si no está por encima de la media.
         */
        fun alturaEncimaMedia(altura: Double): Boolean {
            return altura >= 1.75
        }
        /**
         * pesoEncimaMedia()
         * Método que indica si el peso de una Persona está o no por encima de la media
         * @return true si el peso está por encima de la media indicada, false si no está por encima de la media.
         */
        fun pesoEncimaMedia(peso: Double): Boolean{
            return peso >= 70.0
        }

        /**
         * obtenerDesc()
         * @return método que devuelve un texto con toda la información de cada objeto Persona.
         */
        fun obtenerDesc(persona: Persona): String{
             return ("${persona.nombre} con una altura de ${persona.altura}m (${alturaEncimaMedia(persona.altura)}) tiene un peso de ${persona.peso}kg (${pesoEncimaMedia(persona.peso)}) tiene un IMC de ${persona.imc(persona.peso,persona.altura)} (${persona.obtenerImc(persona.peso, persona.altura)})")
        }

    }

}

