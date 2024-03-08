public class Bitwise {

  public static void main(String[] args) {
    int x = 5, y = 6;
    System.out.println("x= " + x);
    System.out.println("y= " + y);
    System.out.println("x & y= " + (x & y));
    System.out.println("x | y= " + (x | y));
    System.out.println("x ^ y= " + (x ^ y));
  }
}
//Operator "&" adalah operator AND bitwise yang mana menghasilkan 1. Pada angka biner 5 dan 6, maka menjadi 0000 0100 = 4
//Operator | adalah operator OR bitwise yang mana menghasilkan nilai di mana setidaknya satu dari bit-bit yang sesuai adalah 1
//maka menjadi 0000 0111 = 7
//Operator ^ adalah operator XOR bitwise yang mana menghasilkan nilai di mana bit-bit yang berbeda, maka menjadi 0000 0011 = 3
