package prjDoWhile;

import java.util.Scanner;

public class Potencia {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int e, base, i;
		
		i = 1;
		System.out.println("Digite o base");
		base=ler.nextInt(); 
		
		System.out.println("Digite o Expoente");
		e = ler.nextInt();
		do {
			base = base*base;
			i++;
		}while(i<e);
		System.out.println("O resultado é " + base);
		
		
	}

}
