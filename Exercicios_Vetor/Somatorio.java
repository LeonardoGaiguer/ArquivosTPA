import java.util.Scanner;

public class Somatorio {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[], b[], i, j, soma;
        final int TAM = 10;
        a = new int[TAM];
        b = new int[TAM];
        for (i = 0; i < TAM; i++) {
        	System.out.println("digite o " + (i+1) + "º valor do vetor A");
            a[i] = in.nextInt();
        }
        for (i = 0; i < TAM; i++) {
            soma = 0;
            for (j = i; j < TAM; j++) {
                soma = soma + a[j];
            }
            b[i] = soma;
        }
        System.out.println("somatorios:");
        for (i = 0; i < TAM; i++)
            System.out.println("B[" + i + "] = " + b[i]);
    }
}

