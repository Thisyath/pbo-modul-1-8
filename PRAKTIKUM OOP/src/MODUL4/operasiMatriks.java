package MODUL4;

import java.util.Scanner;

public class operasiMatriks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input matriks X
        System.out.println(">>>Masukkan elemen-elemen matriks X (2x2)<<<");
        int[][] X = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("X[" + i + "][" + j + "]: ");
                X[i][j] = scanner.nextInt();
            }
        }

        // Input matriks Y
        System.out.println(">>>Masukkan elemen-elemen matriks Y (2x2)<<<");
        int[][] Y = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Y[" + i + "][" + j + "]: ");
                Y[i][j] = scanner.nextInt();
            }
        }

        // Pilihan operasi
        System.out.println("Pilih operasi:");
        System.out.println("1. Perkalian Matriks");
        System.out.println("2. Pengurangan Matriks");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                // Perkalian Matriks
                int[][] hasilKali = new int[2][2];
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        hasilKali[i][j] = 0;
                        for (int k = 0; k < 2; k++) {
                            hasilKali[i][j] += X[i][k] * Y[k][j];
                        }
                    }
                }
                System.out.println("Hasil Perkalian Matriks:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        System.out.print(hasilKali[i][j] + " ");
                    }
                    System.out.println();
                }
                break;

            case 2:
                // Pengurangan Matriks
                int[][] hasilKurang = new int[2][2];
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        hasilKurang[i][j] = X[i][j] - Y[i][j];
                    }
                }
                System.out.println("Hasil Pengurangan Matriks:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        System.out.print(hasilKurang[i][j] + " ");
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}

