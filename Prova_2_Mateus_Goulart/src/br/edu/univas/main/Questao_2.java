package br.edu.univas.main;

import java.util.Scanner;

public class Questao_2 {
		
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int i = 0;
		int notaDigitada [] = new int [1000];
		String Do = "Dó"; String Re = "Ré"; String Mi = "Mi"; String Fa = "Fá"; String Sol = "Sol"; String La = "Lá"; String Si = "Si";
		
		do {
		
			notaDigitada [i] = read.nextInt();
			
			if (notaDigitada[i] == 0) {
				
				break;
				
			}
			
			i++;
			
			
		}while(true);
		
		for(int j = 0; j < i; j++) {
			
			
			
				if(notaDigitada[j] == 1) {
					System.out.println(Do);
				}
					
				if(notaDigitada[j] == 2) {
					System.out.println(Re);
				}
					
				if (notaDigitada[j]==3) {
					System.out.println(Mi);
				}
					
				if (notaDigitada[j]==4) {
					System.out.println(Fa);
				}
					
				if(notaDigitada[j]==5) {
					System.out.println(Sol);

				}
				if(notaDigitada[j]==6) {
					System.out.println(La);
				}
					
				if(notaDigitada[j]==7) {
					System.out.println(Si);
				}
			}
		
		
				
		read.close();
		
	}
	
}
