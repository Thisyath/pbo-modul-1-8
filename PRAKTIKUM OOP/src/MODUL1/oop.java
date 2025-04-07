package MODUL1;

class Tabung {

    double jariJari;
    double tinggi;

    void hasilVolume() {
        double volume = Math.PI * jariJari * jariJari * tinggi;
        System.out.println("Volume Tabung: " + volume);
    }  
}

public class oop {
    public static void main(String[] args) {
        Tabung tabung = new Tabung();
        tabung.jariJari = 7.0;
        tabung.tinggi = 10.0;
        tabung.hasilVolume();
    }
}