package ProgramNo1;

import java.util.Scanner;

// Class Hewan sebagai blueprint untuk objek hewan peliharaan
class Hewan {
    // Variabel instance untuk menyimpan nama, jenis, dan warna hewan
    private String nama;
    private String jenis;
    private String warna;

    // Constructor untuk inisialisasi objek Hewan dengan nama, jenis, dan warna
    // Constructor adalah metode khusus yang digunakan untuk menginisialisasi objek baru
    public Hewan(String nama, String jenis, String warna) {
        this.nama = nama;
        this.jenis = jenis;
        this.warna = warna;
    }

    // Method Overloading untuk menampilkan informasi hewan
    // Method Overloading adalah teknik mendefinisikan beberapa metode dengan nama yang sama tetapi parameter yang berbeda
    public void tampilkanInfo() {
        System.out.println("Hewan: " + nama);
        System.out.println("Jenis: " + jenis);
        System.out.println("Warna: " + warna);
    }

    // Method Overriding untuk memberikan suara hewan
    // Method Overriding adalah teknik mendefinisikan kembali metode superclass di subclass untuk memberikan implementasi yang spesifik
    public void bersuara() {
        System.out.println("Bunyi hewan: Bunyi hewan ini belum diimplementasikan.");
    }

    // Method getter untuk mendapatkan nama hewan
    public String getNama() {
        return nama;
    }

    // Method setter untuk mengubah nama hewan
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Method getter untuk mendapatkan jenis hewan
    public String getJenis() {
        return jenis;
    }

    // Method setter untuk mengubah jenis hewan
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    // Method getter untuk mendapatkan warna hewan
    public String getWarna() {
        return warna;
    }

    // Method setter untuk mengubah warna hewan
    public void setWarna(String warna) {
        this.warna = warna;
    }
}

// Class Kucing sebagai subclass dari Hewan
// Kucing mewarisi semua atribut dan metode dari Hewan, dan dapat memiliki metode serta atribut tambahan yang spesifik
class Kucing extends Hewan {
    // Constructor untuk inisialisasi objek Kucing dengan nama dan warna
    // Constructor ini memanggil constructor superclass menggunakan keyword super
    public Kucing(String nama, String warna) {
        super(nama, "Kucing", warna);
    }

    // Method Overriding untuk memberikan suara kucing
    // Metode ini menimpa metode bersuara dari superclass Hewan
    @Override
    public void bersuara() {
        System.out.println("Meow - Meow!");
    }
}

// Class Anjing sebagai subclass dari Hewan
// Anjing juga mewarisi atribut dan metode dari Hewan, dan dapat memiliki implementasi spesifik
class Anjing extends Hewan {
    // Constructor untuk inisialisasi objek Anjing dengan nama dan warna
    // Constructor ini memanggil constructor superclass menggunakan keyword super
    public Anjing(String nama, String warna) {
        super(nama, "Anjing", warna);
    }

    // Method Overriding untuk memberikan suara anjing
    // Metode ini menimpa metode bersuara dari superclass Hewan
    @Override
    public void bersuara() {
        System.out.println("Woof - Woof!");
    }
}

public class No1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat objek Kucing
        // Objek adalah instance dari kelas yang dibuat menggunakan keyword new
        System.out.print("Masukkan nama kucing Anda: ");
        String namaKucing = scanner.nextLine();
        System.out.print("Masukkan warna kucing Anda: ");
        String warnaKucing = scanner.nextLine();
        Kucing kucing = new Kucing(namaKucing, warnaKucing);

        // Membuat objek Anjing
        System.out.print("Masukkan nama anjing Anda: ");
        String namaAnjing = scanner.nextLine();
        System.out.print("Masukkan warna anjing Anda: ");
        String warnaAnjing = scanner.nextLine();
        Anjing anjing = new Anjing(namaAnjing, warnaAnjing);

        // Menampilkan informasi hewan
        System.out.println("\nInformasi Hewan:");
        kucing.tampilkanInfo();
        kucing.bersuara();
        System.out.println();
        anjing.tampilkanInfo();
        anjing.bersuara();
    }
}

/*
Penjelasan Naratif:

a. Class:
   - Kelas adalah blueprint atau cetak biru untuk membuat objek. Dalam program ini, ada tiga kelas utama:
     - `Hewan`: Kelas ini digunakan sebagai superclass untuk mendefinisikan atribut umum dan metode untuk hewan peliharaan.
     - `Kucing`: Subclass dari `Hewan` yang menambahkan implementasi spesifik untuk kucing.
     - `Anjing`: Subclass dari `Hewan` yang menambahkan implementasi spesifik untuk anjing.

b. Object:
   - Objek adalah instance dari kelas yang dibuat menggunakan keyword `new`. Dalam program ini, objek `Kucing` dan `Anjing` dibuat berdasarkan input dari pengguna.

c. Constructor:
   - Constructor adalah metode khusus yang digunakan untuk menginisialisasi objek. Setiap kelas memiliki constructor untuk mengatur nilai awal atribut. Misalnya, kelas `Hewan` memiliki constructor yang menerima nama, jenis, dan warna sebagai parameter, sedangkan `Kucing` dan `Anjing` memanggil constructor superclass dengan `super`.

d. Method Overloading:
   - Method Overloading adalah teknik mendefinisikan beberapa metode dengan nama yang sama tetapi parameter yang berbeda. Dalam program ini, `tampilkanInfo` di kelas `Hewan` menunjukkan penggunaan overloading, meskipun hanya ada satu versi saat ini.

e. Method Overriding:
   - Method Overriding adalah teknik mendefinisikan kembali metode superclass di subclass untuk memberikan implementasi yang spesifik. Dalam program ini, metode `bersuara` di `Kucing` dan `Anjing` menimpa metode `bersuara` di `Hewan` untuk memberikan bunyi spesifik masing-masing hewan.

f. Method setter dan getter:
   - Setter dan getter adalah metode yang digunakan untuk mengakses dan mengubah nilai atribut privat. Kelas `Hewan` memiliki metode getter dan setter untuk `nama`, `jenis`, dan `warna` yang memungkinkan kontrol akses yang aman terhadap variabel instance tersebut.
*/
