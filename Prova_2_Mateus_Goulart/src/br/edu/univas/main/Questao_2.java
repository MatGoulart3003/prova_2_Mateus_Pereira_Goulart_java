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
		
		for(int j = 0; j < 8; j++) {
			
			switch (notaDigitada[j]){
			
				case 1:
					System.out.println(Do);
				case 2:
					System.out.println(Re);
				case 3:
					System.out.println(Mi);
				case 4:
					System.out.println(Fa);
				case 5:
					System.out.println(Sol);
				case 6:
					System.out.println(La);
				case 7:
					System.out.println(Si);
				
			}
		}
		
				
		read.close();
		
	}
	
}
