package principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		
	

		 Scanner sc = new Scanner(System.in);
	
		 System.out.println("Qual o valor de A? ");
		 int a = sc.nextInt();
		 System.out.println("Qual o valor de B? ");
		 int b = sc.nextInt();
		 System.out.println("Digite o valor de C? ");
		 int c = sc.nextInt();
		      
		 double quadB = Math.pow(b, 2);
		 double delta = quadB - 4 * a * c;
		 double raizQuadradadelta = Math.sqrt(delta);
		 double x1 =  (-b+ raizQuadradadelta) / (2*a);
		 double x2 =  (-b- raizQuadradadelta) / (2*a);
		      
		 double r1 = Math.round(x1);
		 double r2 = Math.round(x2);
		 System.out.println("A raíz de x1 vale: "  + r1) ;
		 System.out.println("A raíz de x2 vale: "  + r2);
		      }

	}


