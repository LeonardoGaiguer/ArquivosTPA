import java.util.Scanner;

public class AtribuirAparaB {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int TAM=10;
        int a[],b[],i;
        a = new int[TAM];
		b = new int[TAM];

        for (i=0;i<10;i++) {
            System.out.print("valor " + i + " de a ");
            a[i] = in.nextInt();

            if (a[i]% 2 == 0) {
                b[i] = 1;
            } else {
                b[i] = 0;
            }
        }

        System.out.println("vetor B:");
        for (i=0;i<10;i++) {
            System.out.println("valor " + i + " de b " + b[i]);
        }
    }
}

