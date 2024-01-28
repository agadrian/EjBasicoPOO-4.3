/**
 * Ejercicio 4.3¶
 * Crear una clase Rectángulo, con atributos base y altura. La clase debe disponer del constructor y los métodos para calcular el área y el perímetro.
 *
 * Opcionalmente se puede crear el método toString() para mostrar información sobre el rectángulo.
 *
 * En el programa principal, crear varios rectángulos y mostrar por pantalla sus áreas y perímetros.
 */


class Rectangulo(private val altura: Double, private val base: Double ){


    init {
        require(this.base > 0 && this.altura > 0) {"La base y altura debe ser mayor a 0"}
    }

    private fun calcularArea(): Double{
        return this.base * this.altura
    }

    private fun calcularPerimetro(): Double{
        return 2 * (this.base + this.altura)
    }

    // Sobreescribimos la funcion toString() usando override. Solo se sobreescribe dentro de esta clase
    override fun toString(): String {
        return "Datos rectangulo de base ${this.base} y altura ${this.altura}:\nArea: ${calcularArea()}\nPerimetro: ${calcularPerimetro()}\n"
    }
}