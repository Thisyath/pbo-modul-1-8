package MODUL1;

class luas3 {

    double panjangAlasBawah;
    double panjangAlasAtas;
    double tinggi;
    
    void hasilLuas() {
        double luas3 = ((panjangAlasBawah + panjangAlasAtas) * tinggi) / 2;
        System.out.println("Luas Trapesium: " + luas3);
    }
}

public class luasTrapesium {
    public static void main(String[] args) {
        luas3 trapesium = new luas3();
        trapesium.panjangAlasBawah = 5.0;
        trapesium.panjangAlasAtas = 3.0;
        trapesium.tinggi = 4.0;
        trapesium.hasilLuas();
    }
}