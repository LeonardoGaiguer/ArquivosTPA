import java.util.Scanner;

public class Primos {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int a[], i, j, d;
		final int TAM = 10;
		a = new int[TAM];
		d = 0;
		for(i=0; i<TAM; i++) {
			System.out.println("digite o " + (i+1) + "º valor do vetor A");
			a[i]= in.nextInt();
		}
        for (i = 0; i < TAM; i++) {
            d = 0;
            for (j = 1; j <= a[i]; j++) {
                if (a[i] % j == 0) {
                    d++;
                }
            }
		    if (d == 2) {
		        System.out.println(a[i] + " é primo!");
		    } else {
		        System.out.println(a[i] + " não é primo!");
		    }
		 }
	}
}

