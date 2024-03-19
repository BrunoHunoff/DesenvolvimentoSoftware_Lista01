import java.util.Scanner;

public class Console {
    private static Scanner leitor = new Scanner(System.in);

    public static float lerFloat() {
        float n1 = leitor.nextFloat();

        leitor.nextLine();
        return n1;
    }

    public static int lerInt() {
        int n1 = leitor.nextInt();

        leitor.nextLine();
        return n1;
    }

    public static String lerString(){
        String a = leitor.nextLine();

        return a;
    }
}
