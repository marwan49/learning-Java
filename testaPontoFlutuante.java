public class testaPontoFlutuante {

	public static void main(String[] orgs) {
		double salario = 1250.70;
		System.out.println("meu salario é " + salario);
		
		//int contaA = 3.14  2; não é possivel pois o int aceita apenas numero inteiros
		//System.out.println(contaA);
		
		int contaA = (int) 3.14 / 2;// colocando (int) é possivel fazer a conta a pezar de que se perde alguns dados 
		System.out.println("contaA: "+contaA);
		
		double contaB = 3.14 / 2;
		System.out.println("contaB: "+contaB);
		
		double divisao = 5 / 2;
		System.out.println("divisao: "+divisao);
		
		double outraDivisao = 5.0 / 2;
		System.out.println("outraDivisao: "+outraDivisao);
		
		int b = 15;
		int p = 2;
		System.out.println(b / p);

	};
}
