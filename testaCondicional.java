
public class testaCondicional {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 20;
		int quantidadePessoas = 3;
		
		if (idade >= 18) {
			System.out.println("Você ja é maior de idade, seja bem vindo!");
		}else if(idade >= 18 || quantidadePessoas > 1) {
				System.out.println("Seja bem vindo!");
			}else{
				System.out.println("Você é menor de idade e esta desacompanhado,"
						+ " infelizmente você não pode entrar");
			
			}
	}
}
