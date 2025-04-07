package MODUL2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferedReader {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Menghitung keliling lingkaran
            System.out.print("Masukkan jari-jari lingkaran: ");
            double radius = Double.parseDouble(reader.readLine());

            double kelilingLingkaran = 2 * Math.PI * radius;
            System.out.println("__Keliling lingkaran__: " + kelilingLingkaran);

            // Menghitung luas trapesium
            System.out.print("Masukkan panjang alas atas trapesium: ");
            double alasAtas = Double.parseDouble(reader.readLine());

            System.out.print("Masukkan panjang alas bawah trapesium: ");
            double alasBawah = Double.parseDouble(reader.readLine());

            System.out.print("Masukkan tinggi trapesium: ");
            double tinggiTrapesium = Double.parseDouble(reader.readLine());

            double luasTrapesium = 0.5 * (alasAtas + alasBawah) * tinggiTrapesium;
            System.out.println("__Luas trapesium__: " + luasTrapesium);

            // Menghitung luas prisma segitiga
            System.out.print("Masukkan panjang alas segitiga: ");
            double alasSegitiga = Double.parseDouble(reader.readLine());

            System.out.print("Masukkan tinggi segitiga: ");
            double tinggiSegitiga = Double.parseDouble(reader.readLine());

            System.out.print("Masukkan tinggi prisma: ");
            double tinggiPrisma = Double.parseDouble(reader.readLine());

            double luasAlasSegitiga = 0.5 * alasSegitiga * tinggiSegitiga;
            double luasPrismaSegitiga = 2 * luasAlasSegitiga + 3 * alasSegitiga * tinggiPrisma;
            System.out.println("__Luas prisma segitiga__: " + luasPrismaSegitiga);

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan input.");
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid.");
        }
    }
}