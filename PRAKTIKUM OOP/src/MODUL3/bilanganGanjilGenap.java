package MODUL3;

public class bilanganGanjilGenap {
    public static void main(String[] args) {
        
        // Menggunakan while-loop untuk mencari bilangan ganjil antara 1-1000
        System.out.println("Bilangan ganjil antara 1-1000 (menggunakan while-loop):");
        int j = 1;
        while (j <= 1000) {
            if (j % 2 != 0) {
                System.out.print(j + " ");
            }
            j++;
        }
        System.out.println("\n");

        // Menggunakan do-while loop untuk mencari bilangan genap antara 1-1000
        System.out.println("Bilangan genap antara 1-1000 (menggunakan do-while loop):");
        int k = 1;
        do {
            if (k % 2 == 0) {
                System.out.print(k + " ");
            }
            k++;
        } while (k <= 1000);
        System.out.println();


    }
}
