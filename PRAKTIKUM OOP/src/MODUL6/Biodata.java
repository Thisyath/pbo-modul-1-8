package MODUL6;

public class Biodata {
    // Deklarasi variabel private
    private String nama;
    private String nim;
    private String jurusan;
    private String fakultas;
    private String universitas;
    private String alamat;
    private String email;
    private String pekerjaan;
    private String hobi;
    private String keahlian;
    private String karya;

    // Constructor untuk menginisialisasi variabel
    public Biodata(String nama, String nim, String jurusan, String fakultas, String universitas, String alamat, String email, String pekerjaan, String hobi, String keahlian, String karya) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.fakultas = fakultas;
        this.universitas = universitas;
        this.alamat = alamat;
        this.email = email;
        this.pekerjaan = pekerjaan;
        this.hobi = hobi;
        this.keahlian = keahlian;
        this.karya = karya;
    }

    // Getter methods untuk mengakses variabel private
    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public String getFakultas() {
        return fakultas;
    }

    public String getUniversitas() {
        return universitas;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getEmail() {
        return email;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public String getHobi() {
        return hobi;
    }

    public String getKeahlian() {
        return keahlian;
    }

    public String getKarya() {
        return karya;
    }

    // Method untuk menampilkan biodata
    public void tampilkanBiodata() {
        System.out.println("Biodata:");
        System.out.println("Nama: " + getNama());
        System.out.println("NIM: " + getNim());
        System.out.println("Jurusan: " + getJurusan());
        System.out.println("Fakultas: " + getFakultas());
        System.out.println("Universitas: " + getUniversitas());
        System.out.println("Alamat: " + getAlamat());
        System.out.println("Email: " + getEmail());
        System.out.println("Pekerjaan: " + getPekerjaan());
        System.out.println("Hobi: " + getHobi());
        System.out.println("Keahlian: " + getKeahlian());
        System.out.println("Karya: " + getKarya());
    }

    public static void main(String[] args) {
        // Membuat objek Biodata dan menginisialisasi variabel
        Biodata biodata = new Biodata("Thisya Darmala", "11241083", "Informatika", "Sains dan Teknologi Informasi", "ITK", "Balikpapan", "11241083@student.itk.ac.id", "Mahasiswa", "Membaca", "Kurang tau", "Nothing");
        
        // Menampilkan biodata
        biodata.tampilkanBiodata();
    }
}