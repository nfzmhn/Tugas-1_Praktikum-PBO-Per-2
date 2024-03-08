public class Shift {

  public static void main(String[] args) {
    int x = 7;
    System.out.println("x=" + x);
    System.out.println("x>>2=" + (x >> 2));
    //menggeser bit ke kanan 2x
    System.out.println("x<<1=" + (x << 1));
    //gesr ke kiri 1x. 0000 1110 = 14
    System.out.println("x>>>1=" + (x >>> 1));
    //unisigned right shift menggeser semua bit dalam nilai x ke kanan 1x
  }
}
//Contoh bitwise shift, line pertama menggeser bit ke kanan 2x, yang dari 0000 0111 menjadi 0000 0001 = 1
//Lalu yang kedua menggeser ke kiri 1x menjadi 0000 1110 = 14
//Lalu yang ketiga adalah unsigned right shift yang menggeser semua bit dalam nilai x ke kanan satu kali menjadi 0000 0011 = 3
