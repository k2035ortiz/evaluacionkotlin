
class Producto(val nombre: String, val precio: Double) {

    fun mostrarPrecioConIVA() {
        val iva = 0.16
        val precioConIVA = precio * (1 + iva)
        println("Precio con IVA: $precioConIVA")
    }
}
fun main() {

    val laptop = Producto("Laptop X", 1500.0)
    
    laptop.mostrarPrecioConIVA()
}

