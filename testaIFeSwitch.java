
public class testaIFeSwitch {

	        public static void main(String[] args){
	        	System.out.println("testando condicionais");

	            int idade = 20;
	            int quantidadePessoas = 3;    
	            boolean acompanhado;

	            if (quantidadePessoas >= 2) {
	                acompanhado = true;
	            }else {
	                acompanhado = false;
	            }

	            if (idade >=18 || acompanhado){

	                System.out.println("Seja bem vindo"); 
	            } else {
	                System.out.println("infelizmente voce nao pode entrar");
	            }
	            
	            //TESTANDO SWICTH
	            
	            int mes = 13;

	            switch (mes) {
	                case 1:
	                    System.out.println("O m�s � Janeiro");
	                    break;
	                case 2:
	                    System.out.println("O m�s � Fevereiro");
	                    break;
	                case 3:
	                    System.out.println("O m�s � Mar�o");
	                    break;
	                case 4:
	                    System.out.println("O m�s � Abril");
	                    break;
	                case 5:
	                    System.out.println("O m�s � Maio");
	                    break;
	                case 6:
	                    System.out.println("O m�s � Junho");
	                    break;
	                case 7:
	                    System.out.println("O m�s � Julho");
	                    break;
	                case 8:
	                    System.out.println("O m�s � Agosto");
	                    break;
	                case 9:
	                    System.out.println("O m�s � Setembro");
	                    break;
	                case 10:
	                    System.out.println("O m�s � Outubro");
	                    break;
	                case 11:
	                    System.out.println("O m�s � Novembro");
	                    break;
	                case 12:
	                    System.out.println("O m�s � Dezembro");
	                    break;
	                default:
	                    System.out.println("M�s inv�lido");
	                    break;
	            }

	    }
	}
