package MODUL8;

import java.util.Scanner;
//Menghitung luas persegi dengan penanganan kesalahan
public class  IndexOutOfBoundsException1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input panjang sisi persegi
            System.out.print("Masukkan panjang sisi persegi: ");
            int sisi = scanner.nextInt();

            // Menghitung luas persegi
            int luas = sisi * sisi;

            // Menyimpan hasil dalam array
            int[] hasil = new int[1];
            hasil[0] = luas;

            // Mengakses elemen array
            System.out.println("Luas persegi: " + hasil[0]);

            // Simulasi kesalahan akses array di luar batas
            System.out.println("Mengakses elemen di luar batas: " + hasil[1]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Terjadi kesalahan: Akses elemen array di luar batas.");
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
