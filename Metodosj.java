class Main {
  //cria um metodo(sem parametro)
  static void impPrime(){
    System.out.println("Só imprime isso");
  }
  
  //aqui cria um método passando parametro
  static void meuMetodo(String nome) {
    System.out.println("O nome é: "+ nome);
  }

  //aqui cria um método passando parametro
  static void nomeEidade(String nome,int ano) {
    System.out.println(nome + " tem "+ano + " anos");
  }

  //crie um metodo chamado exib que exibe uma String na tela

  //classe principal do java
  public static void main (String[] args){
    //chama metodo impPrime()
    impPrime();

    //chama metodo meuMetodo()
    meuMetodo("Edney");
    meuMetodo("Kauan");
    meuMetodo("Thiago");

    //metodo com dois parametros
    nomeEidade("Edney", 48);
    nomeEidade("Kauan", 17);
    nomeEidade("Thiago", 18);
   
  }
  
}
