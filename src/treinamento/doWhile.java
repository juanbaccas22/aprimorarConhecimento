package treinamento;

import java.util.Locale;
import java.util.Scanner;

public class doWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("oi");
		
		String resposta;
		do {
			System.out.println("deseja pedir outra ?");
			resposta = sc.next();
		} while(resposta.equals("sim"));
		
		System.out.println("feito");
		
		sc.close();
	}

}
