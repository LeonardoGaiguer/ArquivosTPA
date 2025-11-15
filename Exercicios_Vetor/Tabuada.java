package vetores;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM=5;
		int a[],i,j;
		a = new int[TAM];
		System.out.println("digite 5 numeros");
		for(i=0;i<TAM;i++) {
			a[i]=in.nextInt();
		}
		
		for(i=0;i<TAM;i++) {
			System.out.println("a tabuada de " + a[i]);
			for(j=1;j<=10;j++) {
				System.out.println(a[i]+"x"+j+"="+(a[i]*j));
			}
		}
	}

}
