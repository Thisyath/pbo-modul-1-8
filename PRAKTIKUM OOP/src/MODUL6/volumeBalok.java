package MODUL6;

abstract class Shape {
    public abstract double calculateVolume();
}

class Balok extends Shape {
    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    public double calculateVolume() {
        return panjang * lebar * tinggi;
    }
}

public class volumeBalok {
    public static void main(String[] args) {
        Balok balok = new Balok(5, 3, 2);
        //variabel
        double panjang = 5;
        double lebar = 3;
        double tinggi = 2;


        //ourput volume balok
        System.out.println("Panjang Balok: " + panjang);
        System.out.println("Lebar Balok: " + lebar);
        System.out.println("Tinggi Balok: " + tinggi);
        System.out.println("Volume Balok: " + balok.calculateVolume());
    }
}
