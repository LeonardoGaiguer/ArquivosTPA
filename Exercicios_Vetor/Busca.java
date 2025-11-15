import java.util.Scanner;

public class Busca {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int TAM = 10;
        int a[], x, j, i;
        j = 0;
        a = new int[TAM];

        for (i = 0; i < 10; i++) {
            System.out.println("digite o "+ i +" elemento");
            a[i] = in.nextInt();
        }

        System.out.println("Digite X: ");
        x = in.nextInt();

        for ( i = 0; i < 10; i++) {
            if (a[i] == x) {
                j = 1;
            }
        }

        if (j == 1) {
            System.out.println("Encontrado!");
        } else {
            System.out.println("Não encontrado.");
        }
    }
}