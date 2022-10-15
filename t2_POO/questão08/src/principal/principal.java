
package principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		double opç, salario, imposto = 0, aument = 0, novoSal = 0;
		int loop;
		Scanner sc = new Scanner(System.in);
		   do {
		System.out.println("\n---MENU DE OPÇÕES---");
		System.out.println("_1_ Imposto");
		System.out.println("_2_ Novo salário");
		System.out.println("_3_ Classificação");
		System.out.println("_4_ Finalizar o programa");
		System.out.println("Digite a opção desejda: ");
		opç = sc.nextInt();
		if(opç > 4 || opç < 1) {
			System.out.println("Opção invalida!");
		}
			if(opç == 1) {
				System.out.println("Didigite o seu salário: ");
				salario = sc.nextDouble();
				if(salario < 500) {
					imposto = salario * 5/100;
				}
					if(salario>= 500 & salario <= 950) {
						imposto = salario *10/100;
					}
						if(salario > 950) {
							imposto = salario * 15/100;
						}
						System.out.println("O imposto é " + imposto);
					}
		if(opç == 2) {
			System.out.println("Digite o seu salário: ");
			salario = sc.nextDouble();
			if(salario > 1500) {
				aument = 25;
			}
				if(salario >= 750 & salario <= 1500) {
					aument = 50;
				}
					if(salario >= 450 & salario < 750) {
						aument = 75;
					}
						if(salario < 450) {
							aument = 100;
						}
						novoSal = salario + aument;
						System.out.println(" O novo salário é " + novoSal);
		}
		if(opç == 3) {
			System.out.println("Digite o seu salário: ");
			salario = sc.nextDouble();
			if(salario <= 700){
				System.out.println("Mal remunerado");
			}
		   
			else {
				System.out.println("Bem remunerado");
			}
		}
		if(opç == 4) {
			System.out.println("Obrigado pela atenção!");
		}
		System.out.println("------------------------------------");
		System.out.println("_1_ Para repetir o programa novamente \n_2_ Para finalizar o programa");
		loop = sc.nextInt();
		   }
	
		while(loop == 1);
		   
	
		   }   
	}



