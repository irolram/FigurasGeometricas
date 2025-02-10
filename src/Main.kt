//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val circulo1 = Circulo("verde", 10.0)
    val rectangulo1 = Rectangulo("amarillo1", 10.0,15.0 )
    val triangulo1 = Triangulo("amarillo1", 10.0,15.0, 7.0,3.0 )

    println(circulo1.area())
    println(rectangulo1.area())
    println(triangulo1.area())
    println(rectangulo1.perimetro())
    println(circulo1.perimetro())
    println(triangulo1.perimetro())
}