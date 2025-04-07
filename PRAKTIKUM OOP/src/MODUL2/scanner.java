package MODUL2;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menghitung keliling lingkaran
        System.out.print("Masukkan jari-jari lingkaran: ");
        double radius = scanner.nextDouble();

        double kelilingLingkaran = 2 * Math.PI * radius;
        System.out.println("__Keliling lingkaran__: " + kelilingLingkaran);

        // Menghitung luas trapesium
        System.out.print("Masukkan panjang alas atas trapesium: ");
        double alasAtas = scanner.nextDouble();

        System.out.print("Masukkan panjang alas bawah trapesium: ");
        double alasBawah = scanner.nextDouble();

        System.out.print("Masukkan tinggi trapesium: ");
        double tinggiTrapesium = scanner.nextDouble();

        double luasTrapesium = 0.5 * (alasAtas + alasBawah) * tinggiTrapesium;
        System.out.println("__Luas trapesium__: " + luasTrapesium);

        // Menghitung luas prisma segitiga
        System.out.print("Masukkan panjang alas segitiga: ");
        double alasSegitiga = scanner.nextDouble();

        System.out.print("Masukkan tinggi segitiga: ");
        double tinggiSegitiga = scanner.nextDouble();
        
        System.out.print("Masukkan tinggi prisma: ");
        double tinggiPrisma = scanner.nextDouble();

        double luasAlasSegitiga = 0.5 * alasSegitiga * tinggiSegitiga;
        double luasPrismaSegitiga = 2 * luasAlasSegitiga + 3 * alasSegitiga * tinggiPrisma;
        System.out.println("__Luas prisma segitiga__: " + luasPrismaSegitiga);

        scanner.close();
    }
}