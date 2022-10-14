package principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		
	

			    Scanner sc = new Scanner(System.in);
				System.out.println("Menu de opções.");
				System.out.println("-------------------");
				System.out.println(" \n [1] Para somar dois valores.");
				System.out.println(" \n [2] Para saber a raiz quadrada de um número.");
				System.out.println("-------------------");
				System.out.println("Qual a opção desejada? ");
			    int valor = sc.nextInt();    
			    if(valor==1) {
			    	System.out.println("Digite o primeiro valor: ");
			    	int valorP = sc.nextInt();
			    	System.out.println("Digite o segundo valor: ");
			    	int valorS = sc.nextInt();
			    	System.out.println(" \n A soma de "  +  valorP  +  " + "   + valorS +  " = "  + (valorP+valorS));
			    }
			    else if (valor==2) {
			    	System.out.println("Digite um número: ");
			    	int valorR = sc.nextInt();
			    	int raiz = (int)Math.sqrt(valorR);
			    	System.out.println(" \n A raiz quadrada de " + valorR + " = " + raiz);
			    }
			    else {
			    	System.out.println(" \n Erro! opção não encontrada.");
			    }
		}
		

	}


