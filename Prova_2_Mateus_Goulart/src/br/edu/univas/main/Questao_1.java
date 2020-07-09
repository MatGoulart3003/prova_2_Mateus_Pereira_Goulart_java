package br.edu.univas.main;

import java.util.Scanner;

public class Questao_1 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		float morA [] = new float [12];
		float morB [] = new float [12];
		float maiorA = 0, menorA = 0, mediaA = 0;
		float maiorB = 0, menorB = 0, mediaB = 0;
		
		
		System.out.println("Digite o valor das contas de luz, de janeiro à dezembro separadamente, do Morador A");
		
			for (int i = 0; i < 12; i++) {
				
				
				morA [i] = read.nextFloat();
				mediaA = mediaA + morA[i];
				
				if (menorA == 0) {
					
					menorA = morA[i];
					
				}
				
				if (morA [i] > maiorA)
										
					maiorA = morA[i];
			
				else if (morA [i] < menorB) {
					
					menorA = morA[i];
					
				}
							
			}
			
			mediaA = mediaA/12;
			
		System.out.println("Agora, digite o valor das contas de luz, de janeiro à dezembro separadamente, do Morador B ");
		
			for(int i= 0; i < 12; i++) {
				
				morB[i] = read.nextFloat();
				mediaB = mediaB + morB[i];
				
				if (menorB == 0) {
					
					menorB = morB[i];
					
				}
				
				if (morB [i] > maiorB) {
				
					maiorB = morB[i];
								
				}else if (morB [i] < menorB) {
					
					menorB = morB[i];
								
				}
					
			}
			
			mediaB = mediaB/12;
			
			System.out.println("A menor conta do morador A foi no valor de: "+ menorA);
			System.out.println("A maior conta do morador A foi no valor de: "+ maiorA);
			System.out.println("A média das contas do morador A resulta em: "+ mediaA);
			System.out.println("=====================================================");
			System.out.println("A menor conta do morador B foi no valor de: "+ menorB);
			System.out.println("A maior conta do morador B foi no valor de: "+ maiorB);
			System.out.println("A média das contas do morador B resulta em: "+ mediaB);
			
			
			
			
		read.close();
	}
		
}
