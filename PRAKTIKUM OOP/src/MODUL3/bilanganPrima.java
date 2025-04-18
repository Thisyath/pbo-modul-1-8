package MODUL3;

public class bilanganPrima {
    public static void main(String[] args) {
        System.out.println("Bilangan prima antara 1-1000 (menggunakan for-loop):");
        for (int i = 2; i <= 1000; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    //Method untuk mengecek apakah sebuah bilangan adalah bilangan prima
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
