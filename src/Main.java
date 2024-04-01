import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);

		int valor = sc.nextInt();
		int teste= valor;
		
		for (int i=0; i<valor; i++) { //pede quantas vezes
			
			teste = sc.nextInt();
			
			if(teste %2 ==1) { //verifica se é par
				
				System.out.println("é impar " + teste); 
				
			}
		}
		

		sc.close(); // informar que o ciclo acaba aqui da entrada do dado
	}

}