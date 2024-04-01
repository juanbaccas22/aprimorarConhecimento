package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class pensionato {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int quartos[] = new int[9];
		String nome[] = new String[9];
		String email[] = new String[9];
		// int nQuarto;

		System.out.println("quantos alunos vão registrar : ");
		int quantidades = sc.nextInt();

		for (int i = 0; i < quantidades; i++) {
			System.out.println("nome :");
			nome[i]= sc.nextLine();
			nome[i]= sc.nextLine();
			System.out.println("E-mail :");
			email[i] = sc.nextLine();
			System.out.println("Quarto :");
			quartos[i] = sc.nextInt();

		}
		
		
		
		
		
		

		sc.close();
	}
}