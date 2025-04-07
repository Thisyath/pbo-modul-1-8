package MODUL7;

public class VolumeBangunRuang {
    public static void main(String[] args) {
        //menginisialisasi objek dari kelas turunan
        BangunRuang Kubus = new Kubus(5);
        BangunRuang Balok = new Balok(5, 3, 2);
        BangunRuang Tabung = new Tabung(7, 10);
        BangunRuang Kerucut = new Kerucut(7, 10);
        BangunRuang Limas = new Limas(5, 3, 10);
        BangunRuang Prisma = new Prisma(5, 3, 10);
        BangunRuang Bola = new Bola(7);

        //menampilkan hasil perhitungan volume
        System.out.println("Volume Kubus: " + Kubus.hitungVolume());
        System.out.println("Volume Balok: " + Balok.hitungVolume());
        System.out.println("Volume Tabung: " + Tabung.hitungVolume());
        System.out.println("Volume Kerucut: " + Kerucut.hitungVolume());
        System.out.println("Volume Limas: " + Limas.hitungVolume());
        System.out.println("Volume Prisma: " + Prisma.hitungVolume());
        System.out.println("Volume Bola: " + Bola.hitungVolume());
    }
}