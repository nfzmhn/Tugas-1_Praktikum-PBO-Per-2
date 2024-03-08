class PrimitifConversionAssignment2 {

  public static void main(String[] arg) {
    double d;
    short s;
    d = 1.2345;
    s = (short) d; // Assign a double to a short variable
    System.out.print("Nilai d: " + s);
  }
}
//Tidak bisa konversi nilai d ke s karena tidak dilakukan casting sebelumnya pada inisialisasi s. Perbaikan yang saya lakukan adalah
//menambahkan casting '(short)' saat inisialisasi s. Tetapi, hasil konversi ini akan menyebabkan hilangnya angka di belakang koma. Karena
//short tidak dapat menyimpan angka dibelakang koma.
