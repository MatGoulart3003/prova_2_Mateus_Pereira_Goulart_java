package br.edu.univas.main;

import java.util.Scanner;

public class Questao_3 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		
		float empregados [] = new float [150];
		float media = 0f, aumento = 0f;
		
		for(int i = 0; i < 150; i++ ) {
			
			empregados[i] = read.nextFloat();
			
			if(media == 0) {
				
				media = empregados[i];
				
			}else {
				media = empregados[i] + media;
			}
				
				
				
		}	
			
			media = (media/150f);
			aumento = (media * 1.15f);
			
			System.out.println("A m�dia do salario sem aumento �: " + media);
			System.out.println("A m�dia do sal�rio com aumento �: " + aumento);
		
		read.close();
		
	}
	
}
