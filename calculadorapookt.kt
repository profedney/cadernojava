/* Crie um programa Calculadora em kotlin,
o programa solicita que o usuario digite dois numeros inteiros, o programa resolve as quatro operações(soma, subtração, multiplicação, divisão) e responde ao usuario com o resultado das operações, o programa será orientado a objetos, deverá ter uma classe Calculadora, dois atributos num1 e num2, quatro metodos, sendo soma, subtração, multiplicação e divisão */
class Calculadora(var num1: Int, var num2: Int) {
  // metodo soma
  fun soma() {
    var somado=num1+num2
    println("Soma:"+ somado)
  }
  //metodo subtração
  fun sub() {
    var subtraido=num1-num2
    println("Subtração:"+ subtraido)
  }
  // metodo multiplicação
  fun mult() {
    var multiplicado=num1*num2
    println("Multiplicação:"+ multiplicado)
  }
  //metodo subtração
  fun div() {
    var dividido=num1/num2
    println("Divisão:"+ dividido)
  }
}
//função principal kotlin
fun main() {
  println("Digite o primeiro numero: ")
  var numA=readLine()!!.toInt()
  println("Digite outro numero: ")
  var numB=readLine()!!.toInt()
  //instacia a calculadora  
  val calc = Calculadora(numA,numB)  
  // chama funções
  calc.soma()
  calc.sub()
  calc.mult()
  calc.div()
}
