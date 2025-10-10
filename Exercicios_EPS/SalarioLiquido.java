package lista1;

public class SalarioLiquido {
	public static void main (String args[]) {
		double salario, inss, vt, salariol;
		salario=2000;
		inss=salario/100*8;
		vt=salario/100*5;
		salariol=salario-vt-inss;
		System.out.println(salariol);
	}
}
