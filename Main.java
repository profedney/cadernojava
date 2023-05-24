class Main {
  public static void main(String[] args) {
    System.out.println("Olá Mundo");
    int variavel = 5;
    System.out.println(variavel);
    int myNum = -2;
    float myFloatNum = 1500.356f;
    char myLetter = 'c';
    boolean myBool = false;
    String myText = "Olá como é bom aprender java";
    System.out.println(myNum);
    System.out.println(myFloatNum);
    System.out.println(myLetter);
    System.out.println(myBool);
    System.out.println(myText);
    //parte dois do código
    System.out.println(myText + myBool);
    int x = 5;
    float y = x;
    System.out.println(x);
    System.out.println(y);
    double myDouble = 9.78d;
    int myInt = (int) myDouble; // Manual casting: double to int
    System.out.println(myDouble);
    System.out.println(myInt);
  }
}