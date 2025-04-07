package MODUL6;

abstract class Shape {
    public abstract double calculateVolume();
}

class Bola extends Shape {
    private double jariJari;

    public Bola (double jariJari) {
        this.jariJari = jariJari;

    }

    @Override
    public double calculateVolume() {
        return 4.0/3.0 * Math.PI * jariJari * jariJari * jariJari;
    }
}

public class volumeBola {
    public static void main (String[] args) {
        Bola bola = new Bola(5);
        //variabel
        double jariJari = 5;

        //output volume bola
        System.out.println("Jari-jari Bola: " + jariJari);
        System.out.println("Volume Bola: " + bola.calculateVolume());
    }
}