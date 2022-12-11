public class Main {

        public static void main(String args[]) {
            System.out.println("\n 3 sayisini tam bolenler: ");
            for (int i=1; i<100; i++) {
                if (i%3==0)
                    System.out.print(i +", ");
            }

            System.out.println("\n\n5 sayisini tam bolenler: ");
            for (int i=1; i<100; i++) {
                if (i%5==0) System.out.print(i +", ");
            }

            System.out.println("\n\n3 ve 5 sayilarini tam bolenler: ");
            for (int i=1; i<100; i++) {
                if (i%3==0 && i%5==0) System.out.print(i +", ");
            }
            System.out.println("\n");
        }
    }