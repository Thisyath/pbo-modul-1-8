package MODUL5;

public class Mahasiswa2 {
        private String nama;
        private String nim;
        private String jurusan;
        private String fakultas;
        private double ipSemester;
        private double ipKumulatif;
    
        // Constructor untuk menginisialisasi variabel
        public Mahasiswa2(String nama, String nim, String jurusan, String fakultas, double ipSemester, double ipKumulatif) {
            this.nama = nama;
            this.nim = nim;
            this.jurusan = jurusan;
            this.fakultas = fakultas;
            this.ipSemester = ipSemester;
            this.ipKumulatif = ipKumulatif;
        }
    
        public void tampilkanIdentitas() {
            System.out.println("===Identitas Mahasiswa===");
            System.out.println("Nama: " + nama);
            System.out.println("NIM: " + nim);
            System.out.println("Jurusan: " + jurusan);
            System.out.println("Fakultas: " + fakultas);
            if (ipSemester != 0 && ipKumulatif != 0) {
                System.out.println("IP Semester: " + ipSemester);
                System.out.println("IP Kumulatif: " + ipKumulatif);
            }
        }
    
        public static void main(String[] args) {
    
            // Untuk menginialisasi objek mahasiswa dengan data yang diberikan
            Mahasiswa2 mahasiswa = new Mahasiswa2("Kasino", "10251011", "Sistem Informasi", "Sains dan Teknonologi Informasi", 3.75, 3.65);
            mahasiswa.tampilkanIdentitas();
        }
    }

