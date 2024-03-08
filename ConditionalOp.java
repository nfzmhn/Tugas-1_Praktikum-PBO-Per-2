public class ConditionalOp {

  public static void main(String[] args) {
    int nilai = 55;
    boolean lulus = (nilai >= 60);

    System.out.println("Anda lulus? " + lulus);
  }
}
//Hasilnya false. Karena nilai di int memiliki nilai 55.
//Sedangkan lulus memiliki nilai (nilai >= 60). Dimana berarti nilai 55 di atas memiliki nilai false.
