package tabuleiro;

import java.util.Scanner;

public class TABULEIRO {

	public static void main(String[] args) {
		
		int numlinha , numcoluna , a , b;
		
		Scanner leitor = new Scanner (System.in);

		System.out.println("Movimentos de uma Torre no xadrez!");
		System.out.println("Digite a linha em que a Torre se encontra: ");
		numlinha = leitor.nextInt();
		System.out.println("Digite a coluna em que a Torre se encontra: ");
		numcoluna = leitor.nextInt();
		
		
		System.out.println("    1  2  3  4  5  6  7  8");
		System.out.println("   ------------------------");	
		
		if (numlinha>=1 && numlinha<=8 && numcoluna>=1 && numcoluna<=8) {
			
			
		for (a = 1 ; a<=8 ;a++) {
			
			
		  System.out.print(a + "|");
		  
		  for (b = 1 ;  b <= 8 ; b++) {
			  
			
			  
			  if (numlinha == a || numcoluna == b)
				  System.out.print(" x ");
			  else 
				  System.out.print( " - " );
		  }
		  
		System.out.println("");
		} 
		
			}
		else 	
			System.out.println("Erro");
		}
	
	
		
	}

