package principal;  

import java.util.Scanner;

public class principal {
public static void main(String[] args) {
	
	
		int tmnR;
		double soma = 0;
		double[] nums;
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		double mediaPar=0;
		double númerosI = 0;
		double porcentagem = 0;
		
	
		Scanner sc = new Scanner(System.in);
			System.out.print("Quantos números você quer digitar : ");
			String tmn = sc.next();
		
				tmnR = Integer.parseInt(tmn);
				nums = new double[tmnR];
				
				for (int i = 0; i < tmnR; i++) {
					System.out.print((i+1) + "°"  +  " número :");
					nums[i] = sc.nextDouble();
					soma += nums[i];
				}
				double media = (soma/tmnR);
				
				for( int i = 1;i<= nums.length-1;i++){
			           
				
		            if(nums[i]>maior){
		               maior= (int)nums[i];
		            }
		            
		            if(nums[i]<menor){
		               menor=(int)nums[i]; 
		            }

				}
				
				for (int i = 0; i <= nums.length-1; i++) {
					 if(nums[i] % 2 == 0){
						 mediaPar= mediaPar+1; 	 
					 }
					 else {
					númerosI = númerosI+1;
					porcentagem = númerosI/tmnR*100F;
					 }
				}
					
	
				System.out.println("A soma dos valores é :"  + soma);
				System.out.println("A quantidade de números que desejou digitar: "  + tmn);
				System.out.println("A média: " + media);
				System.out.println("O maior número digitado : "  + maior);
				System.out.println("o menor número digitado : "  + menor);
				System.out.println("A média dos números pares : "  + mediaPar/tmnR);
				System.out.println("A porcentagem dos números ímpares "  + porcentagem + "%");
				
	}
	
	}  
        


    		
    		
 
	
	
    	
