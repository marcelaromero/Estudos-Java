// Programa demonstra conversões de tipo que exigem conversões explícitas


public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println("\nConversão de int para byte.");
        b = (byte) i;
        System.out.println("i para b " + i + " - " + b);

        System.out.println("\nConversão de double para int.");
        i = (int) d;
        System.out.println("d para i " + d + " - " + i);

        System.out.println("\nConversão de double para byte.");
        b = (byte) d;
        System.out.println("d para b " + d + " - " + b);
    }
}