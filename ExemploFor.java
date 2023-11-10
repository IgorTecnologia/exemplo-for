package com.igor.cursojava.aula04;

import java.util.Scanner;

public class ExemploFor {

	public static void main(String[] args) {
	
		float n1, n2, n3, media, somaMedia = 0, mediaGeral;
		int x, na;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite a quantidade de alunos");
		na = leia.nextInt();
		
		if(na < 1) {
			System.out.println("\nNúmero inexistente de alunes!!!");
		}else {
			
		
		for(x=1; x<=na; x++) {
			
			System.out.println("\nEntre com a primeira nota");
			n1 = leia.nextFloat();
			
			System.out.println("\nEntre com a segunda palavra");
			n2 = leia.nextFloat();
			
			System.out.println("\nEntre com a terceira nota");
			n3 = leia.nextFloat();
			
			media = (n1+n2+n3)/3;
			System.out.printf("\nMédia do alune " + x + " : %.1f", media);
			somaMedia += media;
		}
		}
		mediaGeral = somaMedia / na;
		System.out.printf("\nMédia geral: %.1f", mediaGeral);
		
	}

}
