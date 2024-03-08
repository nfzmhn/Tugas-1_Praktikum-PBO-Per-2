public class Conditional {

  public static void main(String[] args) {
    int x = 5;
    boolean isEven = false;

    System.out.println("x = " + x);

    x = isEven ? 4 : 7;
    //'?' merupakan operatotr bernama Ternary. dimana itu merupakan if else tapi satu baris.
    //Jika isEven mengembalikan nilai true, maka jawabannya 4. namun jika isEven mengembalikan nilai false, maka hasilnya 7.
    //'x' yang atas bernilai 0 karena x masih bernilai 0.
    //'x' yang bawah sudah bernilai 7, karena nilai x sudah berubah menjadi isEven dimana isEven adalah nilai false = 7.
    System.out.println("x = " + x);
  }
}
