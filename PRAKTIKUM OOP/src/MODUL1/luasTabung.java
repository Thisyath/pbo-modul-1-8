package MODUL1;

class luas1{

    double jariJari;
    double tinggi;

    void hasilLuas() {
        double luas1 = 2 * Math.PI * jariJari * (jariJari + tinggi);
        System.out.println("Luas Isi Tabung: " + luas1);
    }   
}

public class luasTabung {
    public static void main(String[] args) {
        luas1 tabung = new luas1();
        tabung.jariJari = 7.0;
        tabung.tinggi = 10.0;
        tabung.hasilLuas();
    }
}