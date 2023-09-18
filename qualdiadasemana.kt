fun main (){
  println("digite um numero entre 1 e 7");
  var num1=readLine()!!
  var dia=num1.toInt()
  val result = when (dia) {
    1 -> "Domingo"
    2 -> "Segunda"
    3 -> "Terça"
    4 -> "Quarta"
    5 -> "Quinta"
    6 -> "Sexta"
    7 -> "Sábado"
    else -> "Dia Inválido."
  }
  //uma maneira é concatenar usando o sinal de +
  println("O numero: "+dia+", corresponde a: "+result)
  
  //a outra maneira é usar osinal de $ para as variaveis
  println("O numero: $dia, corresponde a: $result")
  
}
