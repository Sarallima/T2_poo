package principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número para saber se ele é primo: ");
		int num = input.nextInt();
		Boolean teste = ePrimo(num);
		if (teste) {
			System.out.println("O número " + num + " é primo ");
		}else {
			System.out.println("O número " + num + " não é primo ");
		}
		
	}
	
        public static Boolean ePrimo(int num) {
	    int divisivel = 0;
	    for (int i = 1; i <=num;i++) {
		if(i==2) {
			
		}else if(num%i==0) {
			divisivel++;
		}
	}
	    if(divisivel<=2) {
		return true;
	}
	    else {
		return false;
	}
}
	
	}


