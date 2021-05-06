
public class testaWhileeFor {

	public static void main(String[] args) {
		int contador = 0;
		while(contador < 10);{
			System.out.println(contador);
			//contador = contador +1;
			//contador += 1; 
			contador ++;
		}
		System.out.println("========FOR=======");
		for(int conta = 0; conta<=10; conta++) {
			System.out.println(conta);
		}
		//A diferença do while para o for é a sintaxe e que a variavel conta so da para ser utilizado dentro do for
		// ja a variavel contador ela da para ser usada dentro e fora do while.
		
	}
}
