package MODUL2;

import javax.swing.JOptionPane;

public class jOptionPane {
    public static void main(String[] args) {

        // Menghitung keliling lingkaran
        String radiusStr = JOptionPane.showInputDialog("Masukkan jari-jari lingkaran:");
        double radius = Double.parseDouble(radiusStr);

        double kelilingLingkaran = 2 * Math.PI * radius;
        JOptionPane.showMessageDialog(null, "Keliling lingkaran: " + kelilingLingkaran);

        // Menghitung luas trapesium
        String alasAtasStr = JOptionPane.showInputDialog("Masukkan panjang alas atas trapesium:");
        double alasAtas = Double.parseDouble(alasAtasStr);

        String alasBawahStr = JOptionPane.showInputDialog("Masukkan panjang alas bawah trapesium:");
        double alasBawah = Double.parseDouble(alasBawahStr);

        String tinggiTrapesiumStr = JOptionPane.showInputDialog("Masukkan tinggi trapesium:");
        double tinggiTrapesium = Double.parseDouble(tinggiTrapesiumStr);

        double luasTrapesium = 0.5 * (alasAtas + alasBawah) * tinggiTrapesium;
        JOptionPane.showMessageDialog(null, "Luas trapesium: " + luasTrapesium);

        // Menghitung luas prisma segitiga
        String alasSegitigaStr = JOptionPane.showInputDialog("Masukkan panjang alas segitiga:");
        double alasSegitiga = Double.parseDouble(alasSegitigaStr);

        String tinggiSegitigaStr = JOptionPane.showInputDialog("Masukkan tinggi segitiga:");
        double tinggiSegitiga = Double.parseDouble(tinggiSegitigaStr);

        String tinggiPrismaStr = JOptionPane.showInputDialog("Masukkan tinggi prisma:");
        double tinggiPrisma = Double.parseDouble(tinggiPrismaStr);
        
        double luasAlasSegitiga = 0.5 * alasSegitiga * tinggiSegitiga;
        double luasPrismaSegitiga = 2 * luasAlasSegitiga + 3 * alasSegitiga * tinggiPrisma;
        JOptionPane.showMessageDialog(null, "Luas prisma segitiga: " + luasPrismaSegitiga);
    }
}