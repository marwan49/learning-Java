
public class testaCondicional {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 20;
		int quantidadePessoas = 3;
		
		if (idade >= 18) {
			System.out.println("Voc� ja � maior de idade, seja bem vindo!");
		}else if(idade >= 18 || quantidadePessoas > 1) {
				System.out.println("Seja bem vindo!");
			}else{
				System.out.println("Voc� � menor de idade e esta desacompanhado,"
						+ " infelizmente voc� n�o pode entrar");
			
			}
	}
}
