
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int n = leitor.nextInt();

        for (int i = 0; i < n; i++) {
            int x = leitor.nextInt();
            int y = leitor.nextInt();

            if (y == 0) {
                System.out.println("divisao impossivel");
            } else {
                double resultado = (double) x / y;
                System.out.printf("%.1f%n", resultado);
            }
        }
        leitor.close();
    }
}
