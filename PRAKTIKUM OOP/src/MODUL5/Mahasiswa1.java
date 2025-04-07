package MODUL5;

//Program overloading method
public class Mahasiswa1 {
    // Method untuk menampilkan identitas mahasiswa
    public void tampilkanInfo(String nama, String nim, String jurusan, String fakultas) {
        System.out.println("===Identitas Mahasiswa===");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Fakultas: " + fakultas);
    }

    // Overloaded method untuk menampilkan prestasi akademik
    public void tampilkanInfo(String nama, double ipSemester, double ipKumulatif, String riwayatBeasiswa) {
        System.out.println("===Prestasi Akademik===");
        System.out.println("Nama: " + nama);
        System.out.println("IP Semester: " + ipSemester);
        System.out.println("IP Kumulatif: " + ipKumulatif);
        System.out.println("Riwayat Beasiswa: " + riwayatBeasiswa);
    }

    public static void main(String[] args) {
        Mahasiswa1 mahasiswa = new Mahasiswa1();

        // Menampilkan identitas mahasiswa
        mahasiswa.tampilkanInfo("Himawari", "11251010", "Informatika", "Sains dan Teknologi Informasi");

        // Menampilkan prestasi akademik
        mahasiswa.tampilkanInfo("Himawari", 3.75, 3.65, "Beasiswa Unggulan");
    }
}