package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class alturas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int quantidade = sc.nextInt();
		
		String nome [] = new String [quantidade];
		int idade [] = new int [quantidade];
		double altura [] = new double [quantidade];
		
		for (int i =0; i <quantidade; i++) {
			System.out.println("dados da 1a pessoa : ");
			System.out.println("digite nome : ");
			nome[i] = sc.next();
			System.out.println("digite idade : ");
			idade[i] = sc.nextInt();
			System.out.println("digite altura : ");
			altura[i] = sc.nextDouble();
			
		}
		
		int menores = 0;
		double soma = 0;
		
		for (int i =0; i <quantidade; i++) {
			if(idade[i]<16) {
				menores++;
			}
			soma +=altura[i];
			
		}
		
		double porMenor = ((double)menores/quantidade) * 100.0;
		
		System.out.println("media altura " + soma/quantidade);
		System.out.println("% de menores de idade  " + porMenor);
		
		for (int i = 0 ; i<quantidade;i++) {
			if(idade[i]<16) {
				System.out.println(nome[i]);
			}
		}
		
		sc.close();
	}
}
