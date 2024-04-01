package treinamento;

import java.util.Locale;
import java.util.Scanner;

public class pizza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		
		System.out.println("boa noite");
		System.out.println("informe a pizza que deseja");
		System.out.println("1 doce ?");
		System.out.println("2 salgada ?");
		
		int sabor =sc.nextInt();
		
		if (sabor == 1) {
			System.out.println("temos a opção : banana, chocolate");
		}
		else {
			System.out.println("queijo, calabresa");
		}
		
		System.out.println("qual sabor :");
		//String sabor = sc.nextLine();
		
		
		
		
		
		
		sc.close();

	}

}
