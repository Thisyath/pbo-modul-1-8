package MODUL1;

class luas2 {

    double panjang;
    double lebar;

    void hasilLuas() {
        double luas2 = panjang * lebar;
        System.out.println("Luas Persegi Panjang: " + luas2);
    }
}

public class luasPersegiPanjang {
    public static void main(String[] args) {
        luas2 persegiPanjang = new luas2();
        persegiPanjang.panjang = 5.0;
        persegiPanjang.lebar = 3.0;
        persegiPanjang.hasilLuas();
    }
}