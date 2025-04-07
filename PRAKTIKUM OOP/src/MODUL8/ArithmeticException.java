package MODUL8;

public class ArithmeticException {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            switch (i) {
                case 1:
                    System.out.println("case pertama");
                    try {
                        System.out.println("try-block entered.");
                    } catch (Exception e) {
                        System.out.println("Exception terjadi: " + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("case Kedua");
                    try {
                        System.out.println("try-block entered.");
                    } catch (Exception e) {
                        System.out.println("Exception terjadi: " + e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("case ketiga");
                    try {
                        throw new RuntimeException("demo case ketiga");
                    } catch (RuntimeException e) {
                        System.out.println("RuntimeException terjadi: " + e.getMessage());
                    } finally {
                        System.out.println("try-block entered.");
                    }
                    break;
                case 4:
                    System.out.println("case keempat");
                    try {
                        System.out.println("try-block entered.");
                        throw new Exception("demo case keempat");
                    } catch (Exception e) {
                        System.out.println("Exception terjadi: " + e.getMessage());
                    }
                    break;
            }
            System.out.println();
        }
    }
}