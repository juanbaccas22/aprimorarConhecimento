package exercicio;

import java.util.Locale;
import java.util.Scanner;



public class listas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("quantos numero vai digitar");
		int quantidade = sc.nextInt();
		if (quantidade >=10) {
			quantidade = 10;
		}
		
		
		
		int numero [] = new int [quantidade];
		
		for (int i = 0 ; i < quantidade ; i++) {
			numero [i] = sc.nextInt();
			
		}
		/*for (int i=0 ; i <quantidade ; i++) {
			if (numero [i]< 0) {
				System.out.println(numero[i]);
			}
			
		}*/
		
		int soma = 0 ;
		for (int i = 0 ; i < quantidade ; i++) {
			soma += numero[i];
			
		}
		
		int media = soma/quantidade;
		System.out.println(soma);
		System.out.println(media);
		
		
		
		sc.close();
	}
}
