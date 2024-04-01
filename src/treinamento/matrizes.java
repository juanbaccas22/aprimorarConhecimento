package treinamento;

import java.util.Locale;
import java.util.Scanner;

public class matrizes {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int contagem = sc.nextInt();
		int [][] matri = new int [contagem][contagem];
		
		for (int i=0 ; i<contagem;i++) { //percarre as linhas 
			for (int j=0;j<contagem;j++) { //percarre as colunas
				matri[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0 ; i<contagem ; i++) {
			System.out.print(matri[i][i] + " ");
		}
		System.out.println();
		
		
		//numeros negativos
		int count = 0;
		for (int i=0 ; i<contagem;i++) {
			for (int j=0;j<contagem;j++) {
				if (matri[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.println(count);
		
		sc.close();

	}

}
