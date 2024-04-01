package treinamento;

import java.util.Locale;
import java.util.Scanner;

public class senhas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int login = 1234;
		int senha = 9999;
		
		System.out.println("digite os 4 digitos do login");
		int dig1 = sc.nextInt();
		
		while(login != dig1) {
			System.out.println("login errada");
			dig1 = sc.nextInt();
		}
		System.out.println("digite os 4 digitos da senha");
		int dig2 = sc.nextInt();
		
		while(senha!= dig2) {
			System.out.println("senha errada");
			dig2 = sc.nextInt();
		}
		System.out.println("senha autorizada");

	}

}
