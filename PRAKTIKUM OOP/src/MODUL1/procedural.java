package MODUL1;

public class procedural {
    public static void main(String[] args){
    
        //deklarasikan variabel
        double jariJari = 7.0;
        double tinggi = 10.0;
        double luasTabung;

        //hitung luas tabung
        luasTabung = Math.PI * jariJari * jariJari * tinggi;

        //tampilkan hasil
        System.out.println("Jari-Jari: " + jariJari);
        System.out.println("Tinggi: " + tinggi);
        System.out.println("Luas Tabung (Procedural): " + luasTabung);
    }
}
