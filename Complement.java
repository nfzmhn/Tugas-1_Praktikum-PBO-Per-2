public class Complement {

  public static void main(String[] args) {
    int i = 7;
    i = ~i;
    System.out.println("Hasil operasi ~ : " + i);
  }
}
//Operator bitwise complement (~) digunakan untuk menghasilkan komplement satu dari suatu bilangan bulat.
//Artinya, semua bit dalam bilangan tersebut akan dibalik, yaitu 0 menjadi 1 dan 1 menjadi 0.
//Dalam kasus ini, kita memiliki bilangan 7, yang dalam representasi biner adalah 0000 0111. Ketika operator ~ diterapkan pada 7,
//kita mendapatkan komplement satu dari bilangan tersebut, yang akan menghasilkan 1111 1000 dalam representasi biner.
//Mengubah representasi biner tersebut ke dalam desimal, kita mendapatkan 8.
//Oleh karena itu, ketika Anda mencetak nilai i, yang memiliki nilai 8, outputnya akan menjadi 8.
