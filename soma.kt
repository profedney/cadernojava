fun main(){
  println("Bem vindo ao programa somador de numeros");
  println("Digite o primeiro numero 1: ");
  var num1=readLine()!!;
  println("Você digitou: "+num1);
  println("Digite o primeiro numero 2: ");
  var num2=readLine()!!;
  println("Você digitou: "+num2);
  println("A Soma dos numeros é: ");
  println(num1+num2);
  println("não, não é, kkkkk")
  //os numeros digitados no console são interpretados como String
  //devemos então transformar de String para Int usando toInt()
  var x=num1.toInt();
  var y=num2.toInt();
  var z=x+y;
  println("Agora sim a soma é:"+z); 
 
}
